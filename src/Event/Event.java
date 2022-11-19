package Event;

import User.Vendor;
import java.math.BigDecimal;
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

    protected String [] eventDescription;
    protected String eventDescription2;
    protected BigDecimal price;
    //int Likes=0;
    //int eventCapacity;



 //overloading of constructors
    Event(){};

    public Event(Vendor vendor, String eventName, String eventDescription, String eventPlace, BigDecimal price){

        this.vendor=vendor;
        this.eventDescription = new String[3];
       this.eventDescription[0]=eventName;
        this.eventDescription[1]=eventDescription;
        this.eventDescription[2]=eventPlace;
        this.price = price;
        vendor.eventCounter++;
            };

        public Event(Vendor vendor,String[] eventDescription, BigDecimal price){

        this.vendor=vendor;
        this.eventDescription = eventDescription;
        this.price = price;
        };
    //static method
        static void updateEvent(Event event, Vendor vendor, String[] eventName, BigDecimal price) {
            if(vendor!=null){ event.vendor = vendor;}
            if (eventName!=null){event.eventDescription = eventName;}
            if (price!=null){event.price = price;}
                       }

    //И тогда можно делать Event так:
    //Event event= Event.makeEventFromData(vendor, eventName, price, eventPlace, eventCapacity);

    public String getEventDescription() {
        String str = this.vendor.toString();
            return str + "\nEvent name: "+eventDescription[0]+"," +
                    "\nShort description: " + eventDescription[1]+ "," +
                    "\nEvent takes place: " +  eventDescription[2];
    }

       public BigDecimal getPrice() {
        return price;
    }


    public String EventDescription() { return eventDescription2;
    }
}

