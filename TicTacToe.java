package Lab9.Ex4;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class TicTacToe extends JFrame {

    private JPanel contentPane;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn11;
    private JButton btn12;
    private JButton btn13;
    private JButton Reset;
    private JButton Exit;
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;


    public TicTacToe() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        contentPane.add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(3, 5, 2, 2));

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_1);
        panel_1.setLayout(new BorderLayout(0, 0));

        btn1 = new JButton();
        btn1.setBackground(Color.PINK);
        btn1.setFont(new Font("Tahoma", Font.BOLD, 40));

        panel_1.add(btn1, BorderLayout.CENTER);
        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_3);
        panel_3.setLayout(new BorderLayout(0, 0));

        btn2 = new JButton("");
        btn2.setBackground(Color.PINK);
        btn2.setFont(new Font("Tahoma", Font.BOLD, 45));
        panel_3.add(btn2, BorderLayout.CENTER);

        JPanel panel_4 = new JPanel();
        panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_4);
        panel_4.setLayout(new BorderLayout(0, 0));

        btn3 = new JButton("");
        btn3.setBackground(Color.PINK);
        btn3.setFont(new Font("Tahoma", Font.BOLD, 45));
        panel_4.add(btn3, BorderLayout.CENTER);

        JPanel panel_5 = new JPanel();
        panel_5.setBackground(Color.PINK);
        panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_5);
        panel_5.setLayout(new BorderLayout(0, 0));

        lbl1 = new JLabel("Player X");
        lbl1.setBackground(new Color(255, 182, 193));
        lbl1.setForeground(Color.MAGENTA);
        lbl1.setFont(new Font("Times New Roman", Font.BOLD, 26));
        panel_5.add(lbl1, BorderLayout.CENTER);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(Color.PINK);
        panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_2);
        panel_2.setLayout(new BorderLayout(0, 0));

        lbl2 = new JLabel("");
        lbl2.setBackground(Color.PINK);
        lbl2.setHorizontalAlignment(SwingConstants.CENTER);
        lbl2.setFont(new Font("Times New Roman", Font.BOLD, 26));
        panel_2.add(lbl2, BorderLayout.CENTER);

        JPanel panel_6 = new JPanel();
        panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_6);
        panel_6.setLayout(new BorderLayout(0, 0));

        btn6 = new JButton("");
        btn6.setBackground(Color.PINK);
        btn6.setFont(new Font("Tahoma", Font.BOLD, 45));
        panel_6.add(btn6, BorderLayout.CENTER);

        JPanel panel_7 = new JPanel();
        panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_7);
        panel_7.setLayout(new BorderLayout(0, 0));

        btn7 = new JButton("");
        btn7.setBackground(Color.PINK);
        btn7.setFont(new Font("Tahoma", Font.BOLD, 45));
        panel_7.add(btn7, BorderLayout.CENTER);

        JPanel panel_8 = new JPanel();
        panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_8);
        panel_8.setLayout(new BorderLayout(0, 0));

        btn8 = new JButton("");
        btn8.setBackground(Color.PINK);
        btn8.setFont(new Font("Tahoma", Font.BOLD, 45));
        panel_8.add(btn8, BorderLayout.CENTER);

        JPanel panel_9 = new JPanel();
        panel_9.setBackground(Color.PINK);
        panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_9);
        panel_9.setLayout(new BorderLayout(0, 0));

        lbl3 = new JLabel("Player 0");
        lbl3.setBackground(new Color(255, 182, 193));
        lbl3.setForeground(Color.MAGENTA);
        lbl3.setFont(new Font("Times New Roman", Font.BOLD, 26));
        panel_9.add(lbl3, BorderLayout.CENTER);

        JPanel panel_10 = new JPanel();
        panel_10.setBackground(Color.PINK);
        panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_10);
        panel_10.setLayout(new BorderLayout(0, 0));

        lbl4 = new JLabel("");
        lbl4.setBackground(Color.PINK);
        lbl4.setHorizontalAlignment(SwingConstants.CENTER);
        lbl4.setFont(new Font("Times New Roman", Font.BOLD, 26));
        panel_10.add(lbl4, BorderLayout.CENTER);

        JPanel panel_11 = new JPanel();
        panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_11);
        panel_11.setLayout(new BorderLayout(0, 0));

        btn11 = new JButton("");
        btn11.setBackground(Color.PINK);
        btn11.setFont(new Font("Tahoma", Font.BOLD, 45));
        panel_11.add(btn11, BorderLayout.CENTER);

        JPanel panel_12 = new JPanel();
        panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_12);
        panel_12.setLayout(new BorderLayout(0, 0));

        btn12 = new JButton("");
        btn12.setBackground(Color.PINK);
        btn12.setFont(new Font("Tahoma", Font.BOLD, 45));
        panel_12.add(btn12, BorderLayout.CENTER);

        JPanel panel_13 = new JPanel();
        panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_13);
        panel_13.setLayout(new BorderLayout(0, 0));

        btn13 = new JButton("");
        btn13.setBackground(Color.PINK);
        btn13.setFont(new Font("Tahoma", Font.BOLD, 45));
        panel_13.add(btn13, BorderLayout.CENTER);

        JPanel panel_14 = new JPanel();
        panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_14);
        panel_14.setLayout(new BorderLayout(0, 0));

        Reset = new JButton("Reset");
        Reset.setBackground(Color.PINK);
        Reset.setForeground(Color.MAGENTA);
        Reset.setFont(new Font("Times New Roman", Font.BOLD, 26));
        panel_14.add(Reset, BorderLayout.CENTER);

        JPanel panel_15 = new JPanel();
        panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_15);
        panel_15.setLayout(new BorderLayout(0, 0));

        Exit = new JButton("Exit");
        Exit.setBackground(Color.PINK);
        Exit.setForeground(Color.MAGENTA);
        Exit.setFont(new Font("Times New Roman", Font.BOLD, 30));
        panel_15.add(Exit, BorderLayout.CENTER);
        setVisible(true);
    }

    public void addBtn1Listener(ActionListener action){btn1.addActionListener(action);}
    public void addBtn2Listener(ActionListener action){btn2.addActionListener(action);}
    public void addBtn3Listener(ActionListener action){btn3.addActionListener(action);}
    public void addBtn4Listener(ActionListener action){btn4.addActionListener(action);}
    public void addBtn5Listener(ActionListener action){btn5.addActionListener(action);}
    public void addBtn6Listener(ActionListener action){btn6.addActionListener(action);}
    public void addBtn7Listener(ActionListener action){btn7.addActionListener(action);}
    public void addBtn8Listener(ActionListener action){btn8.addActionListener(action);}
    public void addBtn11Listener(ActionListener action){btn11.addActionListener(action);}
    public void addBtn12Listener(ActionListener action){btn12.addActionListener(action);}
    public void addBtn13Listener(ActionListener action){btn13.addActionListener(action);}
    public void addResetListener(ActionListener action){Reset.addActionListener(action);}
    public void addExitListener(ActionListener action){Exit.addActionListener(action);}

    public void setBTN1(String s1){btn1.setText(s1);}
    public void setBTN2(String s1){btn2.setText(s1);}
    public void setBTN3(String s1){btn3.setText(s1);}
    public void setBTN6(String s1){btn6.setText(s1);}
    public void setBTN7(String s1){btn7.setText(s1);}
    public void setBTN8(String s1){btn8.setText(s1);}
    public void setBTN11(String s1){btn11.setText(s1);}
    public void setBTN12(String s1){btn12.setText(s1);}
    public void setBTN13(String s1){btn13.setText(s1);}

    public void setLbl2(String s1){
        lbl2.setText(s1);
    }

    public void setLbl4(String s1){
        lbl4.setText(s1);
    }







}

