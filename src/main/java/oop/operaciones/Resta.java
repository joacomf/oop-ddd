package oop.operaciones;

public class Resta extends Operacion {

    protected Resta(double primerValor, double segundoValor) {
        super(primerValor, segundoValor);
    }

    public Double calcular() {
        return this.primerValor - this.segundoValor;
    }
}
