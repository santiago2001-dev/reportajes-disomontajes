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
public class modelEvidencias {
    String desc ,imgRoute;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImgRoute() {
        return imgRoute;
    }

    public void setImgRoute(String imgRoute) {
        this.imgRoute = imgRoute;
    }

    public modelEvidencias(String desc, String imgRoute) {
        this.desc = desc;
        this.imgRoute = imgRoute;
    }

    public modelEvidencias() {
    }
    
            
    
}
