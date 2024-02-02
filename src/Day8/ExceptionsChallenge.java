package Day8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsChallenge {
    public static class  CustomException extends Exception{
        public CustomException(String message) {
            super(message);
        }
    }
    private static void validateInput(int value) throws CustomException {
        if (value > 7) {
            throw new CustomException("Input must be greater than or equal to 10");
        } else {
            System.out.println("Input is valid.");
        }
    }
    private static void multipleExceptionMethode(int a,int b,int[] tab,int index) throws ArrayIndexOutOfBoundsException,ArithmeticException  {
        if (b==0) {
            throw new ArithmeticException("You Shouldn't divide a number by zero, try egain");
        } else {
            System.out.println("validate operation.");
        }
        if (index>tab.length)
        {
            throw new ArrayIndexOutOfBoundsException("Array Index Out of Bounds !!!");
        }
    }


    public static void main(String [] args){
        //Array Index Out of Bounds challenges
        System.out.println("*****************Array Index Out of Bounds challenge1 ******************");
        int [] array={1,2,3,4,5};
        try{
            array[6]=3;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println("ArithmeticException caught: " + e.getMessage());

        }

        System.out.println("***************** Number Format Exception challenge2 ******************");
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("please enter a string");
            String test= s.nextLine();
            int x=Integer.parseInt(test);
        }
        catch (NumberFormatException e){
            System.out.println("Number format exception occurred");
        }
        System.out.println("***************** File Not Found Exception Challenge3 ******************");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("C:/Users/HP/Desktop/exmple.txt"));
            String line = reader.readLine();
            System.out.println("First line: " + line);

        }catch (FileNotFoundException e){
            System.out.println("File Not Found Exception");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("***************** Custom Exception Challenge4  ******************");
        try {
            validateInput(19);
        } catch (CustomException mce) {
            System.err.println("CustomException caught: " + mce.getMessage());
        }
        System.out.println("***************** NullPointerException Challenge5  ******************");
        try {
            String name = null;
            System.out.println(name.charAt(2));

        }catch (NullPointerException e){
            System.out.println(" NullPointerException caught ");
        }
        System.out.println("***************** User Input Validation:Challenge6  ******************");

        System.out.println(" Enter a positive number ");
        Scanner scanner=new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Veuillez saisir un entier positif : ");
                int userInput = scanner.nextInt();
                if (userInput > 0) {
                    System.out.println("Vous avez saisi un entier positif : " + userInput);
                    break;
                } else {
                    System.out.println("Veuillez saisir un entier positif.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erreur : Veuillez saisir un entier valide.");
                scanner.next();
            }
        }

        scanner.close();
        System.out.println("***************** Try-With-Resources:Challenge7  ******************");
        try (BufferedReader reader1 = new BufferedReader(new FileReader("C:/Users/HP/Desktop/exmple.txt"))) {
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());

        }


        System.out.println("***************** Multiple Exceptions:Challenge8  ******************");
        try {
            int [] t={1,2,3,4,5};
            //t[6]=8;
            multipleExceptionMethode(1,0,t,9);
           // System.out.println("result"+);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException caught:"+e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }


        System.out.println("***************** MUnchecked Exception:Challenge9  ******************");
        try {
            int[] numbers = {1, 2, 3};
            int value = numbers[5];
            System.out.println("Valeur du tableau : " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Erreur d'index de tableau : " + e.getMessage());
            System.err.println("Vous avez tenté d'accéder à un index invalide dans le tableau.");
        }
    }

}
