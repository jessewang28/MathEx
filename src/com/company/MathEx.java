package com.company;

public class MathEx {

    public static void main(String[] args)
    {
        int x = swap(123);      //Integer Switch
        System.out.println(x);

        timeLeft(1, 34, 8, 20);                      //Train Time

        }

        public static int swap(int x)
        {
        int a;
        int b = x / 100;   //hundreds digit
        b = b * 100;
        int c = x % 10;   //tens digit
        c = c * 10;
        int d = x % 100;   //ones digit
        d = d / 10;
        a = b + c + d;   //final digit
        return a;
        }

        public static int timeLeft(int curHour, int curMin, int depHour, int depMin)
        {
        //time variables
        int hours1;         //curHour in minutes
        int hours2;         //depHour in minutes
        int b;              //total difference in minutes
        int c;              //hours difference
        int e;              //minutes difference
        hours1 = curHour * 60;
        hours2 = depHour * 60;
        b = (hours2 + depMin) - (hours1 + curMin);
        c = b / 60;
        e = b % 60;
        System.out.print(c + " hours " + e + " mins ");
        return 0;

        }

        public static int dayOfWeek()
        {


        }

}
