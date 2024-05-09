public class Casa extends Propiedad {
     private Integer cantidadDeHabitaciones;
     private Integer cantidadDeBanios;
     private Boolean tienePatio;



    public Casa(Integer codigo, String direccion, Integer precio, Integer cantidadDeHabitaciones, Integer cantidadDeBanios ,Boolean tienePatio) {
        super(codigo, direccion, precio);
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
        this.cantidadDeBanios = cantidadDeBanios;
        this.tienePatio = tienePatio;
    }

    public Integer getCantidadDeHabitaciones() {
        return cantidadDeHabitaciones;
    }

    public void setCantidadDeHabitaciones(Integer cantidadDeHabitaciones) {
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
    }

    public Integer getCantidadDeBanios() {
        return cantidadDeBanios;
    }

    public void setCantidadDeBanios(Integer cantidadDeBanios) {
        this.cantidadDeBanios = cantidadDeBanios;
    }

    public Boolean getTienePatio() {
        return tienePatio;
    }

    public void setTienePatio(Boolean tienePatio) {
        this.tienePatio = tienePatio;
    }
}
