package mariovelez.psptarea5;

/**
 *
 * @author Mario F. Vélez R.
 */
public class Vista
{
    /**
     * Método que organiza los resultados para su visualización en Heroku
     * 
     * @param p1 Valor obtenido de la primera prueba
     * @param p2 Valor obtenido de la segunda prueba
     * @param p3 Valor obtenido de la tercera prueba
     * @return   String con la información de resultados organizada
     */
    public String mostrarResultados(double p1, double p2, double p3)
    {
        String resultado = "Pruebas: " + "<br/>" + "x = (0 to x = 1.1), dof = 9, pEsperado = 0.35006, pObtenido = " + p1 + "<br/>" + "x = (0 to x = 1.1812), dof = 10, pEsperado = 0.36757, pObtenido = " + p2 + "<br/>" + "x = (0 to x = 2.750), dof = 30, p Esperado = 0.49500, pObtenido = " + p3;
		return resultado;
    }
}