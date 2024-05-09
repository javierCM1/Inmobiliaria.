public class Departamento extends Propiedad{
     private Integer numeroPiso;
     private Integer cantidadHabitaciones;
     private Integer cantidadBaños;
     private Boolean tieneAscensor;


    public Departamento(Integer codigo, String direccion, Integer precio, Integer numeroPiso, Integer cantidadHabitaciones, Integer cantidadBaños ,Boolean tieneAscensor) {
        super(codigo, direccion, precio);
        this.numeroPiso = numeroPiso;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.cantidadBaños = cantidadBaños;
        this.tieneAscensor = tieneAscensor;

    }

    public Integer getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(Integer numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Integer getCantidadBaños() {
        return cantidadBaños;
    }

    public void setCantidadBaños(Integer cantidadBaños) {
        this.cantidadBaños = cantidadBaños;
    }

    public Boolean getTieneAscensor() {
        return tieneAscensor;
    }

    public void setTieneAscensor(Boolean tieneAscensor) {
        this.tieneAscensor = tieneAscensor;
    }
}
