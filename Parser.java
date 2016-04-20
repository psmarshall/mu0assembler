import java.util.*;

class Parser {

  private static final Map<String, String> opCodeMap;
  static {
    opCodeMap = new HashMap<String, String>();
    opCodeMap.put("LDA", "0");
    opCodeMap.put("STO", "1");
    opCodeMap.put("ADD", "2");
    opCodeMap.put("SUB", "3");
    opCodeMap.put("JMP", "4");
    opCodeMap.put("JGE", "5");
    opCodeMap.put("JNE", "6");
    opCodeMap.put("STP", "7");
  }

  public static Instruction parse(String line) {
    Instruction i = new Instruction();
    i.setOpCode(opCodeMap.get(line.substring(0, 3)));
    if (line.length() > 4) {
      String paddedHex = String.format("%3s", line.substring(4, line.length())).replace(' ', '0');
      i.setOpAddr(paddedHex);
    } else {
      i.setOpAddr("000");
    }
    return i;
  }
}