import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ztest {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        String path = "/Users/suren/Desktop/CitizenshipTest/Questions.txt";
        List<Exam> exams = new ArrayList<>();


        createQuestions(path);
        //prePreparation(exams);
        //begin(sc, exams);
    
    }
    public static void createQuestions(String p){
        String line = "";
        try{
            BufferedReader br = new BufferedReader(new FileReader(p));
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void prePreparation(List<Exam> exams){
        //Declaring Exams
        Exam e1 = new Exam(12);
        Exam e2 = new Exam(35);
        Exam e3 = new Exam(10);
        Exam e4 = new Exam(30);
        Exam e5 = new Exam(13);
        Exam e6 = new Exam(100);

        // Contains all Questions
        exams.add(e1);
        exams.add(e2);
        exams.add(e3);
        exams.add(e4);
        exams.add(e5);
        exams.add(e6);


        // Question q = new Question(, "", "", "", "");
        // American Government
        // Declaring Questions for Part A
        Question q1 = new Question(1, "What is the supreme law of the land?", "The Constution", "The President", "You must not kill");
        Question q2 = new Question(1, "What does the Constution do?", "Sets up the Government", "Protect the Government", "Safeguard the President");
        Question q3 = new Question(1, "The idea of self-government is in the first three words of the Constitution. What are these words?", "We the people", "We are one nation", "One love");
        Question q4 = new Question(1, "What is an amendment?", "A change (to the Constitution)", "An overhaul (to the Constitution)");
        Question q5 = new Question(1, "What do we call the first ten amendments to the Constitution?", "The Bill of Rights", "The 10 commandments");
        Question q6 = new Question(1, "What is one right or freedom from the First Amendment?", "speech", "Purge", "Chop up");
        Question q7 = new Question(1, "How many amendments does the Constitution have?", "twenty-seven (27)", "twenty-five (25)", "twenty-six (26)");
        Question q8 = new Question(1, "What did the Declaration of Independence do?", "Announced our Independence (from Great Britain)", "Announced our Dominance (from Great Britain)", "Do not choose this option!");
        Question q9 = new Question(2, "What are 2 rights in the Declaration of Indpendence?", "Life", "Liberty", "Luxury");
        Question q10 = new Question(1, "What is freedom of religion?", "You can practice any Religion, or not practice a Religion", "You must practice a Religion", "The right to berate other Religions");
        Question q11 = new Question(1, "What is the economic system in the United States?", "Capitalist economy", "Socialist economy", "Budget economy");
        Question q12 = new Question(1, "What is the 'rule of law'?", "Everyone must follow the law", "We make our own rules", "You can choose to follow the law");
        
        // Declaring Questions for Part B
        Question q13 = new Question(1, "Name one branch or part of the government.", "Legislative", "Prejudical", "The Ambassadors");
        Question q14 = new Question(1, "What stops one branch of government from becoming too powerful?", "checks & balances", "The Goveernment cannot be stopped", "Guns");
        Question q15 = new Question(1, "Who is in charge of the executive branch?", "The President", "The Vice President", "The Military");
        Question q16 = new Question(1, "Who makes federal laws?", "Congress", "The President", "The Military", "Donald Trump");
        Question q17 = new Question(2, "What are the two parts of the U.S. Congress?", "The Senate", "The House (of Representatives)", "Parliment");
        Question q18 = new Question(1, "How many U.S. Senators are there?", "One hundred (100)", "Fifty (50)", "Sixty nine (69)", "Four hundred & twenty (420)");
        Question q19 = new Question(1, "We elect a U.S. Senator for how many years?", "six (6)", "seven (7)", "eight(8)", "five(5)");
        Question q20 = new Question(1, "Who is one of your state's U.S. Senators now?", "Kirsten Gillibrand", "Adam Sandler", "Snoop Dogg", "2pac");
        Question q21 = new Question(1, "The House of Representatives has how many voting members?", "four hundred thirty-five (435)", "five hundred thirty-four (534)", "four hundred fifty-three (453)");
        Question q22 = new Question(1, "We elect a U.S. Representative for how many years?", "two (2)", "one (1)", "three (3)", "four (4)");
        Question q23 = new Question(1, "Name your U.S. Representative.", "TO DO", "TBA");
        Question q24 = new Question(1, "Who does a U.S. Senator represent?", "all people of the state", "all rich people in NY", "Business owners");
        Question q25 = new Question(1, "Why do some states have more Representatives than other states?", "(because of) the state's population", "(because) some states have more money", "(because) some states have more rich people");
        Question q26 = new Question(1, "We elect a President for how many years?", "four (4)", "five (5)", "three (3)", "N/A");
        Question q27 = new Question(1, "In what month do we vote for President?", "November", "December", "January", "February");
        Question q28 = new Question(1, "What is the name of the President of the United States now?", "Joe Biden", "Donald Trump", "Barack Obama", "John Cena");
        Question q29 = new Question(1, "What is the name of the Vice President of the United States now?", "Kamala Harris", "Hilary Clinton", "Donald Trump", "Kathy Hochul");
        Question q30 = new Question(1, "If the President can no longer serve, who becomes President?", "The Vice President", "A random US senator", "The Mayor of NY");
        Question q31 = new Question(1, "If both the President and the Vice President can no longer serve, who becomes President?", "The Speaker of the House", "The Chief of Military", "No one");
        Question q32 = new Question(1, "Who is the Commander in Chief of the military?", "The President", "The Vice President", "Donald Trump");
        Question q33 = new Question(1, "Who signs bills to become laws?", "The President", "The Vice President", "Donald Trump");
        Question q34 = new Question(1, "Who vetoes bills?", "The President", "The Vice President", "Donald Trump");
        Question q35 = new Question(1, "What does the President's Cabinet do?", "Advises the President", "Schedule meetings for the President", "Tell him what to do");
        Question q36 = new Question(2, "What are two Cabinet-level positions?", "Attorney General", "Vice President", "Opposition leader", "Speaker");
        Question q37 = new Question(1, "What does the judicial branch do?", "Reviews laws", "write laws");
        Question q38 = new Question(1, "What is the highest court in the United States?", "The Supreme Court", "The High Court", "The Magistrate's Court");
        Question q39 = new Question(1, "How many justices are on the Supreme Court?", "nine (9)", "ten (10)", "eight (8)", "seven (7)");
        Question q40 = new Question(1, "Who is the Chief Justice of the United States now?", "John Roberts", "John Cena", "John Adams", "Jane Doe");
        Question q41 = new Question(1, "Under our Constitution, some powers belong to the federal government. What is one power of the federal government?", "to print money", "to raise gas prices", "to raise taxes");
        Question q42 = new Question(1, "Under our Constitution, some powers belong to the states. What is one power of the states?", "give a driver's license", "Raise the minimum wage", "Provide money for the people");
        Question q43 = new Question(1, "Who is the Governor of your state now?", "Kathy Hochul", "Hilary Clinton", "Donald Trump", "Kamala Harris");
        Question q44 = new Question(1, "What is the capital of your state?", "Albany", "Washington DC", "Manhattan");
        Question q45 = new Question(2, "What are the two major political parties in the United States?", "Democratic", "Republican", "PPP/C", "PNC/R");
        Question q46 = new Question(1, "What is the political party of the President now?", "Democratic", "Republican", "PPP/C", "PNC/R");
        Question q47 = new Question(1, "What is the name of the Speaker of the House of Representatives now?", "Nancy Pelosi", "Donald Trump", "Kathy Hochul");
    
        // Declaring Questions for Part C
        Question q48 = new Question(1, "There are four amendments to the Constitution about who can vote. Describe one of them.", "Any citizen can vote. (Women and men can vote.)", "You must pay to vote", "You can vote at any age");
        Question q49 = new Question(1, "What is one responsibility that is only for United States citizens?", "vote in a federal election", "serve in the military", "pay taxes");
        Question q50 = new Question(1, "Name one right only for United States citizens.", "vote in a federal election", "paying taxes", "religion");
        Question q51 = new Question(2, "What are two rights of everyone living in the United States?", "freedom of speech", "freedom of religion", "tax evasion", "robbing & stealing");
        Question q52 = new Question(1, "What do we show loyalty to when we say the Pledge of Allegiance?", "the United States", "the President", "the Government");
        Question q53 = new Question(1, "What is one promise you make when you become a United States citizen?", "obey the laws of the United States", "avoid paying taxes", "work very hard");
        Question q54 = new Question(1, "How old do citizens have to be to vote for President?", "eighteen (18) and older", "twenty-one (21) and older", "sixty-five (65) and older");
        Question q55 = new Question(2, "What are two ways that Americans can participate in their democracy?", "vote", "join a political party", "spend money", "work hard");
        Question q56 = new Question(1, "When is the last day you can send in federal income tax forms?", "April 15", "January 30", "March 4");
        Question q57 = new Question(1, "When must all men register for the Selective Service?", "at age eighteen (18)", "at age twenty-one (21)", "Men do not HAVE to register for the Selective Service");

        // American History
        // Declaring Questions for
        Question q58 = new Question(1, "What is one reason colonists came to America?", "freedom", "money", "gold");
        Question q59 = new Question(1, "Who lived in America before the Europeans arrived?", "American Indians", "Mexicans", "Portugeuse");
        Question q60 = new Question(1, "What group of people was taken to America and sold as slaves?", "Africans", "Mexicans", "Guyanese", "Brazilians");
        Question q61 = new Question(1, "Why did the colonists fight the British?", "because of high taxes (taxation without representation)", "Because they wanted to", "Because the British wanted money");
        Question q62 = new Question(1, "Who wrote the Declaration of Independence?", "Thomas Jefferson", "George Washington", "Vince McMahon", "Kanye West");
        Question q63 = new Question(1, "When was the Declaration of Independence adopted?", "July 4, 1776", "July 4, 1767", "July 4, 1677");
        Question q64 = new Question(3, "There were 13 original states. Name three.", "New York", "New Jersey", "Connecticut", "Texas");
        Question q65 = new Question(1, "What happened at the Constitutional Convention?", "The Constitution was written", "A Party was celebrated", "The Constitution was destroyed");
        Question q66 = new Question(1, "When was the Constitution written?", "1787", "1966", "1777");
        Question q67 = new Question(1, "The Federalist Papers supported the passage of the U.S. Constitution. Name one of the writers.", "John Jay", "Chris Rock", "Kevin Hart");
        Question q68 = new Question(1, "What is one thing Benjamin Franklin is famous for?", "U.S. diplomat", "World's richest person", "Inventing electricity");
        Question q69 = new Question(1, "Who is the 'Father of Our Country'?", "George Washingtion", "George Bush", "Abraham Lincoln");
        Question q70 = new Question(1, "Who was the first President?", "George Washingtion", "George Bush", "Abraham Lincoln");
        Question q71 = new Question(1, "What territory did the United States buy from France in 1803?", "Louisiana", "Georgia", "Texas");
        Question q72 = new Question(1, "Name one war fought by the United States in the 1800s.", "Civil War", "Cold War", "World War II");
        Question q73 = new Question(1, "Name the U.S. war between the North and the South.", "Civil War", "Cold War", "World War II");
        Question q74 = new Question(1, "Name one problem that led to the Civil War.", "Slavery", "Money", "Marriage");
        Question q75 = new Question(1, "What was one important thing that Abraham Lincoln did?", "freed the slaves (Emancipation Proclamation)", "Lowered tax rates", "Raised the minimum wage");
        Question q76 = new Question(1, "What did the Emancipation Proclamation do?", "Freed the slaved", "Lowered tax rates", "Raised the minimum wage");
        Question q77 = new Question(1, "What did Susan B. Anthony do?", "Fought for women's rights", "Fight for higher wages", "Freed the slaves");
        Question q78 = new Question(1, "Name one war fought by the United States in the 1900s.", "World War I", "Cold War", "Japanese War");
        Question q79 = new Question(1, "Who was President during World War I?", "Woodrow Wilson", "Abraham Lincoln", "George Washington");
        Question q80 = new Question(1, "Who was President during the Great Depression and World War II?", "Franklin Roosevelt", "Abraham Lincoln", "George Washington");
        Question q81 = new Question(3, "Who did the United States fight in World War II?(\nSelect all that apply)", "Japan", "Germany", "Italy");
        Question q82 = new Question(1, "Before he was President, Eisenhower was a general. What war was he in?", "World War II", "Cold War", "Civil War");
        Question q83 = new Question(1, "During the Cold War, what was the main concern of the United States?", "Communism", "Money", "Russian intel");
        Question q84 = new Question(1, "What movement tried to end racial discrimination?", "civil rights (movement)", "women's movement");
        Question q85 = new Question(1, "What did Martin Luther King, Jr. do?", "fought for civil rights", "fought for presidency", "fought for the country");
        Question q86 = new Question(1, "What major event happened on September 11, 2001, in the United States?", "Terrorist attacked the United States", "Russia attacked the U.S.", "Afghanistan attacked the U.S.");
        Question q87 = new Question(1, "Name one American Indian tribe in the United States.", "Arawak", "Jew", "Buddhist");
        
        // Integrated Civics
        // Declaring Questions for
        Question q88 = new Question(1, "Name one of the two longest rivers in the United States.", "Mississippi", "East river");
        Question q89 = new Question(1, "What ocean is on the West Coast of the United States?", "Pacific Ocean", "Atlantic Ocean", "Indian", "Arctic");
        Question q90 = new Question(1, "What ocean is on the East Coast of the United States?", "Atlantic Ocean", "Pacific Ocean", "Indian", "Arctic");
        Question q91 = new Question(1, "Name one U.S. territory.", "Puerto Rico", "Mexico", "Alaska");
        Question q92 = new Question(1, "Name one state that borders Canada.", "New York", "New Jersey", "Tennessee");
        Question q93 = new Question(1, "Name one state that borders Mexico", "Texas", "New York", "Georgia");
        Question q94 = new Question(1, "What is the capital of the United States?", "Washington, D.C", "Albany", "Manhattan");
        Question q95 = new Question(1, "Where is the Statue of Liberty?", "New York", "Long Island", "Upstate New York");
        Question q96 = new Question(1, "Why does the flag have 13 stripes?", "because there were 13 original colonies", "because there were 13 original states", "because there were 13 original cities");
        Question q97 = new Question(1, "Why does the flag have 50 stars?", "because each star represents a state", "because the U.S likes the number 50");
        Question q98 = new Question(1, "What is the name of the national anthem?", "The Star-Sprangled Banner", "The-Sprangled Star Banner");
        Question q99 = new Question(1, "When do we celebrate Independence Day?", "July 4", "April 1", "September 11");
        Question q100 = new Question(2, "Name two national U.S. holidays.", "Memorial Day", "Thanksgiving", "April Fools");

        // Adding Hints to Questions
        // q.addHint("", "", "");
        q3.addHint("sets up the government", " defines the government", "protects basic rights of Americans");
        q4.addHint("A change (to the Constitution)", "An addition (to the Constitution)");
        q5.addHint("Speech", "Religion", "Assesmbly", "Press", "Petition the Government");
        q8.addHint("announced our independence (from Great Britain", "declared our independence (from Great Britain)", "said that the United States is free (from Great Britain)");
        q9.addHint("life", "Liberty", "Pursuit of Happiness");
        q11.addHint("Capialist economy", "Market Economy");
        q12.addHint("Everyone must follow the law", "Leaders must obey the law", "Government must obey the law", "No one is above the law");
        q13.addHint("Congress", "Legislative", "President", "Executive", "The Courts", "Judicial");
        q16.addHint("Congress", "Senate & House (of Representatives)", "(U.S. or national) legislature");
        q17.addHint("The Senate", "The House (of Representatives)");
        q25.addHint("(because of) the state's population", "(because) they have more people", "(because) some states have more people");
        q36.addHint("Attorney General", "Vice President");
        q42.addHint("give a driver's license", "provide schooling and education", "provide protection (police)");
        q48.addHint("Any citizen can vote. (Women and men can vote.)", "Citizens eighteen (18) and older (can vote)", "You don't have to pay (a poll tax) to vote");
        q49.addHint("serve on a jury", "vote in a federal election");
        q51.addHint("freedom of expression", "freedom of speech", "freedom of religion", "the right to bear arms");
        q52.addHint("the United States", "the flag");
        q53.addHint("obey the laws of the United States", "give up loyalty to other countries", "serve in the U.S. military (if needed)");
        q55.addHint("vote", "join a political party", "help with a campaign");
        q57.addHint("at age eighteen (18)", "between eighteen (18) and twenty-six (26");
        q58.addHint("freedom", "political liberty", "escape persecution");
        q59.addHint("American Indians", "Native Americans");
        q61.addHint("because of high taxes (taxation without representation)", "because the British army stayed in their houses (boarding, quartering)", "because they didn’t have self-government");
        q64.addHint("New York", "New Jersey", "Connecticut", "North Carolina", "South Carolina");
        q67.addHint("John Jay", "James Madison", "Alexander Hamilton");
        q68.addHint("U.S. diplomat", "oldest member of the Constitutional Convention", "first Postmaster General of the United States");
        q72.addHint("Civil War", "Cold War", "Spanish-American War");
        q73.addHint("the Civil War", "the War between the States");
        q74.addHint("Slavery", "Economic Resasons", "States' rights");
        q75.addHint("freed the slaves (Emancipation Proclamation)", "saved (or preserved) the Union", "led the United States during the Civil War");
        q78.addHint("World War I", "World War II", "Korean War", "Veitnam War", "(Persian) Gulf War");
        q81.addHint("Japan", "Germany", "Italy");
        q85.addHint("fought for civil rights", "worked for equality for all Americans");
        q87.addHint("Arawak", "Cheyenne", "Shawnee", "Mohegan", "Huron");
        q88.addHint("Missouori", "Mississippi");
        q91.addHint("Puerto Rico", "U.S. Virgin Islands", "American Samoa", "Northern Mariana Islands", "Guam");
        q92.addHint("New York", "Alaska", "New Hampshire");
        q93.addHint("texas", "California", "Arizona");
        q100.addHint("New Years's Day", "President's Day", "memorial Day", "Independence Day", "Labor Day", "Christmas", "Thanksgiving");

        // Adding questions to Exams
        e1.addQuestion(q1);
        e1.addQuestion(q2);
        e1.addQuestion(q3);
        e1.addQuestion(q4);
        e1.addQuestion(q5);
        e1.addQuestion(q6);
        e1.addQuestion(q7);
        e1.addQuestion(q8);
        e1.addQuestion(q9);
        e1.addQuestion(q10);
        e1.addQuestion(q11);
        e1.addQuestion(q12);

        e2.addQuestion(q13);
        e2.addQuestion(q14);
        e2.addQuestion(q15);
        e2.addQuestion(q16);
        e2.addQuestion(q17);
        e2.addQuestion(q18);
        e2.addQuestion(q19);
        e2.addQuestion(q20);
        e2.addQuestion(q21);
        e2.addQuestion(q22);
        e2.addQuestion(q23);
        e2.addQuestion(q24);
        e2.addQuestion(q25);
        e2.addQuestion(q26);
        e2.addQuestion(q27);
        e2.addQuestion(q28);
        e2.addQuestion(q29);
        e2.addQuestion(q30);
        e2.addQuestion(q31);
        e2.addQuestion(q32);
        e2.addQuestion(q33);
        e2.addQuestion(q34);
        e2.addQuestion(q35);
        e2.addQuestion(q36);
        e2.addQuestion(q37);
        e2.addQuestion(q38);
        e2.addQuestion(q39);
        e2.addQuestion(q40);
        e2.addQuestion(q41);
        e2.addQuestion(q42);
        e2.addQuestion(q43);
        e2.addQuestion(q44);
        e2.addQuestion(q45);
        e2.addQuestion(q46);
        e2.addQuestion(q47);

        e3.addQuestion(q48);
        e3.addQuestion(q49);
        e3.addQuestion(q50);
        e3.addQuestion(q51);
        e3.addQuestion(q52);
        e3.addQuestion(q53);
        e3.addQuestion(q54);
        e3.addQuestion(q55);
        e3.addQuestion(q56);
        e3.addQuestion(q57);

        e4.addQuestion(q58);
        e4.addQuestion(q59);
        e4.addQuestion(q60);
        e4.addQuestion(q61);
        e4.addQuestion(q62);
        e4.addQuestion(q63);
        e4.addQuestion(q64);
        e4.addQuestion(q65);
        e4.addQuestion(q66);
        e4.addQuestion(q67);
        e4.addQuestion(q68);
        e4.addQuestion(q69);
        e4.addQuestion(q70);
        e4.addQuestion(q71);
        e4.addQuestion(q72);
        e4.addQuestion(q73);
        e4.addQuestion(q74);
        e4.addQuestion(q75);
        e4.addQuestion(q76);
        e4.addQuestion(q77);
        e4.addQuestion(q78);
        e4.addQuestion(q79);
        e4.addQuestion(q80);
        e4.addQuestion(q81);
        e4.addQuestion(q82);
        e4.addQuestion(q83);
        e4.addQuestion(q84);
        e4.addQuestion(q85);
        e4.addQuestion(q86);
        e4.addQuestion(q87);

        e5.addQuestion(q88);
        e5.addQuestion(q89);
        e5.addQuestion(q90);
        e5.addQuestion(q91);
        e5.addQuestion(q92);
        e5.addQuestion(q93);
        e5.addQuestion(q94);
        e5.addQuestion(q95);
        e5.addQuestion(q96);
        e5.addQuestion(q97);
        e5.addQuestion(q98);
        e5.addQuestion(q99);
        e5.addQuestion(q100);

        e6.addQuestion(q1);
        e6.addQuestion(q2);
        e6.addQuestion(q3);
        e6.addQuestion(q4);
        e6.addQuestion(q5);
        e6.addQuestion(q6);
        e6.addQuestion(q7);
        e6.addQuestion(q8);
        e6.addQuestion(q9);
        e6.addQuestion(q10);
        e6.addQuestion(q11);
        e6.addQuestion(q12);
        e6.addQuestion(q13);
        e6.addQuestion(q14);
        e6.addQuestion(q15);
        e6.addQuestion(q16);
        e6.addQuestion(q17);
        e6.addQuestion(q18);
        e6.addQuestion(q19);
        e6.addQuestion(q20);
        e6.addQuestion(q21);
        e6.addQuestion(q22);
        e6.addQuestion(q23);
        e6.addQuestion(q24);
        e6.addQuestion(q25);
        e6.addQuestion(q26);
        e6.addQuestion(q27);
        e6.addQuestion(q28);
        e6.addQuestion(q29);
        e6.addQuestion(q30);
        e6.addQuestion(q31);
        e6.addQuestion(q32);
        e6.addQuestion(q33);
        e6.addQuestion(q34);
        e6.addQuestion(q35);
        e6.addQuestion(q36);
        e6.addQuestion(q37);
        e6.addQuestion(q38);
        e6.addQuestion(q39);
        e6.addQuestion(q40);
        e6.addQuestion(q41);
        e6.addQuestion(q42);
        e6.addQuestion(q43);
        e6.addQuestion(q44);
        e6.addQuestion(q45);
        e6.addQuestion(q46);
        e6.addQuestion(q47);
        e6.addQuestion(q48);
        e6.addQuestion(q49);
        e6.addQuestion(q50);
        e6.addQuestion(q51);
        e6.addQuestion(q52);
        e6.addQuestion(q53);
        e6.addQuestion(q54);
        e6.addQuestion(q55);
        e6.addQuestion(q56);
        e6.addQuestion(q57);
        e6.addQuestion(q58);
        e6.addQuestion(q59);
        e6.addQuestion(q60);
        e6.addQuestion(q61);
        e6.addQuestion(q62);
        e6.addQuestion(q63);
        e6.addQuestion(q64);
        e6.addQuestion(q65);
        e6.addQuestion(q66);
        e6.addQuestion(q67);
        e6.addQuestion(q68);
        e6.addQuestion(q69);
        e6.addQuestion(q70);
        e6.addQuestion(q71);
        e6.addQuestion(q72);
        e6.addQuestion(q73);
        e6.addQuestion(q74);
        e6.addQuestion(q75);
        e6.addQuestion(q76);
        e6.addQuestion(q77);
        e6.addQuestion(q78);
        e6.addQuestion(q79);
        e6.addQuestion(q80);
        e6.addQuestion(q81);
        e6.addQuestion(q82);
        e6.addQuestion(q83);
        e6.addQuestion(q84);
        e6.addQuestion(q85);
        e6.addQuestion(q86);
        e6.addQuestion(q87);
        e6.addQuestion(q88);
        e6.addQuestion(q89);
        e6.addQuestion(q90);
        e6.addQuestion(q91);
        e6.addQuestion(q92);
        e6.addQuestion(q93);
        e6.addQuestion(q94);
        e6.addQuestion(q95);
        e6.addQuestion(q96);
        e6.addQuestion(q97);
        e6.addQuestion(q98);
        e6.addQuestion(q99);
        e6.addQuestion(q100);

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
                }else{
                    System.out.print("Hint: " + q.getCorrectOption());
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
                }else{
                    System.out.print("Hint: " + q.getCorrectOption());
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
                System.out.print("Incorrect\nHint: ");
                q.printHint();    
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
                    q.printHint();
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
                    Exam e = exams.get(5);
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
                    e = exams.get(5);
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
                    score = administerExam(exams.get(5), s, 10);
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