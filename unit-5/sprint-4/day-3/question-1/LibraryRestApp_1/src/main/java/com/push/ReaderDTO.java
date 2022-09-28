package com.push;

public class ReaderDTO {
	
	private String name;
	private String author;
	private String publication;
	private String category;
	private Integer pages;
	private Integer price;
	
	public ReaderDTO(String name, String author, String publication, String category, Integer pages, Integer price) {
		super();
		this.name = name;
		this.author = author;
		this.publication = publication;
		this.category = category;
		this.pages = pages;
		this.price = price;
	}

	public ReaderDTO() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ReaderDTO [name=" + name + ", author=" + author + ", publication=" + publication + ", category="
				+ category + ", pages=" + pages + ", price=" + price + "]";
	}
	
	

}
