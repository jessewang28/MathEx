package com.company;

public class MathEx {

    public static void main(String[] args) {
        int x = swap(156);      //integer switch
        System.out.print(x);

    }

        public static int swap(int x)
        {
            int a;
            int b=x/100;   //hundreds digit
            b=b*100;
            int c=x%10;   //tens digit
            c=c*10;
            int d=x%100;   //ones digit
            d = d/10;
            a = b + c + d;   //final digit
            return a;
        }

        public static int timeLeft((int) curHour, curMin, depHour, depMin);
        {
            curHour = 


        }
}
