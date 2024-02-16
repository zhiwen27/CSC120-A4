public class Passenger {
    
    private String name;

    /**
     * Setter for name
     * @param name the name for passengers
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Getter for name
     * @return passenger's name
     */
    public String getName(){
        return this.name;
    }

    /**
     * Constructer for the Passenger class
     * @param name name of the passengers
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Add a new passenger to the car
     * @param c add the passenger to the Car c if it's not full
     */
    public void boardCar(Car c) {
        c.addPassenger(this);
    }

    /**
     * Remove a passenger from the car
     * @param c remove the passenger to the Car c if the passenger is on board
     */
    public void getoffCar(Car c) {
        c.removePassenger(this);
    }

    // sample test
    /*
    public static void main(String[] args) {
        Passenger A = new Passenger("A");
        Passenger B = new Passenger("B");
        Passenger C = new Passenger("C");
        Passenger D = new Passenger("D");
        Passenger E = new Passenger("E");
        Passenger F = new Passenger("F");
        Car newCar = new Car(5);
        A.boardCar(newCar);
        B.boardCar(newCar);
        C.boardCar(newCar);
        D.boardCar(newCar);
        E.boardCar(newCar);
    } */
}
