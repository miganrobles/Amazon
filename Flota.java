import java.util.ArrayList;
/**
 * Write a description of class Flota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flota
{
    private ArrayList<Vehiculo> vehiculos;

    /**
     * Constructor for objects of class Flota
     */
    public Flota()
    {
        vehiculos = new ArrayList<>();
    }

    /**
     * Añade un vehiculo a la flota
     */
    public void addVehiculo(Vehiculo vehiculo)
    {
        vehiculos.add(vehiculo);
    }

    /**
     * Elimina un vehiculo de la flota
     */
    public boolean removeVehiculo(int id)
    {
        boolean eliminado = false;
        for (int i = 0; i < vehiculos.size() && !eliminado; i++)
        {
            Vehiculo vehiculo = vehiculos.get(i);
            if (vehiculo.getCodVehiculo() == id) {
                eliminado = vehiculos.remove(vehiculo);
            }
        }
        return eliminado;
    }

    /**
     * El método marcaMayoritaria devuelve la marca con el mayor número de vehículos en la flota.
     * Si hay empate entre cualquier marca o no hubiera aun vehiculos devuelve null.
     */
    public Marca marcaMayoritaria()
    {
        Marca marca = null;
        Marca[] nombreMarcas = {Marca.FORD, Marca.OPEL, Marca.CITROEN, Marca.FIAT};
        int[] marcas = new int[4];
        if (vehiculos.size() > 0) {
            for (Vehiculo vehiculo : vehiculos) {
                if (vehiculo.getMarca() == Marca.FORD) {
                    marcas[0]++;
                }
                else if(vehiculo.getMarca() == Marca.OPEL) {
                    marcas[1]++;
                }
                else if(vehiculo.getMarca() == Marca.CITROEN) {
                    marcas[2]++;
                }
                else {
                    marcas[3]++;
                }
            }
            int mayor = 0;
            boolean sonIguales = false;
            for (int i = 1; i < marcas.length && !sonIguales; i++) {
                if (marcas[i] > mayor) {
                    mayor = marcas[i];
                }
                else if (marcas[i] == mayor) {
                    sonIguales = true;
                }
            }
            if (!sonIguales) {
                marca = nombreMarcas[mayor];
            }
        }
        return marca;
    }

    public boolean cumplenMedidas()
    {
        //(((CentroEducativo)edificio).getEsPublico())
        boolean cumplen = true;
        for (int i = 0; i < vehiculos.size() && cumplen; i++) {
            if (!(vehiculos.get(i) instanceof FurgonetaGrande)) {
                cumplen = ((CumpleMedidas)vehiculos.get(i)).cumpleMedidas(); 
            }
        }
        return cumplen;
    }

    public int[] getDatosVehiculo(int cod)
    {
        int[] datos = null;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getCodVehiculo() == cod) {
                datos = vehiculo.getDatos();
            }
        }
        return datos;
    }
}

