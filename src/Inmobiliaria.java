import java.util.ArrayList;

public class Inmobiliaria {

    private String nombre;
    private ArrayList<Propiedad> propiedades;

    public Inmobiliaria(String nombre) {
        this.nombre = nombre;
        this.propiedades = new ArrayList<>();
    }

    public Boolean agregarPropiedad(Propiedad pro) {
        return propiedades.add(pro);
    }


    public Boolean modificarPropiedad(Integer codigoParaBuscar, Propiedad nuevaPropiedad) throws PropiedadInexistenteException {

                Propiedad pro = buscarPropiedadPorCodigo(codigoParaBuscar);

                if (pro.getClass().equals(nuevaPropiedad.getClass())){

                if (pro instanceof Casa){
                    ((Casa) pro).setCantidadDeBanios(((Casa)nuevaPropiedad).getCantidadDeBanios());
                    ((Casa) pro).setCantidadDeHabitaciones(((Casa)nuevaPropiedad).getCantidadDeHabitaciones());
                    ((Casa) pro).setTienePatio(((Casa)nuevaPropiedad).getTienePatio());
                }

                if (pro instanceof Departamento){
                    ((Departamento)pro).setCantidadBaños(((Departamento)nuevaPropiedad).getCantidadBaños());
                    ((Departamento)pro).setCantidadHabitaciones(((Departamento)nuevaPropiedad).getCantidadHabitaciones());
                    ((Departamento)pro).setNumeroPiso(((Departamento)nuevaPropiedad).getNumeroPiso());
                    ((Departamento)pro).setTieneAscensor(((Departamento)nuevaPropiedad).getTieneAscensor());
                }

                if (pro instanceof Terreno){
                    ((Terreno)pro).setTipoTerreno(((((Terreno) nuevaPropiedad).getTipoTerreno())));
                    ((Terreno)pro).setTieneServicios(((Terreno)nuevaPropiedad).getTieneServicios());
                }


                pro.setDireccion(nuevaPropiedad.getDireccion());
                pro.setPrecio(nuevaPropiedad.getPrecio());

                }
          return true;

    }

    public Propiedad buscarPropiedadPorCodigo(Integer codigo) throws PropiedadInexistenteException {
    for (Propiedad pro : propiedades) {
        if (pro.getCodigo().equals(codigo)) {
            return pro;
        }
    }
    throw new PropiedadInexistenteException("La propiedad no ha sido encontrada");
}














}
