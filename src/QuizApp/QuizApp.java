/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuizApp;

import java.util.Scanner;

/**
 *
 * @author cr273
 */
public class QuizApp {
    public static void main(String[] args) {
      
        try (Scanner scanner = new Scanner(System.in)) {
            
            Question[] questions = new Question[4];
            
            questions[0] = new Question(
                    "What kind of language is Java?",
                    new String[] {"High level", "Low level", "mid level", "no language"},
                    1 
            );
            
            questions[1] = new Question(
                    "what oriented language is JAVA?",
                    new String[] {"platform", "subject", "class", "object"},
                    4 
            );
            
            questions[2] = new Question(
                    "What language is platform independent?",
                    new String[] {"C++", "Java", "javascript", "Python"},
                    2 
            );
            
            questions[3] = new Question(
                    "Can JVM being installed cause JAVA run on any device?",
                    new String[] {"maybe", "certainly", "Yes", "No"},
                    3
            );        
                    
            
            
            
            int score = 0;
            
            for (int i = 0; i < questions.length; i++) {
                System.out.println("\nQuestion " + (i + 1) + ":");
                questions[i].displayQuestion();
                
                System.out.print("Your answer (1-4): ");
                int userAnswer = scanner.nextInt();
                
                if (questions[i].isCorrect(userAnswer)) {
                    System.out.println("Congrats, your answerCorrect!");
                    score++;
                } else {
                    System.out.println("Nope! The correct answer is: " +
                            questions[i].options[questions[i].correctAnswerIndex - 1]);
                }
            }
            
            
            System.out.println("\nQuiz completed!");
            System.out.println("Your score: " + score + " out of " + questions.length);
        }
    }
}
    
    

