package az.spring.data.springdatarestdemo.model;

import java.util.Scanner;

public class Esger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ali Tehsilisiniz?"+"He/Yox");
        String check = sc.nextLine();
        String f = "He";
        String e = "Yox";
        if (check.equals(f)){
            System.out.println("Gedəcəyiniz ayı daxil edin"+"Ex: Sentaybr");
            sc = new Scanner(System.in);
            String moon1 = sc.nextLine();
            System.out.println("Siz" + " "+moon1 +" "+"ayinda geleceksiniz");
        }else if (check.equals(e)) {

            System.out.println("Doğum ayınızı daxil edin"+"Ex: Sentyabr");
                sc = new Scanner(System.in);
                String moon = sc.nextLine();
                String a = "Yanvar";
                String b = "Fevral";
                String c = "Mart";
                String d = "Aprel";
                String e1 = "May";
                String f2 = "Iyun";
                String g = "Iyul";
                String h = "Avqust";
                String i = "Sentyabr";
                String l = "Okaber";
                String m = "Noyabr";
                String n = "Dekabr";

                if (moon.equals(i)||moon.equals(h)||moon.equals(l)) {
                    System.out.println("Siz Oktyabr ayında gedib Aprel ayinda geleceksiniz");
                }
                if (moon.equals(m)||moon.equals(n)||moon.equals(a)) {
                    System.out.println("Siz Yanvar ayında gedib Iyul ayinda geleceksiniz");
                }
                if (moon.equals(e1)||moon.equals(f2)||moon.equals(g)) {
                    System.out.println("Siz İyul ayinda gedib  Yanvar ayinda geleceksiniz");
                }
                if (moon.equals(b)||moon.equals(c)||moon.equals(d)) {
                    System.out.println("Siz Aprel ayinda gedib Oktyabr ayinda geleceksiniz");

            }
        }else{
            System.out.println("Zehmet olmasa duzgun yazin");
        }
    }
}
