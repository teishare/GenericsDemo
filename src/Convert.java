import java.util.LongSummaryStatistics;

public class Convert {

  public static Integer toInt32(Object aObject) throws Exception {
    Integer retVal = null;

    if (aObject == null) {
      retVal = null;
    } else if (aObject instanceof Integer) {
      retVal = (Integer) aObject;
    } else if (aObject instanceof Long) {
      retVal = ((Long) aObject).intValue();
    } else if (aObject instanceof Double) {
      retVal = ((Double) aObject).intValue();
    } else if (aObject instanceof Boolean) {
      retVal = ((Boolean) aObject) ? 1 : 0;
    } else if (aObject instanceof String) {
      retVal = Integer.parseInt(aObject.toString());
    } else {
      String typeName = aObject.getClass().getCanonicalName();
      throw new Exception(String.format("Cannot convert objects of type %s to %s!", typeName, retVal.getClass().getCanonicalName()));
    }

    return retVal;
  }

  public static Long toInt64(Object aObject) throws Exception {
    Long retVal = null;

    if (aObject == null) {
      retVal = null;
    } else if (aObject instanceof Integer) {
      retVal = ((Integer) aObject).longValue();
    } else if (aObject instanceof Long) {
      retVal = (Long) aObject;
    } else if (aObject instanceof Double) {
      retVal = ((Double) aObject).longValue();
    } else if (aObject instanceof Boolean) {
      retVal = ((Boolean) aObject) ? 1L : 0;
    } else if (aObject instanceof String) {
      retVal = Long.parseLong(aObject.toString());
    } else {
      String typeName = aObject.getClass().getCanonicalName();
      throw new Exception(String.format("Cannot convert objects of type %s to %s!", typeName, retVal.getClass().getCanonicalName()));
    }

    return retVal;
  }

  public static Double toDouble(Object aObject) throws Exception {
    Double retVal = null;

    if (aObject == null) {
      retVal = null;
    } else if (aObject instanceof Integer) {
      retVal = ((Integer) aObject).doubleValue();
    } else if (aObject instanceof Long) {
      retVal = ((Long) aObject).doubleValue();
    } else if (aObject instanceof Double) {
      retVal = (Double) aObject;
    } else if (aObject instanceof Boolean) {
      retVal = ((Boolean) aObject) ? 1d : 0;
    } else if (aObject instanceof String) {
      retVal = Double.parseDouble(aObject.toString());
    } else {
      String typeName = aObject.getClass().getCanonicalName();
      throw new Exception(String.format("Cannot convert objects of type %s to %s!", typeName, retVal.getClass().getCanonicalName()));
    }

    return retVal;
  }

  public static <T> T to(Class<T> clazz, Object aObject) throws Exception {
    T result;

    if (clazz.isInstance(Integer.class)) {
      result = (T) toInt32(aObject);
    } else if (clazz.isInstance(Long.class)) {
      result = (T) toInt64(aObject);
    } else if (clazz.isInstance(Double.class)) {
      result = (T) toDouble(aObject);
    }  else {
      String typeName = aObject.getClass().getCanonicalName();
      throw new Exception(String.format("Cannot convert objects of type %s to %s!", typeName, clazz.getCanonicalName()));
    }

    return result;
  }
}
