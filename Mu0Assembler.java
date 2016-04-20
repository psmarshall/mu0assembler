import java.util.*;
import java.io.*;

class Mu0Assembler {
  
  public static void main(String[] args) throws IOException {
    Scanner fileScanner = new Scanner(new File("prog.mu0asm"));
    File outFile = new File("prog.mu0");
    PrintWriter fileWriter = new PrintWriter("prog.mu0", "UTF-8");

    while (fileScanner.hasNextLine()) {
      String line = fileScanner.nextLine();
      Instruction assembled = Parser.parse(line);
      fileWriter.println(assembled);
    }
    fileWriter.close();
  }
}