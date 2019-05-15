package com.company;
import java.util.Scanner;
public class readclass {
    public int readNextInt(){
        Scanner sc = new Scanner(System.in);
        int i = -1;
        if  (sc.hasNextInt())
            i = sc.nextInt();
        else System.out.println("Ви ввели не ціле число,cпробуйте ще раз");
        return i;
    }
}





