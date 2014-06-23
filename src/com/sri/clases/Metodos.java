/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sri.clases;

/**
 *
 * @author Pablo
 */
public class Metodos {
    public static boolean VerificarCedula(String ced)
        {
            int isNumeric;
            int total = 0;
            int tamanoLongitudCedula = 10;
            int[] coeficientes = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
            int numeroProvincias = 24;
            int tercerDigito = 6;
            if (ced.length() == tamanoLongitudCedula)
            {
                int provincia = Integer.parseInt(ced.substring(0,1));
                int digitoTres = Integer.parseInt(ced.substring(2,2));
                if ((provincia > 0 && provincia <= numeroProvincias) && digitoTres < tercerDigito)
                {
                    int digitoVerificadorRecibido = Integer.parseInt(ced.substring(9,9));
                    for (int k = 0; k < coeficientes.length; k++)
                    {
                        int valor = coeficientes[k] * Integer.parseInt(ced.substring(k,k));
                        total = valor >= 10 ? total + (valor - 9) : total + valor;
                    }
                    int digitoVerificadorObtenido = total >= 10 ? (total % 10) != 0 ? 10 - (total % 10) : (total % 10) : total;
                    return digitoVerificadorObtenido == digitoVerificadorRecibido;
                }
                return false;
            }
            return false;
        }
    
}
