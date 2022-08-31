package ddd.entidades;

import ddd.modelos.Articulo;

import java.time.LocalDateTime;
import java.util.List;

public class FacturaAlmacenable {

    // ID Autogenerado
    private Long id;
    private String numero;
    private String tipo;
    private Double monto;
    private List<Articulo> articulos;
    private LocalDateTime fechaCreacion;

}
