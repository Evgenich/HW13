package Computer.RAM;

public class RAM {
    private Typeram type;
    private int volume;
    private double weight;

    public RAM(Typeram type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public Typeram getType() {
        return type;
    }

    public void setType(Typeram type) {
        this.type = type;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "type=" + type +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }
}
