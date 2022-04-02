import java.util.List;

class Question{
    private String quest;
    private Answer options;
    private int numOfCorrectAnswers;

    Question(String q, String a){
        this.quest = q;
        this.options = new Answer(a);
        this.numOfCorrectAnswers = 1;
    }
    Question(int x, String q, String a, String b){
        this.quest = q;
        this.options = new Answer(x, a, b);
        this.numOfCorrectAnswers = x;
    }
    Question(int x, String q, String a, String b, String c){
        this.quest = q;
        this.options = new Answer(x, a, b, c);
        this.numOfCorrectAnswers = x;
    }
    Question(int x, String q, String a, String b, String c, String d){
        this.quest = q;
        this.options = new Answer(x, a, b, c, d);
        this.numOfCorrectAnswers = x;
    }

    public String getQuest(){ return quest; }
    public Answer getOptions(){ return options; }
    public boolean hasMultipleAnswers(){ return numOfCorrectAnswers>1; }
    public String getSpecificOption(int index){ return options.getOption(index);}
    public String getCorrectOption(){ return options.getCorrectOption(); }

    public void print(){
        System.out.println(getQuest());
        options.printAnswers();
    }
    public void printABC(){
        System.out.println(getQuest());
        options.print();
    }
    public void printHint(){ options.printCorrectAnswers();}
    public String toString(){
        StringBuilder output = new StringBuilder();
        output.append(quest);
        output.append("\n");
        output.append(options.toString());
        return output.toString();
    }
}