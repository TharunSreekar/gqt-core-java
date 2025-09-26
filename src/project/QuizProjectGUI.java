package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class QuizGUI extends JFrame implements ActionListener {
    // Data
    String[] questions;
    String[][] options;
    char[] answers;
    int[] prizes;
    boolean audienceUsed = false;
    boolean fiftyUsed = false;
    int won = 0;          
    int currentQ = 0;     

    // Components
    JLabel questionLabel, prizeLabel, statusLabel;
    JButton[] optionButtons = new JButton[4];
    JButton btnAudience, btnFifty, btnQuit;
    

    QuizGUI() {
        setTitle("Java Quiz Game ");
        setSize(760, 520);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(12, 12));

        // Top panel - prize info
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        prizeLabel = new JLabel("Prize: ₹0");
        prizeLabel.setFont(new Font("Arial", Font.BOLD, 18));
        topPanel.add(prizeLabel);
        add(topPanel, BorderLayout.NORTH);

        // Center - question + options
        JPanel centerPanel = new JPanel(new GridLayout(5, 1, 10, 10));
        questionLabel = new JLabel("Question will appear here");
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        questionLabel.setForeground(new Color(25, 25, 112));
        centerPanel.add(questionLabel);

        for (int i = 0; i < 4; i++) {
            optionButtons[i] = new JButton();
            optionButtons[i].setFont(new Font("Arial", Font.PLAIN, 14));
            optionButtons[i].addActionListener(this);
            optionButtons[i].setFocusPainted(false);
            centerPanel.add(optionButtons[i]);
        }
        add(centerPanel, BorderLayout.CENTER);

        
        JPanel bottomPanel = new JPanel(new BorderLayout());

        JPanel lifelinePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 16, 8));
        btnAudience = new JButton("Audience Poll");
        btnAudience.setBackground(new Color(135, 206, 250));
        btnFifty = new JButton("50-50");
        btnFifty.setBackground(new Color(152, 251, 152));
        btnQuit = new JButton("Quit");
        btnQuit.setBackground(new Color(255, 99, 71));
        btnAudience.addActionListener(this);
        btnFifty.addActionListener(this);
        btnQuit.addActionListener(this);

        lifelinePanel.add(btnAudience);
        lifelinePanel.add(btnFifty);
        lifelinePanel.add(btnQuit);
        bottomPanel.add(lifelinePanel, BorderLayout.NORTH);

        statusLabel = new JLabel("Welcome to the Java Quiz!", SwingConstants.CENTER);
        statusLabel.setFont(new Font("Arial", Font.ITALIC, 14));
        bottomPanel.add(statusLabel, BorderLayout.SOUTH);

        add(bottomPanel, BorderLayout.SOUTH);

        createQuestions();
        loadQuestion();
    }

    void createQuestions() {
        questions = new String[10];
        options = new String[10][4];
        answers = new char[10];
        prizes = new int[10];

        questions[0] = "Which of the following is not a Java keyword?";
        options[0] = new String[]{"class", "interface", "extends", "implement"};
        answers[0] = 'D';

        questions[1] = "What is the size of an int in Java?";
        options[1] = new String[]{"8 bits", "16 bits", "32 bits", "64 bits"};
        answers[1] = 'C';

        questions[2] = "Which method is the entry point of any Java program?";
        options[2] = new String[]{"start()", "run()", "main()", "init()"};
        answers[2] = 'C';

        questions[3] = "Which of the following is used to create an object in Java?";
        options[3] = new String[]{"class", "new", "this", "void"};
        answers[3] = 'B';

        questions[4] = "Which of these is a valid identifier in Java?";
        options[4] = new String[]{"2value", "value_2", "value-2", "@value"};
        answers[4] = 'B';

        questions[5] = "What is the default value of a boolean variable in Java?";
        options[5] = new String[]{"true", "false", "0", "null"};
        answers[5] = 'B';

        questions[6] = "Which operator is used for comparison in Java?";
        options[6] = new String[]{"=", "==", "!=", "&&"};
        answers[6] = 'B';

        questions[7] = "What does JVM stand for?";
        options[7] = new String[]{"Java Variable Machine", "Java Virtual Memory", "Java Virtual Machine", "Java Verified Machine"};
        answers[7] = 'C';

        questions[8] = "Which of these is a loop structure in Java?";
        options[8] = new String[]{"if", "switch", "for", "goto"};
        answers[8] = 'C';

        questions[9] = "Which access modifier makes a variable accessible in all classes?";
        options[9] = new String[]{"public", "private", "protected", "default"};
        answers[9] = 'A';

        for (int i = 0; i < 10; i++) {
            prizes[i] = (i + 1) * 1000; // 1000..10000
        }
    }

    void loadQuestion() {
        // If all questions are done, show final result
        if (currentQ >= questions.length) {
            JOptionPane.showMessageDialog(this, " Game Over! You won ₹" + won);
            System.exit(0);
        }

        // Reset any previous 50-50 disabling for new question
        for (JButton b : optionButtons) {
            b.setEnabled(true);
        }

        questionLabel.setText("Q" + (currentQ + 1) + ": " + questions[currentQ]);
        for (int i = 0; i < 4; i++) {
            optionButtons[i].setText((char) ('A' + i) + ". " + options[currentQ][i]);
        }
        statusLabel.setText("Choose your answer!");
    }

        int checkpointTakeHome(int qIndexWrong) {

    	if (qIndexWrong <= 4) {           
            return 0;
        } else if (qIndexWrong <= 6) {    
            return prizes[4];             
        } else {                          
            return prizes[6];             
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == btnQuit) {
            JOptionPane.showMessageDialog(this, "You quit with ₹" + won);
            System.exit(0);
            return;
        }

        if (src == btnAudience) {
            if (audienceUsed) {
                JOptionPane.showMessageDialog(this, "Audience Poll already used!");
                
                return;
            }
            audienceUsed = true;
            btnAudience.setBackground(Color.GRAY);
            btnAudience.setForeground(Color.WHITE);

            int correctIdx = answers[currentQ] - 'A';
            StringBuilder poll = new StringBuilder(" Audience Poll:\n");
            for (int i = 0; i < 4; i++) {
                int pct = (i == correctIdx) ? 80 : (i == 0 ? 10 : (i == 1 ? 5 : 5));
                poll.append((char) ('A' + i)).append(": ").append(pct).append("%\n");
            }
            JOptionPane.showMessageDialog(this, poll.toString());
            return;
        }

        if (src == btnFifty) {
            if (fiftyUsed) {
                JOptionPane.showMessageDialog(this, "50-50 already used!");
                
                return;
            }
            fiftyUsed = true;
            btnFifty.setBackground(Color.GRAY);
            btnFifty.setForeground(Color.WHITE);

            int correctIdx = answers[currentQ] - 'A';
            List<Integer> wrongs = new ArrayList<>();
            for (int i = 0; i < 4; i++) if (i != correctIdx) wrongs.add(i);
            Collections.shuffle(wrongs);

            // Disable two wrong options
            optionButtons[wrongs.get(0)].setEnabled(false);
            optionButtons[wrongs.get(1)].setEnabled(false);

            statusLabel.setText("50-50 used: Two wrong options removed.");
            return;
        }

        // Option buttons 
        for (int i = 0; i < 4; i++) {
            if (src == optionButtons[i]) {
                char choice = (char) ('A' + i);
                if (choice == answers[currentQ]) {
                    won = prizes[currentQ]; 
                    prizeLabel.setText("Prize: ₹" + won);
                    statusLabel.setText(" Correct! You now have ₹" + won);
                    prizeLabel.setForeground(new Color(218, 165, 32));
                    currentQ++;             
                    SwingUtilities.invokeLater(this::loadQuestion);
                } else {
                    int takeHome = checkpointTakeHome(currentQ);
                    statusLabel.setText(" Wrong! Correct answer: " + answers[currentQ]);
                    JOptionPane.showMessageDialog(
                            this,
                            "Wrong answer on Q" + (currentQ + 1) + ".\n" +
                            "You take home ₹" + takeHome + "."
                    );
                    System.exit(0);
                }
                break;
            }
        }
    }
}

public class QuizProjectGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new QuizGUI().setVisible(true));
    }
}
