package Lab9.Ex4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeController {
    private TicTacToe t1;
    private int xCount = 0;
    private int oCount = 0;
    private String startGame = " ";
    public int b1=10;
    public int b2=10;
    public int b3=10;
    public int b6=10;
    public int b7=10;
    public int b8=10;
    public int b11=10;
    public int b12=10;
    public int b13=10;



    public TicTacToeController(TicTacToe t1) {
        this.t1 = t1;
        t1.addBtn1Listener(new BTN1());
        t1.addBtn2Listener(new BTN2());
        t1.addBtn3Listener(new BTN3());
        t1.addBtn6Listener(new BTN6());
        t1.addBtn7Listener(new BTN7());
        t1.addBtn8Listener(new BTN8());
        t1.addBtn11Listener(new BTN11());
        t1.addBtn12Listener(new BTN12());
        t1.addBtn13Listener(new BTN13());
        t1.addExitListener(new Exitbtn());
        t1.addResetListener(new ResetBtn());
    }


    private void choosePlayer() {
        if (startGame.equalsIgnoreCase(" ")) {
            startGame = "X";
        } else if(startGame.equalsIgnoreCase("X"))
        {
            startGame="O";
        }
        else startGame="X";
    }

    class BTN1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            choosePlayer();
            if(startGame.equalsIgnoreCase("X")) b1=1;
            else b1=0;
            t1.setBTN1(startGame);
            chooseWinner();
        }
    }

    class BTN2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            choosePlayer();
            if(startGame.equalsIgnoreCase("X")) b2=1;
            else b2=0;
            t1.setBTN2(startGame);
            chooseWinner();
        }
    }

    class BTN3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            choosePlayer();
            if(startGame.equalsIgnoreCase("X")) b3=1;
            else b3=0;
            t1.setBTN3(startGame);
            chooseWinner();
        }
    }

    class BTN6 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            choosePlayer();
            if(startGame.equalsIgnoreCase("X")) b6=1;
            else b6=0;
            t1.setBTN6(startGame);
            chooseWinner();
        }
    }

    class BTN7 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            choosePlayer();
            if(startGame.equalsIgnoreCase("X")) b7=1;
            else b7=0;
            t1.setBTN7(startGame);
            chooseWinner();
        }
    }

    class BTN8 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            choosePlayer();
            if(startGame.equalsIgnoreCase("X")) b8=1;
            else b8=0;
            t1.setBTN8(startGame);
            chooseWinner();
        }
    }

    class BTN11 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            choosePlayer();
            if(startGame.equalsIgnoreCase("X")) b11=1;
            else b11=0;
            t1.setBTN11(startGame);
            chooseWinner();
        }
    }

    class BTN12 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            choosePlayer();
            if(startGame.equalsIgnoreCase("X")) b12=1;
            else b12=0;
            t1.setBTN12(startGame);
            chooseWinner();
        }
    }

    class BTN13 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            choosePlayer();
            if(startGame.equalsIgnoreCase("X")) b13=1;
            else b13=0;
            t1.setBTN13(startGame);
            chooseWinner();
        }
    }

    class Exitbtn implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Exit");
            if (JOptionPane.showConfirmDialog(frame, "Conform You want to exit", "Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
            {
              System.exit(0);
            }

        }
    }

    class ResetBtn implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            startGame=" ";
            t1.setBTN1(null);
            t1.setBTN2(null);
            t1.setBTN3(null);
            t1.setBTN6(null);
            t1.setBTN7(null);
            t1.setBTN8(null);
            t1.setBTN11(null);
            t1.setBTN12(null);
            t1.setBTN13(null);
            b1=10;
            b2=10;
            b3=10;
            b6=10;
            b7=10;
            b8=10;
            b11=10;
            b12=10;
            b13=10;
        }
    }

     public void chooseWinner(){
       JFrame frame = new JFrame();
      if(b1==1 && b2==1 && b3==1)
      {
        JOptionPane.showMessageDialog(frame,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        t1.setLbl2(String.valueOf(xCount));
      }
      if(b6==1 && b7==1 && b8==1)
      {
          JOptionPane.showMessageDialog(frame,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
          xCount++;
          t1.setLbl2(String.valueOf(xCount));
      }
      if(b11==1 && b12==1 && b13==1)
      {
          JOptionPane.showMessageDialog(frame,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
          xCount++;
          t1.setLbl2(String.valueOf(xCount));
      }
      if(b1==1 && b6==1 && b11==1)
      {
          JOptionPane.showMessageDialog(frame,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
          xCount++;
          t1.setLbl2(String.valueOf(xCount));
      }
      if(b2==1 && b7==1 && b12==1)
      {
          JOptionPane.showMessageDialog(frame,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
          xCount++;
          t1.setLbl2(String.valueOf(xCount));
      }
      if(b3==1 && b8==1 && b13==1)
      {
          JOptionPane.showMessageDialog(frame,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
          xCount++;
          t1.setLbl2(String.valueOf(xCount));
      }
      if(b1==1 && b7==1 && b13==1)
      {
          JOptionPane.showMessageDialog(frame,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
          xCount++;
          t1.setLbl2(String.valueOf(xCount));
      }
      if(b3==1 && b7==1 && b11==1)
      {
          JOptionPane.showMessageDialog(frame,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
          xCount++;
          t1.setLbl2(String.valueOf(xCount));
      }

         if(b1==0 && b2==0 && b3==0)
         {
             JOptionPane.showMessageDialog(frame,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             oCount++;
             t1.setLbl4(String.valueOf(oCount));
         }
         if(b6==0 && b7==0 && b8==0)
         {
             JOptionPane.showMessageDialog(frame,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             oCount++;
             t1.setLbl4(String.valueOf(oCount));
         }
         if(b11==0 && b12==0 && b13==0)
         {
             JOptionPane.showMessageDialog(frame,"Player 0 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             oCount++;
             t1.setLbl4(String.valueOf(oCount));
         }
         if(b1==0 && b6==0 && b11==0)
         {
             JOptionPane.showMessageDialog(frame,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             oCount++;
             t1.setLbl4(String.valueOf(oCount));
         }
         if(b2==0 && b7==0 && b12==0)
         {
             JOptionPane.showMessageDialog(frame,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             oCount++;
             t1.setLbl4(String.valueOf(oCount));
         }
         if(b3==0 && b8==0 && b13==0)
         {
             JOptionPane.showMessageDialog(frame,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             oCount++;
             t1.setLbl4(String.valueOf(oCount));
         }
         if(b1==0 && b7==0 && b13==0)
         {
             JOptionPane.showMessageDialog(frame,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             oCount++;
             t1.setLbl4(String.valueOf(oCount));
         }
         if(b3==0 && b7==0 && b11==0)
         {
             JOptionPane.showMessageDialog(frame,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             oCount++;
             t1.setLbl4(String.valueOf(oCount));
         }

     }

}
