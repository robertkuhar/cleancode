package ch07;

public class WhenIsTheStacktraceCreated {
  
  public static void main(String[] args) {
    Exception e = new Exception("Hello");
    e.getStackTrace();
    throw new NullPointerException();
  }
}
