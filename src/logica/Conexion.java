package logica;
import java.sql.*; 
import java.util.ArrayList;
public class Conexion {
    static String bd = "usuarios";
    static String login = "root";
    static String password = "";
    static String url = "jdbc:mysql://localhost/"+bd;
    Connection conn = null;
    public String cadena1="Conectado a base de datos "; 
    public String result;
    /** Constructor de DbConnection */
    public  Conexion() {
        try{
            //obtenemos el driver de para mysql
            Class.forName("com.mysql.jdbc.Driver");
            //obtenemos la conexion
            conn = DriverManager.getConnection(url,login,password);
            if (conn!=null){

                result= cadena1.concat(bd);

            }
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }

    public Connection getConnection(){
        return conn;
    }
    
//    public ArrayList<String> darDatosUsuario( String usuario)
//    {
//        if( conn != null)
//                {
//                    Statement st = conn.createStatement();
//                    String anita = "SELECT from usuarios WHERE usuaria equals '" + usuario + "'";
//                    
//                }
//    }

}
