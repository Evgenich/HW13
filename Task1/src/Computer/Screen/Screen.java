package Computer.Screen;

public class Screen {
    private int Diagonal;
    private TypeSc type;
    private double weight;

    public Screen(int diagonal, TypeSc type, double weight) {
        Diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public int getDiagonal() {
        return Diagonal;
    }

    public void setDiagonal(int diagonal) {
        Diagonal = diagonal;
    }

    public TypeSc getType() {
        return type;
    }

    public void setType(TypeSc type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "Diagonal=" + Diagonal +
                ", type=" + type +
                ", weight=" + weight +
                '}';
    }
}
