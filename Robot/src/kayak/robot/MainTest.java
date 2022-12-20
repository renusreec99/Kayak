package kayak.robot;

import static org.junit.jupiter.api.Assertions.*;
import kayak.robot.model.*;
import kayak.robot.types.*;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  public void moveRobot() {
      Robot robot = new Robot(DirectionTypes.NORTH);
      robot.move("FFR");
      assertEquals("[0,2]", robot.getCoordinate().toString());
      assertEquals(DirectionTypes.EAST, robot.getCurrentFacingDirection());

      robot = new Robot(DirectionTypes.NORTH);
      robot.move("FFRRFF");
      assertEquals("[0,0]", robot.getCoordinate().toString());
      assertEquals(DirectionTypes.SOUTH, robot.getCurrentFacingDirection());

      robot = new Robot(DirectionTypes.SOUTH);
      robot.move("FFFLLRFFF");
      assertEquals("[3,-3]", robot.getCoordinate().toString());
      assertEquals(DirectionTypes.EAST, robot.getCurrentFacingDirection());

      robot = new Robot(DirectionTypes.EAST);
      robot.move("FFFFLLLLRRR");
      assertEquals("[4,0]", robot.getCoordinate().toString());
      assertEquals(DirectionTypes.NORTH, robot.getCurrentFacingDirection());

      robot = new Robot(DirectionTypes.WEST);
      robot.move("FFFFLFFLFFLFFFL");
      assertEquals("[-2,1]", robot.getCoordinate().toString());
      assertEquals(DirectionTypes.WEST, robot.getCurrentFacingDirection());

      robot = new Robot(DirectionTypes.EAST);
      robot.move("LFFFRFFFRRFFF");
      assertEquals("[0,3]", robot.getCoordinate().toString());
      assertEquals(DirectionTypes.WEST, robot.getCurrentFacingDirection());

      robot = new Robot(DirectionTypes.EAST);
      robot.move("FLLRRFLRFFLLLRRFRL");
      assertEquals("[4,1]", robot.getCoordinate().toString());
      assertEquals(DirectionTypes.NORTH, robot.getCurrentFacingDirection());

      robot = new Robot(DirectionTypes.EAST);
      robot.move("FFFLFFRRFFFLFRFRFLLF");
      assertEquals("[4,-2]", robot.getCoordinate().toString());
      assertEquals(DirectionTypes.EAST, robot.getCurrentFacingDirection());

      robot = new Robot(DirectionTypes.EAST);
      robot.move("LFRFLRFLRL");
      assertEquals("[2,1]", robot.getCoordinate().toString());
      assertEquals(DirectionTypes.NORTH, robot.getCurrentFacingDirection());
  }

}
