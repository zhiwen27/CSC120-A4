import java.util.ArrayList;
public class Train {

    private Engine Engine;
    private ArrayList<Car> CarsAttached;

    /**
     * Constructer for the Train class
     * @param PassengersOnboard passengers currently on board
     * @param MaxCapacity max capacity
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.Engine.Fuel = fuelType;
        this.Engine.MaxFuelLevel = fuelCapacity;
        ArrayList<Car> CarsAttached = new ArrayList<Car>(nCars);
        this.CarsAttached = CarsAttached;
        for (int i = 0; i < nCars; i++){
            CarsAttached.get(i).MaxCapacity = passengerCapacity / nCars;
        }
    }

    /**
     * Getter for the engine
     * @return return engine
     */
    public Engine getEngine(){
        return this.Engine;
    }

    /**
     * Getter for the cars attached
     * @return return the ith car
     */
    public Car getCar(int i){
        return this.CarsAttached.get(i);
    }

    /**
     * Getter for the maximum total capacity across all Cars
     * @return the total capacity
     */
    public int getMaxCapacity(){
        int TotalCapacity = 0;
        for (int i = 0; i < this.CarsAttached.size(); i++){
            TotalCapacity += this.CarsAttached.get(i).MaxCapacity;
        }
        return TotalCapacity;
    }

    /**
     * Seats remaining
     * @return return the seats remaining
     */
    public int seatsRemaining(){
        int SeatsRemaining = 0;
        for (int i = 0; i < this.CarsAttached.size(); i++){
            SeatsRemaining += this.CarsAttached.get(i).seatsRemaining();
        }
        return SeatsRemaining;
    }

    public void printManifest(){
        for (int i = 0; i < this.CarsAttached.size(); i++){
            this.CarsAttached.get(i).printManifest();
        }
    }

    /*
    public static void main(String[] args) {
        Train newTrain = new Train(FuelType.ELECTRIC, 200, 6, 30);
    } */
}
