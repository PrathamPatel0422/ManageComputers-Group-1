// Desktop computer: adds GPU type

public class Desktop {
    // Computer object to store CPU, RAM and Disk information this is done to
    // do a composition instead of inheritance as a desktop is not a type of
    // computer but rather has a computer(delete this later)
    private final Computer computer;
    private final String GPUType;

    // Constructor
    public Desktop(String CPU, String RAM, String disk, String GPUType) {
        this.computer = new Computer(CPU, RAM, disk);
        this.GPUType = GPUType;

    }

    // Getter
    public String getGPUType() {
        return this.GPUType;
    }

    // Return formatted version of data
    @Override
    public String toString() {
        return "Type:Desktop\t" + computer.toString() + "\tGPU:" + GPUType;
    }
}
