/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parte2;

/**
 *
 * @author Luis Diego
 */
public class Ortonormales {
        
    
    
    public float euclidiana(float[] vector){
        float v=0;
        for (int i = 0; i < vector.length; i++) {
            v+= Math.pow(vector[i],2);
        }
        v=(float) Math.sqrt(v);
        System.out.println(v);
        return v;
    }
    
    public float productoPunto(float[] vector1,float[] vector2){
        float producto=0;
        for (int i = 0; i < vector1.length; i++) {
            producto += (vector1[i]*vector2[i]);
        }
        System.out.println(producto);
        return producto;
    }
    public float proyeccion(float[] vector1,float[] vector2){
        float proyeccion=0;
        float punto=productoPunto(vector1, vector2);
        float eu=euclidiana(vector2);
        proyeccion=(float)(punto/Math.pow(eu, 2));
        System.out.println(punto+"/ "+eu);
        return proyeccion;
    }
    
}
