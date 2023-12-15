package com.roytuts.spring.image.blob.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roytuts.spring.image.blob.entity.Image;
import com.roytuts.spring.image.blob.repository.ImageRepository;

@Service
public class ImageService {

	@Autowired
	private ImageRepository imageRepository;

	public void saveImage(Image image) {
		imageRepository.save(image);
	}

	public void deleteImage(Integer id) {
		imageRepository.deleteById(id);
	}

	public Image getImage(Integer id) {
		return imageRepository.findById(id).get();
	}

	public List<Image> imageList() {
		return imageRepository.findAll();
	}

}
