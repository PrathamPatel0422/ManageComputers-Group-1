// Laptop computer: adds screen size to other Computer info

public class Laptop extends Computer {

    private final String screenSize;

    // Constructor
    public Laptop(String CPU, String RAM, String disk, String screenSize) {
        super(CPU, RAM, disk);   // Call Computer constructor
        this.screenSize = screenSize;
    }

    // Getter
    public String getScreenSize() {
        return this.screenSize;
    }

    // Return formatted version of data
    @Override
    public String toString() {
        return "Type:Laptop\tCPU:" + getCPU() +
               "\tRAM:" + getRAM() +
               "\tDisk:" + getDisk() +
               "\tScreen:" + this.screenSize;
    }
}
