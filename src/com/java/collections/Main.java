package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Kasi", 8, 12);
        if(theatre.reserveSeat("A12")){
            System.out.println("Please Pay for A12");
        }
        else{
            System.out.println("Sold Out");
        }
        if(theatre.reserveSeat("D13")){
            System.out.println("Please Pay for D13");
        }
        else{
            System.out.println("Sold Out");
        }


        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00",13.00));
        priceSeats.add(theatre. new Seat("A00",16.00));
        Collections.sort(priceSeats,Theatre.PRICE_ORDER);
        printList(priceSeats);
    }

    private static void printList(List<Theatre.Seat> theatreList){
        for(Theatre.Seat seat : theatreList){
            System.out.print(" "+seat.getSeatNumber() +" $"+ seat.getPrice());
        }
        System.out.println();
        System.out.println("==================================================================");
    }
/*        theatre.getSeats();*/

//        if(theatre.reserveSeat("A01")){
//            System.out.println("Please Pay");
//        }
//        else{
//            System.out.println("Sold Out");
//        }
//        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
//        printList(seatCopy);
//        seatCopy.get(1).reserve();
//        if(theatre.reserveSeat("A02")){
//            System.out.println("Please pay");
//        }
//        else{
//            System.out.println("Seat already reserved");
//        }
//        Collections.reverse(seatCopy);
//        System.out.println("Printing reverse seatCopy");
//        printList(seatCopy);
//        System.out.println("Printing theatre.seat");
//        printList(theatre.seats);
//        Collections.shuffle(seatCopy);
//        System.out.println("Printing shuffled seatCopy");
//        printList(seatCopy);
//
//        Theatre.Seat minSeat = Collections.min(seatCopy);
//        Theatre.Seat maxSeat = Collections.max(seatCopy);
//        System.out.println("Min seat number of the seatCopy "+minSeat.getSeatNumber());
//        System.out.println("Max seat number of the seatCopy "+maxSeat.getSeatNumber());
//        sortList(seatCopy);
//        System.out.println("Sorted seatCopy");
//        printList(seatCopy);
//
//
//        List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
//        Collections.copy(newList,theatre.seats);
//        System.out.println("Printing ");
//
//    }


//    public static void sortList(List<Theatre.Seat> list){
//        for(int i = 0; i< list.size();i++){
//            for( int j = i+1; j< list.size();j++){
//                if(list.get(i).compareTo(list.get(j)) > 0){
//                    Collections.swap(list,i,j);
//                }
//            }
//        }
//    }
}
