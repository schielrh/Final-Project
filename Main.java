//@author Ryan Schiell, Andrew Edelen, Luke Estey, and Jacob Schloemer
//@version 

import javax.swing.*;

class Main {
 public static void main(String[] args) {
   SwingUtilities.invokeLater(new Runnable() {
     public void run() {
   new JeopardyGame();
     }
   });
 }
}