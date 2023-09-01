package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.models.Vehiculo;

public interface IVehiculoRepository extends JpaRepository<Vehiculo, Long>{

}
