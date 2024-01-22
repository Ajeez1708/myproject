package newpackage;

public class abstraction2 
{
abstract class Animal 
{
private String name;
public Animal(String name) 
{
this.name=name;
}
 public void sleep() 
{
System.out.println("Dog is sleeping");
}
public abstract void makeSound();
}
class Dog extends Animal 
{
public Dog(String name) 
{
super(name);
}
public void makeSound() 
{
System.out.println("Dog barks");
	    }
	}
class Cat extends Animal 
{
public Cat(String name) 
{
super(name);
	    }

	    public void makeSound() {
	        System.out.println("Cat meows");
	    }
	}

	public class Main {
	    public static void main(String[] args) 
	    {
	    	
	        Dog d=new Dog("Buddy");
	        Cat c=new Cat("Whiskers");
	        d.sleep();
	        d.makeSound();

	        c.sleep();
	        c.makeSound();
	    }
	}
}

	