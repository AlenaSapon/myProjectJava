package User;

import Event.Event;

import java.math.BigDecimal;

public class Vendor extends User {
    static int role = 1;

    String address;
    String phone;
    public int eventCounter;

   // конструкторы вендоров


   public Vendor (String organizationName,  String address, String phone){
       super(organizationName);
       this.setOrganizationName(organizationName);
       this.setAddress(address);
       this.setPhone(phone);
       this.eventCounter=0;
   }

    //что может делать вендор с иветами
   public Event createEvent(String[] eventDescription, BigDecimal price){
       Event event = new Event(this, eventDescription, price);
       eventCounter++;
       return event;
          };

  @Override// showVendorDetails()
   public String toString(){
       String details = "Vendor name: " + this.userName + ", Address: " + this.address + ", phone: " + this.phone +".";
       return details;
   }

    //геттеры сеттеры
    public String getOrganizationName() {
        return userName;
    }
    public void setOrganizationName(String organizationName) {
        this.userName = organizationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getEventCounter() {
        return eventCounter;
    }

    public void setEventCounter(int eventCounter) {
        this.eventCounter = eventCounter;
    }
}
