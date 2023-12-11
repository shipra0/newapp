package org.example;

public class MethodMain {

    public static void main(String[]args){
//        Bicycle bicyle = new Bicycle(10,1);
//        System.out.println("Bicycle gear is"+ bicyle.gear);
//        System.out.println("Bicyle speed is"+ bicyle.speed);
//        bicyle.applyBrake(1);
//        System.out.println("Bicyle speed after applying breaks"+ bicyle.speed);

        Bicycle mountainBike = new MountainBike(50,50,3);
        System.out.println("MountainBike Gear is"+ mountainBike.gear);
        System.out.println("MountainBike speed is "+ mountainBike.speed);

        mountainBike.applyBrake(1);
        System.out.println("MountainBike speed after applying break is"+ mountainBike.speed);

        mountainBike.speedUp(10);
        System.out.println("Bike speed after speeding up is " + mountainBike.speed);

    }
}
