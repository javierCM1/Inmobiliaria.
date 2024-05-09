import java.util.Objects;

public class Propiedad {

    private String direccion;
    private Integer codigo;
    private Integer precio;
    private Boolean alquilado;
    private Boolean vendida;



    public Propiedad(Integer codigo, String direccion, Integer precio) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.precio = precio;
        this.alquilado = false;
        this.vendida = false;

    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Boolean getAlquilado() {
        return alquilado;
    }

    public void setAlquilado(Boolean alquilado) {
        this.alquilado = alquilado;
    }

    public Boolean getVendida() {
        return vendida;
    }

    public void setVendida(Boolean vendida) {
        this.vendida = vendida;
    }


}
