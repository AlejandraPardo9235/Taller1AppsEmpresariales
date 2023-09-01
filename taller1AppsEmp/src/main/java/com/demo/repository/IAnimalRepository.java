package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.models.Animal;

public interface IAnimalRepository extends JpaRepository<Animal, Long>{

}
