/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.prefs.Preferences;
import vistas.login;

public class conexion {

    String db = "dismonta_app-reportes",
            url = "jdbc:mysql://162.241.61.248:3306/",
            user = "dismonta_Admin",
            password = "4pDy^)PoAL6C",
            driver = "com.mysql.cj.jdbc.Driver";
    Connection cx;

    public conexion() {
    }

    public Connection conectar() {
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url + db, user, password);
            System.out.println("conexion exitosa");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("error al conectar db" + ex);

        }

        return cx;

    }

    public void desconectar() {

        try {

            cx.close();
        } catch (SQLException e) {
            System.out.println(e);

        }

    }

    public int validateTypeUser() {
        Preferences prefs = Preferences.userNodeForPackage(login.class);
        int respuesta = 0;
        String tipoUser = prefs.get("tipoUser", " ");
        if (tipoUser.equals("administrador")) {
            respuesta = 1;
        } else if (tipoUser.equals(" ")) {
            respuesta = 0;
        } else {
            respuesta = 0;
        }

        return respuesta;
    }
}
