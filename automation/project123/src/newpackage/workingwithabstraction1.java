package newpackage;

abstract class flowers 
{
 public abstract void abstractMethod();
}
abstract class Rose extends flowers 
{
 
}
class Jasmine extends Rose
{
 public void abstractMethod() 
 {
 System.out.println("my Rose");
 }
}

public class workingwithabstraction1
{
 public static void main(String[] args)
 {
     Jasmine js = new Jasmine();
     js.abstractMethod();
 }
}

