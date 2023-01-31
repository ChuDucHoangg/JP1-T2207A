package session7;

public class Main {
    public static void main(String[] args) {
        // khong the tao mot doi tuong tu lop truu tuong
        Asian a = new Asian();
        American am = new American();
        Human h = new Human() { //LOP AN DANH ANONYMOUS CLASS
            @Override
            public void eat() {

            }

            @Override
            public void sleep() {

            }
        };
    }
}
