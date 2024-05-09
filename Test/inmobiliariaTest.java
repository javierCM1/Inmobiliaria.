import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class inmobiliariaTest {

    @Test
    public void queSePuedaAgregarPropiedad(){
        Inmobiliaria inmo = new Inmobiliaria("nombre");
        Propiedad pro2 = new Casa(723672,"apipe",40000,4,4,false);
        Boolean res2 = inmo.agregarPropiedad(pro2);
        assertTrue(res2);
    }

    @Test

    public void queSePuedanDarDeAltaDosDepartamentoEnLaInmobiliaria(){
        Inmobiliaria inmo = new Inmobiliaria("nombre");
        Propiedad pro2 = new Casa(723672,"apipe",40000,4,4,false);
        Propiedad departamento = new Departamento(13223,"la comsk",21323,3,4,2,true);
        Boolean res2 = inmo.agregarPropiedad(pro2);
        Boolean res3 = inmo.agregarPropiedad(departamento);


        assertTrue(res2);
        assertTrue(res3);


    }

    @Test
    public void queSePuedaModificarPropiedad() throws PropiedadInexistenteException {
        Inmobiliaria inmo = new Inmobiliaria("nombre");
        Propiedad pro2 = new Casa(723672, "apipe", 40000, 4, 4, false);
        Boolean res = inmo.agregarPropiedad(pro2);
        assertTrue(res);


        Integer codigoParaBuscar = 723672;
        Propiedad nuevaPropiedad = new Casa(723672, "apipe", 40000, 2, 1, true);
        Boolean resModificado = inmo.modificarPropiedad(codigoParaBuscar, nuevaPropiedad);
        assertTrue(resModificado);

        Propiedad propiedadModificada = inmo.buscarPropiedadPorCodigo(723672);

        // Paso 4: Verificar que la propiedad tiene el precio esperado después de la modificación
        assertNotNull(propiedadModificada); // Verificar que la propiedad buscada no es nula
        assertEquals(723672, propiedadModificada.getCodigo()); // Verificar que el código es el mismo
        assertEquals(45000, propiedadModificada.getPrecio()); // Verificar que el precio aumentó a 45000
        // Asegúrate de verificar otros atributos si también se modificaron
    }



}