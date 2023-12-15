package com.roytuts.spring.image.blob.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roytuts.spring.image.blob.entity.Image;

public interface ImageRepository extends JpaRepository<Image, Integer>{

}
