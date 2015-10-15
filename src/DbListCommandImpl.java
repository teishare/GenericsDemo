import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DbListCommandImpl<T> implements DbListCommand<T> {
  private ArrayList<T> result;
  private DbRs2obj<T> dbRs2obj;

  @Override
  public ArrayList<T> getResult() {
    return this.result;
  }

  @Override
  public void run() throws SQLException {
    ResultSet resultSet = null;

    while(resultSet.next()) {
      this.result.add(this.dbRs2obj.convert(resultSet));
    };
  }
}
