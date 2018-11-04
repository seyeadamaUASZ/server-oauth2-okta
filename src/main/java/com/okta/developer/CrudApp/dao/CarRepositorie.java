package com.okta.developer.CrudApp.dao;

import com.okta.developer.CrudApp.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface CarRepositorie extends JpaRepository<Car,Long> {
}
