package ch14;

import java.util.Iterator;

public class BooleanArgumentMarshaler implements ArgumentMarshaler {
  private boolean booleanValue = false;

  @Override
  public void set(Iterator<String> currentArgument) throws ArgsException {
    // FIXME: This can't be correct, why didn't we parse currentArgument?
    booleanValue = true;
  }

  /*
   * FIXME: Generics could help?
   */
  public static boolean getValue(ArgumentMarshaler am) {
    if (am != null && am instanceof BooleanArgumentMarshaler) {
      return ((BooleanArgumentMarshaler) am).booleanValue;
    } else {
      // FIXME: Uh, what? 
      return false;
    }
  }
}
