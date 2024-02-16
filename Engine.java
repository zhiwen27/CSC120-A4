public class Engine {

    FuelType Fuel;
    private double CurrentFuelLevel;
    double MaxFuelLevel;
    // Define the public double rate which represents the hourly fuel consumption
    private double Rate;

    /**
     * Constructer for the Engine class
     * @param Fuel fueltype
     * @param CurrentFuelLevel current fuel level
     * @param MaxFuelLevel maximum fuel level
     */
    public Engine(FuelType Fuel, double CurrentFuelLevel, double MaxFuelLevel){
        this.Fuel = Fuel;
        this.CurrentFuelLevel = CurrentFuelLevel;
        this.MaxFuelLevel = MaxFuelLevel;
    }

    /**
     * Setter for current fuel level
     * @param newFuelLevel updated fuel level
     */
    public void setCurrentFuel(double newFuelLevel){
        this.CurrentFuelLevel = newFuelLevel;
    }

    /**
     * Getter for current fuel level
     * @return current fuel level
     */
    public double getCurrentFuel(){
        return this.CurrentFuelLevel;
    }

    /**
     * Setter for hourly consumption rate
     * @param newRate set (arbitrary) consumption rate
     */
    public void setRate(double newRate){
        this.Rate = newRate;
    }

    /**
     * Getter for hourly consumption rate
     * @return return the consumption rate
     */
    public double getRate(){
        return this.Rate;
    }
    
    /**
     * Refuel the engine
     * @return set the current fuel level to the maximum fuel value and return
     */
    public void refuel(){
        this.CurrentFuelLevel = this.MaxFuelLevel;
    }

    /**
     * Getter for maximum fuel level
     * @return return true if the remain fuel is above 0, otherwise, return false
     */
    public boolean go(){
        if (this.CurrentFuelLevel > 0){
            System.err.println("The remaining fuel level of the engine is" + this.CurrentFuelLevel);
            this.CurrentFuelLevel -= this.Rate;
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