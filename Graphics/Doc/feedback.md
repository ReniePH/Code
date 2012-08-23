# Feedback - Graphics by Magen | Feedback by Matan

* The call to the superclass (super.paintComponent) is required because the paintComponent method does a few things you are unaware of, just like when you have a constructor of a subclass, you have to invoke the superclass constructor on the first line of the constructor. like in this simplified example:

public class Animal{
	private String name;
	public Animal(String name){
	this.name = name;
	}
	// Getters and Setters ignored for shortness sake
}
public class Cat extends Animal{
	private String color;
	public Cat(String name, String color){
	super(name);
	this.color = color;
	}
// Getters and setters like before
}

In this example, the superclass sets the field of name, which you can not even see directly because its private, if it was protected you could modify it directly, but it isn't.

* I'm pretty sure you don't actually have to call the super method in paintComponent, But i'm not sure.

* More feedback later...