import es.ulpgc.eii.strings.StringUtils;

public class Main {
    /**
     * Prueba el método StringUtils.tagger
     * @param input - ristra a normalizar
     * @param expected - resultado esperado
     */
    static void test(String input, String expected) {
    	// Se informa del caso que se está probando
    	System.out.println("probando: getMonths(\"" + input + "\")");
    	
        // Llamada al método a probar
        String result = StringUtils.getMonths(input);
        
        // Comprobación de los resultados
        if (!result.equals(expected)) {
            System.out.print(">> Resultado erróneo, deberia ser: \"" + expected + "\"");
            System.out.println(" y es: \"" + result + "\"");
        } else {
            System.out.println(">> Resultado correcto: \"" + result + "\"");
        }        
    }

    /**
     * @param args
     */
    /**
     * Invoca a test para realizar múltiples pruebas de StringUtils.normalize
     * @param args
     */
    public static void main(String[] args) {
        test("fue el 10-enero-2010, no el 12-febrero-2008", "enero-febrero");
    }

}
