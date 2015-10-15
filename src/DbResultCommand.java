public interface DbResultCommand<T> extends DbCommand {
  T getResult();
}
