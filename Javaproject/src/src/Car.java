package src;

public class Car {
int carModel;
String carName;
String carColor;


public Car(int carModel, String carName, String carColor) {
	this.carModel = carModel;
	this.carName = carName;
	this.carColor = carColor;
}


public Car(int carModel, String carName) {
	this.carModel = carModel;
	this.carName = carName;
}


public static void main(String[] args) {
    Car car = new Car(2332, "Vilvo");
    System.out.println(car.carModel+" "+car.carName);
    Car car1 = new Car(1111, "UV","RED");
    System.out.println(car.carModel+" "+car.carName+" "+car1.carColor);
   
}

}
