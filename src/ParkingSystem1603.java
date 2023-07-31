import java.util.HashMap;
import java.util.Map;

public class ParkingSystem1603 {
    Map<Integer, Integer> slots;

    public ParkingSystem1603(int big, int medium, int small) {
        Map<Integer, Integer> slots = new HashMap<>();
        slots.put(1, big);
        slots.put(2, medium);
        slots.put(3, small);
        this.slots = slots;
    }

    public boolean addCar(int carType) {
        int remainSlots = this.slots.get(carType);
        if (remainSlots > 0) {
            this.slots.put(carType, remainSlots - 1);
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        ParkingSystem1603 parkingSystem = new ParkingSystem1603(1, 1, 0);
        System.out.println(parkingSystem.addCar(1)); // return true because there is 1 available slot for a big car
    }
}
