import java.util.ArrayList;
public class Car {
    private ArrayList<Passenger> passengersOnboard;
    private int maxCapacity;
    /**
     * Constructer for the Car class
     * @param passengersOnboard passengers currently on board
     * @param maxCapacity max capacity
     */
    public Car(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.passengersOnboard = new ArrayList<Passenger>(maxCapacity);
    }

    /**
     * Get the number of seats remaining
     * @return the number of seats remaining
     */
    public int seatsRemaining(){
        return this.maxCapacity - this.passengersOnboard.size();
    }

    /**
     * Add a new passenger
     * @param p the new passenger
     * @return return true if add successfully, otherwise, return false
     */
    public boolean addPassenger(Passenger p){
        if (this.passengersOnboard.size() < this.maxCapacity){
            if(!this.passengersOnboard.contains(p)){
                this.passengersOnboard.add(p);
                System.out.println("Dear " + p.getName() + ", welcome aboard!");
                return true;
            }
            else{
                System.out.println("Sorry, " + p.getName() + ", you cannot aboard again!");
                return false;
            }
        }
        else{
            System.out.println("Sorry, this car is full!");
            return false;
        }
    }

    /**
     * Remove a passenger
     * @param p the passenger to be removed
     * @return return true if the passenger is on board and is removed successfully, otherwise, return false
     */
    public boolean removePassenger(Passenger p){
        boolean removeSuccessfully = this.passengersOnboard.remove(p);
        if (removeSuccessfully == false){
            System.out.println("Oops! Passenger " + p.getName() + " is not on board!");
        }
        else{
            System.out.println("Sorry, passenger " + p.getName() + " is no longer on board.");
        }
        return removeSuccessfully;
    }

    /**
     * Getter for max capacity
     * @return return the max capacity of the car
     */
    public int getMaxCapacity(){
        return this.maxCapacity;
    }

    /**
     * Print out the passengers in the car; print out nothing if there is no one in the car
     */
    public void printManifest(){
        if (this.passengersOnboard.size() != 0){
            for (int i = 0; i < this.passengersOnboard.size(); i++){
                System.out.println(this.passengersOnboard.get(i).getName());
            }
        }
        else{
            System.out.println("This car is empty!");
        }
    }
    
    // sample test
    /*
    public static void main(String[] args) {
        Car newCar = new Car(5);
        Passenger A = new Passenger("A");
        Passenger B = new Passenger("B");
        Passenger C = new Passenger("C");
        Passenger D = new Passenger("D");
        Passenger E = new Passenger("E");
        Passenger F = new Passenger("F");
        newCar.addPassenger(A);
        newCar.addPassenger(B);
        newCar.addPassenger(C);
        newCar.addPassenger(D);
        newCar.addPassenger(E);
        newCar.addPassenger(F);
        System.out.println(newCar.seatsRemaining());
        newCar.removePassenger(B);
        System.out.println(newCar.seatsRemaining());
        newCar.printManifest();
    } */
}