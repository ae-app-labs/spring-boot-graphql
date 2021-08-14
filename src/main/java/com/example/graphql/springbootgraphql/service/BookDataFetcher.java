package com.example.graphql.springbootgraphql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.graphql.springbootgraphql.models.Book;
import com.example.graphql.springbootgraphql.repository.BookRepository;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

@Component
public class BookDataFetcher implements DataFetcher<Book>{

	@Autowired
	BookRepository bookRepository;
	
	@Override
	public Book get(DataFetchingEnvironment environment) {
		String isin = environment.getArgument("id");
		return bookRepository.findById(isin).get();
	}

}
