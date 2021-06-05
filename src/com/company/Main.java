package com.company;

public class Main {

    public static void main(String[] args) {
//        Dimensions dimensions = new Dimensions(20,20,5);
//	    Case theCase = new Case("220","Dell", "220", dimensions);
//
//	    Monitor theMonitor = new Monitor("27 inch Beast","Acer", 27, new Resolution(2540,1440));
//
//	    Motherboard theMotherboard = new Motherboard("Bj-200","Asus",4,6,"v2.33");
//
//	    PC thePc = new PC(theCase, theMonitor,theMotherboard);
//	    thePc.powerUP();

		Wall wall1 = new Wall("North");
		Wall wall2 = new Wall("South");
		Wall wall3 = new Wall("East");
		Wall wall4 = new Wall("West");

		Ceiling ceiling = new Ceiling(220, 3);
		Bed bed = new Bed("Modern", 4, 200,1,2);
		Lamp lamp = new Lamp("Classic", false, 2);

		Bedroom bedroom = new Bedroom("Alex", wall1,wall2,wall3,wall4,ceiling,bed,lamp);

		bedroom.makeBed();
		bedroom.getLamp().turnOn();

    }
}
