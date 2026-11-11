package interfaceslambda.figuras;

public record Retangulo(double base, double height) implements FiguraGeometrica{

    @Override
    public double calculateArea() {
        return base * height;
    }
}
