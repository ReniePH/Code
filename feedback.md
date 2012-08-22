Feedback
========

### Day One | I/O Task
#### Notes:
* Comment your code, you did great in the beginning of the file you should me with the running thing, you can put that in a /doc directory for that project, inside your code also document what it does, it looks obvious to you now but in a day or a week it will not, plus it definitely is not obvious immidietly to someone who is seeing your code for the first time.
* Use packages from now on, when you work on a new task i give you, either create a new project or inside the project inside of the src folder make a new package and name it properly (In eclipse, simply "new package").
* Make a doc folder in the project root and DOCUMENT the stuff you are going to do, if you make a different file for each task it's fine, again i would prefer if you work on different Java projects for each task
* Seperate your classes and NAME them properly.
* A class that has a main method (the static void main(String[] args) method) should be in a file called Main.java or somethingMain.java.
* In the class/file that you have your Main method do NOT have anything else but the main method, it should be for testing.
* Create better seperation in your code and try to think about the design before doing it, if you have a shop that has items, you can have a Class Item that has fields for name,price and amount in stock, a class Shop that manages all the items and the money earned, and a class ShopCommandLine that actually creates a shop and manages it, reading input from the user and manipulating the objects, then you just create it and call it in your Main class in the main method to test it, this way you can easily create a GUI shop later, which reaches my next point...
* SEPERATE THE MODEL FROM THE LOGIC, you should have Classes representing Objects and other classes manipulating these Objects, do not try to merge them, then you have another class responsible for showing them( The Command Line Shop that i mentioned in my previous point would be the display/view part here).

Good luck, I would be glad if you can take these points and improve the code you already have make it nice and most importantly well commented.

### Day Two | More I/O
#### Notes:
* DO NOT DO EVERYTHING IN The constructor!, Methods exist for a reason, the constructor should initialize variables etc, then you can have a method like start, but you should avoid that!, for example, your command line store manager does not need to manage the reading of the string, YOU should pass it strings through methods and you will have finer control over it
* Name your commits and classes properly, i cannot stress this enough, they need to REPRESENT what the class does, and your commits... 'ok' is not a OK comment.
* Try to design better encapsulation, basically better "Object" seperation, have all your I/O Operations in one file, than the store manager file uses that and the Item object together, than the Command line Shop manager is a level over that, and then there's the highest level that reads the string and passes them to the software and uses a loop, and through methods in the Command line shop class gives it input and gets the output it provides every time, again BETTER SEPERATION.
* Still you haven't used packages.
* Again, USE METHODS.

Good Luck!.
