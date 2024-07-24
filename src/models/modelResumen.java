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
public class modelResumen {
    
    String name ,desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public modelResumen() {
    }

    public modelResumen(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    
    
            
    
}
