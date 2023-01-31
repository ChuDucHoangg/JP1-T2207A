package session4;

import java.util.ArrayList;

public class PhoneNumberss4 {
    private String ten;
    private ArrayList<String> danhsach = new ArrayList<>();

    public PhoneNumberss4(){
    }

    public PhoneNumberss4(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public ArrayList<String> getDanhsach() {
        return danhsach;
    }

    public void setDanhsach(ArrayList<String> danhsach) {
        this.danhsach = danhsach;
    }

    public void addPhone(String danhsachphone){
        if(!this.getDanhsach().contains(danhsachphone)){
            danhsach.add(danhsachphone);
        }
    }

    public void updatePhone(String olddanhsachphone,String newdanhsachphone){
        if(danhsach.contains(olddanhsachphone)){
            int index = danhsach.indexOf(olddanhsachphone);
            danhsach.add(index,newdanhsachphone);
        }
    }

    public void deletePhone(String danhsachphone){
        if(danhsach.contains(danhsachphone)){
            danhsach.remove(danhsachphone);
        }
    }
}
