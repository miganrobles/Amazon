
/**
 * Write a description of class Coche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coche extends VehiculoConPlazas implements CumpleMedidas
{
    public Coche(Marca marca, int antiguedad, int km, int numPlazas)
    {
        super(marca, antiguedad, km, numPlazas);

    }

     public int pasaRevision()
   {
       final int REVISION_FORD = 2;
       final int REVISION_NO_FORD = 1;
       int anioRevision = REVISION_NO_FORD;
       if (getMarca() == Marca.FORD) {
           anioRevision = REVISION_FORD;
       }
       return anioRevision;
   }

    public boolean cumpleMedidas() {
        return getNumPlazas() <= 5;
    }
    
    public int[] getDatos()
    {
        int[] datos = new int[5];
        datos[0] = getCodVehiculo();
        datos[1] = getAntiguedad();
        datos[2] = getKm();
        datos[3] = getNumPlazas();
        datos[4] = pasaRevision();
        return datos;
    }
}
