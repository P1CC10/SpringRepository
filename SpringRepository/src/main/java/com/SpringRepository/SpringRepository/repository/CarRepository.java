package com.SpringRepository.SpringRepository.repository;

import com.SpringRepository.SpringRepository.entitys.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car,Long> {
}
