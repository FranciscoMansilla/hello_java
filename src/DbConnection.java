import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnection {
  private String url = "jdbc:mysql://localhost:3306/hello_fran";
  private String usuario = "root";
  private String contraseña = "AFFmb1521";

  public int findBy(String table, String key, String datum) {
    try {
      Connection conexión = DriverManager.getConnection(url, usuario, contraseña);

      // Aquí puedes realizar operaciones en la base de datos
      java.sql.Statement statement = conexión.createStatement();
      // String base = "SELECT * FROM ";
      ResultSet resultSet = statement.executeQuery("SELECT * FROM " + table + " WHERE " + key + " = " + datum );
      
      // Cierra la conexión al terminar
      resultSet.close();
      statement.close();
      conexión.close();
      
      return 0;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return 0;
  }
}
