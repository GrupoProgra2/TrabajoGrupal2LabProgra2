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
public class TrabajoGrupal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LogCall log=new LogCall(9854567,2.55);
        System.out.println(log.toString());
        Calendar t= Calendar.getInstance();
        t.set(t.get(Calendar.YEAR), t.get(Calendar.MONTH), 1, 0, 0);
        System.out.println(t.getTime().toString());
        t.set(t.get(Calendar.YEAR), t.get(Calendar.MONTH)+1, 1, 0, 0);
        System.out.println(t.getTime().toString());
    }
    
}
