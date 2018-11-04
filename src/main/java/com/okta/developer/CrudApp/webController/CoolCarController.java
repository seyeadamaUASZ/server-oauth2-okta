package com.okta.developer.CrudApp.webController;

import com.okta.developer.CrudApp.dao.CarRepositorie;
import com.okta.developer.CrudApp.models.Car;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class CoolCarController {

    private CarRepositorie repositorie;

    public CoolCarController(CarRepositorie carRepositorie){
        this.repositorie=carRepositorie;
    }
    @GetMapping("/cool-cars")
    @CrossOrigin(origins="http://localhost:4200")
    public Collection<Car> coolCars(){
        return repositorie.findAll().stream()
                .filter(this::isCool)
                .collect(Collectors.toList());
    }

    private boolean isCool(Car car) {
        return !car.getName().equals("AMC Gremlin") &&
                !car.getName().equals("Triumph Stag") &&
                !car.getName().equals("Ford Pinto") &&
                !car.getName().equals("Yugo GV");
    }
}
