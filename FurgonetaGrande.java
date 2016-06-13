
/**
 * Write a description of class FurgonetaGrande here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FurgonetaGrande extends VehiculoPesado
{
    /**
     * Constructor for objects of class Camion
     */
    public FurgonetaGrande(Marca marca, int antiguedad, int km, int peso)
    {
        super(marca, antiguedad, km, peso);
    }
    
    public boolean cumpleMedidas()
    {
        return false;
    }
}
