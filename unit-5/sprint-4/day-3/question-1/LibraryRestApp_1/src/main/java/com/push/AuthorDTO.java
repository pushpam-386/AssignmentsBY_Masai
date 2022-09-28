package com.push;

public class AuthorDTO {
	
	 private Integer Id;
	 private String name;
	 private String  author;
	 private String publication;
	 private String category;
	 private Integer pages;
	 private Integer price;
	 private String Registration_Number;
	 private String Author_Number;
	 
	public AuthorDTO() {
		super();
	}

	public AuthorDTO(Integer id, String name, String author, String publication, String category, Integer pages,
			Integer price, String registration_Number, String author_Number) {
		super();
		Id = id;
		this.name = name;
		this.author = author;
		this.publication = publication;
		this.category = category;
		this.pages = pages;
		this.price = price;
		Registration_Number = registration_Number;
		Author_Number = author_Number;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
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

	public String getRegistration_Number() {
		return Registration_Number;
	}

	public void setRegistration_Number(String registration_Number) {
		Registration_Number = registration_Number;
	}

	public String getAuthor_Number() {
		return Author_Number;
	}

	public void setAuthor_Number(String author_Number) {
		Author_Number = author_Number;
	}

	@Override
	public String toString() {
		return "AuthorDTO [Id=" + Id + ", name=" + name + ", author=" + author + ", publication=" + publication
				+ ", category=" + category + ", pages=" + pages + ", price=" + price + ", Registration_Number="
				+ Registration_Number + ", Author_Number=" + Author_Number + "]";
	}
	 
	 
	 
}
