
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
    
    public boolean esArticulado()
    {
        return (getMarca() == Marca.FIAT || getMarca() == Marca.FORD);
    }
    
    @Override
    public boolean cumpleMedidas()
    {
        return ((esArticulado() && getPeso() < 3000) || (!esArticulado() && getPeso() < 2000));
    }
}
