import java.util.HashMap;

public class PhoneBook {

    private HashMap<String, String > phoneBook= new HashMap();


    public void add (String name, String phone){
        this.phoneBook.put(name, phone);
    }

    public HashMap<String, String> getPhoneBook() {
        return phoneBook;
    }
}
