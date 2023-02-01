package session7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {
// chua bai
    public ArrayList<PhoneNumber> PhoneList = new ArrayList<>();

//    public ArrayList<String> getPhoneList() {
//        return PhoneList;
//    }

//    public void setPhoneList(ArrayList<String> phoneList) {
//        PhoneList = phoneList;
//    }

    @Override
    public void insertPhone(String name, String phone) {
//        boolean tim = false;
//        for (String s : PhoneList) {
//            if (s.contains(name)) {
//                tim = true;
//                if (!s.contains(phone)) {
//                    s += ":" + phone;
//                } else {
//                    System.out.println("Danh ba nay da co!");
//                }
//            }
//        }
//        if (!tim) {
//            PhoneList.add(name + " " + phone);
//        }

        //kiem tra name da co chua ?
        for (PhoneNumber p : PhoneList){
            if(p.name.equals(name)){
                if (p.danhsach.contains(phone)){
                    return;
                }
                p.danhsach.add(phone);
                return;
            }
        }
        // sau khi di het danh ba ma khong co ten nay
        PhoneNumber pn = new PhoneNumber(name,phone);
        PhoneList.add(pn);
    }

    @Override
    public void removePhone(String name) {
//        if (PhoneList.contains(name)) {
//            PhoneList.remove(name);
//        }
        for (PhoneNumber p : PhoneList){
            if(p.name.equals(name)){
                PhoneList.remove(p);
                return;
            }
        }
    }

    @Override
    public void updatePhone(String name, String oldPhone, String newPhone) {
//        if (PhoneList.contains(oldPhone)) {
//            int index = PhoneList.indexOf(oldPhone);
//            PhoneList.add(index, newPhone);
//        }
        for (PhoneNumber p : PhoneList){
            if(p.name.equals(name)){
                p.danhsach.remove(oldPhone);
                p.danhsach.add(newPhone);
                return;
            }
        }
    }

    @Override
    public PhoneNumber searchPhone(String name) {
        for (PhoneNumber pn : PhoneList) {
            if (pn.name.equals(name)) {
                return pn;
            }
        }
//        boolean search = false;
//        for (String s : PhoneList) {
//            if (s.contains(name)) {
//                search = true;
//                System.out.println(s.toString());
//                break;
//        if (!search) System.out.println("khong tin thay nguoi can tim");
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
        Collections.sort(PhoneList, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.name.compareTo(o2.name);
            }
        });
    }
}
