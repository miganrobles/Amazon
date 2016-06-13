import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class FlotaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FlotaTest
{
    /**
     * Default constructor for test class FlotaTest
     */
    public FlotaTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {

    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testFlota01()
    {
        // coche Fiat de 8 años con 2000 kilometros y 4 plazas
        Vehiculo coche1 = new Coche(Marca.FIAT, 8, 2000, 4);
        // furgoneta pequeña Ford de 2 años con 456 kilometros y 6 plazas
        Vehiculo furgonet1 = new FurgonetaPequena(Marca.FORD, 2, 456, 6);
        // furgoneta grande Opel de 5 años con 20000 kilometros y 1000 kilos de peso
        Vehiculo furgonet2 = new FurgonetaGrande(Marca.OPEL, 5, 20000, 1000);
        // camion Citroen de 6 años con 10000 kilometros y 1500 kilos de peso
        Vehiculo camion1 = new Camion(Marca.CITROEN, 6, 10000, 1500);
        
        Flota flota1 = new Flota();
        
        flota1.addVehiculo(coche1);
        flota1.addVehiculo(furgonet1);
        flota1.addVehiculo(furgonet2);
        flota1.addVehiculo(camion1);        
        
        assertEquals(true, flota1.cumplenMedidas());
        
        assertNull(flota1.marcaMayoritaria());
        
        // Un vehiculo con ID 0, de 8 años, con 2000 kilometros, 4 plazas y pasa revision cada 1 año
        int[] arrayEsperado0 = {0, 8, 2000, 4, 1};
        assertArrayEquals(arrayEsperado0, flota1.getDatosVehiculo(0));
        // Un vehiculo con ID 1, de 2 años, con 456 kilometros y 6 plazas
        int[] arrayEsperado1 = {1, 2, 456, 6};
        assertArrayEquals(arrayEsperado1, flota1.getDatosVehiculo(1));
        // Un vehiculo con ID 2, de 5 años, con 20000 kilometros y peso 1000 kilos
        int[] arrayEsperado2 = {2, 5, 20000, 1000};
        assertArrayEquals(arrayEsperado2, flota1.getDatosVehiculo(2));
        // Un vehiculo con ID 3, de 6 años, con 10000 kilometros y 1500 kilos de peso
        int[] arrayEsperado3 = {3, 6, 10000, 1500};
        assertArrayEquals(arrayEsperado3, flota1.getDatosVehiculo(3));        
        
        //Añadimos un coche que no cumple las medidas de seguridad
        Vehiculo coche2 = new Coche(Marca.FORD, 10, 300000, 6);
        flota1.addVehiculo(coche2);
        
        assertEquals(false, flota1.cumplenMedidas());
        
        assertEquals(Marca.FORD, flota1.marcaMayoritaria());
        
        // Un vehiculo con ID 4, de 10 años, con 300000 kiloemtros, de 6 plazas y pasa revision cada 2 años
        int[] arrayEsperado4 = {4, 10, 300000, 6, 2};
        assertArrayEquals(arrayEsperado4, flota1.getDatosVehiculo(4));        
        
        //Eliminamos de la flota el ultimo coche añadido 
        flota1.removeVehiculo(4); 
        assertEquals(true, flota1.cumplenMedidas());  
 
        //Añadimos un camion que no cumple las medidas de seguridad
        // camion Citroen de 7 años con 206000 kiloemtros y 4000 kilos de peso
        Vehiculo camion2 = new Camion(Marca.CITROEN, 7, 206000, 4000);
        flota1.addVehiculo(camion2);     
        assertEquals(Marca.CITROEN, flota1.marcaMayoritaria());
        assertEquals(false, flota1.cumplenMedidas());
        
        //Eliminamos de la flota el camion añadido
        flota1.removeVehiculo(5);
        assertEquals(true, flota1.cumplenMedidas()); 
    }
}