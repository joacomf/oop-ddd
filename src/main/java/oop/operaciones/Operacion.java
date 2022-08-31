package oop.operaciones;

public abstract class Operacion {
    protected final double primerValor;
    protected final double segundoValor;

    protected Operacion(double primerValor, double segundoValor) {
        this.primerValor = primerValor;
        this.segundoValor = segundoValor;
    }

    public abstract Double calcular();
}
