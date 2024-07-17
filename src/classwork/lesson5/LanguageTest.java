package classwork.lesson5;

import java.util.Scanner;

public class LanguageTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Language lang = Language.RU;

        switch (lang) {
            case HY:
                System.out.println("Բարև");
                break;
            case RU:
                System.out.println("PRIVET");
                break;
            case ENG:
                System.out.println("Hello");
                break;
            default:
                System.out.println("Hola");
                break;
        }
        Language.CH.setCountry("China");
        System.out.println("Please choose language from list :");
        Language[] values = Language.values();
        for(Language value : values){
            System.out.print(value + ", \n");
        }
        try{
            System.out.print("Input :");
            String languageStr = sc.nextLine();
            if(languageStr != null){
                Language chooseLanguage = Language.valueOf(languageStr.toUpperCase());
                System.out.println("Choose language : " + chooseLanguage);
                System.out.println("Country : " + chooseLanguage.getCountry());
                System.out.println("Index :" + chooseLanguage.ordinal());
            }
        }catch(IllegalArgumentException e){
            System.out.println("Please choose element from the list!");
        }
    }
}
