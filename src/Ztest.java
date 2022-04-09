import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.module.Configuration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ztest {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        String path = "/Users/suren/Desktop/CitizenshipTest/Questions.txt";
        //String path = "/Users/Think/Desktop/CitizenshipTest/Questions.txt";
        List<Exam> exams = new ArrayList<>();


        readInQuestions(path, exams);
        // Exam e1 = exams.get(0);
        // administerExam(e1, sc, 5);
        begin(sc, exams);
        // Exam e = exams.get(5);
        // Question q;
        // for(int i=0; i<100; i++){
        //     q = e.getExamQuestion(i);
        //     System.out.print(q.getNumOfCorrectOptions() + "|" +q.getQuest() + q.getOptions2());
        //     System.out.println();
        // }
    
    }
    public static void readInQuestions(String p, List<Exam> exams){
        Exam e = new Exam(100);
        exams.add(e);
        Question q;
        int x, amount =0;
        String [] values = new String[] {""};
        String line = "";
        try{
            BufferedReader br = new BufferedReader(new FileReader(p));

            // parse each line
            while((line = br.readLine()) != null){               
                values = line.split("\\|");

                // get char from string and case to int
                x = (int) values[0].charAt(0);

                // adjustment for integer casting
                x -= 48;
                switch (values.length) {
                    case 6:
                        q = new Question(x, values[1], values[2], values[3], values[4], values[5]);
                        e.addQuestion(q);
                        amount++;
                        break;
                    case 5:
                        q = new Question(x, values[1], values[2], values[3], values[4]);
                        e.addQuestion(q);
                        amount++;
                        break;
                    case 4:
                        q = new Question(x, values[1], values[2], values[3]);
                        e.addQuestion(q);
                        amount++;
                        break;
                    default:
                        break;
                }
            }
            br.close();
            System.out.println("Read success: " + amount + "/100");
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }
    
    public static int administerExam(Exam e, Scanner s){
        e.shuffleExamQuestions();
        int score = 0;
        for(int i = 0; i<e.getSize(); i++){

            // 1.) Print the question
            e.printExamQuestion(i+1);
            System.out.print("Select Answer: ");
            // 2.) get which question is being printed
            // 3.) does it have multiple answers?
            Question q = e.getExamQuestion(i);
            if(gradeQuestion(s, q)){
                score ++;
                System.out.println("Correct");
            }
            else{
                if(!(q.getHint().isEmpty())){
                    System.out.print("Hint: ");
                    q.printHint();
                    System.out.println();
                }else{
                    System.out.println("Hint: " + q.getCorrectOption());
                }
            }           
        }
        return score;
    }
    public static int administerExam(Exam e, Scanner s, int quantity){
        e.shuffleExamQuestions();
        int score = 0;
        for(int i = 0; i<quantity; i++){

            // 1.) Print the question
            e.printExamQuestion(i+1);
            System.out.print("Select Answer: ");
            // 2.) get which question is being printed
            // 3.) does it have multiple answers?
            Question q = e.getExamQuestion(i);
            if(gradeQuestion(s, q)){
                score ++;
                System.out.println("Correct");
            }
            else{
                if(!(q.getHint().isEmpty())){
                    System.out.print("Hint: ");
                    q.printHint();
                    System.out.println();
                }else{
                    System.out.println("Hint: " + q.getCorrectOption());
                }
            }           
        }
        return score;
    }
    public static boolean gradeQuestion(Scanner s, Question q){
        String userInput = s.nextLine();
        String userAnswer = "";


        // determine if question has multiple answers        
        if(q.hasMultipleAnswers()){
            int userInputLength = userInput.length();
            List<String> userSelectedOptions;
            // grab the user input
            // parse it & store into array list
            // check if 2 array lists are equals
            if (userInput.equals("h")){
                // System.out.print("Incorrect\nHint: ");
                // q.printHint();    
                return false;
            }
            else{
                userSelectedOptions = new ArrayList<>(userInputLength);
                for(int i=0; i<userInputLength; i++){
                    switch (userInput.charAt(i)) {
                        case 'a':
                            userSelectedOptions.add(q.getSpecificOption(0));
                            break;
                        case 'b':
                            userSelectedOptions.add(q.getSpecificOption(1));
                            break;
                        case 'c':
                            userSelectedOptions.add(q.getSpecificOption(2));
                            break;
                        case 'd':
                            userSelectedOptions.add(q.getSpecificOption(3));
                            break;
                        default:
                            // System.out.println("Incorrect\n Hint: ");
                            // q.printHint();
                            break;
                    }
                }
                Collections.sort(userSelectedOptions);
                Collections.sort(q.getCorrectOptions());
                return userSelectedOptions.equals(q.getCorrectOptions());
            }
        }
        else{
            // question has 1 answer
            // determine what answer the user selected
            switch (userInput) {
                case "a":
                    userAnswer = q.getSpecificOption(0);
                    break;               
                case "b":
                    userAnswer = q.getSpecificOption(1);
                    break;
                case "c":
                    userAnswer = q.getSpecificOption(2);
                    break;
                case "d":
                    userAnswer = q.getSpecificOption(3);
                    break;
                case "h":
                    userAnswer = "";
                    //System.out.println(q.getCorrectOption());
                    break;
                default:
                    break;
        }
            // compare the userAnswer with correctOption
            return userAnswer.equals(q.getCorrectOption());
        }
      //return false;
    }
    public static void menu(){
        System.out.println("**********************MENU************************");
        System.out.println("*\t\t\t\t\t\t *");
        System.out.println("* A) Preview all 100 questions\t\t\t *");
        System.out.println("* B) Preview 10 random questions ONLY\t\t *");
        System.out.println("* C) Practice 10 random questions\t\t *");
        System.out.println("* D) TBA\t\t\t\t\t *");
        System.out.println("* E) Exit\t\t\t\t\t *");
        System.out.println("*\t\t\t\t\t\t *");
        System.out.println("**************************************************");
    }
    public static void begin(Scanner s, List<Exam> exams){
        Scanner abc = new Scanner(System.in);
        //int size = exams.size();
        int score;
        int qHolder;
        menu();
        System.out.print("Select answer: ");
        String UserInput = s.nextLine();
        System.out.println();
        while(!(UserInput.equals("e"))){
            switch (UserInput) {
                case "a":
                    Exam e = exams.get(0);
                    e.printExamQuestions();
                    System.out.print("What question do you want the answer(s) for? ");
                    qHolder = abc.nextInt();
                    if(qHolder == -1) break;
                    Question q = e.getExamQuestion(qHolder-1);
                    //System.out.println(gradeQuestion(s, q));
                    while(qHolder > 0 && qHolder < 101){
                        if(q.hasMultipleAnswers()){
                            System.out.println(q.getCorrectOptions());
                            System.out.print("What question do you want the answer(s) for? ");
                            qHolder = abc.nextInt();
                            if(qHolder == -1) break;
                            q = e.getExamQuestion(qHolder-1);
                        }else{
                            System.out.println(q.getCorrectOption());
                            System.out.print("What question do you want the answer(s) for? ");
                            qHolder = abc.nextInt();
                            if(qHolder == -1) break;
                            q = e.getExamQuestion(qHolder-1);
                        }
                    }
                    break;
                case "b":
                    e = exams.get(0);
                    e.shuffleExamQuestions();
                    e.printExamQuestions(10);
                    System.out.print("What question do you want the answer(s) for? ");
                    qHolder = abc.nextInt();
                    if(qHolder == -1) break;
                    q = e.getExamQuestion(qHolder-1);
                    //System.out.println(gradeQuestion(s, q));
                    while(qHolder > 0 && qHolder < 11){
                        if(q.hasMultipleAnswers()){
                            System.out.println(q.getCorrectOptions());
                            System.out.print("What question do you want the answer(s) for? ");
                            qHolder = abc.nextInt();
                            if(qHolder == -1) break;
                            q = e.getExamQuestion(qHolder-1);
                        }else{
                            System.out.println(q.getCorrectOption());
                            System.out.print("What question do you want the answer(s) for? ");
                            qHolder = abc.nextInt();
                            if(qHolder == -1) break;
                            q = e.getExamQuestion(qHolder-1);
                        }
                    }
                    break;
                case "c":
                    score = administerExam(exams.get(0), s, 10);
                    System.out.println("Your score: " + score + "/10");
                    break;
                
                case "d":
                    break;
                default:
                    break;
            }
            menu();
            System.out.print("Select answer: ");
            UserInput = s.nextLine();
        }
        abc.close();
        return;
    }
}