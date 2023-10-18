package dz2;

abstract class Vehicle {
  protected String company;
  protected String model;
  protected int yearRelease;
  protected int numWheels;
  protected int speed;


  public Vehicle(String company, String model, int yearRelease) {
    this.company = company;
    this.model = model;
    this.yearRelease = yearRelease;
  }

  public abstract void testDrive();
  public abstract void park();

  public int getSpeed(){
    return speed;
  }

  public int getNumWheels(){
    return numWheels;
  }
}
