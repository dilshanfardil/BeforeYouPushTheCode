package mistake;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class BasicMistakes {

    public static void main(String[] args) throws IOException
    {
        mistakeFlow();
    }

    public static void mistakeFlow() throws IOException {
        optimizeImportIsAMust();
        generics();
        stringImmutable();
        usingEquals();
        System.out.println(usingIfWithBoolean());
        System.out.println(usingTernary(10));
        carefulWithSwitches(11);
        accessingResources();
        System.out.println(handlingNulls());
        exceptionPainInTheAss();
        printLetters();
        removeLetter();
    }




















    private static void optimizeImportIsAMust() {
        //
    }


















    private static void generics() {
        ArrayList listOfNumbers = new ArrayList();
        listOfNumbers.add(10);
        listOfNumbers.add(10);
        listOfNumbers.forEach(System.out::println);

        /*
         * Note : Always use super type
         */
    }


















    private static void stringImmutable() {
        String name = "Sirius";
        name = "Atlas";

        /*
         * Note : What do we care ???
         */

    }


















    private static void usingEquals() {
        String name = "Sirius";
        var nameVar = "Sirius";
        String nameObj = new String("Sirius");


        System.out.println(name == nameVar);
        System.out.println(nameObj == name);
        System.out.println(name.equals(name));
    }


















    private static boolean usingIfWithBoolean() {
        boolean bool = "a".contains("a");

        if (bool == true) {
            return true;
        }

        if (bool == false) {
            return false;
        }
        return bool;
    }


















    private static String usingTernary(int age) {
        if (age >= 18) {
            return "Adult";
        } else {
            return "Child";
        }
    }


















    private static String carefulWithSwitches(int index) {
        switch (index % 5) {
            case 0:
                System.out.println("One");
            case 1:
                System.out.println("Two");
            case 2:
                System.out.println("Three");
            case 3:
                System.out.println("Four");
            default:
                System.out.println("Default");
        }
        return "Empty";
    }

















    private static void accessingResources() throws IOException {
        FileInputStream inputStream = new FileInputStream("fileName");
        int read = inputStream.read();
        while (read != -1) {
            System.out.println(read);
            read = inputStream.read();
        }
    }

















    private static String handlingNulls() {
        String name = null;

        if (name == null) {
            return null;

        }
        return "Saman";
    }


















    private static void exceptionPainInTheAss()
    {
        System.out.println(printNumbers());
    }
    private static int printNumbers(){
        try {
            return 1;
        }
        catch (Exception e){
            return 2;
        }
        finally {
            return 3;
        }
    }
    private static String printLetters(){
        try {
            int x = Integer.parseInt("ABC");
        }
        catch (Exception e)
        {
            System.out.println("Wrong Cast..!!!");
        }
        finally {
            System.out.println("Finally..!!!");
        }
        return "AB";
    }























    private static void removeLetter() {
        ArrayList<String> letters = new ArrayList<>(Arrays.asList("A", "B", "C"));

        letters.forEach(letter -> {
            if (letter.equals("A")) {
                letters.remove("A");
            }
        });

    }

















































}
