package Event;

import User.Vendor;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to EventBY!\n");
        Vendor vendor1 = new Vendor("Vendor1", "Heaven 7", "+123456789");
        Vendor vendor2 = new Vendor("Vendor2", "Earth 7", "+987654321");

        String[] eventDescription1 = {"Wedding","Wedding description","Av. Garden 102"};
        Event event1 = vendor1.createEvent(eventDescription1, new BigDecimal(100.25));
        System.out.println(event1.getEventDescription());
        System.out.println("Price: " + event1.getPrice());
        System.out.println("Amount of events of the vendor '" + vendor1.getUserName() + "' is " + vendor1.eventCounter+"\n");

        String[] eventDescription2 = {"Big Dance","We help you to be as big bang!","Lenina 52"};
        Event event2 = vendor1.createEvent(eventDescription2, new BigDecimal(100000));
        System.out.println(event2.getEventDescription());
        System.out.println("Price: " + event2.getPrice());
        System.out.println("Amount of events of the vendor '" + vendor1.getUserName() + "' is " + vendor1.eventCounter+"\n");

        //another way to create event
        System.out.println("Another way to create vendor and Event using class 'Vendor' in class 'Event' as field");
        Event event3 = new Event(vendor1, "Wild life", "Wild life description" , "Nordic Forest 5", new BigDecimal(450) );
        System.out.println(event3.getEventDescription());
        System.out.println("Price: " + event3.getPrice()+"\n");

        Event event4 = new Event(vendor2, "Simple event on the Earth", "Simple event description" , "Earth planet 003", new BigDecimal(250) );
        System.out.println(event4.getEventDescription());
        System.out.println("Price: " + event4.getPrice());

        System.out.println("Amount of events of the vendor '" + vendor2.getUserName() + "' is " + vendor2.eventCounter+"\n");
    }
}
