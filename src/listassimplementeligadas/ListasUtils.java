/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listassimplementeligadas;

/**
 *
 * @author Alumnos
 */
public class ListasUtils<T> {
    
    public int count(Nodo<T> inicio){
        int resultado=0;
        Nodo<T> q= inicio;
        
        while(q != null){
            resultado++;
            q= q.getLiga();
        }  
        return resultado;
    }
    
    public int elementos(Nodo<T> inicio, int posicion){
        T valor= null;
        if(posicion>count (inicio)){
            System.out.println("Error");
        }else{
            Nodo<T> q = inicio;
            int cont=0;
            while( cont!= posicion){
                q= q.getLiga();
                cont++;
            }
            valor = q.getInfo();
        }     
        return posicion;
    }
    
    public int pop(){
        return 0;
    }
}
