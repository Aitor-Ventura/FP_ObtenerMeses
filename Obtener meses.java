package es.ulpgc.eii.strings;

/*  Aitor Ventura Delgado
    23.02.2019
    
    Crearemos un metodo que escogerá meses siguiendo unas series de condiciones */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringUtils {
    public static String getMonths(String s1){
        String res = "";
        //Creamos una expresión regular que coja las fechas por formato dd/mm/aaaa, y si hay algo
        //antes o después, ignorarlo. 
        String s2 = "\\b...(enero|febrero|marzo|abril|mayo|junio|julio|agosto|septiembre|octubre|noviembre|diciembre).....\\b";
        
        Pattern n = Pattern.compile(s2);
        Matcher m = n.matcher(s1);
       
       //Mientras encuentre
        while(m.find()){
            //La String resultante tomará el mes y añadirá un espacio
            res += m.group(1) + " ";
        }
        //Luego quitamos los espacios que sobran y los intermedios los sustituimos por un guión
        res = res.trim().replaceAll("\\s+", "-");
        //Y devolvemos la String resultante
        return res;
    }
}