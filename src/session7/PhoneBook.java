package session7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {

    ArrayList<String> PhoneList = new ArrayList<>();

    public ArrayList<String> getPhoneList() {
        return PhoneList;
    }

    public void setPhoneList(ArrayList<String> phoneList) {
        PhoneList = phoneList;
    }

    @Override
    void insertPhone(String name, String phone) {
        boolean tim = false;
        for (String s : PhoneList) {
            if (s.contains(name)) {
                tim = true;
                if (!s.contains(phone)) {
                    s += ":" + phone;
                } else {
                    System.out.println("Danh ba nay da co!");
                }
            }
        }
        if (!tim) {
            PhoneList.add(name + " " + phone);
        }
    }

    @Override
    void removePhone(String name) {
        if (PhoneList.contains(name)) {
            PhoneList.remove(name);
        }
    }

    @Override
    void updatePhone(String name, String oldPhone, String newPhone) {
        if (PhoneList.contains(oldPhone)) {
            int index = PhoneList.indexOf(oldPhone);
            PhoneList.add(index, newPhone);
        }
    }

    @Override
    PhoneNumber searchPhone(String name) {
//        for (PhoneNumber pn : PhoneList) {
//            if (pn.getTen().contains(name)) {
//                return pn;
//            }
//        }
        boolean search = false;
        for (String s : PhoneList) {
            if (s.contains(name)) {
                search = true;
                System.out.println(s.toString());
                break;
            }
        }
        if (!search) System.out.println("khong tin thay nguoi can tim");
        return null;
    }

    @Override
    void sort() {
//            Collections.sort(PhoneList, new Comparator<PhoneNumber>() {
//                @Override
//                public int compare(PhoneNumber p1,PhoneNumber p2){
//                    return p1.getTen().compareTo(p2.getTen());
//                }
//            });
    }
}
