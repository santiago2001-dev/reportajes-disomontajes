
package models;


public class equipos {
    String  nomEquipo, nomSistema;
    int id;

    public String getNomEquipo() {
        return nomEquipo;
    }

    public void setNomEquipo(String nomEquipo) {
        this.nomEquipo = nomEquipo;
    }

    public String getNomSistema() {
        return nomSistema;
    }

    public void setNomSistema(String nomSistema) {
        this.nomSistema = nomSistema;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public equipos(String nomEquipo, String nomSistema, int id) {
        this.nomEquipo = nomEquipo;
        this.nomSistema = nomSistema;
        this.id = id;
    }
    public equipos(){
    }
    
}
