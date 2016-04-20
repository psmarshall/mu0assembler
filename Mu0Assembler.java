import java.util.*;
import java.io.*;

class Mu0Assembler {
  
  public static void main(String[] args) throws IOException {
    String inFileName = args[0];
    String outFileName = args[1];
    Scanner fileScanner = new Scanner(new File(inFileName));
    PrintWriter fileWriter = new PrintWriter(outFileName, "UTF-8");

    while (fileScanner.hasNextLine()) {
      String line = fileScanner.nextLine();
      Instruction assembled = Parser.parse(line);
      fileWriter.println(assembled);
    }
    fileWriter.close();
  }
}