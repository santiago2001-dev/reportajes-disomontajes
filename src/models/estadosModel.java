/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author taesi
 */
public class estadosModel {
    String nameStado, color;

    public estadosModel(String nameStado, String color) {
        this.nameStado = nameStado;
        this.color = color;
    }

    public estadosModel() {
    }

    public String getNameStado() {
        return nameStado;
    }

    public void setNameStado(String nameStado) {
        this.nameStado = nameStado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
