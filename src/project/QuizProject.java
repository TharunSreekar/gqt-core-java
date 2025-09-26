/**
 * 
 */
package project;

/**
 * @author tharun
 * @category
 * @description: Quiz Project
 */

import java.util.Scanner;


class quizoperation {
    Scanner sc = new Scanner(System.in);

    String questions[];
    String options[][];
    char answers[];
    int prizes[];
    boolean audienceused = false;
    boolean fiftyused = false;
    int won = 0;

    // colors
    String reset = "\u001B[0m";
    String cyan = "\u001B[36m";
    String yellow = "\u001B[33m";
    String blue = "\u001B[34m";
    String green = "\u001B[32m";
    String purple = "\u001B[35m";
    String red = "\u001B[31m";
    String lifelinecolor = "\u001B[94m";

    void createquestions() {
        questions = new String[10];
        questions[0] = "Which of the following is not a Java keyword?";
        questions[1] = "What is the size of an int in Java?";
        questions[2] = "Which method is the entry point of any Java program?";
        questions[3] = "Which of the following is used to create an object in Java?";
        questions[4] = "Which of these is a valid identifier in Java?";
        questions[5] = "What is the default value of a boolean variable in Java?";
        questions[6] = "Which operator is used for comparison in Java?";
        questions[7] = "What does JVM stand for?";
        questions[8] = "Which of these is a loop structure in Java?";
        questions[9] = "Which access modifier makes a variable accessible in all classes?";

        options = new String[10][4];
        options[0][0] = "class";
        options[0][1] = "interface";
        options[0][2] = "extends";
        options[0][3] = "implement";

        options[1][0] = "8 bits";
        options[1][1] = "16 bits";
        options[1][2] = "32 bits";
        options[1][3] = "64 bits";

        options[2][0] = "start()";
        options[2][1] = "run()";
        options[2][2] = "main()";
        options[2][3] = "init()";

        options[3][0] = "class";
        options[3][1] = "new";
        options[3][2] = "this";
        options[3][3] = "void";

        options[4][0] = "2value";
        options[4][1] = "value_2";
        options[4][2] = "value-2";
        options[4][3] = "@value";

        options[5][0] = "true";
        options[5][1] = "false";
        options[5][2] = "0";
        options[5][3] = "null";

        options[6][0] = "=";
        options[6][1] = "==";
        options[6][2] = "!=";
        options[6][3] = "&&";

        options[7][0] = "Java Variable Machine";
        options[7][1] = "Java Virtual Memory";
        options[7][2] = "Java Virtual Machine";
        options[7][3] = "Java Verified Machine";

        options[8][0] = "if";
        options[8][1] = "switch";
        options[8][2] = "for";
        options[8][3] = "goto";

        options[9][0] = "public";
        options[9][1] = "private";
        options[9][2] = "protected";
        options[9][3] = "default";

        answers = new char[10];
        answers[0] = 'D';
        answers[1] = 'C';
        answers[2] = 'C';
        answers[3] = 'B';
        answers[4] = 'B';
        answers[5] = 'B';
        answers[6] = 'B';
        answers[7] = 'C';
        answers[8] = 'C';
        answers[9] = 'A';

        prizes = new int[10];
        prizes[0] = 1000;
        prizes[1] = 2000;
        prizes[2] = 3000;
        prizes[3] = 4000;
        prizes[4] = 5000;
        prizes[5] = 6000;
        prizes[6] = 7000;
        prizes[7] = 8000;
        prizes[8] = 9000;
        prizes[9] = 10000;
    }

