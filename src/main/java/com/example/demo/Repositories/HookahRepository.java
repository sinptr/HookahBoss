package com.example.demo.Repositories;

import com.example.demo.Entities.Hookah;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HookahRepository extends CrudRepository<Hookah, Long> {

}
