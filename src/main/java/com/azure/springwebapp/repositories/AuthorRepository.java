package com.azure.springwebapp.repositories;

import com.azure.springwebapp.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
