import java.util.ArrayList;
public class Car {
    ArrayList<Passenger> PassengersOnboard;
    int MaxCapacity;
    /**
     * Constructer for the Car class
     * @param PassengersOnboard passengers currently on board
     * @param MaxCapacity max capacity
     */
    public Car(int MaxCapacity){
        this.MaxCapacity = MaxCapacity;
        ArrayList<Passenger> PassengersOnboard = new ArrayList<Passenger>(MaxCapacity);
        this.PassengersOnboard = PassengersOnboard;
    }

    /**
     * Get the number of seats remaining
     * @return the number of seats remaining
     */
    public int seatsRemaining(){
        return this.MaxCapacity - this.PassengersOnboard.size();
    }

    /**
     * Add a new passenger
     * @param p the new passenger
     * @return return true if add successfully, otherwise, return false
     */
    public boolean addPassenger(Passenger p){
        if (this.PassengersOnboard.size() < this.MaxCapacity){
            this.PassengersOnboard.add(p);
            System.out.println("Dear " + p.getName() + ", welcome aboard!");
            return true;
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
        boolean removeSuccessfully = this.PassengersOnboard.remove(p);
        if (removeSuccessfully == false){
            System.out.println("Oops! Passenger " + p.getName() + " is not on board!");
        }
        else{
            System.out.println("Sorry, passenger " + p.getName() + " is no longer on board.");
        }
        return removeSuccessfully;
    }

    /**
     * Print out the passengers in the car; print out nothing if there is no one in the car
     */
    public void printManifest(){
        if (this.PassengersOnboard.size() != 0){
            for (int i = 0; i < this.PassengersOnboard.size(); i++){
                System.out.println(this.PassengersOnboard.get(i).getName());
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