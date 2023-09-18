import java.util.Scanner;

public class Opgave3
{
    public static void main(String args[])
    {


        //******************************************************************** *//
        /////////  #1 Skift farve på strings - chatGPT og kun til flex :D ////////
        //******************************************************************** *//

       String resetColor = "\u001B[0m";
       String redColor = "\u001B[31m";
       String greenColor = "\u001B[32m";
       String yellowColor = "\u001B[33m";


        //******************************************************************** *//
        /////////  #2 Intro kode blok                                    /////////
        //******************************************************************** *//

        Scanner GradeCalc = new Scanner(System.in); // Laver et scanner objekt 

        System.out.println(greenColor + "Welcome to the system grade calculator!" + resetColor);
        System.out.println(greenColor + "=======================================" + resetColor);
        System.out.println(greenColor + "Please insert your grade, so we can calculate your result" + resetColor); // Prompter useren for svar

        
        int score; // Laver en tom variabel, der afventer


        //******************************************************************** *//
        /////////  #3  Validerings blok - tjekker om input er gyldingt   /////////
        //******************************************************************** *//


        Boolean isActive = true;

        while(isActive = true) // KIG DET HER!
        {}

        while(true) // Forever looper næste blok af kode, der validere userens kode. Break pointet lader useren gå videre, mens de andre looper til vi rammer break
        {
            try 
            {
                score = Integer.parseInt(GradeCalc.nextLine()); // Læser userens svar og konvetere stringen til en int, og gemmer den i score variabelen

                
                if (score < 0 || score > 100) // Nu checker vi om scoren ligger indenfor de 0-100. Hvis den er det, så looper vi til starten af koden
                {
                    System.out.println("Error! Score must be between 0 and 100!");
                }
                else
                {
                    break; // Hvis den IKKE er under 0 og over 100 breaker vi vores loop og fortsætter til if/else statements
                }
            }
            catch (NumberFormatException e) // Her tjekker vi at det er et tal vi har skrevet, så useren ikke kan prompte et bogstav.
            {
                System.out.println("Error! Answer must be a valid number!");
            }
        }


        //******************************************************************** *//
        /////////  #4 Confirmer at userens indtasting er god             /////////
        //******************************************************************** *//


        System.out.println("Are you sure that is your grade (Y/N?)");
        String confirmGrade = GradeCalc.nextLine();


        while (true) 
        {
            if (!confirmGrade.equals("N") && !confirmGrade.equals("Y"))
            {
                System.out.println("Please enter a valid Y/N");
                confirmGrade = GradeCalc.nextLine(); // Læser user input igen efter hver iteration af koden - ellers vil svarret altid være det samme
            }
             else if (confirmGrade.equals("N")) 
            {
                System.out.println("The program will now stop");
                System.exit(0);
            } 
            else if (confirmGrade.equals("Y")) 
            {
                break;
            }
        }

         //******************************************************************** *//
        /////////  #5 Placere userens score som karakter                  /////////
        //******************************************************************** *//

        if(confirmGrade.equals("Y"))
        {
            if(score >= 90 && score <= 100)
            {
                System.out.println(greenColor + "You have passed with an A!!! You are the best!"  + resetColor);
            }
            else if(score >= 80 && score <= 89)
            {
                System.out.println(greenColor + "Good job! You have passed, with an B!"  + resetColor);
            }
            else if(score >= 70 && score <= 79)
            {
                System.out.println(greenColor + "You have passed with an C! Very average, but still nice :D"  + resetColor);
            }
            else if(score >= 60 && score <= 69)
            {
                System.out.println(yellowColor + "Pretty close to fail! - but you made it with an C"  + resetColor);
            }
            else if(score < 60)
            {
                System.out.println();
                System.out.println();
                System.out.println("You have chosen the follow grade: " + score + " and therefor got the grade:");
                System.out.println("*******************************************************");
                System.out.println(redColor + "You have failed! better luck next time!!!!" + resetColor);
                System.out.println("*******************************************************");
            }
        }
    }
}



