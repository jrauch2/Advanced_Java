package lab1;

public class StartUp {
//    In this instance, each course needs the ability to do all of the same things and doesn't need to be overridden in any subclasses. All of the methods are final in the abstract class.
    public static void main(String[] args) {
//        Using Liskov's is advantageous when using collections, so that the collection of Course can hold any number of subclasses that inherit from course. A disadvantage to this is that if anything is declared private in the subclass, the object declared as it's abstract type does not have access to the private properties and attributes within the subclass that aren't inherited from the abstract class.
        Course advancedJava = new AdvancedJava("Advanced Java", "1234");
        Course introJava = new IntroJava("Introduction to Java", "2345");
        Course introProgramming = new IntroProgramming("Introduction to Programming", "3456");

        advancedJava.setPrerequisites("Introduction to Java");
        introJava.setPrerequisites("Introduction to Programming");
        introProgramming.setPrerequisites("none");
    }
}
