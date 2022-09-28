package com.push.persistenceLayer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Books {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int Book_Id;
		private String name;
		private String author;
		private int price;
		
		public Books(int book_Id, String name, String author, int price) {
			super();
			Book_Id = book_Id;
			this.name = name;
			this.author = author;
			this.price = price;
		}

		public Books() {
			super();
		}

		public int getBook_Id() {
			return Book_Id;
		}

		public void setBook_Id(int book_Id) {
			Book_Id = book_Id;
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

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Books [Book_Id=" + Book_Id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
		}
		
		
		

}
