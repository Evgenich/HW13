import Calculete.ArithmeticCalculator;
import Calculete.operation;
import Computer.Computer;
import Computer.HardDisck.HardDisck;
import Computer.HardDisck.Typehd;
import Computer.Keyboard.Illumination;
import Computer.Keyboard.Keyboard;
import Computer.Keyboard.TypeKb;
import Computer.Processor.Cores;
import Computer.Processor.Frequency;
import Computer.Processor.Manufacturer;
import Computer.Processor.Processor;
import Computer.RAM.RAM;
import Computer.RAM.Typeram;
import Computer.Screen.Screen;
import Computer.Screen.TypeSc;


import java.util.Stack;



public class Main {

    public static void main(String[] args) {
        Processor processor = new Processor(Frequency.THREE_THOUSAND_HUNDRED, Cores.ONE,
                Manufacturer.INTEL, 230);
        RAM ram = new RAM(Typeram.DDR4, 8000, 1200);
        Screen screen = new Screen(32, TypeSc.IPS, 1000);
        Keyboard keyboard = new Keyboard(TypeKb.WIRELESS, Illumination.YES, 200);
        HardDisck hardDisck = new HardDisck(Typehd.HDD, 1024, 500);

        Computer computer = new Computer(processor, ram, hardDisck, screen, keyboard );
        System.out.println(computer.getWeight());

    }

}
