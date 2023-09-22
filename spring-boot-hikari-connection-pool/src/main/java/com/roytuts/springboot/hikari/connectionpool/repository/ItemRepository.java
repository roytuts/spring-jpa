package com.roytuts.springboot.hikari.connectionpool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roytuts.springboot.hikari.connectionpool.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
