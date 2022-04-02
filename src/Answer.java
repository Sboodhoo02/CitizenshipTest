import java.util.ArrayList;
import java.util.List;

public class Answer {
    // use an boolean as a parameter to determine whether a question has multiple answers
    //private String ans;
    private List<String> options;
    String correctOption = null;
    int numOfCorrectOptions;
    List<String> correctOptions;
    int size;
    int correctOptionIndex = 0;
    

    Answer(String str){
        options = new ArrayList<>(1);
        options.add(str);
        size = 1;
        correctOption = str;
    }
    Answer(int x, String str, String str2){
        options = new ArrayList<>(2);
        numOfCorrectOptions = x;
        options.add(str);
        options.add(str2);
        size = 2;  
        if(x>1){
            correctOptions = new ArrayList<>(x);
            correctOptions = new ArrayList<>(x);
            for(int i=0; i<x; i++){
                correctOptions.add(options.get(i));
            }
        }else{
            correctOption = str;
        }
    }
    Answer(int x, String str, String str2, String str3){
        options = new ArrayList<>(3);
        numOfCorrectOptions = x;
        options.add(str);
        options.add(str2);
        options.add(str3);
        size = 3;
        if(x>1){
            correctOptions = new ArrayList<>(x);
            for(int i=0; i<x; i++){
                correctOptions.add(options.get(i));
            }
        }else{
            correctOption = str;
        }
    }
    Answer(int x, String str, String str2, String str3, String str4){
        options = new ArrayList<>(4);
        numOfCorrectOptions = x;
        options.add(str);
        options.add(str2);
        options.add(str3);
        options.add(str4);
        size = 4;
        if(x>1){
            correctOptions = new ArrayList<>(x);
            for(int i=0; i<x; i++){
                correctOptions.add(options.get(i));
            }
        }else{
            correctOption = str;
        }
    }

    List<String> getOptions(){ return options; }
    public String getCorrectOption(){ return correctOption;}
    public List<String> getCorrectOptions() { return correctOptions; }
    public int getNumOfCorrectOptions(){ return numOfCorrectOptions; }
    public String getOption(int index){ return options.get(index); }
    public int getCorrectOptionIndex() { return correctOptionIndex; }
    //public int getCorrectOptionIndex(int index) { return correctOptionIndex; }
    // TO DO
    // void setAns(String str){ ans = str; }

    public void printAnswers(){
        for(int i =0; i<size; i++){
            System.out.println(options.get(i));
        }
    }
    public void print(){
        // place holder for ABCD to ascii
        int a = 65;
        for(int i =0; i<size; i++){
            System.out.println((char)a + ". " + options.get(i));
            a++;
        }
        System.out.println();
    }
    public void printCorrectAnswer() { System.out.println(correctOption); }
    public void printCorrectAnswers(){ System.out.println(correctOptions);}
    public String toString(){
        StringBuilder b = new StringBuilder();
        int d = 65;
        for(int i =0; i<size; i++){
            b.append((char)d++);
            b.append(". ");
            b.append(options.get(i));
            b.append("\n");
        }
        return b.toString();
    }
}

