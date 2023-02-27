public class Main {
    public static void main(String[] args) {
        Contact contact1=new Contact(220744449,"Oksana");
        Contact contact2=new Contact(220000000,"Aizat");
        Contact contact3=new Contact(2207489,"Ernazar");
   Contact[] contacts={contact1,contact2,contact3};

   Phone phone=new Phone("Redmi","mio",2020,contacts);
phone.turnOn();

        System.out.println("---Contact search and call---  ");
    phone.call(220000000);
     phone.call1("Aizat");

        System.out.println("----Search contact");
        System.out.println(phone.searchContact("Aizat").getFullName());
        System.out.println("---Rename a contact---");
        System.out.println(phone.upDateName("Aizat","Aizat"));
        phone.getAllContacts();

    }
}