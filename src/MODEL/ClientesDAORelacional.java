
package MODEL;

import DAO.ClientesDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class ClientesDAORelacional implements ClientesDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion acceso = new Conexion();
    
    @Override
    public LinkedList<clientesM> ListarC() {
       
        String sql = "SELECT * FROM clientes";
        LinkedList<clientesM> ListarC = new LinkedList<>();
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
//                listar.add(new UsuariosGT(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9), rs.getString(10)));
//            }
        ListarC.add(new clientesM(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
                  }
          return ListarC;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
        
    }

    @Override
    public clientesM obtener_clientes(int codigo) {
     
    String sql = "select * from clientes where codigo= ?";
        
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            if (rs.next()) {

//            vendedoresM vm = new vendedoresM(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6));
            clientesM cm = new clientesM(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            return cm;
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados");
            }
            
            return null;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    
    
    }

    @Override
    public void crear_clientes(clientesM cliente) {
     
    String sql = "insert into clientes (nombre,nit,correo,genero) values (?,?,?,?);";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getNit());
            ps.setString(3, cliente.getCorreo());
            ps.setString(4, cliente.getGenero());
            
            ps.executeUpdate();
             
        } catch (SQLException e) {
            System.out.println(e);
        
        } 
        
    }

    @Override
    public void modificar_clientes(clientesM cliente) {
        
    String sql = "update clientes set nombre=?, nit=?, correo=?, genero=? where codigo=?;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getNit());
            ps.setString(3, cliente.getCorreo());
            ps.setString(4, cliente.getGenero());
            ps.setInt(5, cliente.getCodigo());
            ps.executeUpdate();
            
            
        } catch (SQLException e) {
            System.out.println(e);
        
        }
    
    }

    
    public void eliminar_clientes(int codigo) {
    
    String sql = "delete from clientes where codigo=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    
    }

//    @Override
//    public LinkedList<clientesM> listarClientes(String nombre, String nit, String correo, String genero) {
//     
//    String sql = "SELECT * FROM clientes WHERE nombre LIKE '%"+nombre+"%' AND correo LIKE '%"+correo+"%' AND nit LIKE '%"+nit+"%' AND genero LIKE '%"+genero+"%';";
//    try {
//        LinkedList<clientesM> listarCC = new LinkedList<>();
//        con = acceso.Conectar();
//        ps = con.prepareStatement(sql);
//        rs = ps.executeQuery();
//        while (rs.next()) {
//            listarCC.add(new clientesM(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
//        }
//        return listarCC;
//    } catch (Exception e) {
//        System.out.println(e);
//    }
//    return null;
//
//    }
    


//    @Override
//    public clientesM filtro(String nombre, int nit, String correo, String genero) {
//
//    String sql = "SELECT * FROM clientes WHERE nombre LIKE ? OR nit = ? OR correo LIKE ? OR genero = ?;";
//    try {
//        // Inicializa la base de datos
//        con = acceso.Conectar();
//        ps = con.prepareStatement(sql);
//        ps.setString(1, "%" + nombre + "%");
//        ps.setInt(2, nit);
//        ps.setString(3, "%" + correo + "%");
//        ps.setString(4, genero);
//        rs = ps.executeQuery();
//
//        while (rs.next()) {
//        
//        }
//        return null;
//    } catch (Exception e) {
//        System.out.println(e);
//    }
//    return null;
//}

    
    
    
    
    
    
    
    
    @Override
    public clientesM obtenerClientePorNombre(String nombre) {
        
    String sql = "SELECT * FROM clientes WHERE nombre = ?;";
    try {
        con = acceso.Conectar();
        ps = con.prepareStatement(sql);
        ps.setString(1, nombre);
        rs = ps.executeQuery();
        if (rs.next()) {
            return new clientesM(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
        }
    } catch (Exception e) {
        System.out.println(e);
    }
    return null;
}

    @Override
    public LinkedList<clientesM> listarClientesss(String nombre, String nit, String correo, String genero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    }


    
    
    
    
   
