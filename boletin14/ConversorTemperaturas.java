package boletin14;

import java.util.*;

/**
 *
 * @author mmartinezcosta
 */
public class ConversorTemperaturas {

    Scanner sc = new Scanner(System.in);

    private float temperaturaMinima = 80;

    public ConversorTemperaturas() {

    }

    public void centigradosAFahrenheit() throws TemperaturaErradaExcepcion {

        float temperaturaInicial;
        float temperaturaConversaF;

        System.out.println("Dime cuantos grados centígrados quieres convertir a Fahrenheit");
        temperaturaInicial = sc.nextFloat();
        
        if (temperaturaInicial < temperaturaMinima) {
            throw new TemperaturaErradaExcepcion("La temperatura no puede ser menor que " + temperaturaMinima + "ºC");
        }
        
        temperaturaConversaF = (float) (9.0 / 5.0 * temperaturaInicial + 32.4);

        System.out.println("Los " + temperaturaInicial + "ºC equivalen a " + temperaturaConversaF + "º Fahrenheit");
    }

    public void centígradosAReamur() throws TemperaturaErradaExcepcion {

        float temperaturaInicial;
        float temperaturaConversaR;

        System.out.println("Dime cuantos grados centígrados quieres convertir a grados Réamur");
        temperaturaInicial = sc.nextFloat();

        if (temperaturaInicial < temperaturaMinima) {
            throw new TemperaturaErradaExcepcion("La temperatura no puede ser menor que " + temperaturaMinima + "ºC");
        }
        
        temperaturaConversaR = (float) (4.0 / 5.0 * temperaturaInicial);

        System.out.println("Los " + temperaturaInicial + "ºC equivalen a " + temperaturaConversaR + "º Réamur");
    }

}
