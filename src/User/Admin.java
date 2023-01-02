package User;

import Event.Event;

import java.util.Arrays;
import java.util.ArrayList;

public class Admin extends User{
   static int role =0;

   static Vendor[] Vendors = {};
   static Customer[] Customers ={};

   static Event[] Events={};
   public Admin(String userName){super(userName);
   };
   public static void addVendorToAdminList(Vendor vendor) {
      ArrayList<Vendor> arrayList = new ArrayList<>(Arrays.asList(Vendors));
      arrayList.add(vendor);
      Vendors = arrayList.toArray(Vendors);
   }
   public static void showVendorsList(){
      System.out.println("************ VENDOR LIST ***************:");
      for (int i=0; i< Vendors.length; i++) {
         System.out.println(Vendors[i]);
         System.out.println("Amount of events of the vendor \"" +  Vendors[i].getUserName() + "\" is " + Vendors[i].eventCounter+".\n");
      }
      System.out.println("************* END of list ***************\n");}
   public static void addCustomerToList(Customer customer) {
      ArrayList<Customer> arrayList = new ArrayList<>(Arrays.asList(Customers));
      arrayList.add(customer);
      Customers = arrayList.toArray(Customers);
   }
   public static void showCustomers(){
      System.out.println("CUSTOMER LIST:");
      for (int i=0; i< Customers.length; i++) {
         System.out.println(Customers[i]);
      }
      System.out.println("END of list\n");}

   void banEvent(Event event){};
   void banUser(User user){};

}

