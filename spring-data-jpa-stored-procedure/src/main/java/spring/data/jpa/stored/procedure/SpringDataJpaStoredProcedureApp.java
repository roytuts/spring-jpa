package spring.data.jpa.stored.procedure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import spring.data.jpa.stored.procedure.service.UserService;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "spring.data.jpa.stored.procedure.repository")
public class SpringDataJpaStoredProcedureApp implements CommandLineRunner {

	@Autowired
	private UserService service;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaStoredProcedureApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("===========================================");
		System.out.println("User List using Native Query");

		service.getUserListUsingNativeQuery().stream().forEach(
				u -> System.out.println(u.getId() + " " + u.getFirstName() + " " + u.getLastName() + " " + u.getDob()));

		System.out.println("===========================================");
		System.out.println("User List using Procedure name");

		service.getUserDetailsListUsingProcName().stream().forEach(
				u -> System.out.println(u.getId() + " " + u.getFirstName() + " " + u.getLastName() + " " + u.getDob()));

		System.out.println("===========================================");
		System.out.println("User List using Procedure alias");

		service.getUserDetailsListUsingProcAlias().stream().forEach(
				u -> System.out.println(u.getId() + " " + u.getFirstName() + " " + u.getLastName() + " " + u.getDob()));

		System.out.println("===========================================");

		System.out.println(
				"IN and OUT parameters using Procedure name: " + service.getUserFullNameIn_OutUsingProcName(7));

		System.out.println("===========================================");

		System.out.println(
				"INOUT parameter using Procedure name: " + service.getUserFullNameInOutUsingProcName("30-08-2016"));

		System.out.println("===========================================");
	}

}
