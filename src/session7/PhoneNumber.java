package session7;

import java.util.ArrayList;

public class PhoneNumber {
    public String name;
    public ArrayList<String> danhsach = new ArrayList<>();

    public PhoneNumber() {
    }

//    public PhoneNumber(String name) {
//        this.name = name;
//    }
    public PhoneNumber(String name, String phone) {
        this.name = name;
        this.danhsach = new ArrayList<>();
        this.danhsach.add(phone);
    }

    public String getTen() {
        return name;
    }

    public void setTen(String name) {
        this.name = name;
    }

    public ArrayList<String> getDanhsach() {
        return danhsach;
    }

    public void setDanhsach(ArrayList<String> danhsach) {
        this.danhsach = danhsach;
    }
}
