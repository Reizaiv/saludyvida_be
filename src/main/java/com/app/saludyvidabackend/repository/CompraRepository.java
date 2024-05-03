package com.app.saludyvidabackend.repository;

import com.app.saludyvidabackend.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CompraRepository extends CrudRepository<Compra, Long>{
}
