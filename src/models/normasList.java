/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class normasList {
    ArrayList<normasModel> lista;

    public normasList() {
        lista = new ArrayList<>();
    }

    public void addNorma(normasModel t) {
        lista.add(t);
    } 
    
}
