package com.company;

import java.util.Scanner;

public class Main {


    Boolean checkerString(String string,Boolean status){
        return status;
    }

    public static void main(String[] args) {
        Boolean status;
        String string="Чaбаненко Александр  CHABANENKO Chabanenko";
        String string1;
        Scanner sc =new Scanner(System.in);
        System.out.println("напиши Фамилию Имя Отчество через пробел");
        //string1=sc.next();
       // System.out.println(string.matches("Чaбаненко Александр Александрович Chabanenko Aleksand Aleksandrovich"));

        string1 = "Chabanenko Aleksandr Aleksandrovich";
        String[] words = string1.split("\\s*(\\s|,|!|\\.)\\s*");
        for(String word : words){
            System.out.println(word);
        }
        System.out.println(words[0].matches("(^\\p{Upper}$)"));

        //System.out.println(words[0].matches("(CHABANENKO(\\w*)|ЧАБАНЕНКО(\\w*)|Чaбаненко(\\w*)|Chabanenko(\\w*))&\\D"));
       // System.out.println(words[1].matches("ALEKSANDR(\\w*)|АЛЕКСАНДР(\\w*)|Александр(\\w*)|Aleksand(\\w*)"));


    }
}
