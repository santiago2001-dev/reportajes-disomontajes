/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.prefs.Preferences;
import javax.swing.JOptionPane;
import vistas.login;
import vistas.perforacion.Portada;
import vistas.perforacion.formularioPerforacion;
import vistas.perforacion.infoPerforacion;

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

    public void InsertDocument() {
        Preferences portada = Preferences.userNodeForPackage(Portada.class);
        Preferences vistaUno = Preferences.userNodeForPackage(formularioPerforacion.class);
        Preferences vistaDos = Preferences.userNodeForPackage(infoPerforacion.class);
        Preferences infoPer1 = Preferences.userNodeForPackage(infoPerforacion.class);
            Preferences login = Preferences.userNodeForPackage(login.class);

        String titulo = portada.get("Titulo", " "),
                companiaContra = portada.get("Compañiacontratante", " "),
                companiaSeriv = portada.get("comapañiaservicio", " "),
                IDFECHADOC = portada.get("fechaDoc", " "),
                Equiporieg = vistaUno.get("equipoRieg", " "),
                nombreUno = vistaUno.get("nombre1", " "),
                celularUno = vistaUno.get("celular1", " "),
                correoUno = vistaUno.get("correo1", " "),
                nombreDos = vistaUno.get("nombre2", " "),
                celularDos = vistaUno.get("celular2", " "),
                correoDos = vistaUno.get("correo2", " "),
                nombreTres = vistaUno.get("nombre3", " "),
                celularTres = vistaUno.get("celular3", " "),
                correoTres = vistaUno.get("correo3", " "),
                Nombre4 = vistaUno.get("nombre4", " "),
                Ceular4 = vistaUno.get("celular4", " "),
                Correo4 = vistaUno.get("correo4", " "),
                Nombre5 = vistaUno.get("nombre5", " "),
                Ceular5 = vistaUno.get("celular5", " "),
                Correo5 = vistaUno.get("correo5", " "),
                Nombre6 = vistaUno.get("nombre6", " "),
                Celular6 = vistaUno.get("celular6", " "),
                Correo6 = vistaUno.get("correo6", " "),
                idpozo = vistaUno.get("pozo", " "),
                idmuni = vistaUno.get("municipio", " "),
                iddepa = vistaUno.get("depa", " "),
                ubiPozo = vistaDos.get("ubiPozo", " "),
                activdadEqui = vistaDos.get("activdadEqui", " "),
                fechaIni = vistaDos.get("fechaIni", " "),
                fehaFin = vistaDos.get("fehaFin", " "),
                compaIns = vistaDos.get("compaIns", " "),
                nameSuper = vistaDos.get("nameSuper", " "),
                celSuper = vistaDos.get("celSuper", " "),
                nameAsis = vistaDos.get("nameAsis", " "),
                celAsis = vistaDos.get("celAsis", " "),
                nameInspect = vistaDos.get("nameInspect", " "),
                celInspect = vistaDos.get("celInspect", " "),
                descImgUno = vistaDos.get("descripcionimagenuno", " "),
                descImgDos = vistaDos.get("descripcionimagedos", " "),
                descImgTres = vistaDos.get("descripcionimagentres", " "),
                descImgCuatro = vistaDos.get("descripcionimagencuatro", " "),
                propositoInspect = vistaDos.get("propositoInspect", " "),
                imgUno = vistaDos.get("imgUno", " "),
                imgDos = vistaDos.get("imgDos", " "),
                imgTres = vistaDos.get("imgTres", " "),
                imgCuatro = vistaDos.get("imgCuatro", " ");

        int Perf1 = infoPer1.getInt("perf1", 0),
                idUser = login.getInt("idUser", 0),
                Perf2 = infoPer1.getInt("perf2", 0),
                Perf3 = infoPer1.getInt("perf3", 0),
                Perf4 = infoPer1.getInt("perf4", 0),
                Wk1 = infoPer1.getInt("wk1", 0),
                Wk2 = infoPer1.getInt("wk2", 0),
                Wk3 = infoPer1.getInt("wk3", 0),
                Wk4 = infoPer1.getInt("wk4", 0),
                IVPSEH1 = infoPer1.getInt("IVSEH1", 0),
                IVSEH2 = infoPer1.getInt("IVSEH2", 0),
                IVSEH3 = infoPer1.getInt("IVSEH3", 0),
                IVSEH4 = infoPer1.getInt("IVSEH4", 0),
                ICFR1 = infoPer1.getInt("ICFR1", 0),
                ICFR2 = infoPer1.getInt("ICFR2", 0),
                ICFR3 = infoPer1.getInt("ICFR3", 0),
                ICFR4 = infoPer1.getInt("ICFR4", 0),
                ERIAI1 = infoPer1.getInt("ERIAI1", 0),
                ERIAI2 = infoPer1.getInt("ERIAI2", 0),
                ERIAI3 = infoPer1.getInt("ERIAI3", 0),
                ERIAI4 = infoPer1.getInt("ERIAI4", 0);
        
        System.out.println(idUser);

        String query = "INSERT INTO infoReporte (titulo, companiaContra, companiaSeriv, IDFECHADOC, Equiporieg, "
                + "nombreUno, celularUno, correoUno, nombreDos, celularDos, correoDos, nombreTres, celularTres, correoTres, "
                + "Nombre4, Ceular4, Correo4, Nombre5, Ceular5, Correo5, Nombre6, Celular6, Correo6, "
                + "idpozo, idmuni, iddepa, ubiPozo, activdadEqui, fechaIni, fehaFin, compaIns, nameSuper, celSuper, "
                + "nameAsis, celAsis, nameInspect, celInspect, descImgUno, descImgDos, descImgTres, descImgCuatro, "
                + "propositoInspect, imgUno, imgDos, imgTres, imgCuatro, "
                + "Perf1, Perf2, Perf3, Perf4, Wk1, Wk2, Wk3, Wk4, "
                + "IVPSEH1, IVSEH2, IVSEH3, IVSEH4, ICFR1, ICFR2, ICFR3, ICFR4, "
                + "ERIAI1, ERIAI2, ERIAI3, ERIAI4, idUser) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try ( PreparedStatement statement = conectar().prepareStatement(query)) {
            // Configura los valores para cada campo

            statement.setString(1, titulo);
            statement.setString(2, companiaContra);
            statement.setString(3, companiaSeriv);
            statement.setString(4, IDFECHADOC);
            statement.setString(5, Equiporieg);

            statement.setString(6, nombreUno);
            statement.setString(7, celularUno);
            statement.setString(8, correoUno);
            statement.setString(9, nombreDos);
            statement.setString(10, celularDos);
            statement.setString(11, correoDos);
            statement.setString(12, nombreTres);
            statement.setString(13, celularTres);
            statement.setString(14, correoTres);

            statement.setString(15, Nombre4);
            statement.setString(16, Ceular4);
            statement.setString(17, Correo4);
            statement.setString(18, Nombre5);
            statement.setString(19, Ceular5);
            statement.setString(20, Correo5);
            statement.setString(21, Nombre6);
            statement.setString(22, Celular6);
            statement.setString(23, Correo6);

            statement.setString(24, idpozo);
            statement.setString(25, idmuni);
            statement.setString(26, iddepa);
            statement.setString(27, ubiPozo);
            statement.setString(28, activdadEqui);
            statement.setString(29, fechaIni);
            statement.setString(30, fehaFin);
            statement.setString(31, compaIns);
            statement.setString(32, nameSuper);
            statement.setString(33, celSuper);

            statement.setString(34, nameAsis);
            statement.setString(35, celAsis);
            statement.setString(36, nameInspect);
            statement.setString(37, celInspect);
            statement.setString(38, descImgUno);
            statement.setString(39, descImgDos);
            statement.setString(40, descImgTres);
            statement.setString(41, descImgCuatro);

            statement.setString(42, propositoInspect);
            statement.setString(43, imgUno);
            statement.setString(44, imgDos);
            statement.setString(45, imgTres);
            statement.setString(46, imgCuatro);

            statement.setInt(47, Perf1);
            statement.setInt(48, Perf2);
            statement.setInt(49, Perf3);
            statement.setInt(50, Perf4);
            statement.setInt(51, Wk1);
            statement.setInt(52, Wk2);
            statement.setInt(53, Wk3);
            statement.setInt(54, Wk4);

            statement.setInt(55, IVPSEH1);
            statement.setInt(56, IVSEH2);
            statement.setInt(57, IVSEH3);
            statement.setInt(58, IVSEH4);
            statement.setInt(59, ICFR1);
            statement.setInt(60, ICFR2);
            statement.setInt(61, ICFR3);
            statement.setInt(62, ICFR4);

            statement.setInt(63, ERIAI1);
            statement.setInt(64, ERIAI2);
            statement.setInt(65, ERIAI3);
            statement.setInt(66, ERIAI4);
            statement.setInt(67, idUser);

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Se insertaron los datos correctamente.");
                // Código adicional si es necesario
            } else {
                JOptionPane.showMessageDialog(null, "No se pudieron insertar los datos en el servidor");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
