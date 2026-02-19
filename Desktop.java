//Desktop computer: adds GPU type

public class Desktop{ 
    String GPUType=null;
    Computer computer = null; // Composition
    
    //Constructors
    public Desktop() {} //No-arg constructor

    public Desktop(String CPU, String RAM, String disk, String GPUType) {
    	//Composition from Computer superclass
        computer = new Computer(CPU, RAM, disk);
        //Only in Desktop subclass
        this.GPUType=GPUType;
    }

    //Setter
    public void setGPUType(String GPUType) {
        this.GPUType=GPUType;
    }

    //Getter
    public String getGPUType() {
        return this.GPUType;
    }

    //Return formatted version of data
    @Override
    public String toString() {
        return computer.toString() + "\tGPU: " + this.GPUType;
    }

}