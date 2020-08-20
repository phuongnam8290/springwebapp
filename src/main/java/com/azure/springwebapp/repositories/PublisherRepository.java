package com.azure.springwebapp.repositories;

import com.azure.springwebapp.entities.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
