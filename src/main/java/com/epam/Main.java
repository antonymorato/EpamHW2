package com.epam;

import static org.junit.Assert.*;
public class Main{

    public static void main(String[] args)
    {	String string1="Anton Korol";
        System.out.println(string1);
        String string2 ="something";
        assertEquals(string1,string2);
    }


}