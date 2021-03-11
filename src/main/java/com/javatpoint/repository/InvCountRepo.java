package com.javatpoint.repository;


import com.javatpoint.model.InvCount;
import org.springframework.data.repository.CrudRepository;

public interface InvCountRepo extends CrudRepository<InvCount, Integer> {
}
