/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajogrupal2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Justm
 */
public class PlanBasico {
    protected int numero;
    protected String name;
    protected ArrayList<LogCall> llamadas;
    
    public PlanBasico(int n, String name){
        numero=n;
        this.name=name;
        this.llamadas= new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void call(int numero, double mins){
        LogCall e= new LogCall(numero, mins);
        llamadas.add(e);
    } 
    public double monthlyMinutes(){
        double suma=0;
        Calendar t= Calendar.getInstance();
        t.set(t.get(Calendar.YEAR), t.get(Calendar.MONTH), 1, 0, 0);
         Calendar t2= Calendar.getInstance();
        t2.set(t2.get(Calendar.YEAR), t2.get(Calendar.MONTH)+1, 1, 0, 0);
        for (LogCall log: llamadas){
            if (log.fecha.after(t) && log.fecha.before(t2)){
                suma=log.minutos+suma;
            }
        }
        return suma;
    }
    
    public double pagoMensual(){
        return this.monthlyMinutes()* 0.5;
    }
    
    public String toString(){
        return "Nombre"+name+numero;
    }
    
    public void imprimir(){
        System.out.println(this.toString());
        Calendar t= Calendar.getInstance();
        t.set(t.get(Calendar.YEAR), t.get(Calendar.MONTH), 1, 0, 0);
         Calendar t2= Calendar.getInstance();
        t2.set(t2.get(Calendar.YEAR), t2.get(Calendar.MONTH)+1, 1, 0, 0);
         for (LogCall log: llamadas){
            if (log.fecha.after(t) && log.fecha.before(t2)){
                System.out.println(log.toString());
            }
        }
    }
}
