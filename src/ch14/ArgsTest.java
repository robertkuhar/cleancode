package ch14;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArgsTest {

  @Test
  public void testSpacesInFormat() throws Exception {
    Args args = new Args("x, y", new String[] { "-xy" });
    assertEquals(2, args.cardinality());
    assertTrue(args.has('x'));
    assertTrue(args.has('y'));
  }

}
