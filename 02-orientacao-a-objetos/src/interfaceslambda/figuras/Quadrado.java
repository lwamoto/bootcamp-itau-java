package interfaceslambda.figuras;

public record Quadrado(double side) implements FiguraGeometrica{

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }
}
