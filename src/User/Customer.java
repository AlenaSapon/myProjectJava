package User;

import Event.Event;

public class Customer extends User {
    static int role = 2;
    String[] likedEvents;
    void likeEvent(Event event){
        return;
    };

    Customer (String userName){super(userName);};
    String showLikedEvents(){
        //немного переделал:
        String buffer="Пролайканные ивенты:";
        for (String likedEvent:likedEvents) {
            buffer+=", "+likedEvent;
        }
        buffer+=".";
        return buffer;
    }

   }
