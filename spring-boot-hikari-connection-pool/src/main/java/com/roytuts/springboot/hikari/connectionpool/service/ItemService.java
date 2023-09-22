package com.roytuts.springboot.hikari.connectionpool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roytuts.springboot.hikari.connectionpool.entity.Item;
import com.roytuts.springboot.hikari.connectionpool.repository.ItemRepository;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;

	public Item getItem(long id) {
		return itemRepository.findById(id).get();
	}

	public List<Item> getItemList() {
		return itemRepository.findAll();
	}

}
