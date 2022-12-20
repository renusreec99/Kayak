package kayak.robot.sb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateTest {


  @Test
  public void test1() {
      assertTrue(Validate.isValidCommand("F"));
      assertTrue(Validate.isValidCommand("R"));
      assertTrue(Validate.isValidCommand("F"));
      assertTrue(Validate.isValidCommand("FR"));
      assertTrue(Validate.isValidCommand("FL"));
      assertTrue(Validate.isValidCommand("FFRRLL"));
      assertTrue(Validate.isValidCommand("LFLRLFLFR"));
      assertFalse(Validate.isValidCommand("AF"));
      assertFalse(Validate.isValidCommand(" AF"));
      assertFalse(Validate.isValidCommand("AF "));
      assertFalse(Validate.isValidCommand("FALRLR"));
      assertFalse(Validate.isValidCommand("F LRLR"));
      assertFalse(Validate.isValidCommand(""));
      assertFalse(Validate.isValidCommand(" "));
      assertFalse(Validate.isValidCommand(null));
  }

}
