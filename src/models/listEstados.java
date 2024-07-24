/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author taesi
 */
public class listEstados {
    ArrayList<estadosModel> lista;

    public listEstados() {
        lista = new ArrayList<>();
    }

    public void addEstado(estadosModel t) {
        lista.add(t);
    }  
    
}
