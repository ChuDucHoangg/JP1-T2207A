package session3;

public class Car {
    private  String brand;
    private  String name;
    private double price;

    public Car() {
    }

    public Car(String brand,String name,double price){
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void inCar(){
        System.out.println("Hang Xe:" +brand);
        System.out.println("Ten Xe:" +name);
        System.out.println("Gia Xe:" +price);
    }

}
