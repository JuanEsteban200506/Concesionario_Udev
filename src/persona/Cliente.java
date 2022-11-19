package persona;

import persona.tipos.TipoCliente;
import persona.tipos.TipoDocumento;

public class Cliente extends Persona {

    private TipoCliente tipoCliente;

    public Cliente(String nombre, int edad, TipoDocumento tipoDocumento,
                   String documento, String telefono, String direccion) {
        super(nombre, edad, tipoDocumento, documento, telefono, direccion);
    }
}
