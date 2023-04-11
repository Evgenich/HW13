package Computer.Keyboard;



public class Keyboard {
    private TypeKb type;
    private Illumination illumination;
    private double weight;

    public Keyboard(TypeKb type, Illumination illumination, double weight) {
        this.type = type;
        this.illumination = illumination;
        this.weight = weight;
    }

    public TypeKb getType() {
        return type;
    }

    public void setType(TypeKb type) {
        this.type = type;
    }

    public Illumination getIllumination() {
        return illumination;
    }

    public void setIllumination(Illumination illumination) {
        this.illumination = illumination;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "type=" + type +
                ", illumination=" + illumination +
                ", weight=" + weight +
                '}';
    }
}
