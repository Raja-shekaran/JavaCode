package org.striver.step1.lec1;

public class _2_DataTypes
{
        //Primitive Data Types and Non-Primitive Data Types
        //Primitive
            //Non-Numeric
                //Boolean and Char
            //Numeric
                //Integer
                    //byte, short, int and long
                //Floating Point
                    //float and double
        //Non-Primitive
            //Strings, Arrays, Classes and Objects

        public static void main(String[] args) {
            //Primitive - Stored on the stack
            //boolean - logical value size - 1 byte(8 bits)
            boolean flag = true;
            System.out.println(flag);
            //byte - signed two's complement integer - 1 byte(8 bits)
            byte a = 25;
            byte b = -10;
            System.out.println(a+" "+b);
            //short - 16-bit signed two's complement integer - 2 byte(16 bits)
            short c = -10000;
            System.out.println(c);
            //int - 32-bit signed two's complement integer - 4 bytes(32 bits)
            int d = -100000;
            System.out.println(d);
            //long - 64-bit signed two's complement integer - 8 bytes(64 bits)
            long e = 7800000000L;
            System.out.println(e);
            //float - single-precision 32-bit IEEE 754 floating-point - 4 bytes(32 bits)
            float pi = 3.14f;
            System.out.println(pi);
            //double - double-precision 64-bit IEEE 754 floating-point - 8 bytes(64 bits)
            double f = 3.141592653589793;
            System.out.println(f);
            //char - single 16-bit Unicode character - 2 bytes(16 bits)
            char g = 'A';
            char h = '$';
            System.out.println("Grade: " + g);
            System.out.println("Symbol: " +h);

            //Non-Primitive - stored on the heap
            //String - An array of characters
            String i = "Geek1";
            String j = "Hello, World!";
            System.out.println("Name: " + i);
            System.out.println("Message: " + j);
            //Array
            int[] num = {1, 2, 3, 4, 5};
            String[] arr = {"Geek1", "Geek2", "Geek3"};
            System.out.println("First Number: " + num[0]);
            System.out.println("Second Fruit: " + arr[1]);
            //Class, Objects and Interface - can be covered in OOPS
        }
}

