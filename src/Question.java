import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Question{
    private String quest;
    private Answer options;
    private int numOfCorrectOptions;
    private List<String> hint = null;
    private boolean hasHint = false;

    Question(String q, String a){
        this.quest = q;
        this.options = new Answer(a);
        this.numOfCorrectOptions = 1;
    }
    Question(int x, String q, String a, String b){
        this.quest = q;
        this.options = new Answer(x, a, b);
        this.numOfCorrectOptions = x;
    }
    Question(int x, String q, String a, String b, String c){
        this.quest = q;
        this.options = new Answer(x, a, b, c);
        this.numOfCorrectOptions = x;
    }
    Question(int x, String q, String a, String b, String c, String d){
        this.quest = q;
        this.options = new Answer(x, a, b, c, d);
        this.numOfCorrectOptions = x;
    }

    public void addHint(String... hints){
        hint = new ArrayList<>();
        Collections.addAll(hint, hints);
        hasHint = true;
    }
    public boolean hasHint(){ return hasHint; }
    public List<String> getHint(){ return hint; }
    public String getQuest(){ return quest; }
    public Answer getOptions(){ return options; }
    public String getOptions2(){ return options.getOptions2(); };
    public int getNumOfCorrectOptions(){ return numOfCorrectOptions; }
    public boolean hasMultipleAnswers(){ return numOfCorrectOptions>1; }
    public String getSpecificOption(int index){ return options.getOption(index); }
    public String getCorrectOption(){ return options.getCorrectOption(); }
    public List<String> getCorrectOptions(){ return options.getCorrectOptions(); }
    public void shuffleOptions(){
        Collections.shuffle(options.getOptions());
    }


    public void print(){
        System.out.println(getQuest());
        options.printAnswers();
    }
    public void printABC(){
        System.out.println(getQuest());
        options.print();
    }
    public void printHint(){ System.out.println(hint);}
    public String toString(){
        StringBuilder output = new StringBuilder();
        output.append(quest);
        output.append("\n");
        output.append(options.toString());
        return output.toString();
    }
    public String toString2(){
        StringBuilder output = new StringBuilder();
        output.append(quest);
        output.append("\n");
        output.append(options.toString());
        if(hasHint){
            output.append("# of correct options: ");
            output.append(numOfCorrectOptions);
            output.append("\n");
            output.append("Hint: ");
            output.append(hint);
            output.append("\n");
        }else{
            output.append("Correct Option: ");
            output.append(options.getCorrectOption());
            output.append("\n");
        }
        return output.toString();
    }
}