//Jesse Wang
//MathEx
//September 27th. 2019


package com.company;

public class MathEx {

    public static void main(String[] args)
    {
        int x = swap(123);              //Integer Switch
        System.out.println(x);

        timeLeft(1, 34, 8, 20);   //Train Time


        int a = dayOfWeek(0,1);          //Calender
        System.out.println(a);
        int b = dayOfWeek(0,14);
        System.out.println(b);
        int c = dayOfWeek(6,22);
        System.out.println(c);
        int d = dayOfWeek(5,4);
        System.out.println(d);
        int e = dayOfWeek(1,24);
        System.out.println(e);
        int f = dayOfWeek(2,1);
        System.out.println(f);

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

        public static void timeLeft(int curHour, int curMin, int depHour, int depMin)
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
        System.out.println(c + " hours " + e + " minutes ");

        }

        public static int dayOfWeek(int day, int date)
        {
            int a = day + date - 1;     //gives the integer a, which is the total number of days past plus how far into the week we already in accordance to the 1st day// ; the minus one accounts for Sunday being equal to 0
            a = a%7;                    //divided by 7 to get remainder. the rest are full weeks so they don't matter
            return a;
        }

}

/*
//132
//6 hours 46 mins
//0
//6
//6
//1
//3
//2
//
//Process finished with exit code 0
 */