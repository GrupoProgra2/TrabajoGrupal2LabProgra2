/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajogrupal2;

/**
 *
 * @author Justm
 */
public class PlanSmart extends PlanBasico {
   
    public PlanSmart(int n, String nom){
        super(n, nom);
    }
   
    public double pagoMensual(){
        double x= monthlyMinutes()-300;
        return x*.5+42;
    }
    
    public String toString(){
        return super.toString()+pagoMensual();
    }
}
