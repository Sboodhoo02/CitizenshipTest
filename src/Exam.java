import java.util.ArrayList;
import java.util.List;

public class Exam {
    private ArrayList<Question> examQuestions;
    int size;

    Exam(){
        this.examQuestions = new ArrayList<>(10);
        this.size = 0;
    }
    Exam(int size){
        this.examQuestions = new ArrayList<>(size);
        this.size = 0;
    }

    public List<Question> getExamQuestions() { return examQuestions; }
    public void addQuestion(Question q){
        examQuestions.add(q);
        size++;
    }
    public Question getExamQuestion(int index){ return examQuestions.get(index); }

    public void printExamQuestions(){
        for(int i=0; i<size; i++){
            System.out.println(i+1 + ") " + examQuestions.get(i).getQuest());
        }
        System.out.println();
    }
    public void printExam(){
        for(int i=0; i<size; i++){
            System.out.println(i+1 + ") " + examQuestions.get(i).getQuest());
            examQuestions.get(i).getOptions().print();
        }
        System.out.println();
    }
    public void printExamAndSolutions(){
        for(int i=0; i<size; i++){
            if(examQuestions.get(i).getOptions().getNumOfOptions() > 1){
                System.out.print(i+1 + ") " + "Solution--> " + examQuestions.get(i).getQuest() + " ");
                examQuestions.get(i).getOptions().printCorrectAnswers();
            }
            else{
                System.out.print(i+1 + ") " + "Solution--> " + examQuestions.get(i).getQuest() + " ");
                examQuestions.get(i).getOptions().printCorrectAnswer();
            }
        }
        System.out.println();
    }
    public void printExamQuestion(int index){
        System.out.println();
        System.out.print(index);
        System.out.print(") ");
        System.out.println(examQuestions.get(index-1));
    }
    // public void administerExam(){
    //     for(int i=0; i<size; i++){

    //     }
    // }
}
