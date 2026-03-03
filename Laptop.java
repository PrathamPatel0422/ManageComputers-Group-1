// Laptop computer: adds screen size to other Computer info

public class Laptop {
    // Computer object to store CPU, RAM and Disk information this is done to
    // do a composition instead of inheritance as a laptop is not a type of computer
    // but rather has a computer(delete this later)
    private final Computer computer;
    private final String screenSize;

    // Constructor
    public Laptop(String CPU, String RAM, String disk, String screenSize) {
        this.computer = new Computer(CPU, RAM, disk);
        this.screenSize = screenSize;
    }

    // Getter
    public String getScreenSize() {
        return this.screenSize;
    }

    // Return formatted version of data
    @Override
    public String toString() {
        return "Type:Laptop\t" + computer.toString() + "\tScreen:" + this.screenSize;
    }
}
