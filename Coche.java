
/**
 * Write a description of class Coche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coche extends VehiculoConPlazas implements CumpleMedidas
{
    /**
     * Constructor for objects of class Coche
     */
    public Coche(Marca marca, int antiguedad, int km, int numPlazas)
    {
        super(marca, antiguedad, km, numPlazas);
    }

    /**
     * Devuelve un int que indica cada cuantos años tiene que pasar la revision
     */
    public int pasaRevision()
    {
        final int REVISION_FORD = 2;
        final int REVISION_NO_FORD = 1;
        return (getMarca() == Marca.FORD) ? REVISION_FORD: REVISION_NO_FORD; 
    }

    /**
     * Devuelve true si el camión cumple las medidas de seguridad o false si no
     */
    @Override
    public boolean cumpleMedidas() {
        return getNumPlazas() <= CumpleMedidas.NUM_PLAZAS_COCHE;
    }

    /**
     * Devuelve un int[] con los datos del Coche
     * [codigo, antigüedad, km, numPlazas, revision]
     */
    @Override
    public int[] getDatos()
    {
        return new int[]{getCodVehiculo(), getAntiguedad(), getKm(), getNumPlazas(), pasaRevision()};
    }
}