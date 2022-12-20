package kayak.robot.sb;

import kayak.robot.types.InstructionTypes;

public class Validate {

  public static boolean isValidCommand(String steps) {
    if (steps == null) {
        return false;
    }

    StringBuilder sb = new StringBuilder();
    sb.append("[");

    for (InstructionTypes it : InstructionTypes.class.getEnumConstants()) {
        sb.append(it.getValue());
    }
    sb.append("]+");

    return steps.matches(sb.toString());
}
 
  
}
