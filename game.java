//@author Ryan Schiell, Andrew Edelen, Luke Estey, and Jacob Schloemer

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//jeopardy game class is created
class JeopardyGame implements ActionListener {

  JTextField userName;
  JLabel userWelcome;
  JLabel category;
  JLabel score;
  JLabel label1;
  JButton ans1;
  JButton ans2;
  JButton ans3;
  JButton ans4;
  JButton next;
  JButton exit;

//here the game is formatted using swing GUI elements
  JeopardyGame(){

    userName.setBounds(0,0,650,50);
    userName.setFont(new Font("Ink Free",Font.BOLD,25));
    userName.setHorizontalAlignment(userName.CENTER);
    
    
    JFrame frame = new JFrame("Group 4's Jeopardy Game");
    frame.setLayout(null);
    frame.setSize(450,450);
    frame.add(userName);

    JButton ans1 = new JButton();
    ans1.setText("A");
    ans1.setBounds(0,100,100,100);
    frame.add(ans1);

    JButton ans2 = new JButton();
    ans2.setText("B");
    ans2.setBounds(0,200,100,100);
    frame.add(ans2);

    JButton ans3 = new JButton();
    ans3.setText("C");
    ans3.setBounds(0,300,100,100);
    frame.add(ans3);

    JButton ans4 = new JButton();
    ans4.setText("D");
    ans4.setBounds(0,400,100,100);
    frame.add(ans4);

    JButton next = new JButton();
    next.setText("Next Question");
    next.setBounds(0,100,100,100);
    frame.add(next);

    JButton exit = new JButton();
    exit.setText("Exit");
    exit.setBounds(0,100,100,100);
    frame.add(exit);

    JLabel score = new JLabel("Score: ");
    frame.add(score);
    JLabel category = new JLabel("Category: ");
    frame.add(category);
    JLabel userWelcome = new JLabel("Welcome to Group 4's Jeopardy game!");
    frame.add(userWelcome);

    JLabel label1 = new JLabel("");
    frame.add(label1);

    JLabel answer_labelA = new JLabel();
    answer_labelA.setBounds(125,100,400,100);
    answer_labelA.setFont(new Font("Calibri", Font.PLAIN,35));
    JLabel answer_labelB = new JLabel();
    answer_labelB.setBounds(125,200,400,100);
    answer_labelB.setFont(new Font("Calibri", Font.PLAIN,35));
    JLabel answer_labelC = new JLabel();
    answer_labelC.setBounds(125,300,400,100);
    answer_labelC.setFont(new Font("Calibri", Font.PLAIN,35));
    JLabel answer_labelD = new JLabel();
    answer_labelD.setBounds(125,400,400,100);
    answer_labelD.setFont(new Font("Calibri", Font.PLAIN,35));

    frame.add(answer_labelA);
    frame.add(answer_labelB);
    frame.add(answer_labelC);
    frame.add(answer_labelD);

    ans1.addActionListener(this);
    ans2.addActionListener(this);
    ans3.addActionListener(this);
    ans4.addActionListener(this);
    next.addActionListener(this);
    exit.addActionListener(this);
    userName.addActionListener(this);
    

    frame.setVisible(true);

    questions = new ArrayList<Questions>();
    filename = "trivia.txt";

    try{
      FileReader file;
      File = new FileReader("questions.txt");
      BufferedReader = new BufferedReader(file);


      while (reader.ready()){
        question = reader.readLine();
        System.out.println(question);
      }
      reader.close();
    } catch (IOException exception){
    System.out.println("An error occurred: " + exception);
  }
  public void actionPerformed(Action Event ae){
    if(ae.getActionCommand.equals())
  }
  

  
}