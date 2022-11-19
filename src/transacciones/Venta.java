package transacciones;

import persona.Cliente;
import persona.Empleado;
import vehiculo.Particular;
import vehiculo.Publico;

import java.util.ArrayList;

public class Venta {
    private String fecha;
    private Cliente cliente;
    private Empleado empleado;

    private ArrayList<Particular> carrosParticulares;
    private ArrayList<Publico> carrosPublicos;
}
