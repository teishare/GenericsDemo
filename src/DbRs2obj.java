import java.sql.ResultSet;

public interface DbRs2obj<T> {
  T convert(ResultSet aResultSet);
}
