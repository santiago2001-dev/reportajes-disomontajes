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
public class modelHallazgosGen {
   String nombreSistem, nombreEquipo,Desc,imgUno,imgDos,imgTres,prioridad;
   int tipoHallazgo;

    public modelHallazgosGen(String nombreSistem, String nombreEquipo, String Desc, String imgUno, String imgDos, String imgTres, String prioridad, int tipoHallazgo) {
        this.nombreSistem = nombreSistem;
        this.nombreEquipo = nombreEquipo;
        this.Desc = Desc;
        this.imgUno = imgUno;
        this.imgDos = imgDos;
        this.imgTres = imgTres;
        this.prioridad = prioridad;
        this.tipoHallazgo =  tipoHallazgo;
    }

    public modelHallazgosGen() {
    }

    public int getTipoHallazgo() {
        return tipoHallazgo;
    }

    public void setTipoHallazgo(int tipoHallazgo) {
        this.tipoHallazgo = tipoHallazgo;
    }

    public String getNombreSistem() {
        return nombreSistem;
    }

    public void setNombreSistem(String nombreSistem) {
        this.nombreSistem = nombreSistem;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public String getImgUno() {
        return imgUno;
    }

    public void setImgUno(String imgUno) {
        this.imgUno = imgUno;
    }

    public String getImgDos() {
        return imgDos;
    }

    public void setImgDos(String imgDos) {
        this.imgDos = imgDos;
    }

    public String getImgTres() {
        return imgTres;
    }

    public void setImgTres(String imgTres) {
        this.imgTres = imgTres;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
   
}
