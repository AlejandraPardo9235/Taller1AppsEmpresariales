package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.models.Materia;

public interface IMateriaRepository extends JpaRepository<Materia, String>{

}
