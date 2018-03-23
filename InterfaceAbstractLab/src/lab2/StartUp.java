package lab2;

public class StartUp {
//    One thing good about this architecture is how flexible it is. Each class that implements the interface MUST implement all methods, but how they do so is up to the developer, leaving it flexible and open to whatever the developer decides. In this instance, that flexibility can be troublesome, since I would think that we would want all courses in our program to do the same thing. To make them all do the same thing, there is a lot of repeating code.
    public static void main(String[] args) {
//        Using Liskov's is advantageous when using collections, so that the collection of Course can hold any number of subclasses that inherit from course. A disadvantage to this is that if anything is declared private in the subclass, the object declared as it's abstract type does not have access to the private properties and attributes within the subclass that aren't inherited from the abstract class.
//        In this instance Liskov's principle cannot be used, because setPrerequisits() and getPrerequisits() become unavailable since they are not in the interface.
        AdvancedJava advancedJava = new AdvancedJava("Advanced Java", "1234");
        IntroJava introJava = new IntroJava("Introduction to Java", "2345");
        IntroProgramming introProgramming = new IntroProgramming("Introduction to Programming", "3456");

        advancedJava.setPrerequisites("Introduction to Java");
        introJava.setPrerequisites("Introduction to Programming");
        introProgramming.setCredits(4);
    }
}
