//Laptop computer: adds screen size to other Computer info

public class Laptop{
    String screenSize=null;
    Computer computer = null;  // Composition
    
    //Constructors
    public Laptop() {} //No-arg constructor

    public Laptop(String CPU, String RAM, String disk, String screenSize) {
        //Composition from Computer superclass
    	computer = new Computer(CPU, RAM, disk);
        //Only in Laptop subclass
        this.screenSize=screenSize;
    }

    //Setter
    public void setScreenSize(String screenSize) {
        this.screenSize=screenSize;
    }

    //Getter
    public String getScreenSize() {
        return this.screenSize;
    }

    //Return formatted version of data 
    @Override
    public String toString() {
        return computer.toString() + "\tGPU:"  + "\tScreen:" + this.screenSize;
    }
    
}