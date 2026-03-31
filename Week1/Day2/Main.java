import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ContactDetails{
    private long number;
    private String firstname;
    private String lastname;

    public ContactDetails(long number, String firstname, String lastname){
        this.number = number;
        this.firstname = firstname;
        this.lastname = lastname;
    }


    public long getNumber(){
        return  number;
    }

    public void setNumber(long number){
        this.number = number;
    }

    public String getFirstname(){
        return firstname;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }


    @Override
    public String toString(){
        return  getNumber() + " " + getFirstname() + " " + getLastname();
    }

}


/// PhoneBook Class

class Phonebook{
    List<ContactDetails> contactDetailsList = new ArrayList<>();

    Map<Long, ContactDetails> search = new HashMap<>();


    public void storeInMap(){
        for(ContactDetails details : contactDetailsList){
        search.put(details.getNumber(), details);
    }
    }



    public void addDetails(ContactDetails c){
        contactDetailsList.add(new ContactDetails(c.getNumber(), c.getFirstname(), c.getLastname()));
        // contactDetailsList.add(new ContactDetails(8135082382L, "Ashutosh", "Jha"));
        // contactDetailsList.add(new ContactDetails(8638280363L, "Ashutosh Kr", "Jha"));
    }

    public void showDetails(){
        for(ContactDetails cont : contactDetailsList){
            System.out.println(cont.toString());
        }
    }

    public void searchBynumber(long number){
        System.out.println("The Contact Info is: " + search.get(number));
    }

    public void searchBylastname(String lastname){
        for(ContactDetails last : contactDetailsList){
            if(last.getLastname() == lastname){
                System.out.println("The User with Specific last name is: " + last);
            }
        }
    }

    public void sortBylastname(){
        List<ContactDetails> sortedContacts = contactDetailsList;
        sortedContacts.sort((a, b) -> a.getLastname().compareTo(b.getLastname()));
        for(ContactDetails contact : sortedContacts){
            System.out.println(contact);
        }
    }

}

public class Main{
    public static void main(String[] args){

        Phonebook ph = new Phonebook();
        ph.addDetails(new ContactDetails(8135082381L, "Rahul", "Ray"));
        ph.addDetails(new ContactDetails(81350828761L, "Baroon", "Jha"));
        ph.addDetails(new ContactDetails(9365203842L, "Ashutosh", "Jha"));
        ph.addDetails(new ContactDetails(93652033732L, "Bimal", "Sharma"));
        ph.showDetails();
        ph.storeInMap();
        
        // ph.search.containsKey(9365203842L);
        // System.out.println(ph.search.containsKey(9365203842L));
        ph.searchBynumber(9365203842L);

        System.out.println("/////////////////////////////////////////////////");

        ph.searchBylastname("Ray");
        // System.out.println(ph.search);

        System.out.println("//////////////////////////////////////////////////");


        ph.sortBylastname();




    }
}