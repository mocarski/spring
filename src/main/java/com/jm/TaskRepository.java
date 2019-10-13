package com.jm;

import org.springframework.data.repository.CrudRepository;

// Repository to support CRUD operations
public interface TaskRepository extends CrudRepository<Task, Long> { }
