package kayak.robot.model;

import kayak.robot.types.*;

public interface RobotInterface {
  void move(String commands);

  Position getCoordinate();

  DirectionTypes getCurrentFacingDirection();

}
