package com.sdg.core.java;

//http://javaeasy.weebly.com/types-of-coupling.html

class Traveler
{
    Car c=new Car();
    Bike bike=new Bike();
    void startJourney()
    {
       c.move();
    }
}
 
class Car
{
  void move()
  {
     // logic...
  }
}

class Bike
{
  void move()
  {
     // logic...
  }
}

public class Coupling {

}
