package com.company;

// [MDTUDDM] Project interview
//  Input:
//  Car List contains cars: new Car (toyota,130, Corolla); new Car("toyota", 130, "C-HR"); new Car (toyota,150, Yaris); new Car (toyota,180, RAV4).
//
//  Tasks:
//    1. Find cars with speed < 150;
//    2. Find the car with max speed.

import java.util.ArrayList;
import java.util.List;

public class CarOverrided {
    private String brand;
    private String model;
    private int speed;

    public CarOverrided() {
        this.brand = "";
        this.model = "";
        this.speed = 0;
    }

    public CarOverrided(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "The car is " + this. getBrand() + " " + this.getModel() + " " + this.getSpeed();
    }

    @Override
    public Object clone(){
        CarOverrided car = new CarOverrided();
        car.brand = this.brand;
        car.model = this.model;
        car.speed = this.speed;
        return car;
    }
//    Это избавляет от необходимости обрабатывать CloneNotSupportedExeption,
//    работает с полями final и не нужно беспокоиться о типа который нужно вернуть.

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;

        result = prime * result + ((this.getBrand() == null ? 0 : this.getBrand().hashCode()));
        result = prime * result + ((this.getModel() == null ? 0 : this.getModel().hashCode()));
        // как переменная класса int по умолчанию инициализируется как 0
        result = prime * result + ((this.getSpeed() == 0 ? 0 : this.getSpeed()));

        return result;
    }
//  Контракт hashCode():
//    - вызов hashCode над одним объектом должен возвращать одно и то же значение при условии что объект не менялся;
//    - вызов hashCode над двумя оъектами должен возвращать одно и то же значение при условии что объекты равны;
//    - вызов hashCode над неравными оъектами должен возвращать разные значения. Для этого правила могут быть исключения.

    @Override
    public boolean equals(Object obj){ // ArrayList работает с классом Object поэтому Object в качестве параметра
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        CarOverrided car = (CarOverrided) obj;
        return brand == car.brand || (brand != null && brand.equals(car.getBrand())) &&
                model == car.model || (model != null && model.equals((car.getModel()))) &&
                speed == car.speed;
    }
//    Основная идея:
//    - если ссылки равны - объекты равны;
//    - если классы разные - объекты не равны;
//    - и если поля равны - объекты равны.

//    Контракт equals:
//    1. Рефлексивность - если x != null то x.equals(x) = true.
//    2. Симметричность - если x.equals(e) = true то y.equals(x) = true.
//    3. Транзитивность - если x.equals(y) = true и y.equals(z) = true то x.equals(z) = true должно вернуть true.
//    4. Согласованность - повторный вызов x.equals(y) будет возвращать значение предыдущего вызова этого метода
//      при условии, что поля не изменялись между вызовами.
//    5. Сравнение null - для любого заданного значения x вызов x.equals(null) должно возвращать false.


    public static void main(String[] args) {

        List<CarOverrided> cars = new ArrayList<>();
        cars.add(new CarOverrided("toyota", "Corolla", 130));
        cars.add(new CarOverrided("toyota", "C-HR", 130));
        cars.add(new CarOverrided("toyota", "RAV4", 180));
        cars.add(new CarOverrided("toyota", "Yaris", 150));

        int i;
        for (i = 0; i < cars.size(); i++){
            if (cars.get(i).getSpeed() > 150) {
                System.out.println(cars.get(i)); // return 'object Car'
                System.out.println(cars.get(i).toString());
            }
        }
    }
}









