/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

public class listTypeUsers {

    ArrayList<typeUsers> lista;

    public listTypeUsers() {
        lista = new ArrayList<>();
    }

    public void addTypeUser(typeUsers t) {
        lista.add(t);
    }
}
