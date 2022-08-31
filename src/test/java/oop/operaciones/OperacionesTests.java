package oop.operaciones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OperacionesTests {

    @Test
    void ejecutaUnaOperacionDeSuma() {
        Operacion suma = new Suma(2.0, 6.0);
        Double resultado = suma.calcular();

        assertEquals(8.0, resultado);
    }

    @Test
    void ejecutaUnaOperacionDeResta() {
        Operacion resta = new Resta(12.0, 6.0);
        Double resultado = resta.calcular();

        assertEquals(6.0, resultado);
    }
}
