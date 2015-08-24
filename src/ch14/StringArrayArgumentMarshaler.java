package ch14;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static ch14.ArgsException.ErrorCode.*;

public class StringArrayArgumentMarshaler implements ArgumentMarshaler {
  private String[] stringArrayValue;

  @Override
  public void set(Iterator<String> currentArgument) throws ArgsException {
    try {
      stringArrayValue = new String[0];
    } catch (NoSuchElementException e) {
      throw new ArgsException(MISSING_STRING_ARRAY);
    }
    // TODO: new ArgsException(INVALID_STRING_ARRAY, ...);
  }

  /*
   * FIXME: Generics could help?
   */
  public static String[] getValue(ArgumentMarshaler am) {
    if (am != null && am instanceof StringArrayArgumentMarshaler) {
      return ((StringArrayArgumentMarshaler) am).stringArrayValue;
    } else {
      // FIXME: Uh, what?
      return new String[0];
    }
  }

}
