import java.sql.ResultSet;
import java.sql.SQLException;

public class DbSingleValueCommandImpl<T> implements DbSingleValueCommand<T> {
  private T result;
  private DbRs2obj<T> dbRs2obj;

  @Override
  public void run() throws SQLException {
    ResultSet resultSet = null;

    if(resultSet.next())
      this.result = dbRs2obj.convert(resultSet);
  }

  @Override
  public T getResult() {
    return this.result;
  }
}
