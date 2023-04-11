package Computer.HardDisck;

public class HardDisck {
    private Typehd type;
    private double memory;
    private double weight;

    public HardDisck(Typehd type, double memory, double weight) {
        this.type = type;
        this.memory = memory;
        this.weight = weight;
    }

    public Typehd getType() {
        return type;
    }

    public void setType(Typehd type) {
        this.type = type;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HardDisck{" +
                "type=" + type +
                ", memory=" + memory +
                ", weight=" + weight +
                '}';
    }
}
