package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("Tesla", 1, 100));
        carList.add(new Car("BMW", 2, 200));
        carList.add(new Car("Audi", 3, 300));
        carList.add(new Car("Lada", 4, 40));
        carList.add(new Car("Mercedes", 5, 500));
    }

    @Override
    public List<Car> getCountCar(int count) {
        return (count >= 5) ? carList : carList.subList(0, count);

    }
}
