import java.util.ArrayList;

public class Workshop<T extends Vehicle> {
    private int capacity;
    private ArrayList<T> vehicles = new ArrayList<>();
    
	public Workshop(int capacity) {
        this.capacity = capacity;
    }

    public void registerVehicle(T vehicle) {
        if (vehicles.size() < capacity) {
            vehicles.add(vehicle);
        }
    }

    public ArrayList<T> getVehicles() {
        return vehicles;
    }

    public T releaseVehicle(int index) {
        return index < 0 || index >= vehicles.size() ? null : vehicles.remove(index);
    }

}
