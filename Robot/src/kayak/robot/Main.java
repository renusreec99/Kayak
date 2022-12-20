package kayak.robot;

import kayak.robot.types.*;
import kayak.robot.model.*;

public class Main {
  public static void main(String[] args) {
    Robot robot = new Robot(DirectionTypes.NORTH);
    robot.move("FF");

    System.out.println(robot.getCoordinate());
}
}
