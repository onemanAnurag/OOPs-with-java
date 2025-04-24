sealed class Vehicle permits Car,Bike,Scooter
{
  public void speed(){
      System.out.println("speed of vehicle upto200");
  }
}
final class Car extends Vehicle
{

}
sealed class Bike extends Vehicle permits SportsBike,SimpleBike
{

}
non-sealed class Scooter extends Vehicle
{

}
final class SportsBike extends Bike{

}
final class SimpleBike extends Bike{

}

public class SealedClass {
    public static void main(String[] args) {

    }
}
