package com.company;

import com.company.maker.CoffeMaker;

import java.util.Scanner;

public class Main {

    /*
        Papildyti kavos aparata šiuo funkcionalumu:
        - vartojas pats įveda kavos pavadinimą
        - kai tikrinama ar aparatas pasiruošęs,
            pranešti jei kažko trūksta ir ar reikia valyti
            įskaitant ir prieš gaminant kavą
        - visur naudoti string builder
        - prideti "ASCII art" kavos puodeliams, naudoti string builder
        - pildant aparatą iš vartotojo pasiimti kiekius kiek papildys
     */

    public static void main(String[] args) {
        Main obj = new Main();
        obj.dirbam();
    }

    private void showMenu() {
        System.out.println("0 - baigti darba");
        System.out.println("1 - gaminti kava");
        System.out.println("2 - rodyti aparato busena");
        System.out.println("3 - plauti aparata");
        System.out.println("4 - pildyti produktus");
    }

    private void dirbam() {
        CoffeMaker aparatas = new CoffeMaker();
        Scanner sc = new Scanner(System.in);
        boolean arTesti = true;
        do {
            showMenu();
            int pasirinkimas = sc.nextInt();
            switch (pasirinkimas) {
                case 0:
                    arTesti = false;
                    break;
                case 1:
                    if(aparatas.isReady()) {
                        System.out.println("Iveskite kavos pavadinima: black, latte arba espresso");
                        String name = sc.next();
                        aparatas.makeCoffe(name.toLowerCase());
                    }
                    break;
                case 2:
                    aparatas.showStatus();
                    break;
                case 3:
                    aparatas.washMaker();
                    break;
                case 4:
                    System.out.println("Iveskite kiek pildome vandens(l)");
                    float water =sc.nextFloat();
                    System.out.println("Iveskite kiek pildome cukraus(g)");
                    float sugar = sc.nextFloat();
                    System.out.println("Ivesite kiek pildome pupeliu(g)");
                    float beans = sc.nextFloat();
                    aparatas.fillProducts(water,sugar,beans);
                    break;

            }

        } while (arTesti);
    }
}
