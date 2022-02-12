
/**
 * Esta subclase tiene un método que te permite saber cuántas vocales tiene tu palabra.
 * 
 * @author (Nayarith del Carmen Jiménez Sierra 2017100188) 
 * @version (1 - 11 de Julio de 2021)
 */
public class Vocales extends Palabra
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor para objetos de la subclase Vocales
     */
    public Vocales(String Palab)
    {
        // initialise instance variables
        super(Palab);
    }

    /**
     * Éste método permite conocer la cantidad de vocales en la palabra
     */
    public String VocalesMétodo()
    {
        // put your code here
        super.getPalab();   
        
        int vocales =0;
        
        
        for (int x = 0; x < Palab.length(); x++)
        {
            char letraActual = Palab.charAt(x);
            System.out.print(letraActual);
            
            int AsciiValue = letraActual;
            System.out.print(AsciiValue);
             if (AsciiValue == 65 || AsciiValue == 69 || AsciiValue == 73 || AsciiValue == 79
            || AsciiValue ==85 || AsciiValue ==97  || AsciiValue ==101  || AsciiValue ==105
            || AsciiValue ==111 || AsciiValue == 117 || AsciiValue == 130 || AsciiValue == 160
            || AsciiValue ==161 || AsciiValue == 162 || AsciiValue == 163)
            { 
                ++vocales; 
            } 
            
               
                      
        }
        
        return "Vocales: " + vocales;
        
    }
    
    /**
      * Éste método permite conocer la cantidad de consonantes en la palabra
     */
    public String ConsonantesMétodo()
    {
        // put your code here
           
        int consonantes =0;
        
        for (int x = 0; x < Palab.length(); x++)
        {
            char letraActual = Palab.charAt(x);
            
            int AsciiValue = letraActual;
            
            
            if (66 == AsciiValue || AsciiValue == 67 || AsciiValue == 68  || AsciiValue == 70 
            || AsciiValue == 71 || AsciiValue == 72 || AsciiValue == 74 || AsciiValue == 75 || AsciiValue == 76
            || AsciiValue == 77|| AsciiValue == 78 || AsciiValue == 80|| AsciiValue == 81 || AsciiValue == 82 
            || AsciiValue == 83|| AsciiValue == 84 || AsciiValue == 86 || AsciiValue == 87 || AsciiValue == 88
            || AsciiValue == 89|| AsciiValue == 90 
            
            || AsciiValue == 98|| AsciiValue == 99 || AsciiValue == 100 || AsciiValue == 102 || AsciiValue == 103
            || AsciiValue == 104 || AsciiValue == 106 || AsciiValue == 107 || AsciiValue == 108 || AsciiValue == 109
             || AsciiValue == 110 || AsciiValue == 112 || AsciiValue == 113 || AsciiValue == 114 || AsciiValue == 115
             || AsciiValue == 116 || AsciiValue == 118 || AsciiValue == 119 || AsciiValue == 120 || AsciiValue == 121
             || AsciiValue == 122)
            { 
               ++consonantes; 
            }
               
                      
        }
        return "Consonantes: " + consonantes;
        
    }
}
