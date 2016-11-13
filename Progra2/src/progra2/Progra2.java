/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2;

import Parte2.Ortonormales;

/**
 *
 * @author Luis Diego
 */
public class Progra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new progra2.Principal().setVisible(true);
        Parte2.Ortonormales obj=new Ortonormales();
        float[] m={1,-1,1};
        float[] r={-2,3,-1};
        float[] suma=obj.suma2Vectores(m,m);
        for (int i = 0; i < suma.length; i++) {
            System.out.println(r[i]);
        }
       obj.euclidiana(obj.resta2Vectores(r,suma));
       
    }
    
}
