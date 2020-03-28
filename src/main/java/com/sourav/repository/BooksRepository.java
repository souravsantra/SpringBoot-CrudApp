package com.sourav.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sourav.model.Books;

@Repository
public interface BooksRepository extends CrudRepository<Books, Integer>{

}
