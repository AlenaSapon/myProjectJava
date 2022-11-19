package User;

import Event.Event;

public class Vendor extends User {
    static int role = 1;
    String organizationName;
    String address;
    String personToContact;
    String phone;
    int eventCounter = 0;

   // конструкторы вендоров
   void Vendor(){};
   void Vendor(String organizationName, String phone, int eventCounter){
       this.setOrganizationName(organizationName);
       this.setPhone(phone);
       this.setEventCounter(0);//?
   };
   void Vendor (String organizationName,  String address, String personToContact, String phone, int eventCounter){
       this.setOrganizationName(organizationName);
       this.setAddress(address);
       this.setPersonToContact(personToContact);
       this.setPhone(phone);
       this.setEventCounter(0);
   }

    //что может делать вендор с иветами
   int updateCounter(){
       int counter = this.eventCounter+1;
       return counter;
   }

    //геттеры сеттеры
    public String getOrganizationName() {
        return organizationName;
    }
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPersonToContact() {
        return personToContact;
    }

    public void setPersonToContact(String personToContact) {
        this.personToContact = personToContact;
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
