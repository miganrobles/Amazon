
/**
 * Write a description of class VehiculosConPlazas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class VehiculoConPlazas extends Vehiculo
{
    // Numero de plazas del vehiculo
    private int numPlazas;

    /**
     * Constructor for objects of class VehiculosConPlazas
     */
    public VehiculoConPlazas(Marca marca, int antiguedad, int km, int numPlazas)
    {
        super(marca, antiguedad, km);
        this.numPlazas = numPlazas;
    }
    
    public int getNumPlazas()
    {
        return numPlazas;
    }
}
