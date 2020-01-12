package com.softserve.vilin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String choice;
        do{
            Scanner in = new Scanner(System.in);
            System.out.println("This game will show you if one envelope can be included in another one\n");

            System.out.println("Please specify length of the first envelope");
            double firstEnvelopeLength = in.nextDouble();

            System.out.println("Please specify width of the first envelope");
            double firstEnvelopeWidth = in.nextDouble();

            Envelope firstEnvelope = new Envelope(firstEnvelopeLength, firstEnvelopeWidth);
            System.out.println("First envelope was created:" + firstEnvelope.toString() +"\n");

            System.out.println("Please specify length of the second envelope");
            double secondEnvelopeLength = in.nextDouble();

            System.out.println("Please specify width of the second envelope");
            double secondEnvelopeWidth = in.nextDouble();

            Envelope secondEnvelope = new Envelope(secondEnvelopeLength, secondEnvelopeWidth);
            System.out.println("Second envelope was created:" + secondEnvelope.toString() + "\n");

            String result = canIncludeOneEnvelopeInTheOther(firstEnvelope, secondEnvelope) ? "can" : "cannot";
            System.out.println("You " + result + " include one envelope in another one \n");

            in.nextLine(); // This line you have to add (It consumes the \n character)
            System.out.print("Do you want to continue y or n \n");
            choice = in.nextLine();
        } while(choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes"));
    }

    public static boolean canIncludeOneEnvelopeInTheOther(Envelope firstEnvelope, Envelope secondEnvelope){
        boolean islengthGreater = firstEnvelope.getLength() > secondEnvelope.getLength();
        boolean isWidthGreater = firstEnvelope.getWidth() > secondEnvelope.getWidth();
        return islengthGreater == isWidthGreater;
    }
}