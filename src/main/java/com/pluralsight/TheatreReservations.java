package com.pluralsight;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TheatreReservations {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        //BEGIN
        System.out.println("Greetings peasant! What be thy name? ");
        String name = keyBoard.nextLine();
       String[] names = name.split("");
        //take me on a date
        System.out.println("What date, by the gods' grace, shalt thou arrive? MM/DD/YYYY ");
        String date = keyBoard.nextLine();
        //I can't figure out for the life of me how to make the dates match up
        //Will work on this in the future
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM,DD,YYYY");
        String date_input = ("10-10-2023");
        //tickets pls
        System.out.println("How many tickets wilt thou purchase? ");
        int tickets = keyBoard.nextInt();

        //collate it all together
        System.out.println("Confirmation:");
        System.out.println("Name: " + name);
        System.out.println("Date: " + date_input);
        System.out.println("Number of Ticket(s): " + tickets);




        System.out.println("Summary: Thou Purchased " + tickets + " Ticket(s), for " + date + ", under the name of " + name);
        System.out.println("Thank thee kindly for thy patronage.");








    }
}
