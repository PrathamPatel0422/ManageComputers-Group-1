// Desktop computer: adds GPU type

public class Desktop extends Computer {

    private final String GPUType;

    // Constructor
    public Desktop(String CPU, String RAM, String disk, String GPUType) {
        super(CPU, RAM, disk);   // Call Computer constructor
        this.GPUType = GPUType;
    }

    // Getter
    public String getGPUType() {
        return this.GPUType;
    }

    // Return formatted version of data
    @Override
    public String toString() {
        return "Type:Desktop\tCPU:" + getCPU() +
               "\tRAM:" + getRAM() +
               "\tDisk:" + getDisk() +
               "\tGPU:" + this.GPUType;
    }
}
