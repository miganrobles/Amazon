
/**
 * Write a description of interface CumpleMedidas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface CumpleMedidas
{
    /**
     * An example of a method header - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the result produced by sampleMethod 
     */
    // Número maximo de plazas del coche para que cumpla las medidas de seguridad
    int NUM_PLAZAS_COCHE = 5;
    // Número maximo de plazas de las furgonetas pequeñas para que cumpla las medidas de seguridad
    int NUM_PLAZAS_FURGO = 7;
    // Peso medio máximo de los camiones articulados para que cumpla las medidas de seguridad
    int PESO_ARTICULADOS = 3000;
    // Peso medio máximo de los camiones no articulados para que cumpla las medidas de seguridad
    int PESO_NO_ARTICULADOS = 2000;

    boolean cumpleMedidas();    
}
