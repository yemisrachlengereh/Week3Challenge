package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String eduans = " ";
        String workans;
        String dutyans;
        String answer;
        String skillanswer;
        int skillcounter = 1;
        int educounter = 1;
        int workcounter = 0;
        Scanner keyboard = new Scanner(System.in);
        Name newName = new Name();
        Other newOther = new Other();
        Name othero=new Name();
        ArrayList<Other> OtherList = new ArrayList<>();
        ArrayList<Name> NameList = new ArrayList<>();


        System.out.print("Enter your  first name: ");
        newName.setFirstName(keyboard.nextLine());
        System.out.print("Enter last  last name: ");
        newName.setLastname(keyboard.nextLine());

        System.out.print("Enter your email: ");
        newName.setEmail(keyboard.nextLine());
        //education


        do {

            do {
                System.out.print("Enter your educaton expriance");

                System.out.print("In which field you graduate?:");
                eduans = keyboard.nextLine();
                if (eduans.isEmpty()) {

                    System.out.println("Nothing was entered.enter atleast one expriance");
                } else {

                    System.out.print("good,enter other information");
                }
            } while (eduans.isEmpty());
            System.out.print("your dgree level(BS or MS)?:");
            newOther.setLevel(keyboard.nextLine());


            System.out.print("where you graduate?");
            newOther.setWhere(keyboard.nextLine());
            System.out.print("when did you graduate?(year)");
            newOther.setWhen(keyboard.nextLine());
            educounter++;


            System.out.print("do you want to enter other education expriance(yes/no)");
            eduans = keyboard.nextLine();
        } while (eduans.equalsIgnoreCase("yes") && educounter <= 10);


        do {
            System.out.print("enter your expriace with level,");
            System.out.print("Enter your work exipriance: ");
            newOther.setExipriance(keyboard.nextLine());
            System.out.print("what postion do you work before?");
            newOther.setWhatposition(keyboard.nextLine());
            System.out.print("where do you work before?");
            newOther.setWherework(keyboard.nextLine());
            System.out.print("when you work there?( M/Y)");
            newOther.setWhere(keyboard.nextLine());
            workcounter++;
            System.out.print("you want to enter other work expriance?(yes/no)");
            workans = keyboard.nextLine();
        } while (workans.equalsIgnoreCase("yes") && workcounter <= 10);


        do

        {
            System.out.print("what was your duty?");
            newOther.setDuty(keyboard.nextLine());
            System.out.print("you want to enter other duties?yes/no");
            dutyans = keyboard.nextLine();
        } while (!dutyans.equalsIgnoreCase("yes") && !dutyans.equalsIgnoreCase("no"));


        do {
            do {
                System.out.print(" enter your skills :");
                skillanswer = keyboard.nextLine();
                if (skillanswer.isEmpty()) {

                    System.out.println("Nothing was entered.enter atleast one expriance");
                } else {

                    System.out.print("good,enter other information");
                }

            } while (skillanswer.isEmpty());


            System.out.print("enter your level of skill(skilled/proficient/familiar):");
            newOther.setLevel(keyboard.nextLine());
            skillcounter++;

            System.out.print("do you want to enter other skill?(yes/no)");
            skillanswer = keyboard.nextLine();
        } while (skillanswer.equalsIgnoreCase("yes") && skillcounter <= 20);


        System.out.println(newName.getFirstName() + newName.getLastname() + "\n" + newName.getEmail());
        System.out.print("\n");
        System.out.println("Education");
        System.out.println(newOther.getDgree() + " in " + newOther.getField());
        System.out.println(newOther.getWhere() + " , " + newOther.getWhen());
        System.out.println("\n");
        System.out.println("Expriance");
        System.out.println(newOther.getWhatposition());
        System.out.println(newOther.getWherework() + "," + newOther.getWhenwork());
        System.out.println(newOther.getDuty());

        System.out.println("\n");
        System.out.println("Skills");
        System.out.println(newOther.getSkills() + "," + newOther.getField());

    }

}

