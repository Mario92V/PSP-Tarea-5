package mariovelez.psptarea5;

import static spark.Spark.*;
/**
 *
 * @author Mario F. Vélez R.
 */
public class Controlador
{
    /**
     * Método main que controla la ejecución de las otras clases y envia el resultado a Heroku
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        port(Integer.valueOf(System.getenv("PORT")));
        staticFileLocation("/public");
        
        get("/", (request, response) -> {
        Vista controladorVista = new Vista();
        Modelo controladorModelo = new Modelo();
        double w = controladorModelo.calcularW(1.1, 10);
        double valor1 = controladorModelo.calcularP(w, 1.1, 10, 9, 10);
        w = controladorModelo.calcularW(1.1, 20);
        double valor2 = controladorModelo.calcularP(w, 1.1, 20, 9, 20);
        boolean comprobacion = controladorModelo.compararResultados(valor1, valor2);
        double p1 = valor2;
        w = controladorModelo.calcularW(1.1812, 10);
        valor1 = controladorModelo.calcularP(w, 1.1812, 10, 10, 10);
        w = controladorModelo.calcularW(1.1812, 20);
        valor2 = controladorModelo.calcularP(w, 1.1812, 20, 10, 20);
        comprobacion = controladorModelo.compararResultados(valor1, valor2);
        double p2 = valor2;
        w = controladorModelo.calcularW(2.750, 10);
        valor1 = controladorModelo.calcularP(w, 2.750, 10, 30, 10);
        w = controladorModelo.calcularW(2.750, 20);
        valor2 = controladorModelo.calcularP(w, 2.750, 20, 30, 20);
        comprobacion = controladorModelo.compararResultados(valor1, valor2);
        double p3 = valor2;
        return controladorVista.mostrarResultados(p1, p2, p3);
    });
    }
}