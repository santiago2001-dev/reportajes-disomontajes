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
public class InfoReporte {
    private int idDoc;
    private int idUser;
    
    private String titulo;
    private String companiaContra;
    private String companiaSeriv;
    private String IDFECHADOC;
    private String Equiporieg;
    private String namesUser;
    private String nombreUno;
    private String celularUno;
    private String correoUno;
    private String nombreDos;
    private String celularDos;
    private String correoDos;
    private String nombreTres;
    private String celularTres;
    private String correoTres;

    private String Nombre4;
    private String Ceular4;
    private String Correo4;
    private String Nombre5;
    private String Ceular5;
    private String Correo5;
    private String Nombre6;
    private String Celular6;
    private String Correo6;

    private String idpozo;
    private String idmuni;
    private String iddepa;
    private String ubiPozo;
    private String activdadEqui;
    private String fechaIni;
    private String fehaFin;
    private String compaIns;
    private String nameSuper;
    private String celSuper;

    private String nameAsis;
    private String celAsis;
    private String nameInspect;
    private String celInspect;
    private String descImgUno;
    private String descImgDos;
    private String descImgTres;
    private String descImgCuatro;
    private String propositoInspect;
    private String imgUno;
    private String imgDos;
    private String imgTres;
    private String imgCuatro;

    private int Perf1;
    private int Perf2;
    private int Perf3;
    private int Perf4;
    private int Wk1;
    private int Wk2;
    private int Wk3;
    private int Wk4;

    private int IVPSEH1;
    private int IVSEH2;
    private int IVSEH3;
    private int IVSEH4;
    private int ICFR1;
    private int ICFR2;
    private int ICFR3;
    private int ICFR4;

    private int ERIAI1;
    private int ERIAI2;
    private int ERIAI3;
    private int ERIAI4;

    // Constructor
    public InfoReporte() {
        // Puedes proporcionar un constructor vacío o crear uno con todos los campos según tus necesidades.
    }

