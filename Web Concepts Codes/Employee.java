import java.io.*;

class Employee implements java.io.Serializable {
  public String name;
  public String address;
  public transient int SSN;
  public int number;
  public static int code;
  private String passcode;

  public Employee(String n, String a, int s, int num, int cod, String pas) {
    name = n;
    address = a;
    SSN = s;
    number = num;
    code = cod;
    passcode = pas;
  }

  
  public void mailCheck() {
    System.out.println("Mailing a check to " + name + " " + address);
  }

  public void print() {
    System.out.println("Name: " + name);
    System.out.println("Adress: " + address);
    System.out.println("SSN: " + SSN);
    System.out.println("Number: " + number);
    System.out.println("Code: " + code);
    System.out.println("Passcode: " + passcode);
  }
}
