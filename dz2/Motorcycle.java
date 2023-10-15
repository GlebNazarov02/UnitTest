package dz2;

class Motorcycle extends Vehicle {
  public Motorcycle(String company, String model, int yearRelease) {
    super(company, model, yearRelease);
    this.numWheels = 2;
    this.speed = 0;
  }

  @Override
  public void testDrive() {
    this.speed = 75;
  }

  @Override
  public void park() {
    this.speed = 0;
  }

  @Override
  public int getSpeed(){
    return speed;
  }

  @Override
  public int getNumWheels(){
    return numWheels;
  }
}