    public InfoReporte(int idDoc, int idUser, String titulo, String companiaContra, String companiaSeriv, String IDFECHADOC, String Equiporieg, String namesUser, String nombreUno, String celularUno, String correoUno, String nombreDos, String celularDos, String correoDos, String nombreTres, String celularTres, String correoTres, String Nombre4, String Ceular4, String Correo4, String Nombre5, String Ceular5, String Correo5, String Nombre6, String Celular6, String Correo6, String idpozo, String idmuni, String iddepa, String ubiPozo, String activdadEqui, String fechaIni, String fehaFin, String compaIns, String nameSuper, String celSuper, String nameAsis, String celAsis, String nameInspect, String celInspect, String descImgUno, String descImgDos, String descImgTres, String descImgCuatro, String propositoInspect, String imgUno, String imgDos, String imgTres, String imgCuatro, int Perf1, int Perf2, int Perf3, int Perf4, int Wk1, int Wk2, int Wk3, int Wk4, int IVPSEH1, int IVSEH2, int IVSEH3, int IVSEH4, int ICFR1, int ICFR2, int ICFR3, int ICFR4, int ERIAI1, int ERIAI2, int ERIAI3, int ERIAI4) {
        this.idDoc = idDoc;
        this.idUser = idUser;
        this.titulo = titulo;
        this.companiaContra = companiaContra;
        this.companiaSeriv = companiaSeriv;
        this.IDFECHADOC = IDFECHADOC;
        this.Equiporieg = Equiporieg;
        this.namesUser = namesUser;
        this.nombreUno = nombreUno;
        this.celularUno = celularUno;
        this.correoUno = correoUno;
        this.nombreDos = nombreDos;
        this.celularDos = celularDos;
        this.correoDos = correoDos;
        this.nombreTres = nombreTres;
        this.celularTres = celularTres;
        this.correoTres = correoTres;
        this.Nombre4 = Nombre4;
        this.Ceular4 = Ceular4;
        this.Correo4 = Correo4;
        this.Nombre5 = Nombre5;
        this.Ceular5 = Ceular5;
        this.Correo5 = Correo5;
        this.Nombre6 = Nombre6;
        this.Celular6 = Celular6;
        this.Correo6 = Correo6;
        this.idpozo = idpozo;
        this.idmuni = idmuni;
        this.iddepa = iddepa;
        this.ubiPozo = ubiPozo;
        this.activdadEqui = activdadEqui;
        this.fechaIni = fechaIni;
        this.fehaFin = fehaFin;
        this.compaIns = compaIns;
        this.nameSuper = nameSuper;
        this.celSuper = celSuper;
        this.nameAsis = nameAsis;
        this.celAsis = celAsis;
        this.nameInspect = nameInspect;
        this.celInspect = celInspect;
        this.descImgUno = descImgUno;
        this.descImgDos = descImgDos;
        this.descImgTres = descImgTres;
        this.descImgCuatro = descImgCuatro;
        this.propositoInspect = propositoInspect;
        this.imgUno = imgUno;
        this.imgDos = imgDos;
        this.imgTres = imgTres;
        this.imgCuatro = imgCuatro;
        this.Perf1 = Perf1;
        this.Perf2 = Perf2;
        this.Perf3 = Perf3;
        this.Perf4 = Perf4;
        this.Wk1 = Wk1;
        this.Wk2 = Wk2;
        this.Wk3 = Wk3;
        this.Wk4 = Wk4;
        this.IVPSEH1 = IVPSEH1;
        this.IVSEH2 = IVSEH2;
        this.IVSEH3 = IVSEH3;
        this.IVSEH4 = IVSEH4;
        this.ICFR1 = ICFR1;
        this.ICFR2 = ICFR2;
        this.ICFR3 = ICFR3;
        this.ICFR4 = ICFR4;
        this.ERIAI1 = ERIAI1;
        this.ERIAI2 = ERIAI2;
        this.ERIAI3 = ERIAI3;
        this.ERIAI4 = ERIAI4;
    }

