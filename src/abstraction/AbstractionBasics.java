package abstraction;

public class AbstractionBasics {

    /*
    Abstraction - Hiding the implementation
    You hide the complete class (with data members and methods)

    Encapsulation - Hiding the important instance variables by using getter, setter methods or by using access modifiers
    This is within the class

    ENCAPSULATION means binding the fields and methods together. - Called as DataBinding/Data Hiding as well.

    Abstraction can be achieved by 2 ways -
    1. Using abstract keyword
    2. Using Interface (Pure Abstraction)
     */

    /*
    For driving a car we don't need to know the underlying mechanisms of the car
     */

    /*
    Abstract class -
    1. Created by using abstract keyword
    2. Abstract can be a class or a method
    Abstract mean incomplete.
Uses extends keyword to implement
    If the class does not have any abstract method then it is called as CONCRETE class

    If there is any abstract method in the class then the class name should also have abstract keyword in it.

    Abstract class cannot be final
    Abstract class cannot be instantiated.

    Cannot use the following modifiers with abstract methods-
    1. Private 2. static 3. final 4. 5. strictfp, 6. synchronized, 7. native
     */


    /*
    Interface -
    it is a keyword to define UserDefined DataTypes
     Interface class cannot be instantiated.
     Interface are always implemented


    Interface can contain the following members -
    public final static variables
    public abstract methods
    public static inner class
     */

    /*
    Default and static methods are the only methods that can have a body in interface

    MULTIPLE INHERITANCE IS POSSIBLE BY ONLY USING INTERFACE

     */

}
