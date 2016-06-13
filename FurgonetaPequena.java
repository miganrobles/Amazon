
/**
 * Write a description of class FurgonetasPequenas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FurgonetaPequena extends VehiculoConPlazas implements CumpleMedidas
{
    /**
     * Constructor for objects of class FurgonetaPequena
     */
    public FurgonetaPequena(Marca marca, int antiguedad, int km, int numPlazas)
    {
        super(marca, antiguedad, km, numPlazas);
    }

    /**
     * Devuelve true si cumple las medidas de seguridad o false si no
     */
    @Override
    public boolean cumpleMedidas() {
        return getNumPlazas() <= CumpleMedidas.NUM_PLAZAS_FURGO;
    }

    /**
     * Devuelve un int[] con los datos del VehiculoPesado
     * [codigo, antigüedad, km, numPlazas]
     */
    @Override
    public int[] getDatos()
    {
        return new int[]{getCodVehiculo(), getAntiguedad(), getKm(), getNumPlazas()};
    }
}
