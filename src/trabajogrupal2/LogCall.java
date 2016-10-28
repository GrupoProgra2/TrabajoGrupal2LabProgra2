/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajogrupal2;

import java.util.Calendar;

/**
 *
 * @author Justm
 */
public class LogCall {
    public int numero;
    public double minutos;
    public Calendar fecha;
    
    public LogCall(int num, double mins){
        numero= num;
        minutos=mins;
        fecha=Calendar.getInstance();
    }
    public String toString(){
        String cadena= Integer.toString(numero)+Double.toString(minutos)+
        return 
    }
    
}
