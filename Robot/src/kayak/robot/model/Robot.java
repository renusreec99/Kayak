package kayak.robot.model;

import kayak.robot.change.Change;
import kayak.robot.types.*;

public class Robot implements RobotInterface{
 private DirectionTypes current;
 private Position pos;
 
 public Robot(DirectionTypes start) {
   if (start == null) {
       throw new IllegalArgumentException("Invalid facing direction");
   }
   this.current = start;
   this.pos = new Position(0, 0);
}
 
 
@Override
 public void move(String steps) {
     if (steps == null || steps.isBlank()) {
         throw new IllegalArgumentException("Empty commands not valid");
     }



     String[] commandCharacters = steps.split("");
     for (int i = 0; i < commandCharacters.length; i++) {
         if (commandCharacters[i].equals(InstructionTypes.FORWARD.getValue())) {
             moveForward();
         } else if (commandCharacters[i].equals(InstructionTypes.TURN_LEFT.getValue())) {
             turnLeft();
         } else if (commandCharacters[i].equals(InstructionTypes.TURN_RIGHT.getValue())) {
             turnRight();
         }
     }
 }

 protected void moveForward() {
     if (current == DirectionTypes.NORTH) {
         pos.setY(pos.getY() + 1);
         return;
     }

     if (current == DirectionTypes.EAST) {
         pos.setX(pos.getX() + 1);
         return;
     }

     if (current == DirectionTypes.SOUTH) {
       pos.setY(pos.getY() - 1);
         return;
     }

     if (current == DirectionTypes.WEST) {
         pos.setX(pos.getX() - 1);
         return;
     }

     throw new RuntimeException("Unsupported current facing direction!");
 }

 protected void turnLeft() {
     current = Change.change(current, InstructionTypes.TURN_LEFT);
 }

 protected void turnRight() {
     current = Change.change(current, InstructionTypes.TURN_RIGHT);
 }


 @Override
 public Position getCoordinate() {
     return pos;
 }
 
 @Override
 public DirectionTypes getCurrentFacingDirection() {
     return current;
 }




}
