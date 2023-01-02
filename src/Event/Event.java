package Event;

import User.Vendor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

//Вообще слишком много переменных, можно потеряться...
//Я бы удалил: boolean isFree - так как если цена установлена, тогда это false, иначе true.
//Также бы удалил boolean isActual=true, а ввел бы просто дату мероприятия, чтобы система сравнивала с текущей датой.
//На самом деле класс нужно упростить: во первых всЁ описание можно сделать как массив стрингов:
//String [] eventDescription;
/*
 *
 *
 * */
public class Event {
    int Id;
    protected Vendor vendor; //subclass
    protected String[] eventDescription;
    protected String eventDescription2;
    protected BigDecimal price;
    static Event[] Events = {};
    int likes=0;
    //int eventCapacity;


    //overloading of constructors

    public Event(Vendor vendor, String eventName, String eventDescription, String eventPlace, BigDecimal price) {

        this.vendor = vendor;
        this.eventDescription = new String[3];
        this.eventDescription[0] = eventName;
        this.eventDescription[1] = eventDescription;
        this.eventDescription[2] = eventPlace;
        this.price = price;
        this.likes = 0;
        vendor.eventCounter++;
        Event.addEventToList(this);// передает и выводит ссылку - переделать!!!! добавить геттеры и сеттеры? есть другой способ?
    }
    public Event(Vendor vendor, String[] eventDescription, BigDecimal price) {

        this.vendor = vendor;
        this.eventDescription = eventDescription;
        this.price = price;
        Event.addEventToList(this);
    }
    public static void addEventToList(Event event) {
        ArrayList<Event> arrayList = new ArrayList<>(Arrays.asList(Events));
        arrayList.add(event);
        Events = arrayList.toArray(Events);
    }

    public static void showEventsList() {
        System.out.println("************ EVENT LIST ***************:");
        for (int i = 0; i < Events.length; i++) {
            System.out.println(Events[i]);
        }
        System.out.println("************* END of list ***************\n");
    }

    public String getEventDescription() {
        String str = this.vendor.toString();
        return str + "\nEvent name: " + eventDescription[0] + "," +
                "\nShort description: " + eventDescription[1] + "," +
                "\nEvent takes place: " + eventDescription[2];
    }

    public BigDecimal getPrice() {
        return price;
    }


    public String EventDescription() {
        return eventDescription2;
    }
}

