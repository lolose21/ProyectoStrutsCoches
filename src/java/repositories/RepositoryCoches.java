package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import models.Coches;
import oracle.jdbc.OracleDriver;

public class RepositoryCoches {

    private Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new OracleDriver());
        String cadena = "jdbc:oracle:thin:@LOCALHOST:1521:XE";
        Connection cn = DriverManager.getConnection(cadena, "system", "oracle");
        return cn;
    }

    public ArrayList<Coches> getCoches() throws SQLException {

        Connection cn = this.getConnection();
        String sql = "select * from coches";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Coches> lista = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("idcoche");
            String marca = rs.getString("marca");
            String modelo = rs.getString("modelo");
            String conductor = rs.getString("conductor");
            String imagen = rs.getString("imagen");
            Coches coche = new Coches(id, marca, modelo, conductor, imagen);
            lista.add(coche);
        }
        rs.close();
        cn.close();
        return lista;
    }

    public void eliminarCoche(int id) throws SQLException {

        Connection cn = this.getConnection();
        String sql = "delete from coches where idcoche = ?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setInt(1, id);
        pst.executeUpdate();
        cn.close();
    }

    public void insertarCoche(int id, String marca, String modelo, String conductor, String imagen) throws SQLException {

        Connection cn = this.getConnection();
        String sql = "insert into coches values(?,?,?,?,?)";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setInt(1, id);
        pst.setString(2, marca);
        pst.setString(3, modelo);
        pst.setString(4, conductor);
        pst.setString(5, imagen);
        pst.executeUpdate();
        cn.close();
    }

    public void modificarCoche(String marca, String modelo, String conductor, String imagen, int idcoche) throws SQLException {
        Connection cn = this.getConnection();
        String sql = "update coches set marca =?, modelo=?, conductor=? , imagen= ? where idcoche = ?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setString(1, marca);
        pst.setString(2, modelo);
        pst.setString(3, conductor);
        pst.setString(4, imagen);
        pst.setInt(5, idcoche);
        pst.executeUpdate();
        cn.close();
    }

    public Coches buscarCoche(int idcoche) throws SQLException {
        Connection cn = this.getConnection();
        String sql = "select * from coches where idcoche=?";
        PreparedStatement pst = cn.prepareStatement(sql);
        return null;
    }

    public ArrayList<Coches> buscarCochesMarca(String marca) throws SQLException {
        Connection cn = this.getConnection();
        String sql = "select * from coches Where upper(marca) like upper(?)";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setString(1, "%" + marca + "%");
        ResultSet rs = pst.executeQuery();
        ArrayList<Coches> cohes = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("idcoche");

        }
        return null;
    }
}
