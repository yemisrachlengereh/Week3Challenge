package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String answer;
        int Counter;
        Scanner Keyboard = new Scanner(System.in);
        Name newName = new Name();
        Other newOther = new Other();

        ArrayList<Other> OtherList = new ArrayList<>();
        ArrayList<Name> NameList = new ArrayList<>();


        System.out.print("Enter your  first name: ");
        newName.setFirstName(Keyboard.nextLine());
        System.out.print("Enter last  last name: ");
        newName.setLastname(Keyboard.nextLine());

        System.out.print("Enter your email: ");
        newName.setEmail(Keyboard.nextLine());
        //education

        for (int counter = 1; counter < 10; counter++) {
            System.out.print("Enter your educaton: ");


            System.out.print("your dgree level(BS or MS)?:");
            newOther.setEducationalachivment(Keyboard.nextLine());
            System.out.print("In which field you graduate?:");
            newOther.setField(Keyboard.nextLine());

            System.out.print("where you graduate?");
            newOther.setWhere(Keyboard.nextLine());
            System.out.print("when did you graduate?(year)");
            newOther.setWhen(Keyboard.nextLine());
            System.out.print("do you want to enter other education expriance(yes/no)");
            answer = Keyboard.nextLine();
        }

        for (int counter = 0; counter < 10; counter++) {
            System.out.println("enter your expriace with level,");
            System.out.print("Enter your work exipriance: ");
            newOther.setExipriance(Keyboard.nextLine());
            System.out.print("what postion do you work before?");
            newOther.setWhatposition(Keyboard.nextLine());
            System.out.print("where do you work before?");
            newOther.setWherework(Keyboard.nextLine());
            System.out.print("when you work there?( M/Y)");
            newOther.setWhere(Keyboard.nextLine());
            System.out.println("you want to enter other work expriance?(yes/no)" );
            answer=Keyboard.nextLine();

        }
        System.out.print("what was your duty?");
        newOther.setDuty(Keyboard.nextLine());
        System.out.print("you want to enter other duties?yes/no");
        answer = Keyboard.nextLine();


        do {


            System.out.print("enter your other dutie");
            newOther.setDuty(Keyboard.nextLine());
            System.out.print("do you want to enter other dutie?");
        } while (answer.equalsIgnoreCase("yes"));





   for(int counter = 0;counter< 10;counter++)

    {

        System.out.print(" enter your skills :");
        newOther.setSkills(Keyboard.nextLine());
        System.out.print("enter your level of skill(skilled/proficient/familiar):");
        newOther.setLevel(Keyboard.nextLine());

        System.out.print("do you want to enter other work expriance(yes/no)");
        answer = Keyboard.nextLine();
    }






        System.out.println(newName.getFirstName()+newName.getLastname()+"\n"+newName.getEmail());
        System.out.print("\n");
        System.out.println("education");
        System.out.println(newOther.getDgree()+ " in " +newOther.getField());
        System.out.println(newOther.getWhere()+" , "+newOther.getWhen());
        System.out.println("\n");
        System.out.println("Expriance");
        System.out.println(newOther.getWhatposition());
        System.out.println(newOther.getWherework()+","+newOther.getWhenwork());
        System.out.println(newOther.getDuty())   ;

        System.out.println("\n");
        System.out.println("Skills");
        System.out.println(newOther.getSkills()+","+newOther.getField());

    }
}

