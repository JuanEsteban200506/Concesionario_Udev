package persona;

import persona.tipos.TipoDocumento;
import persona.tipos.TipoPermiso;

public class Empleado extends Persona {

    public TipoPermiso getTipoPermiso() {
        return tipoPermiso;
    }

    public void setTipoPermiso(TipoPermiso tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }

    private TipoPermiso tipoPermiso;

    public Empleado(String nombre, int edad, TipoDocumento tipoDocumento, String documento, String telefono, String direccion) {
        super(nombre, edad, tipoDocumento, documento, telefono, direccion);
    }
}
