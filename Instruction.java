class Instruction {

  String opCode;
  String opAddr;

  public void setOpCode(String opCode) {
    this.opCode = opCode;
  }

  public void setOpAddr(String opAddr) {
    this.opAddr = opAddr;
  }

  public String inHex() {
    return String.format("%4s", Integer.toHexString(Integer.parseInt(opCode + opAddr, 2))).replace(' ', '0');
  }
  
  @Override
  public String toString() {
    return opCode + " " + opAddr;
  }
}