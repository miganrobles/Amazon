
/**
 * Write a description of class VehiculosPesados here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class VehiculoPesado extends Vehiculo
{
    // Peso en kg del VehiculoPesado
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
     * Devuelve el peso en kg del vehiculo
     */
    public int getPeso()
    {
        return peso;
    }  

    /**
     * Devuelve un int[] con los datos del VehiculoPesado
     * [codigo, antigüedad, km, peso]
     */
    @Override
    public int[] getDatos()
    {
        return new int[]{getCodVehiculo(), getAntiguedad(), getKm(), peso};
    }
}
