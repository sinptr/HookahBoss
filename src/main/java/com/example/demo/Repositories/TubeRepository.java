package com.example.demo.Repositories;

import com.example.demo.Entities.Tube;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TubeRepository extends CrudRepository<Tube, Long> {
}
