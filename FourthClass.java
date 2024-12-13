public class FourthClass {

    public static void main(String[] args) {
//        TYPE-CASTING

        /*
        It is a process of converting the data from one Data type to another Data type;
        It is of 2 types ->
            Implicit -> process of converting the data from smaller Data type to larger Data type;
                - Widering
                -Promotion
            Explicit ->  process of converting the data from larger Data type to smaller Data type;
                -

            Any real number literal by default treated as double in Java so because of that we have to explicitly type casting
            it (or) use suffix f for treated as it float;
            and
            Any Integer literal by default treated as int in Java so because of that we have to  use suffix l for treated as it long;
         */

//**************************        Probably Question   *********************************************
    /*
        What are Datatypes
        What are its uses
        Types of Data types
        How Many Primitive DT
        memory for integer DT
        format in which integer is stored
        -ve integers 2's compliment base 2 format
        what is a literal
        character data types: -
        format of char
        memory of char
        Real number Type
        memory DT
        memory for float and double
        formats for float and double
        memory boolean
        special characters that are available in variable names
        special characters that are available in Literal names
        Types of typecasting
        problems in typecasting
        why prefix 0,0x, 0b, for integer literal
        why suffix for float and double and long
        Conversions from octal, hexadecimal, binary to decimal
        Scientific notations in real numbers
        Type Inference

     */


//*********************************        Programme                 ********************************************

//        Implicit

        byte a = 20;
        int b = a;

        System.out.println("a is "+a);
        System.out.println("b is "+b);


//        Explicit

        double d = 89.2034;
        int i = (int) d;

        System.out.println("i is "+i);
        System.out.println("d is "+d);

//        Float and Long Why use suffix
        long l = 2014;
//        float f = 121.3;    //Not ok
        float f2 = 121.3F;

        float c = 12155662489516988F;
        long b1= (long) c;


//*******************************       Assignment      **************************************************

       /*
       can we convert char to integer or float              YES
            can we convert boolean ||     ||   ||           NO
            create a table with 8 row and 8 column with     👍
         */
    }
}
