package interfaceslambda.figuras;

public record Circulo(double radius) implements FiguraGeometrica{

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
