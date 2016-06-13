import java.util.ArrayList;

/**
 * Write a description of class Flota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flota
{
    // Guarda los vehiculos de la flota
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
        return vehiculos.remove(buscaVehiculo(id));
    }

    /**
     * Busca un vehículo en la flota por su id
     * Si lo encuentra devuelve el vehiculo y si no devuelve null
     */
    private Vehiculo buscaVehiculo(int id)
    {
        Vehiculo vehiculoBuscado = null;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getCodVehiculo() == id) {
                vehiculoBuscado = vehiculo;
            }
        }
        return vehiculoBuscado;
    }

    /**
     * Devuelve el número de vehículos de una marca pasada como parámetro
     */
    private int getNumeroVehiculosMarca(Marca marca) {
        int numVehiculos = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMarca() == marca) {
                numVehiculos++;
            }
        }
        return numVehiculos;
    }

    /**
     * El método marcaMayoritaria devuelve la marca con el mayor número de vehículos en la flota.
     * Si hay empate entre cualquier marca o no hubiera aun vehiculos devuelve null.
     */
    public Marca marcaMayoritaria()
    {
        Marca marcaMayoritaria = null;
        Marca[] marcas = Marca.values();
        int mayor = 0;
        for (Marca marca : marcas) {
            int numVehiculos = getNumeroVehiculosMarca(marca);
            if (numVehiculos > mayor) {
                mayor = numVehiculos;
                marcaMayoritaria = marca;
            }
            else if (numVehiculos == mayor) {
                marcaMayoritaria = null;
            }           
        }
        return marcaMayoritaria;
    }

    /**
     * Devuelve verdadero si todos los vehiculos cumplen las medidas de seguridad (obviando a las furgonetas grandes)
     * y falso en caso contrario. En caso de no haber vehículos devuelve verdadero.
     */
    public boolean cumplenMedidas()
    {
        boolean cumplenMedidas = true;
        for (int i = 0; i < vehiculos.size() && cumplenMedidas; i++) {
            if (!(vehiculos.get(i) instanceof FurgonetaGrande)) {
                cumplenMedidas = ((CumpleMedidas)vehiculos.get(i)).cumpleMedidas(); 
            }
        }
        return cumplenMedidas;
    }

    /**
     * Recibe como parametro el identificador de un vehiculo y devuelve un array de enteros con todos los datos del vehiculo
     * excepto la marca y si es articulado o no para los camiones.
     */
    public int[] getDatosVehiculo(int id)
    {
        Vehiculo vehiculo = buscaVehiculo(id);
        return (vehiculo != null) ? vehiculo.getDatos() : null;
    }
}