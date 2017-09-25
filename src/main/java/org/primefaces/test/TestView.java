package org.primefaces.test;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name = "testView")
@ApplicationScoped
public class TestView implements Serializable {
    
    private String testString;
    
	@ManagedProperty("#{carService}")
	private CarService service;
    
    @PostConstruct  
    public void init() {
        testString = "Welcome to PrimeFaces!!!";
        cars1 = service.createCars(10);
    }

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }
    
    private List<Car> cars1;
 
    public List<Car> getCars1() {
        return cars1;
    }
 
    public void setService(CarService service) {
        this.service = service;
    }
}
