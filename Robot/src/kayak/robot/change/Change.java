package kayak.robot.change;

import kayak.robot.types.*;

public class Change {
  private Change() {
  }
  public static DirectionTypes change(DirectionTypes current, InstructionTypes value) {

    if (value != InstructionTypes.TURN_LEFT && value != InstructionTypes.TURN_RIGHT) {
        throw new IllegalArgumentException(value + " is not a valid command to change facing direction.");
    }
    return value.equals(InstructionTypes.TURN_LEFT) ? rotateLeft(current) : rotateRight(current);
}

private static DirectionTypes rotateRight(DirectionTypes current) {
    if (current == DirectionTypes.NORTH) {
        return DirectionTypes.EAST;
    }

    if (current == DirectionTypes.EAST) {
        return DirectionTypes.SOUTH;
    }

    if (current == DirectionTypes.SOUTH) {
        return DirectionTypes.WEST;
    }

    if (current == DirectionTypes.WEST) {
        return DirectionTypes.NORTH;
    }
    throw new IllegalArgumentException("Unsupported facing direction value: " + current);
}

private static DirectionTypes rotateLeft(DirectionTypes current) {
    if (current == DirectionTypes.NORTH) {
        return DirectionTypes.WEST;
    }

    if (current == DirectionTypes.WEST) {
        return DirectionTypes.SOUTH;
    }

    if (current == DirectionTypes.SOUTH) {
        return DirectionTypes.EAST;
    }

    if (current == DirectionTypes.EAST) {
        return DirectionTypes.NORTH;
    }
    throw new IllegalArgumentException("Unsupported facing direction value: " + current);
}
}
