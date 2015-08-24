package ch14;

import java.util.Iterator;

/*
 * FIXME: ISO some Generic 'T' way to make the getValue thing part of this
 * interface.
 */

public interface ArgumentMarshaler {
  /*
   * FIXME: This stinks, no? I am changing the state of my input argument by
   * this action. Maybe not here on the interface, but on the implementations.
   */
  void set(Iterator<String> currentArgument) throws ArgsException;
}
