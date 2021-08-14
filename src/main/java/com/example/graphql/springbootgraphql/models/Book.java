package com.example.graphql.springbootgraphql.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class Book {

	public Book() {
		super();
	}
	
	public Book(String isin, String title, String publisher, String[] authors, String publishedDate) {
		super();
		this.isin = isin;
		this.title = title;
		this.publisher = publisher;
		this.authors = authors;
		this.publishedDate = publishedDate;
	}
	
	@Id
	private String isin;
	private String title;
	private String publisher;
	private String [] authors;
	private String publishedDate;
}
