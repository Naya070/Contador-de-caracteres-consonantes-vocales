
/**
 * Con esta clase podrás construir un objeto palabra de tipo String.
 * Utilizando el método de esta clase podrás conocer la cantidad de letras de la palabra.
 * Esta clase es una clase madre.
 * @author (Nayarith del Carmen Jiménez Sierra 2017100188) 
 * @version (1 - 11 de Julio de 2021)
 */
public class Palabra
{
    // instance variables - replace the example below with your own
    public String Palab;
    
    
    /**
     * Constructor de objetos de la clase Palabra
     * Escriba una y sólo una palabra, evite el uso de números, saltos de línea o espacios.
     * Recuerde usar comillas al escribir su palabra
     * Ejemplo: "Hola"
     * 
     */
    public Palabra(String Palab)
    {
        // initialise instance variables
        this.Palab = Palab;
    }

    
    /**
     * Método para ver palabra
     */
    
    public String getPalab()
    {
        return Palab;
       
    }
    /**
     * Éste método permite conocer el número de letras que tiene la palabra del objeto Palabra.
     * Ejemplo: "Hola" devuelve: 4
     */
    public int NúmeroDeLetras()
    {
        // put your code here
        int CantidadDeLetras = Palab.length();
        
        return CantidadDeLetras;
    }
}
