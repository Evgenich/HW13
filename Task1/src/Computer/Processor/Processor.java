package Computer.Processor;

public class Processor {
    private Frequency frequency;
    private Cores cores;
    private Manufacturer manufacturer;
    private double weight;

    public Processor(Frequency frequency, Cores cores, Manufacturer manufacturer, double weight) {
        this.frequency = frequency;
        this.cores = cores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public Cores getCores() {
        return cores;
    }

    public void setCores(Cores cores) {
        this.cores = cores;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequency=" + frequency +
                ", cores=" + cores +
                ", manufacturer=" + manufacturer +
                ", weight=" + weight +
                '}';
    }
}
