package com.example.Ejerciciossesiones101112.repository;


import com.example.Ejerciciossesiones101112.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Laptoprepository extends JpaRepository<Laptop, Long> {

}
