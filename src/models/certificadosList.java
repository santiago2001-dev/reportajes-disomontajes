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
public class certificadosList {
 
    
    ArrayList<certificadosModel> lista;

    public certificadosList() {
        lista = new ArrayList<>();
    }

    public void  addCertificado(certificadosModel t) {
        lista.add(t);
    }
    
}
