package com.roytuts.spring.data.jpa.named.query.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.roytuts.spring.data.jpa.named.query.entity.Item;

public interface NameQueryRepository extends JpaRepository<Item, Long> {

    List<Item> findAll();

    List<Item> findByName(String name);

    Item findByPrice(@Param("price") Double price);

}
