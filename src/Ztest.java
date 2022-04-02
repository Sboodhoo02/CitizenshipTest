import java.util.Scanner;
public class Ztest {
    private static final Scanner sc = new Scanner(System.in);
    // public static void query(Question q){

    //     String s;
    //     System.out.print(q.quest);
    //     sc.nextLine();
    //     System.out.println(q.ans1 + "\n");
    // }
    public static void main(String[] args) throws Exception {

        //Declaring Exam
        Exam e = new Exam();

        //Question q = new Question("", "");
        //Declaring Questions
        Question q1 = new Question(1, "When was Indpendence?", "1776", "1966", "1787");
        Question q2 = new Question(1, "Who is the current President?", "Joe Biden", "Donald Trump", "Barack Obama", "Hilary Clinton");
        Question q3 = new Question(1, "Who is the current Vice President?", "Kamala Harris", "Donald Trump", "Barack Obama", "Hilary Clinton");
        Question q4 = new Question(1, "What is the name of the National Anthem?", "The Star-Sprangled Banner", "The Sprangled-Star Banner");
        Question q5 = new Question(2, "What are 2 rights in the Declaration of Indpendence?", "Life", "Liberty", "Luxury");

        // Adding Questions to an Exam
        e.addQuestion(q1);
        e.addQuestion(q2);
        e.addQuestion(q3);
        e.addQuestion(q4);
        //e.addQuestion(q5);
        
        e.printExamQuestion(1);
        System.out.println(gradeQuestion(sc, q1));

        e.printExamQuestion(2);
        System.out.println(gradeQuestion(sc, q2));

        e.printExamQuestion(3);
        System.out.println(gradeQuestion(sc, q3));

        // e.printExamQuestion(1);


        // e.printExamQuestion(2);


        // e.printExamQuestion(3);

        //int score = administerExam(e);

    }
    public static int administerExam(Exam e){
        int score = 0;
        System.out.println("check");
        return score;
    }
    public static boolean gradeQuestion(Scanner s, Question q){
        String userInput = sc.nextLine();
        String userAnswer = "";


        // determine if question has multiple answers        
        if(q.hasMultipleAnswers()){
            System.out.println("Q has multiple answers");
            // to do
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

                default:
                    break;
        }
            // compare the userAnswer with correctOption
            if(userAnswer.equals(q.getCorrectOption())){
                return true;
            }
        }
      return false;
    }
}
