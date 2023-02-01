package session7;

public abstract class Phone {
    public abstract void insertPhone(String name,String phone);
    public abstract void removePhone(String name);
    public abstract void updatePhone(String name, String oldPhone,String newPhone);
    public abstract PhoneNumber searchPhone(String name);
    abstract void sort();
}
