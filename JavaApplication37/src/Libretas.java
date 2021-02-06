/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pineda
 */
public class Libretas {
    public String marca;
    public int numeroHojas;
    Double precio;
    boolean pastaDura;
    public Libretas(){
        
    }
    public Libretas(String marca,int numeroHojas,Double precio,boolean pastaDura){
        this.marca=marca;
        this.numeroHojas=numeroHojas;
        this.precio=precio;
        this.pastaDura=pastaDura;
    }
    @Override
    public String toString(){
        if(pastaDura)
            return "La libreta de marca "+marca+" tiene un precio de "+precio+"\nun total de "+numeroHojas+
                    "y tiene pasta dura";           
        else
            return "La libreta de marca "+marca+" tiene un precio de "+precio+"\nun total de "+numeroHojas+
                    "y no tiene pasta dura";
    }
    
}
