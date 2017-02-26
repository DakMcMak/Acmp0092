import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        int cranes01,cranes02;
        Scanner scanner = new Scanner(System.in);
        int themaincrane = scanner.nextInt();
        if(themaincrane < 1000000) {
            cranes02 = themaincrane;
            cranes01 = themaincrane / 6;
            System.out.print(" " + cranes01);
            cranes01 = cranes01 + cranes01;
            themaincrane = themaincrane - cranes01;
            System.out.print(" " + themaincrane);
            cranes01 = cranes02 / 6;
            System.out.print(" " + cranes01);
        }
        else{
            System.out.println("ошибка");
        }
    }
}
