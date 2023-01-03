package Event;

import User.Admin;
import User.Vendor;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Welcome to EventBY!\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Do you want to continue as...\n 1.Vendor\n 2.User\n 3.Admin\n Your choice: ");
        
        int choice = in.nextInt();
        
        while (!(choice == 1 || choice== 2 || choice == 3)) {
            System.out.println("Incorrect entered value: " + in.nextInt() + ". Expected: 1, 2 or 3. \nYour choice:");
            in.next();
        }
        
        //my proposal:
        int choice;        
       //First need to create cyclic input with do - while. 
        do {
            try{
                choice = in.nextInt(); //Throws: InputMismatchException – if the next token does not match the Integer regular expression, or is out of range
            } catch (InputMismatchException exception) {
                choice=0; //If thrown InputMismatchException, then choice=0;
            }
            //And check for incorrect input :
            if((choice == 1 || choice == 2 || choice == 3)) {                
                break;
            } else {
                System.out.println("Incorrect entered value: " //it is incorrect because you read next input: + in.nextInt()  
                + ". Expected: 1, 2 or 3. \nYour choice:");
            }
            in.next();
        } while (true);
        //but better way to use: String str = in.next(); try{choice=Integer.parseInt(str)} catch(NumberFormatException e) {choice=0;}
        //And in this case you can print incorrect input: str;
        //System.out.println("Incorrect entered value: " + str + ". Expected: 1, 2 or 3. \nYour choice:");
        
        
        
        
        switch (choice){
            case 1: {System.out.println("You are logged in as Vendor.");}; break;
            case 2: {System.out.println("You are logged in as User.");}; break;
            case 3: {System.out.println("You are logged in as Admin.");}; break;
        }*/

        Vendor vendor1 = new Vendor("Vendor1", "Heaven 7", "+123456789");
        Vendor vendor2 = new Vendor("Vendor2", "Earth 7", "+987654321");
        Vendor vendor3 = new Vendor("Vendor3", "Hell 7", "+1234567898");

        String[] eventDescription1 = {"Wedding", "Wedding description", "Av. Garden 102"};
        Event event1 = vendor1.createEvent(eventDescription1, new BigDecimal(100.25));
        System.out.println(event1.getEventDescription());
        System.out.println("Price: " + event1.getPrice());
        System.out.println("Amount of events of the vendor '" + vendor1.getUserName() + "' is " + vendor1.eventCounter + "\n");

        String[] eventDescription2 = {"Big Dance", "We help you to be as big bang!", "Lenina 52"};
        Event event2 = vendor1.createEvent(eventDescription2, new BigDecimal(100000));
        System.out.println(event2.getEventDescription());
        System.out.println("Price: " + event2.getPrice());
        System.out.println("Amount of events of the vendor '" + vendor1.getUserName() + "' is " + vendor1.eventCounter + "\n");

        //another way to create event
        System.out.println("Another way to create vendor and Event using class 'Vendor' in class 'Event' as field");
        Event event3 = new Event(vendor1, "Wild life", "Wild life description", "Nordic Forest 5", new BigDecimal(450));
        System.out.println(event3.getEventDescription());
        System.out.println("Price: " + event3.getPrice() + "\n");

        Event event4 = new Event(vendor2, "Simple event on the Earth", "Simple event description", "Earth planet 003", new BigDecimal(250));
        System.out.println(event4.getEventDescription());
        System.out.println("Price: " + event4.getPrice());

        Admin.showVendorsList();
        Event.showEventsList();

    }
}
