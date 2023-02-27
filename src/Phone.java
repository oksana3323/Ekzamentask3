import java.util.Arrays;
import java.util.Scanner;

public class Phone implements Phonelterface {


    private String brand;
    private String name;
    private int password;
    Contact[] contacts;

    public Phone(String brand, String name, int password, Contact[] contacts) {
        this.brand = brand;
        this.name = name;
        this.password = password;
        this.contacts = contacts;
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

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public void turnOn() {
        System.out.println("Hello");
        int password1 = new Scanner(System.in).nextInt();
        if (password1 == password) {
            System.out.println("Телефон жанды");
        } else {
            System.out.println("Ishtebeit");
        }
    }

    @Override
    public void call(int number) {
        for (Contact con : contacts) {
            if (con.getPhoneNumber() == number) {
                System.out.println("CALL: " + con.getFullName() + " " + con.getPhoneNumber());
            }
        }

    }


    @Override
    public void call1(String name) {
        for (Contact contact : contacts) {
            if (contact.equals(name)) {
                System.out.println("Call:" + contact.getFullName() + " " + contact.getPhoneNumber());
            }
        }


    }

    @Override
    public Contact searchContact(String name1) {
        for (Contact contact : contacts) {
            if (contact.getFullName().equals(name1)) {
                return contact;
            }

        }
        return null;
    }

    @Override
    public Contact upDateName(String oldname, String newName) {
        for (Contact contact : contacts)
            if (contact.getFullName().equals(oldname)) {
                contact.setFullName(newName);
                return contact;
            }
        return null;
    }


    @Override
    public void getAllContacts() {
        for (Contact contact2 : contacts) {
            System.out.println(contact2.getFullName() + contact2.getPhoneNumber());
        }

    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", password=" + password +
                ", contacts=" + Arrays.toString(contacts) +
                '}';
    }
}