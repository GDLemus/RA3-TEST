package MODEL_VENTA;

import MODEL.Conexion;
import MODEL.clientesM;
import VISTA.ViewV;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class vende  {
    
Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;


    public LinkedList<clientesM> listaFiltroClientes(String nombre, String nit, String correo, String genero) {
        LinkedList<clientesM> lista = new LinkedList<clientesM>();
        String sql = "SELECT codigo, nombre FROM clientes WHERE nombre LIKE ? AND nit LIKE ? AND correo LIKE ? AND genero LIKE ?;";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + nombre + "%");
            ps.setString(2, "%" + nit + "%");
            ps.setString(3, "%" + correo + "%");
            ps.setString(4, "%" + genero + "%");
            rs = ps.executeQuery();
            String nombreEncontrado = "";
            while (rs.next()) {
                clientesM cliente = new clientesM();
                cliente.setCodigo(rs.getInt(1));
                cliente.setNombre(rs.getString(2));
                lista.add(cliente);
            }
        } catch (Exception e) {
            System.out.println("ERROR FILTRO CLIENTES: " + e);
        }
        return lista;
    }
}
