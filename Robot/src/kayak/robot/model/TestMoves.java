package kayak.robot.model;

import kayak.robot.types.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMoves {


  @Test
  public void moveRobot1() {
      Robot robot = new Robot(DirectionTypes.NORTH);
      robot.move("F");
      assertEquals(DirectionTypes.NORTH, robot.getCurrentFacingDirection());
      assertEquals("[0,1]", robot.getCoordinate().toString());

      robot = new Robot(DirectionTypes.EAST);
      robot.move("F");
      assertEquals(DirectionTypes.EAST, robot.getCurrentFacingDirection());
      assertEquals("[1,0]", robot.getCoordinate().toString());

      robot = new Robot(DirectionTypes.SOUTH);
      robot.move("F");
      assertEquals(DirectionTypes.SOUTH, robot.getCurrentFacingDirection());
      assertEquals("[0,-1]", robot.getCoordinate().toString());

      robot = new Robot(DirectionTypes.WEST);
      robot.move("F");
      assertEquals(DirectionTypes.WEST, robot.getCurrentFacingDirection());
      assertEquals("[-1,0]", robot.getCoordinate().toString());
  }
  @Test
  public void moveRobot2() {
      Robot robot = new Robot(DirectionTypes.EAST);
      assertEquals("[0,0]", robot.getCoordinate().toString());

      robot.move("F");
      assertEquals(DirectionTypes.EAST, robot.getCurrentFacingDirection());
      assertEquals("[1,0]", robot.getCoordinate().toString());

      robot.move("R");
      assertEquals(DirectionTypes.SOUTH, robot.getCurrentFacingDirection());
      assertEquals("[1,0]", robot.getCoordinate().toString());

      robot.move("F");
      assertEquals(DirectionTypes.SOUTH, robot.getCurrentFacingDirection());
      assertEquals("[1,-1]", robot.getCoordinate().toString());

      robot.move("R");
      assertEquals(DirectionTypes.WEST, robot.getCurrentFacingDirection());
      assertEquals("[1,-1]", robot.getCoordinate().toString());

      robot.move("F");
      assertEquals(DirectionTypes.WEST, robot.getCurrentFacingDirection());
      assertEquals("[0,-1]", robot.getCoordinate().toString());

      robot.move("R");
      assertEquals(DirectionTypes.NORTH, robot.getCurrentFacingDirection());
      assertEquals("[0,-1]", robot.getCoordinate().toString());

      robot.move("F");
      assertEquals(DirectionTypes.NORTH, robot.getCurrentFacingDirection());
      assertEquals("[0,0]", robot.getCoordinate().toString());
  }

}
