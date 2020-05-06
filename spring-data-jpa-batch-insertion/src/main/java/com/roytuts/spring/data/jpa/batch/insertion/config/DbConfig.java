package com.roytuts.spring.data.jpa.batch.insertion.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.roytuts.spring.data.jpa.batch.insertion.repository")
public class DbConfig {

	@Autowired
	private Environment environment;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(environment.getRequiredProperty("spring.datasource.driverClassName"));
		ds.setUrl(environment.getRequiredProperty("spring.datasource.url"));
		ds.setUsername(environment.getRequiredProperty("spring.datasource.username"));
		ds.setPassword(environment.getRequiredProperty("spring.datasource.password"));
		return ds;
	}

	@Bean
	public EntityManagerFactory entityManagerFactory(DataSource dataSource) {
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		vendorAdapter.setDatabase(Database.MYSQL);
		// vendorAdapter.setDatabasePlatform("org.hibernate.dialect.MySQL8Dialect");

		// Use these properties to let spring work on batch insertion
		Properties jpaProperties = new Properties();
		jpaProperties.put("hibernate.jdbc.batch_size", 500);
		jpaProperties.put("hibernate.order_inserts", true);
		jpaProperties.put("hibernate.order_updates", true);

		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		factory.setJpaVendorAdapter(vendorAdapter);
		factory.setJpaProperties(jpaProperties);
		factory.setPackagesToScan("com.roytuts.spring.data.jpa.batch.insertion.entity");
		factory.setDataSource(dataSource);
		factory.afterPropertiesSet();
		return factory.getObject();
	}

}
