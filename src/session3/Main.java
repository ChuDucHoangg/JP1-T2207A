package session3;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("Audi","A6");
        System.out.println(c.getBrand());

        int x = 10;
        int[] arr = new int[5];
        for(int i=0;i < arr.length;i++){
            arr[i] = i+3;
        }

        Car[] cars = new Car[3];
        for(int i=0;i< cars.length;i++){
            cars[i] = new Car("Mec","E350");
        }
    }
}
