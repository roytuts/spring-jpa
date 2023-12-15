package com.roytuts.spring.image.blob.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.roytuts.spring.image.blob.entity.Image;
import com.roytuts.spring.image.blob.service.ImageService;

@Controller
public class ImageController {

	@Autowired
	private ImageService imageService;

	@GetMapping("/")
	public String imageList(ModelMap modelMap) {
		List<Image> images = imageService.imageList();

		modelMap.addAttribute("imageList", images);

		return "images";
	}

	@GetMapping("/uploadImage")
	public String uploadImage() {
		return "upload";
	}

	@PostMapping("/upload/image")
	public String uploadImage(@RequestParam("image") MultipartFile image, ModelMap modelMap) throws IOException {
		String imageName = image.getOriginalFilename();

		String ext = Objects.requireNonNull(imageName).substring(imageName.lastIndexOf('.') + 1).toLowerCase();

		if (ext.equals("jpeg") || ext.equals("jpe") || ext.equals("jpg") || ext.equals("png") || ext.equals("gif")) {
			byte[] content = image.getBytes();

			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");

			Image img = new Image();
			img.setName(imageName);
			img.setContent(content);
			img.setDate(dtf.format(LocalDateTime.now()));

			imageService.saveImage(img);

			modelMap.addAttribute("msg", "Image '" + imageName + "' Successfully Uploaded");
		} else {
			modelMap.addAttribute("msg", "Image '" + imageName + "' must be an image file (jpeg/png/gif)");
		}

		return "upload";
	}

	@ResponseBody
	@GetMapping("/download/image/{id}")
	public ResponseEntity<Resource> downloadImages(@PathVariable int id) {
		Image img = imageService.getImage(id);

		ByteArrayResource resource = new ByteArrayResource(img.getContent());

		return ResponseEntity.ok().contentType(MediaType.valueOf(img.getMimeType()))
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + img.getName() + "\"")
				.body(resource);
	}

	@GetMapping("/delete/image/{id}")
	public String deleteImage(@PathVariable int id, ModelMap modelMap) {
		imageService.deleteImage(id);

		List<Image> images = imageService.imageList();

		modelMap.addAttribute("imageList", images);
		modelMap.addAttribute("msg", "Image deleted successfully");

		return "redirect:/";
	}

}
