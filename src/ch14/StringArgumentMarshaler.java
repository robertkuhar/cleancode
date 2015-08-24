package ch14;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static ch14.ArgsException.ErrorCode.*;

public class StringArgumentMarshaler implements ArgumentMarshaler {
  private String stringValue = "";

  public void set(Iterator<String> currentArgument) throws ArgsException {
    try {
      stringValue = currentArgument.next();
    } catch (NoSuchElementException e) {
      throw new ArgsException(MISSING_STRING);
    }
  }

  /*
   * FIXME: Generics could help?
   */
  public static String getValue(ArgumentMarshaler am) {
    if (am != null && am instanceof StringArgumentMarshaler) {
      return ((StringArgumentMarshaler) am).stringValue;
    } else {
      // FIXME: Uh, what?
      return "";
    }
  }
}
