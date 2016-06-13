
/**
 * Write a description of class Camion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Camion extends VehiculoPesado implements CumpleMedidas
{
    /**
     * Constructor for objects of class Camion
     */
    public Camion(Marca marca, int antiguedad, int km, int peso)
    {
        super(marca, antiguedad, km, peso);
    }

    /**
     * Devuelve true si es articualdo o false si no
     */
    public boolean esArticulado()
    {
        return (getMarca() == Marca.FIAT || getMarca() == Marca.FORD);
    }

    /**
     * Devuelve true si el camión cumple las medidas de seguridad o false si no
     */
    @Override
    public boolean cumpleMedidas()
    {
        return ((esArticulado() && getPeso() < CumpleMedidas.PESO_ARTICULADOS) || (!esArticulado() && getPeso() < PESO_NO_ARTICULADOS));
    }
}