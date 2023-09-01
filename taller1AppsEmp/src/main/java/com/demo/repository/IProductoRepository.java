package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.models.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Long>{

}