    void rules() {
        System.out.println(cyan + "--------------------------------------------");
        System.out.println(yellow + " WELCOME TO THE JAVA QUIZ CHALLENGE 🎮");
        System.out.println(cyan + "--------------------------------------------");
        System.out.println(blue + " RULES:");
        System.out.println("1. You will be asked 10 questions.");
        System.out.println("2. Each correct answer earns you 10000 rupees.");
        System.out.println("3. If you answer incorrectly, the game ends.");
        System.out.println("4. If your answer is incorrect between Q1-Q5, you get nothing.");
        System.out.println("5. If your answer is incorrect between Q6-Q7, you get the amount till Q5.");
        System.out.println("6. If your answer is incorrect between Q8-Q10, you get the amount till Q7.");
        System.out.println("7. You have two lifelines: '50-50' and 'Audience poll'.");
        System.out.println("8. Each lifeline can be used only once.");
        System.out.println("9. If you quit, you take home the amount earned so far.");
        System.out.println("10. If you answer all questions correctly, you win the game.");
        System.out.println("--------------------------------------------"+reset);
        
    }

    void displayquestions() {
        for (int i = 0; i < 10; i++) {
            System.out.println("\n--------------------------------------------");
            System.out.println(yellow+"Q" + (i + 1) + ": " + questions[i]+reset);
            for (int j = 0; j < 4; j++) {
                System.out.println(cyan+(char) ('A' + j) + ". " + options[i][j]+reset);
            }
            System.out.print(yellow + " Lifelines: ");
            System.out.print("[1] Audience poll" + (audienceused ? red + " (used)" : ""));
            System.out.print(yellow + " | [2] 50-50" + (fiftyused ? red + " (used)" : ""));
            System.out.println(yellow + " | [3] Quit");
            System.out.print(cyan + "Your choice (A/B/C/D or 1/2/3): ");
            String input = sc.next();

            if (input.equals("3")) {
                System.out.println(purple + " You quit with ₹" + won);
                break;
            }

            if (input.equals("1")) {
                if (audienceused) {
                    System.out.println(red + " Audience poll already used!");
                    i--;
                    continue;
                }
                audienceused = true;
                showaudiencepoll(i);
                i--;
                continue;
            }

            if (input.equals("2")) {
                if (fiftyused) {
                    System.out.println(red + " 50-50 already used!");
                    i--;
                    continue;
                }
                fiftyused = true;
                showfiftyfifty(i);
                i--;
                continue;
            }

            if (input.equalsIgnoreCase(String.valueOf(answers[i]))) {
                won = prizes[i];
                System.out.println(green + " Correct! You now have ₹" + won);
            } else if (input.equalsIgnoreCase("A") || input.equalsIgnoreCase("B") ||
                       input.equalsIgnoreCase("C") || input.equalsIgnoreCase("D")) {
                System.out.println(red + " Wrong!");
                if (i < 5) won = 0;
                else if (i < 8) won = prizes[6];
                else won = prizes[6];
                System.out.println(red + " You take home ₹" + won);
                break;
            } else {
                System.out.println(red + " Invalid input!");
                i--;
            }
        }
    }

    void showaudiencepoll(int qindex) {
        char correctans = answers[qindex];
        System.out.println(lifelinecolor + " Audience Poll Results:");
        for (int j = 0; j < 4; j++) {
            char opt = (char) ('A' + j);
            int percent = (opt == correctans) ? 80 : (j == 0 ? 10 : (j == 1 ? 5 : 5));
            System.out.println(opt + ": " + percent + "%");
        }
    }

    void showfiftyfifty(int qindex) {
        System.out.println(lifelinecolor + " 50-50 Lifeline:");
        char correctans = answers[qindex];
        System.out.println(correctans + ". " + options[qindex][correctans - 'A']);
        for (int j = 0; j < 4; j++) {
            char opt = (char) ('A' + j);
            if (opt != correctans) {
                System.out.println(opt + ". " + options[qindex][j]);
                break;
            }
        }
    }

    void displayfinalresult() {
        System.out.println(purple + " Game Over!  you won ₹" + won);
    }
}

public class QuizProject {
    public static void main(String[] args) {
        quizoperation q = new quizoperation();
        q.createquestions();
        q.rules();
        q.displayquestions();
        q.displayfinalresult();
    }
}
