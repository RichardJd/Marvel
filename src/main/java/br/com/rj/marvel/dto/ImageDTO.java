package br.com.rj.marvel.dto;

import br.com.rj.marvel.model.Image;

public class ImageDTO {

	private String path;
	private String extension;

	public ImageDTO(Image image) {
		this.path = image.getPath();
		this.extension = image.getExtension();
	}

	public String getPath() {
		return path;
	}

	public String getExtension() {
		return extension;
	}

	public static ImageDTO converter(Image image) {
		return new ImageDTO(image);
	}
}
