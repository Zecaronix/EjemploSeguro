package com.example.farmacias.repository;

import com.example.farmacias.entity.Seguro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface SeguroRepository extends JpaRepository <Seguro, Integer>
{

}
