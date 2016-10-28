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
public class PlanTarjeta extends PlanBasico{
     private double saldo ;
    
    public PlanTarjeta(int n, String name) {
        super(n, name);
        saldo = 0;
    }
    public void aplicarTarjeta(double monto){
        Calendar domingo = Calendar.getInstance();
        Calendar hoy = Calendar.getInstance();
        domingo.get(Calendar.SUNDAY);
        if(monto > 0){
            if(hoy.getTime().equals(domingo)){
                saldo += (3 * monto);
            }
            else{
               saldo += monto;
            }
        } 
   }
    @Override
     public void call(int numero, double mins){
         double Monto =(mins*0.7);
        LogCall e= new LogCall(numero, mins);
        llamadas.add(e);
    } 
    
    
}
