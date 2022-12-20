package kayak.robot.change;

import kayak.robot.types.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChangeTest {
  @Test
  public void leftRotate() {
      assertEquals(DirectionTypes.WEST, Change.change(DirectionTypes.NORTH, InstructionTypes.TURN_LEFT));
      assertEquals(DirectionTypes.NORTH, Change.change(DirectionTypes.EAST, InstructionTypes.TURN_LEFT));
      assertEquals(DirectionTypes.EAST, Change.change(DirectionTypes.SOUTH, InstructionTypes.TURN_LEFT));
      assertEquals(DirectionTypes.SOUTH, Change.change(DirectionTypes.WEST, InstructionTypes.TURN_LEFT));
  }

  @Test
  public void rightRotate() {
    assertEquals(DirectionTypes.EAST, Change.change(DirectionTypes.NORTH, InstructionTypes.TURN_RIGHT));
    assertEquals(DirectionTypes.SOUTH, Change.change(DirectionTypes.EAST, InstructionTypes.TURN_RIGHT));
    assertEquals(DirectionTypes.WEST, Change.change(DirectionTypes.SOUTH, InstructionTypes.TURN_RIGHT));
    assertEquals(DirectionTypes.NORTH, Change.change(DirectionTypes.WEST, InstructionTypes.TURN_RIGHT));
}

}
