import java.util.*;

public class Problem8ParkingLot {

    String[] spots = new String[10];

    public int parkVehicle(String plate){

        int index = Math.abs(plate.hashCode()) % spots.length;

        while(spots[index] != null){
            index = (index + 1) % spots.length;
        }

        spots[index] = plate;

        return index;
    }

    public void exitVehicle(String plate){

        for(int i=0;i<spots.length;i++){

            if(plate.equals(spots[i])){

                spots[i] = null;

                System.out.println("Vehicle exited from spot "+i);
            }
        }
    }

    public static void main(String[] args){

        Problem8ParkingLot obj = new Problem8ParkingLot();

        int spot = obj.parkVehicle("ABC123");

        System.out.println("Parked at: "+spot);

        obj.exitVehicle("ABC123");
    }
}
