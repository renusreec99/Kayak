package kayak.robot.types;

public enum InstructionTypes {
  FORWARD("F"),
  TURN_RIGHT("R"),
  TURN_LEFT("L");

  private final String value;

  private InstructionTypes(String value) {
      this.value = value;
  }

  public String getValue() {
      return value;
  }
}
