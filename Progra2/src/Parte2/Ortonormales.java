/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parte2;

import java.util.Arrays;

/**
 *
 * @author Luis Diego
 */
public class Ortonormales {
        public double euclidiana(double[] vector){
        double res=0;
        for(int i=0;i<vector.length;i++){
            res=res+Math.pow((vector[i]), 2);
        }
        return (Math.sqrt(res));
    }
    
    public double punto(double[] vector1,double[] vector2){
        double res=0;
        for(int i=0;i<vector1.length;i++){
            res=res+((vector1[i])*(vector2[i]));
        }
        return res;
    }
    
    public double[] proyeccion(double[] vector1,double[] vector2){
        double[] resFinal; 
        double res1,res2,resDiv;
        res1=punto(vector1, vector2);
        res2=Math.pow(euclidiana(vector2),2);
        resDiv=res1/res2;
        resFinal=Escalar(vector2, resDiv);
        return resFinal;
    }
    
    public double[] Escalar(double[] vector,double escalar){
        double[] res=new double[vector.length];
        for(int i=0;i<vector.length;i++){
            res[i]=(escalar*(vector[i]));
        }
        return res;
    }
    
    public double[] restarVectores(double[] vector1, double[] vector2){
        double[] res = new double[vector1.length];
        for(int i=0;i<vector1.length;i++){
            res[i]=vector1[i]-vector2[i];
        }
        return res;
    }
    public double determinante(double[][] matriz)
{
    double det;
    if(matriz.length==2)
    {
        det=(matriz[0][0]*matriz[1][1])-(matriz[1][0]*matriz[0][1]);
        return det;
    }
    double suma=0;
    for(int i=0; i<matriz.length; i++){
    double[][] nm=new double[matriz.length-1][matriz.length-1];
        for(int j=0; j<matriz.length; j++){
            if(j!=i){
                for(int k=1; k<matriz.length; k++){
                int indice=-1;
                if(j<i)
                indice=j;
                else if(j>i)
                indice=j-1;
                nm[indice][k-1]=matriz[j][k];
                }
            }
        }
        if(i%2==0)
        suma+=matriz[i][0] * determinante(nm);
        else
        suma-=matriz[i][0] * determinante(nm);
    }
    return suma;
}
    
    public double[][] ortonormalizacion(double[][] matriz){
        double[][]resultado = new double[matriz.length][matriz.length];
        
        resultado[0]=(Escalar(matriz[0], 1/euclidiana(matriz[0])));
        resultado[1]=
        Escalar(restarVectores(matriz[1],proyeccion(matriz[1],resultado[0])),1/euclidiana(restarVectores(matriz[1],proyeccion(matriz[1],resultado[0]))));
        if(matriz.length==3){
            resultado[2]=
        Escalar(restarVectores(restarVectores(matriz[2],proyeccion(matriz[2],resultado[0])),proyeccion(matriz[2],resultado[1])),1/euclidiana(restarVectores(restarVectores(matriz[2],proyeccion(matriz[2],resultado[0])),proyeccion(matriz[2],resultado[1]))));
        }
        return resultado;
    }
    
    
    
    
}
