package oop.operaciones;

public class Suma extends Operacion {
    public Suma(double primerValor, double segundoValor) {
        super(primerValor, segundoValor);
    }

    public Double calcular() {
        return this.primerValor - this.segundoValor;
    }
}
