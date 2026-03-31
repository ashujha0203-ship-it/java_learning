package Week1.Day2;

import java.sql.DriverAction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class ContactDetails {


    private long number;
    private String firstname;
    private String lastname;


    public ContactDetails(long number, String firstname, String lastname){
        this.number = number;
        this.firstname = firstname;
        this.lastname = lastname;

    }




    public Long getNumber(){
        return number;
    }

    public void setNumber(Long number){
        this.number = number;
    }

    public String getName(){
        return firstname;
    }

    public void setName(String firstname){
        this.firstname = firstname;
    }


    public String getlastName(){
        return lastname;
    }

    public void setlastName(String lastname){
        this.lastname = lastname;
    }


}






class Phonebook{
    private List<ContactDetails> Details = new ArrayList<>();
    private Map<String, ContactDetails> search = new HashMap<>();
    private LinkedList<ContactDetails> searchByname = new LinkedList<>();
    // Details.add(8135082381L, "Rahul", "Ray");



    public void addContect(ContactDetails c){
        Details.add(c);
        search.put(c.getNumber().toString(), c);

    }

    public void ShowContact(){

        for (ContactDetails contactDetails : Details) {
             System.out.println(contactDetails.getNumber() + " " +  contactDetails.getName()+ " " + contactDetails.getlastName());
            
        }

    }

    public void searchByPhone(String number){
        System.out.println(search.get(number).getName());
        
    }

    public void searchByName(String firstname){
        System.out.println();
    }
}






public class Main {
    public static void main(String[] args){
        Phonebook add = new Phonebook();
        add.addContect(new ContactDetails(987654310, "rahu", "ketu"));

        // Phonebook show = new Phonebook();


        add.ShowContact();

        add.searchByPhone("987654310");
        
        // System.out.println(list);
    }
}
