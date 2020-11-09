package com.roytuts.spring.data.jpa.named.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.roytuts.spring.data.jpa.named.query.entity.Item;
import com.roytuts.spring.data.jpa.named.query.service.NamedQueryService;

@SpringBootApplication
@EntityScan("com.roytuts.spring.data.jpa.named.query.entity")
@EnableJpaRepositories("com.roytuts.spring.data.jpa.named.query.repository")
public class SpringDataJpaNamedQueryApp implements CommandLineRunner {

    @Autowired
    private NamedQueryService service;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaNamedQueryApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Item> itemList = service.getAllItems();

        itemList.stream().forEach(i -> System.out.println(i));

        List<Item> items = service.getItemsByName("CD");

        items.stream().forEach(i -> System.out.println(i));

        Item item = service.getItemByPrice(30.02);
        System.out.println(item);
    }

}
