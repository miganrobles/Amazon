
/**
 * Write a description of class VehiculosPesados here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class VehiculoPesado extends Vehiculo
{
    // instance variables - replace the example below with your own
    private int peso;

    /**
     * Constructor for objects of class VehiculosPesados
     */
    public VehiculoPesado(Marca marca, int antiguedad, int km, int peso)
    {
        super(marca, antiguedad, km);
        this.peso = peso;
    }

    /**
     * Devuelve el peso del vehiculo
     */
    public int getPeso()
    {
        return peso;
    }  
    
     public int[] getDatos()
    {
        int[] datos = new int[4];
        datos[0] = getCodVehiculo();
        datos[1] = getAntiguedad();
        datos[2] = getKm();
        datos[3] = getPeso();
        return datos;
    }
}
