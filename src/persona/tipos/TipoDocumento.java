package persona.tipos;

public enum TipoDocumento {
    CEDULA("Cedula", "C.C"),
    TARJETA_IDENTIDAD("Tarjeta Identidad", "T.I"),
    CEDULA_EXTRANJERIA("Cedula_extranjera", "C.E"),
    PASAPORTE("Pasaporte", "P.S");

    public String nombreLargo;
    public String nombreCorto;

    TipoDocumento(String nombreLargo, String nombreCorto) {
        this.nombreLargo = nombreLargo;
        this.nombreCorto = nombreCorto;
    }
}