    public int getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(int idDoc) {
        this.idDoc = idDoc;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCompaniaContra() {
        return companiaContra;
    }

    public void setCompaniaContra(String companiaContra) {
        this.companiaContra = companiaContra;
    }

    public String getCompaniaSeriv() {
        return companiaSeriv;
    }

    public void setCompaniaSeriv(String companiaSeriv) {
        this.companiaSeriv = companiaSeriv;
    }

    public String getIDFECHADOC() {
        return IDFECHADOC;
    }

    public void setIDFECHADOC(String IDFECHADOC) {
        this.IDFECHADOC = IDFECHADOC;
    }

    public String getEquiporieg() {
        return Equiporieg;
    }

    public void setEquiporieg(String Equiporieg) {
        this.Equiporieg = Equiporieg;
    }

    public String getNamesUser() {
        return namesUser;
    }

    public void setNamesUser(String namesUser) {
        this.namesUser = namesUser;
    }

    public String getNombreUno() {
        return nombreUno;
    }

    public void setNombreUno(String nombreUno) {
        this.nombreUno = nombreUno;
    }

    public String getCelularUno() {
        return celularUno;
    }

    public void setCelularUno(String celularUno) {
        this.celularUno = celularUno;
    }

    public String getCorreoUno() {
        return correoUno;
    }

    public void setCorreoUno(String correoUno) {
        this.correoUno = correoUno;
    }

    public String getNombreDos() {
        return nombreDos;
    }

    public void setNombreDos(String nombreDos) {
        this.nombreDos = nombreDos;
    }

    public String getCelularDos() {
        return celularDos;
    }

    public void setCelularDos(String celularDos) {
        this.celularDos = celularDos;
    }

    public String getCorreoDos() {
        return correoDos;
    }

    public void setCorreoDos(String correoDos) {
        this.correoDos = correoDos;
    }

    public String getNombreTres() {
        return nombreTres;
    }

    public void setNombreTres(String nombreTres) {
        this.nombreTres = nombreTres;
    }

    public String getCelularTres() {
        return celularTres;
    }

    public void setCelularTres(String celularTres) {
        this.celularTres = celularTres;
    }

    public String getCorreoTres() {
        return correoTres;
    }

    public void setCorreoTres(String correoTres) {
        this.correoTres = correoTres;
    }

    public String getNombre4() {
        return Nombre4;
    }

    public void setNombre4(String Nombre4) {
        this.Nombre4 = Nombre4;
    }

    public String getCeular4() {
        return Ceular4;
    }

    public void setCeular4(String Ceular4) {
        this.Ceular4 = Ceular4;
    }

    public String getCorreo4() {
        return Correo4;
    }

    public void setCorreo4(String Correo4) {
        this.Correo4 = Correo4;
    }

    public String getNombre5() {
        return Nombre5;
    }

    public void setNombre5(String Nombre5) {
        this.Nombre5 = Nombre5;
    }

    public String getCeular5() {
        return Ceular5;
    }

    public void setCeular5(String Ceular5) {
        this.Ceular5 = Ceular5;
    }

    public String getCorreo5() {
        return Correo5;
    }

    public void setCorreo5(String Correo5) {
        this.Correo5 = Correo5;
    }

    public String getNombre6() {
        return Nombre6;
    }

    public void setNombre6(String Nombre6) {
        this.Nombre6 = Nombre6;
    }

    public String getCelular6() {
        return Celular6;
    }

    public void setCelular6(String Celular6) {
        this.Celular6 = Celular6;
    }

    public String getCorreo6() {
        return Correo6;
    }

    public void setCorreo6(String Correo6) {
        this.Correo6 = Correo6;
    }

    public String getIdpozo() {
        return idpozo;
    }

    public void setIdpozo(String idpozo) {
        this.idpozo = idpozo;
    }

    public String getIdmuni() {
        return idmuni;
    }

    public void setIdmuni(String idmuni) {
        this.idmuni = idmuni;
    }

    public String getIddepa() {
        return iddepa;
    }

    public void setIddepa(String iddepa) {
        this.iddepa = iddepa;
    }

    public String getUbiPozo() {
        return ubiPozo;
    }

    public void setUbiPozo(String ubiPozo) {
        this.ubiPozo = ubiPozo;
    }

    public String getActivdadEqui() {
        return activdadEqui;
    }

    public void setActivdadEqui(String activdadEqui) {
        this.activdadEqui = activdadEqui;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public String getFehaFin() {
        return fehaFin;
    }

    public void setFehaFin(String fehaFin) {
        this.fehaFin = fehaFin;
    }

    public String getCompaIns() {
        return compaIns;
    }

    public void setCompaIns(String compaIns) {
        this.compaIns = compaIns;
    }

    public String getNameSuper() {
        return nameSuper;
    }

    public void setNameSuper(String nameSuper) {
        this.nameSuper = nameSuper;
    }

    public String getCelSuper() {
        return celSuper;
    }

    public void setCelSuper(String celSuper) {
        this.celSuper = celSuper;
    }

    public String getNameAsis() {
        return nameAsis;
    }

    public void setNameAsis(String nameAsis) {
        this.nameAsis = nameAsis;
    }

    public String getCelAsis() {
        return celAsis;
    }

    public void setCelAsis(String celAsis) {
        this.celAsis = celAsis;
    }

    public String getNameInspect() {
        return nameInspect;
    }

    public void setNameInspect(String nameInspect) {
        this.nameInspect = nameInspect;
    }

    public String getCelInspect() {
        return celInspect;
    }

    public void setCelInspect(String celInspect) {
        this.celInspect = celInspect;
    }

    public String getDescImgUno() {
        return descImgUno;
    }

    public void setDescImgUno(String descImgUno) {
        this.descImgUno = descImgUno;
    }

    public String getDescImgDos() {
        return descImgDos;
    }

    public void setDescImgDos(String descImgDos) {
        this.descImgDos = descImgDos;
    }

    public String getDescImgTres() {
        return descImgTres;
    }

    public void setDescImgTres(String descImgTres) {
        this.descImgTres = descImgTres;
    }

    public String getDescImgCuatro() {
        return descImgCuatro;
    }

    public void setDescImgCuatro(String descImgCuatro) {
        this.descImgCuatro = descImgCuatro;
    }

    public String getPropositoInspect() {
        return propositoInspect;
    }

    public void setPropositoInspect(String propositoInspect) {
        this.propositoInspect = propositoInspect;
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

    public String getImgCuatro() {
        return imgCuatro;
    }

    public void setImgCuatro(String imgCuatro) {
        this.imgCuatro = imgCuatro;
    }

    public int getPerf1() {
        return Perf1;
    }

    public void setPerf1(int Perf1) {
        this.Perf1 = Perf1;
    }

    public int getPerf2() {
        return Perf2;
    }

    public void setPerf2(int Perf2) {
        this.Perf2 = Perf2;
    }

    public int getPerf3() {
        return Perf3;
    }

    public void setPerf3(int Perf3) {
        this.Perf3 = Perf3;
    }

    public int getPerf4() {
        return Perf4;
    }

    public void setPerf4(int Perf4) {
        this.Perf4 = Perf4;
    }

    public int getWk1() {
        return Wk1;
    }

    public void setWk1(int Wk1) {
        this.Wk1 = Wk1;
    }

    public int getWk2() {
        return Wk2;
    }

    public void setWk2(int Wk2) {
        this.Wk2 = Wk2;
    }

    public int getWk3() {
        return Wk3;
    }

    public void setWk3(int Wk3) {
        this.Wk3 = Wk3;
    }

    public int getWk4() {
        return Wk4;
    }

    public void setWk4(int Wk4) {
        this.Wk4 = Wk4;
    }

    public int getIVPSEH1() {
        return IVPSEH1;
    }

    public void setIVPSEH1(int IVPSEH1) {
        this.IVPSEH1 = IVPSEH1;
    }

    public int getIVSEH2() {
        return IVSEH2;
    }

    public void setIVSEH2(int IVSEH2) {
        this.IVSEH2 = IVSEH2;
    }

    public int getIVSEH3() {
        return IVSEH3;
    }

    public void setIVSEH3(int IVSEH3) {
        this.IVSEH3 = IVSEH3;
    }

    public int getIVSEH4() {
        return IVSEH4;
    }

    public void setIVSEH4(int IVSEH4) {
        this.IVSEH4 = IVSEH4;
    }

    public int getICFR1() {
        return ICFR1;
    }

    public void setICFR1(int ICFR1) {
        this.ICFR1 = ICFR1;
    }

    public int getICFR2() {
        return ICFR2;
    }

    public void setICFR2(int ICFR2) {
        this.ICFR2 = ICFR2;
    }

    public int getICFR3() {
        return ICFR3;
    }

    public void setICFR3(int ICFR3) {
        this.ICFR3 = ICFR3;
    }

    public int getICFR4() {
        return ICFR4;
    }

    public void setICFR4(int ICFR4) {
        this.ICFR4 = ICFR4;
    }

    public int getERIAI1() {
        return ERIAI1;
    }

    public void setERIAI1(int ERIAI1) {
        this.ERIAI1 = ERIAI1;
    }

    public int getERIAI2() {
        return ERIAI2;
    }

    public void setERIAI2(int ERIAI2) {
        this.ERIAI2 = ERIAI2;
    }

    public int getERIAI3() {
        return ERIAI3;
    }

    public void setERIAI3(int ERIAI3) {
        this.ERIAI3 = ERIAI3;
    }

    public int getERIAI4() {
        return ERIAI4;
    }

    public void setERIAI4(int ERIAI4) {
        this.ERIAI4 = ERIAI4;
    }

   
    

}
