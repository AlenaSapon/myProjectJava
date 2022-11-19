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
    Vendor Vendor; //subclass

    //String [] eventDescription добавить;
    String eventName;//убрать
    String eventDescription;//убрать
    BigDecimal price;
    boolean isFree; //no payment is needed
    String eventPlace;//убрать
    boolean isActual=true;
    int Likes=0; //?
    //Инициализируй значениями в конструкторе.
    int eventCapacity;

 //overloading of constructors
    void Event(){};
//конструкторы пишут без void
    public Event(String eventName, BigDecimal price, String eventPlace, int eventCapacity){
        //Здесь заменить String eventName на String [] eventDescription, как в main;
        //тогда в конструктор нужно добавить:
        /*
        * this.eventDescription=eventDescription; и сделать общий геттер
        * */
        this.setEventName(eventName);
        this.setEventPlace(eventPlace);
        this.setPrice(price);
        this.setEventCapacity(eventCapacity);
    };
    //Статический метод можно сделать по подобию стринга:
    static Event makeEventFromData(Vendor vendor, String eventName, BigDecimal price, String eventPlace, int eventCapacity) {
        Event newEvent = new Event(eventName, price, eventPlace, eventCapacity);
        newEvent.Vendor=vendor;
        return newEvent;
    }
    //И тогда можно делать Event так:
    //Event event= Event.makeEventFromData(vendor, eventName, price, eventPlace, eventCapacity);



    /*
    * public String getEventDescription() {
        return "Название мероприятия: "+eventDescription[0]+", краткое описание:" + eventDescription[1]+ ", место проведения: " +  eventDescription[2];
    }
    * */
    //и у вендора тоже все таким образом сократить

    // methods
    void updateEvent(){
    };

    //getters and setters
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isActual() {
        return isActual;
    }

    public void setActual(boolean actual) {
        isActual = actual;
    }

        public String getEventDescription() {
        return eventDescription;
    }
    public String getEventPlace() {
        return eventPlace;
    }


    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public int getCounterLikes() {
        return Likes;
    }

    public void setCounterLikes(int counterLikes) {
        this.Likes = counterLikes;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public int getEventCapacity() {
        return eventCapacity;
    }

    public void setEventCapacity(int eventCapacity) {
        this.eventCapacity = eventCapacity;
    }



    public void setEventPlace(String eventPlace) {
        this.eventPlace = eventPlace;
    }
}
