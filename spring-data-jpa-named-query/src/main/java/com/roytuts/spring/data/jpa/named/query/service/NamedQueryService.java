package com.roytuts.spring.data.jpa.named.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roytuts.spring.data.jpa.named.query.entity.Item;
import com.roytuts.spring.data.jpa.named.query.repository.NameQueryRepository;

@Service
public class NamedQueryService {

    @Autowired
    private NameQueryRepository repository;

    public List<Item> getAllItems() {
        return repository.findAll();
    }

    public List<Item> getItemsByName(final String name) {
        return repository.findByName(name);
    }

    public Item getItemByPrice(final Double price) {
        return repository.findByPrice(price);
    }

}
