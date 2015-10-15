import java.sql.SQLException;

public interface DbCommand {
  void run() throws SQLException;
}
