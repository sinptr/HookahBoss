package com.example.demo.Repositories;

import com.example.demo.Entities.Bottle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BottleRepository extends CrudRepository<Bottle, Long> {
}
