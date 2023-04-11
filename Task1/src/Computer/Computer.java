package Computer;

import Computer.HardDisck.HardDisck;
import Computer.Keyboard.Keyboard;
import Computer.RAM.RAM;
import Computer.Screen.Screen;

import Computer.Processor.Processor;

public class Computer {


    private Processor processor;
    private RAM ram;
    private HardDisck hardDisck;
    private Screen screen;
    private Keyboard keyboard;
    static final String VENDOR = "INTEL";

    public Computer(Processor processor, RAM ram, HardDisck hardDisck, Screen screen, Keyboard keyboard) {
        this.processor = processor;
        this.ram = ram;
        this.hardDisck = hardDisck;
        this.screen = screen;
        this.keyboard = keyboard;
    }



    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public HardDisck getHardDisck() {
        return hardDisck;
    }

    public void setHardDisck(HardDisck hardDisck) {
        this.hardDisck = hardDisck;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public double getWeight(){
        return  ram.getWeight() + screen.getWeight()+keyboard.getWeight() +hardDisck.getWeight();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", ram=" + ram +
                ", hardDisck=" + hardDisck +
                ", screen=" + screen +
                ", keyboard=" + keyboard +
                '}';
    }
}
