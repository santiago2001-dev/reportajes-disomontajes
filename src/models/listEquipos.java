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
public class listEquipos {
ArrayList<equipos> lista;

    public listEquipos() {
        lista = new ArrayList<>();
    }

    public void addTypeUser(equipos t) {
        lista.add(t);
    }    
}
