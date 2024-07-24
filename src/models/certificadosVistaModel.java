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
public class certificadosVistaModel {
    
    String  equipo,fechaSerti,Vencimiento,refNorma,Comentarios,estado;
    int mt;
    public certificadosVistaModel() {
    }

    public certificadosVistaModel(String equipo, String fechaSerti, String Vencimiento, String refNorma, String Comentarios, String estado, int mt) {
        this.equipo = equipo;
        this.fechaSerti = fechaSerti;
        this.Vencimiento = Vencimiento;
        this.refNorma = refNorma;
        this.Comentarios = Comentarios;
        this.estado = estado;
        this.mt = mt;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getFechaSerti() {
        return fechaSerti;
    }

    public void setFechaSerti(String fechaSerti) {
        this.fechaSerti = fechaSerti;
    }

    public String getVencimiento() {
        return Vencimiento;
    }

    public void setVencimiento(String Vencimiento) {
        this.Vencimiento = Vencimiento;
    }

    public String getRefNorma() {
        return refNorma;
    }

    public void setRefNorma(String refNorma) {
        this.refNorma = refNorma;
    }

    public String getComentarios() {
        return Comentarios;
    }

    public void setComentarios(String Comentarios) {
        this.Comentarios = Comentarios;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getMt() {
        return mt;
    }

    public void setMt(int mt) {
        this.mt = mt;
    }
    
    
    

   
    
    
}
