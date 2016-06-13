
/**
 * Write a description of class FurgonetasPequenas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FurgonetaPequena extends VehiculoConPlazas implements CumpleMedidas
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class FurgonetasPequenas
     */
    public FurgonetaPequena(Marca marca, int antiguedad, int km, int numPlazas)
    {
        super(marca, antiguedad, km, numPlazas);

    }

    public boolean cumpleMedidas() {
        return getNumPlazas() <= 7;
    }
    
     public int[] getDatos()
    {
        int[] datos = new int[4];
        datos[0] = getCodVehiculo();
        datos[1] = getAntiguedad();
        datos[3] = getKm();
        datos[4] = getNumPlazas();
        return datos;
    }
}
