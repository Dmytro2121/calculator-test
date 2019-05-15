package com.company;
import java.util.Scanner;
public class RometoInteger {
    public static int RomeInt(){
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        switch(input) {
            case "I": return 1;
            case "II": return 2;
            case "III": return 3;
            case "IV": return 4;
            case "V": return 5;
            case "VI": return 6;
            case "VII": return 7;
            case "VIII": return 8;
            case "IX": return 9;
            case "X": return 10;
            case "XI":return 11;
            case "XII":return 12;
            case "XIII":return 13;
            case "XIV":return 14;
            case "XV":return 15;
            case "XVI":return 16;
            case "XVII":return 17;
            case "XVIII":return 18;
            case "XIX":return 19;
            case "XX":return 20;
            default: {System.out.println("Невірний формат,спробуйте ще раз");
                return 0;}
        }

    }
    public static String IntRome(int output){
        switch(output) {
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 7: return "VII";
            case 8: return "VIII";
            case 9: return "IX";
            case 10: return "X";
            case 11: return "XI";
            case 12: return "XII";
            case 13: return "XIII";
            case 14: return "XIV";
            case 15: return "XV";
            case 16: return "XVI";
            case 17: return "XVII";
            case 18: return "XVIII";
            case 19: return "XIX";
            case 20: return "XX";
            default: return "NULL";
    }
}}
