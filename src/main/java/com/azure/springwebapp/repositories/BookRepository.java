package com.azure.springwebapp.repositories;

import com.azure.springwebapp.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
