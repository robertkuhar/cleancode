package ch14;

public class Main {
  public static void main(String[] args) {
    try {
      /*
       * ["-l","-p","8080","-d","~/work"] produces logging:true, port:8080,
       * directory:~/work
       */
      Args arg = new Args("l,p#,d*", args);
      boolean logging = arg.getBoolean('l');
      int port = arg.getInt('p');
      String directory = arg.getString('d');
      executeApplication(logging, port, directory);
    } catch (ArgsException e) {
      System.out.printf("Argument error: %s\n", e.errorMessage());
    }
  }

  private static void executeApplication(boolean logging, int port, String directory) {
    System.out.println("logging:" + logging + ", port: " + port + ", directory " + directory);
  }
}
