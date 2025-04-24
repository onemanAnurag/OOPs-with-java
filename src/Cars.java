public class Cars {
    int noofwheels;
    String color;
    float maxspeed;
    float currentFuelInliters;
    int noofsheats;

    public void start(){
        if (currentFuelInliters == 0){
            System.out.println("Car is out of fuel");
        }
        else if (currentFuelInliters<5){
            System.out.println("Car is in reserved mode,please refuel");
            currentFuelInliters--;
        }
        else {
            System.out.println("Car is started...bruhhhh...");
        }
    }

    public void drive(){
        currentFuelInliters--;
        System.out.println("car is driving");


    }
    public void addfuel(float fuel){
        currentFuelInliters+=fuel;
    }
    public float getcurrentfuellevel(){
        return currentFuelInliters;
    }

}
