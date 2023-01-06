package session3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        Car c = new Car("Audi","A6",14);
//        System.out.println(c.getBrand());
//
//        int x = 10;
//        int[] arr = new int[5];
//        for(int i=0;i < arr.length;i++){
//            arr[i] = i+3;
//        }
//
//        Car[] cars = new Car[3];
//        for(int i=0;i< cars.length;i++){
//            cars[i] = new Car("Mec","E350",14);
//        }

        //tao 1 lop car gom: brand, name, price
        //tao 1 arraylist car, sau do sap xep theo gia tang dan
        Car[] hs = new Car[5];
        ArrayList<Car> ls = new ArrayList<>();
        ls.add(new Car("Mec","MayBach S650",14));
        ls.add(new Car("Audi","Audi A6",2.5));
        ls.add(new Car("Lexus","LX570",10));

        Collections.sort(ls, new Comparator<Car>() {
            @Override
            public  int compare(Car o1, Car o2) {
                return o1.getPrice() - o2.getPrice() > 0? 0:-1;
            }
        });
        ls.get(0).inCar();
        ls.get(1).inCar();
        ls.get(2).inCar();
    }
}
