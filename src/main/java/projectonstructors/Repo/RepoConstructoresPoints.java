package projectonstructors.Repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import projectonstructors.Model.ConnectionDB;
import projectonstructors.Model.ConstructoresPoints;

public class RepoConstructoresPoints {

     public List<ConstructoresPoints> getDriversPoints() {
        List<ConstructoresPoints> listaDriversLocal = new ArrayList<>();
        ConnectionDB connDB = new ConnectionDB();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = connDB.establecerConexion();
            String sql = "SELECT \n" +
                        "    d.name AS constructor_name, \n" +
                        "    SUM(r.points) AS total_points \n" +
                        "FROM \n" +
                        "    results r \n" +
                        "JOIN \n" +
                        "    constructors d ON r.constructor_id = d.constructor_id \n" +
                        "GROUP BY \n" +
                        "    d.name \n" +
                        "ORDER BY \n" +
                        "    total_points DESC \n" +
                        "LIMIT 50;";


            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String name = rs.getString("constructor_name");
                float points = rs.getFloat("total_points");
                ConstructoresPoints objConstructoresPoints = new ConstructoresPoints(name, points);
                listaDriversLocal.add(objConstructoresPoints);
            }

        } catch (Exception e) {
            System.out.println("No se completó la carga de los datos.");
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return listaDriversLocal;
    }
}