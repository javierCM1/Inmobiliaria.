public class Terreno extends Propiedad{
      private String tipoTerreno;
      private Boolean tieneServicios;


    public Terreno(Integer codigo, String direccion, Integer precio, String tipoTerreno, Boolean tieneServicios) {
        super(codigo, direccion, precio);
        this.tipoTerreno = tipoTerreno;
        this.tieneServicios = tieneServicios;
    }

    public String getTipoTerreno() {
        return tipoTerreno;
    }

    public void setTipoTerreno(String tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }

    public Boolean getTieneServicios() {
        return tieneServicios;
    }

    public void setTieneServicios(Boolean tieneServicios) {
        this.tieneServicios = tieneServicios;
    }
}
