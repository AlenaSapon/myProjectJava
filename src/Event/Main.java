package Event;

import User.Vendor;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to EventBY!");
        Vendor vendor1 = new Vendor("Vendor1", "Heaven 7", "+123456789");
        String[] eventDescription1 = {"Wedding","Wedding description","Av. Garden 102"};
        Event event1 = vendor1.createEvent(eventDescription1, new BigDecimal(100.25));
        String[] eventDescription2 = {"Big Dance","We help you to be as big bang!","Lenina 52"};
        Event event2 = vendor1.createEvent(eventDescription2, new BigDecimal(100000));
        System.out.println();
        System.out.println(event1.getEventDescription());
        System.out.println("Price: " + event1.getPrice()+ "\n");
        System.out.println(event2.getEventDescription());
        System.out.println("Price: " + event2.getPrice()+ "\n");
        System.out.println("Amount of events of the vendor '" + vendor1.getUserName() + "' is " + vendor1.eventCounter);


    }
}
