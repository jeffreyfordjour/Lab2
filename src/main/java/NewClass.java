
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author frys
 */
public class NewClass {
    public static void main(String[] args) {
         Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter 1st Test Score:");
        double testScoreOne = keyboard.nextDouble();
        
        System.out.println("Enter 2nd Test Score:");
        double testScoreTwo = keyboard.nextDouble();
        
        System.out.println("Enter 3rd Test Score:");
        double testScoreThree = keyboard.nextDouble();
        
        double averageScore = (testScoreOne + testScoreTwo + testScoreThree) / 3;
        
       if (averageScore >= 90 && averageScore <= 100){
        System.out.println("Your Average Grade is " + averageScore + " this is a A!!" );
        
       }
       else if (averageScore >= 80 && averageScore <= 89.99){
       System.out.println("Your Average Grade is " + averageScore + " this is a B!!" );
       }
       else if (averageScore >= 70 && averageScore <= 79.99){
       System.out.println("Your Average Grade is " + averageScore + " this is a C!!" );
       }
       else if (averageScore >= 60 && averageScore <= 69.99){
       System.out.println("Your Average Grade is " + averageScore + " this is a D!!" );
       }
       else if (averageScore < 60){
       System.out.println("Your Average Grade is " + averageScore + " this is a F!!" );
       }
      
      
    
       
    }
       
        
    }

