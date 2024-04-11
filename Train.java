import java.util.ArrayList;
public class Train {

    private final Engine engine;
    private ArrayList<Car> carsAttached;

    /**
     * Constructer for the Train class
     * @param fuelType the type of the fuel
     * @param fuelCapacity the capacity of the fuel
     * @param nCars the number of cars attached
     * @param passengerCapacity the capacity of passengers
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, fuelCapacity, fuelCapacity);
        this.engine.setFuelType(fuelType);
        this.engine.setMaxFuel(fuelCapacity);;
        this.carsAttached = new ArrayList<Car>(nCars);
        for (int i = 0; i < nCars; i++){
            this.carsAttached.add(new Car(passengerCapacity / nCars));
        }
    }

    /**
     * Getter for the Engine
     * @return return Engine
     */
    public Engine getEngine(){
        return this.engine;
    }

    /**
     * Getter for the cars attached
     * @return return the ith car
     */
    public Car getCar(int i){
        return this.carsAttached.get(i);
    }

    /**
     * Getter for the maximum total capacity across all Cars
     * @return the total passenger capacity
     */
    public int getMaxCapacity(){
        int TotalCapacity = 0;
        for (int i = 0; i < this.carsAttached.size(); i++){
            TotalCapacity += this.carsAttached.get(i).getMaxCapacity();
        }
        return TotalCapacity;
    }

    /**
     * Seats remaining
     * @return return the seats remaining
     */
    public int seatsRemaining(){
        int SeatsRemaining = 0;
        for (int i = 0; i < this.carsAttached.size(); i++){
            SeatsRemaining += this.carsAttached.get(i).seatsRemaining();
        }
        return SeatsRemaining;
    }

    public void printManifest(){
        for (int i = 0; i < this.carsAttached.size(); i++){
            this.carsAttached.get(i).printManifest();
        }
    }

    // sample test
    /*
    public static void main(String[] args) {
        Train newTrain = new Train(FuelType.ELECTRIC, 200, 6, 30);
        Passenger A = new Passenger("A");
        Passenger B = new Passenger("B");
        newTrain.getCar(0).addPassenger(A);
        System.out.println(newTrain.seatsRemaining());
        newTrain.carsAttached.get(1).addPassenger(B);
        newTrain.carsAttached.get(0).removePassenger(A);
        System.out.println(newTrain.seatsRemaining());
    } */
}
