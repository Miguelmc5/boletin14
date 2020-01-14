package boletin14;

/**
 *
 * @author DANIELCASTELAO\mmartinezcosta
 */
public class Boletin14 {

    
    public static void main(String[] args) {
        // TODO code application logic here
    
    ConversorTemperaturas temperatura1= new ConversorTemperaturas();
    
    try{
            temperatura1.centigradosAFahrenheit();
        }catch(TemperaturaErradaExcepcion e){
            System.out.println("Erro "+e.getMessage());
        }
       try{
            temperatura1.centígradosAReamur();
        }catch(TemperaturaErradaExcepcion e1){
            System.out.println("Erro "+e1.getMessage());
        }
    
    
    }
    
}
