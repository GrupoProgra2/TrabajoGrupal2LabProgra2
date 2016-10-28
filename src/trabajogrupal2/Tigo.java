/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajogrupal2;

import java.util.ArrayList;

/**
 *
 * @author Justm
 */
public class Tigo {
    private ArrayList<PlanBasico> planes;
     boolean b=true;
    public void addPlan(int numtel,String nombre, String tipo){
        for (PlanBasico p: planes){
            if (p.numero==numtel)
                    b=true;
        }
        if (b){
            if (tipo.equalsIgnoreCase("Basico")){
                planes.add(new PlanBasico(numtel, nombre));
            }
            else if (tipo.equalsIgnoreCase("Smart")){
                planes.add(new PlanSmart(numtel, nombre));
            }
            else if (tipo.equalsIgnoreCase("Tarjeta")){
                planes.add(new PlanTarjeta(numtel, nombre));
            }
        }
    }
}
