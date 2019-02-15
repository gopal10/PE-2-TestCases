package com.stackroute.PE2;

public class PowerOfFour {

    public boolean power(long n) {

        if(n == 0)
            return true;
        while(n != 1)
        {
            if(n % 4 != 0) {

                return false;


            }
            n = n / 4;

        }
        return true;
    }


}