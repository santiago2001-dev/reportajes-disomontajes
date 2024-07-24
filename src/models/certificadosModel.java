/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author User
 */
public class certificadosModel {
    int id ;
    String equipo, vencimiento;

    public certificadosModel(int id, String equipo, String vencimiento) {
        this.id = id;
        this.equipo = equipo;
        this.vencimiento = vencimiento;
    }

    public certificadosModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }
    
    
    
    
}
