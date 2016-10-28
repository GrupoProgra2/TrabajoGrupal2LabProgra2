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
public class PlanBasico {
    protected int numero;
    protected String name;
    protected ArrayList<LogCall> llamadas;
    
    public PlanBasico(int n, String name){
        numero=n;
        this.name=name;
        this.llamadas= new ArrayList<>();
    }
}
