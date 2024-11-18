package strings;

public class StringBufferStringBuilderIntro {

    /*
    These 2 classes are for making string mutable - These are also final classes.
    If we change the value the original string will als be changed
    For efficient string manipulation - appending, inserting, deleting characters from String

    Diff -
    String Builder is not thread-safe, Buffer is thread-safe
    String Builder is faster as it is for single threaded operations

    StringBuilder sb = new StringBuilder("hello");
    sb.append(" World");
    sout(sb.toString()); - Outputs - Hello World

    StringBuffer sb = new StringBuffer("hello");
    sb.append(" World");
    sout(sb.toString()); - Outputs - Hello World
    sb.insert(5, ",");
    sout(sb.toString()); - Outputs - Hello, World

    sb.reverse(); - To reverse the String






     */
}
