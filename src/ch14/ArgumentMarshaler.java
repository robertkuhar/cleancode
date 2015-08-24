package ch14;

import java.util.Iterator;

/*
 * FIXME: ISO some Generic 'T' way to make the getValue thing part of this
 * interface.
 */

public interface ArgumentMarshaler {
  void set(Iterator<String> currentArgument) throws ArgsException;
}
