package com.company;
import java.util.Scanner;
public class kalculatortest {
    public static  void  main (String[] args){

        readclass ReadClass = new readclass();
        RometoInteger rometoInteger = new RometoInteger();
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        n1 =0;
        n2 =0;
        int action1;
        System.out.println("Вітаю в калькуляторі Римських та Арабських чисел)");
        System.out.println("Примітки:");
        System.out.println("1)У випадку роботи з Римськими числами програма працює в діапазоні від I(1) до XX(20) включно,");
        System.out.println("інакше результатом програми буду null.");
        System.out.println("2)Римські цифри вводити англійськими літерами з капсом.");
        System.out.println("3)Калькулятор працює з цілими числами,у випадках коли результатом є не ціле число,залишатиметься тільки ціла частина");
        System.out.println("Виберіть Арабські чи Римські цифри:");
        System.out.println("1.Римські");
        System.out.println("2.Арабські");

        int action2 =sc.nextInt();
        switch (action2){
            case 1:{
                do {
                    System.out.println("Введіть перше число ");
                    n1 = rometoInteger.RomeInt();
                    if(n1 == 0) continue;
                    System.out.println("Введіть друге число ");
                    n2 = rometoInteger.RomeInt();
                }
                while(n2==0);


                kalculator kalculator = new kalculator(n1,n2);
                System.out.println("1. Додати");
                System.out.println("2. Відняти");
                System.out.println("3. Множити");
                System.out.println("4. Розділити");
                System.out.println("0. Вихід");
                System.out.println("Введіть номер дії");
                action1 = ReadClass.readNextInt();

                switch (action1){
                    case  1:System.out.println(RometoInteger.IntRome(kalculator.add()));break;
                    case  2:System.out.println(RometoInteger.IntRome(kalculator.subs()));break;
                    case  3:System.out.println(RometoInteger.IntRome(kalculator.multi()));break;
                    case  4:System.out.println(RometoInteger.IntRome(kalculator.div()));break;
                    case  0:break;
                    default:System.out.println("Ви вибрали неправильний пункт");
                } break;
            }
            case 2:{
                do {
                    System.out.println("Введіть перше число ");
                    n1 = ReadClass.readNextInt();
                    if (n1 == -1) continue;
                    System.out.println("Введіть друге число ");
                    n2 = ReadClass.readNextInt();
                }while (n2==-1);
                kalculator kalculator = new kalculator(n1,n2);
                System.out.println("1. Додати");
                System.out.println("2. Відняти");
                System.out.println("3. Множити");
                System.out.println("4. Розділити");
                System.out.println("0. Вихід");
                System.out.println("Введіть номер дії");
                action1 = ReadClass.readNextInt();

                switch (action1){
                    case  1:System.out.println(kalculator.add());break;
                    case  2:System.out.println(kalculator.subs());break;
                    case  3:System.out.println(kalculator.multi());break;
                    case  4:System.out.println(kalculator.div());break;
                    case  0:break;
                    default:System.out.println("Ви вибрали неправильний пункт");
                }
            }
            default:break;
            }
        }





        }










