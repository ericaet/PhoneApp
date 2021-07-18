

import java.util.ArrayList;

public class Phone {

    /*
       1- Create instance variables
       phoneBrand, phoneModel, SerialNumber, passCode and ArrayList<Contact> allContact
       2- Create constructor to initialize this variables
       3- Create the method to add new contact this method take one parameter as Contact
       4- Create the method to print all Contacts' first and last name with phone number
       5- Create the method to update person's phone number. This method takes two parameter old phone number and new phone number
       6- Create the method to search with phone number and print all other information for person
       7- create the method to search with name of person and print phone number of person
       8- Create the method to update city of person with new city, you need two parameter one is phone number of person another is new email address.
       9- Create the method to update email address for person with new email address, you need two parameter oldEmail and newEmail

       In this contact list only two things are unique Phone number and email address. You can not store same phone number and email address two times
       because of that before adding the new contact you need to make sure this phone number is not exist in your Contact arraylist.
     */
    String phoneBrand;
    String phoneModel;
    long serialNumber;
    long passcode;
    public ArrayList<Contact>allContact;

    public Phone(String phoneBrand, String phoneModel, long serialNumber, long passcode, ArrayList<Phone> allContact) {
        this.phoneBrand = phoneBrand;
        this.phoneModel = phoneModel;
        this.serialNumber = serialNumber;
        this.passcode = passcode;

    }

    public void newContact(String contact){

    }


    public void allContacts(String firstName,String lastName, String phoneNumber){
        System.out.println(firstName + lastName + phoneNumber);

    }

    public void updatePhoneNumber(String oldPhoneNumber,String newPhoneNUmber){


    }

//    public static void main(String[] args) {
//        Phone ph=new Phone;
//        ph.updatePhoneNumber("2133456123", "2135678976");
//
//    }
//








//
//    public static void main(String[] args) {
//        ArrayList<Contact> cont = new ArrayList<>();
//        cont.add();
//    }
//










    }





