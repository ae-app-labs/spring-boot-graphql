package com.example.graphql.springbootgraphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.graphql.springbootgraphql.models.Book;

public interface BookRepository extends JpaRepository<Book, String>{

}
