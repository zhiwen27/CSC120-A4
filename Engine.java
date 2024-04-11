public class Engine {

    private FuelType fuel;
    private double currentFuelLevel;
    private double maxFuelLevel;
    // Define the public double rate which represents the hourly fuel consumption
    private double rate;

    /**
     * Constructer for the Engine class
     * @param fuel fueltype
     * @param currentFuelLevel current fuel level
     * @param maxFuelLevel maximum fuel level
     */
    public Engine(FuelType fuel, double currentFuelLevel, double maxFuelLevel){
        this.fuel = fuel;
        this.currentFuelLevel = currentFuelLevel;
        this.maxFuelLevel = maxFuelLevel;
    }

    /**
     * Setter for current fuel level
     * @param newFuelLevel updated fuel level
     */
    public void setCurrentFuel(double newFuelLevel){
        this.currentFuelLevel = newFuelLevel;
    }

    /**
     * Getter for current fuel level
     * @return current fuel level
     */
    public double getCurrentFuel(){
        return this.currentFuelLevel;
    }

    /**
     * Setter for max fuel level
     * @return max fuel level
     */
    public void setMaxFuel(double d){
        this.maxFuelLevel = d;
    }

    /**
     * Setter for hourly consumption rate
     * @param newRate set (arbitrary) consumption rate
     */
    public void setRate(double newRate){
        this.rate = newRate;
    }

    /**
     * Getter for hourly consumption rate
     * @return return the consumption rate
     */
    public double getRate(){
        return this.rate;
    }

    /**
     * Setter for the fuel type
     * @param f the type of the fuel you want
    */
    public void setFuelType(FuelType f){
        this.fuel = f;
    }
    
    /**
     * Refuel the engine
     * @return set the current fuel level to the maximum fuel value and return
     */
    public void refuel(){
        this.currentFuelLevel = this.maxFuelLevel;
    }

    /**
     * Getter for maximum fuel level
     * @return return true if the remain fuel is above 0, otherwise, return false
     */
    public boolean go(){
        if (this.currentFuelLevel > 0){
            System.err.println("The remaining fuel level of the engine is" + this.currentFuelLevel);
            this.currentFuelLevel -= this.rate;
            return true;
        }
        else{
            return false;
        }
    }
    // sample test
    /*
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0, 125.0);
        myEngine.setRate(2.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    } */
}