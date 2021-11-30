import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JeopardyGame implements ActionListener {
  
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

  JeopardyGame(){

    userName.setBounds(0,0,650,50);
    userName.setFont(new Font("Ink Free",Font.BOLD,25));
    userName.setHorizontalAlignment(userName.CENTER);
    
    
    JFrame frame = new JFrame("Group 4's Jeopardy Game");
    frame.setLayout(null);
    frame.setSize(650,650);
    frame.add(userName);

    JButton ans1 = new JButton("A");
    ans1.setBounds(0,100,100,100);
    frame.add(ans1);

    JButton ans2 = new JButton("B");
    ans2.setBounds(0,100,100,100);
    frame.add(ans2);

    JButton ans3 = new JButton("C");
    ans3.setBounds(0,100,100,100);
    frame.add(ans3);

    JButton ans4 = new JButton("D");
    ans4.setBounds(0,100,100,100);
    frame.add(ans4);

    JButton next = new JButton("Next Question");
    next.setBounds(0,100,100,100);
    frame.add(next);

    JButton exit = new JButton("Exit");
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
    JLabel answer_labelB = new JLabel();
    JLabel answer_labelC = new JLabel();
    JLabel answer_labelD = new JLabel();

    ans1.addActionListener(this);
    ans2.addActionListener(this);
    ans3.addActionListener(this);
    ans4.addActionListener(this);
    next.addActionListener(this);
    exit.addActionListener(this);
    userName.addActionListener(this);
    

    frame.setVisible(true);
  }
  public void nextQuestion(){

  }

  public void actionPerformed(ActionEvent ae){
    if(ae.getActionCommand().equals("Next Question"));
    
  }
  public void displayAnswer(){

  }
  public void results(){

  }
}