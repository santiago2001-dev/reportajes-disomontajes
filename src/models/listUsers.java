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
public class listUsers {
    ArrayList<users> Lista;
    
    public listUsers() {
        Lista = new ArrayList();
    }
    
    
    public void addUsers(users u){
    
        Lista.add(u);
    }
    
    
    
}
