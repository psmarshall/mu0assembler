import java.util.*;

class Parser {

  private static final Map<String, String> opCodeMap;
  static {
    opCodeMap = new HashMap<String, String>();
    opCodeMap.put("LDA", "0000");
    opCodeMap.put("STO", "0001");
    opCodeMap.put("ADD", "0010");
    opCodeMap.put("SUB", "0011");
    opCodeMap.put("JMP", "0100");
    opCodeMap.put("JGE", "0101");
    opCodeMap.put("JNE", "0110");
    opCodeMap.put("STP", "0111");
  }

  public static Instruction parse(String line) {
    Instruction i = new Instruction();
    i.setOpCode(opCodeMap.get(line.substring(0, 3)));
    if (line.length() > 4) {
      int integerRep = Integer.parseInt(line.substring(4, line.length()));
      String paddedBinary = String.format("%12s", Integer.toBinaryString(integerRep)).replace(' ', '0');
      i.setOpAddr(paddedBinary);
    } else {
      i.setOpAddr(String.format("%12s", "0").replace(' ', '0'));
    }
    return i;
  }
}