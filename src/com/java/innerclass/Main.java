package com.java.innerclass;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");
    public static void main(String[] args){
//        GearBox mclaren = new GearBox(6);
//        mclaren.addGear(1,5.3);
//        mclaren.addGear(2,10.6);
//        mclaren.addGear(3,15.9);
//        mclaren.operateClutch(true);
//        mclaren.changeGear(1);
//        mclaren.operateClutch(false);
//        System.out.println(mclaren.wheelSpeed(1000));
//        mclaren.changeGear(2);
//        System.out.println(mclaren.wheelSpeed(3000));
//        mclaren.operateClutch(true);
//        mclaren.changeGear(3);
//        mclaren.operateClutch(false);
//        System.out.println(mclaren.wheelSpeed(5000));
        // cant create a instance of inner class without the outer class
//        GearBox.Gear second = new GearBox.Gear(2,15.3);
//        GearBox.Gear third = new GearBox.Gear(3,17.8)
//        System.out.println(first.driveSpeed(1000));
//            class ClickListener implements Button.OnClickListener{
//                public ClickListener(){
//                    System.out.println("I've been attached");
//                }
//
//                @Override
//                public void onClick(String title) {
//                    System.out.println(title +" was clicked");
//                }
//            }
//            using local class
//            btnPrint.setOnClickListener(new ClickListener());
            //using anonymous class
            btnPrint.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(String title) {
                    System.out.println(title +" was clicked");
                }
            });
            listen();
    }

    private static void listen()
    {
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }

    }
}
