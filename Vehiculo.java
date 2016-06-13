
/**
 * Write a description of class Vehiculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * Todos los vehículos se caracterizan por una marca (Ford, Opel, Citroen o Fiat), 
 * una antiguedad expresada en años y un kilometraje. 
 * Cada vehiculo lleva asociado un número identificativo que comienza en 0 y se incrementa de 1 en 1.
 */
public abstract class Vehiculo
{
    private static int genCodVehiculos = 0;
    // Codigo del vehiculo
    private int codVehiculo;
    // Antigüedad del vehiculo
    private int antiguedad;
    // Marca del vehiculo
    private Marca marca;
    // Kilometros del vehiculo
    private int km;

    /**
     * Constructor for objects of class Vehiculo
     */
    public Vehiculo(Marca marca, int antiguedad, int km) 
    {
        codVehiculo = genCodVehiculos++;
        this.km = km;
        this.marca = marca;
        this.antiguedad = antiguedad;
    }

    /**
     * Devuelve la marca del vehiculo
     */
    public Marca getMarca()
    {
        return marca;
    }

    /**
     * Devuelve el codigo del vehiculo
     */
    public int getCodVehiculo()
    {
        return codVehiculo;
    }

    /**
     * Devuelve la antigüedad del vehiculo
     */
    public int getAntiguedad()
    {
        return antiguedad;
    }

    /**
     * Metodo abstract para los datos del vehiculo
     */
    public abstract int[] getDatos();

    /**
     * Devuelve los km del vehiculo
     */
    public int getKm()
    {
        return km;
    }
}
