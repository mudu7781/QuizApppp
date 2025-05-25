/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuizApp;


            
          

/**
 *
 * @author cr273
 */
public class Question {
    String questionText;
    String[] options;
    int correctAnswerIndex;
    
    public Question(String questionText, String[] options, int correctAnswerIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    
    public void displayQuestion() {
        System.out.println(questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
            
        }
    }
    
    public boolean isCorrect(int userAnswer) {
        return userAnswer == correctAnswerIndex;
    }
}
