/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author Darren Moore
 */
public class Car {
    
    int maxSpeed = 100;
    int minSpeed = 0;
    
    double weight = 4079;
    
    boolean isTheCarOn = false;
    
    char condition = 'A';
    String nameOfCar = "Herbie";
    
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    
    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 6;
    
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
        maxSpeed =  customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }
    
    // Getters and setters
    // Getters get the values of the defined properties
    // Setters sets the values of the defined properties
    
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    
    public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed = newMaxSpeed;
    }
    
    public int getMinSpeed() {
        return this.minSpeed;
    }
    
    public double getWeight() {
        return this.weight;
    }
    
    public boolean getIsTheCarOn() {
        return this.isTheCarOn;
    }
    
    public void printVariables() {
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
        }
    
    public void upgradeMaxSpeed() {
        setMaxSpeed(getMaxSpeed() + 10);
    }
    
    public void getIn() {
        if (numberOfPeopleInCar < maxNumberOfPeopleInCar){
            numberOfPeopleInCar++;
            System.out.println("Someone got in.");
        } else { 
            System.out.println("There's no room!");
        }
    }
    
    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }
    
    public void getOut() {
        if (numberOfPeopleInCar > 0) {
            numberOfPeopleInCar--;
        }
    }
    
    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }
    
    public void turnTheCarOn() {
        if (!isTheCarOn) {
            isTheCarOn = true;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Car birthdayPresent = new Car(500, 5000.545, true);
        System.out.println("This is my birthday present!!");
        birthdayPresent.printVariables();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        System.out.println("Miles left: " + birthdayPresent.howManyMilesTillOutOfGas());
        System.out.println("Max miles per fill up: " + birthdayPresent.maxMilesPerFillUp());
        birthdayPresent.printVariables();
        birthdayPresent.getOut();
        System.out.println("Birthday present v2");
        birthdayPresent.printVariables();
        
    }
    
}
