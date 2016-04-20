class Instruction {

  String opCode;
  String opAddr;

  public void setOpCode(String opCode) {
    this.opCode = opCode;
  }

  public void setOpAddr(String opAddr) {
    this.opAddr = opAddr;
  }
  
  @Override
  public String toString() {
    return opCode + " " + opAddr;
  }
}