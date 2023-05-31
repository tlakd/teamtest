import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import java.util.Random;
import testteam.MakeRoom;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

 
public class back3 extends JFrame {
	
	Random random = new Random();
	
    JScrollPane scrollPane;
    ImageIcon icon;
    
    private List<Integer> lottoNumbers; // 로또 번호를 저장할 변수


    private JFrame frame;
    
    public back3() {
    	URL urlback = back3.class.getResource("이전회차 당첨번호 이미지1.jpg");
        icon = new ImageIcon(urlback);
        
       
        //배경 Panel 생성후 컨텐츠페인으로 지정      
        JPanel background = new JPanel() {
            public void paintComponent(Graphics g) {
                g.drawImage(icon.getImage(), 0, 0, null);
                setOpaque(false); //그림을 표시하게 설정,투명하게 조절
                super.paintComponent(g);
            }
        };
        scrollPane = new JScrollPane(background);
        background.setLayout(null);
        
        
        URL url = back2.class.getResource("이전메뉴.jpg");
        URL url_1 = back2.class.getResource("이전메뉴변화.jpg");
        ImageIcon icon = new ImageIcon(url);
        ImageIcon icon1_1 = new ImageIcon(url_1);
        
        JButton[] buttons = new JButton[6];
        JButton[] buttons1 = new JButton[1];

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(String.valueOf(random.nextInt(46)));
            buttons[i].setBounds(36 + (i * 53), 185, 60, 60);
            buttons[i].setFont(new Font("휴먼모음T", Font.BOLD, 16));
            background.add(buttons[i]);
        }
        
        for (int i = 0; i < buttons1.length; i++) {
            buttons1[i] = new JButton(String.valueOf(random.nextInt(46)));
            buttons1[i].setBounds(411 , 185, 60, 60);
            buttons1[i].setFont(new Font("휴먼모음T", Font.BOLD, 16));
            background.add(buttons1[i]);
        }
        
        JButton btnNewButton = new JButton("");
        btnNewButton.setOpaque(false);
        btnNewButton.setContentAreaFilled(false);
        btnNewButton.setBorderPainted(false);
        
        btnNewButton.setIcon(icon);
        btnNewButton.setSelectedIcon(icon);
        btnNewButton.setPressedIcon(icon1_1);
        btnNewButton.setBounds(400, 317, 71, 30);
        background.add(btnNewButton);
        
        JLabel lblNewLabel = new JLabel("회차선택");
        lblNewLabel.setBounds(387, 23, 56, 22);
        background.add(lblNewLabel);
        
        JLabel lblNewLabel_2 = new JLabel("100");
        lblNewLabel_2.setBounds(121, 96, 60, 34);
        lblNewLabel_2.setForeground(Color.white);
        lblNewLabel_2.setFont(new Font("휴먼모음T", Font.BOLD, 30));
        background.add(lblNewLabel_2);
        
        JComboBox selectBox = new JComboBox();
        selectBox.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int selectedNumber = (int) selectBox.getSelectedItem();
        		lblNewLabel_2.setText(Integer.toString(selectedNumber));
                List<Integer> lottoNumbers;
        	}
        });
        
        		
        selectBox.setBounds(445, 24, 50, 21);
        background.add(selectBox);
        MakeRoom a = new MakeRoom(); // 
        
        for (int i = 1; i <= 101; i++) {
            selectBox.addItem(i);
          }
      a.makeLottoNumberNew(selectBox);

   
       
        JLabel lblNewLabel_1 = new JLabel("회차 당첨번호");
        lblNewLabel_1.setBounds(188, 96, 211, 36);
        lblNewLabel_1.setForeground(Color.white);
        lblNewLabel_1.setFont(new Font("휴먼모음T", Font.BOLD, 30));
        background.add(lblNewLabel_1);
        
        JButton btnNewButton_1 = new JButton("");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        URL urlColor = back2.class.getResource("회색버튼1rgb2.jpg");
        ImageIcon iconColor = new ImageIcon(urlColor);
        
        btnNewButton_1.setIcon(iconColor);
        btnNewButton_1.setSelectedIcon(iconColor);
        btnNewButton_1.setBounds(42, 190, 50, 50);
        btnNewButton_1.setOpaque(false);
        btnNewButton_1.setContentAreaFilled(false);
        btnNewButton_1.setBorderPainted(false);
        background.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("");
        btnNewButton_2.setBounds(95, 190, 50, 50);
        background.add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("");
        btnNewButton_3.setBounds(148, 190, 50, 50);
        background.add(btnNewButton_3);
        
        JButton btnNewButton_4 = new JButton("");
        btnNewButton_4.setBounds(201, 190, 50, 50);
        background.add(btnNewButton_4);
        
        JButton btnNewButton_5 = new JButton("");
        btnNewButton_5.setBounds(254, 190, 50, 50);
        background.add(btnNewButton_5);
        
        JButton btnNewButton_6 = new JButton("");
        btnNewButton_6.setBounds(307, 190, 50, 50);
        background.add(btnNewButton_6);
        
        JButton btnNewButton_7 = new JButton("");
        btnNewButton_7.setBounds(416, 190, 50, 50);
        background.add(btnNewButton_7);
        
        setContentPane(scrollPane);
    }
    
 
    public static void main(String[] args) {
    	EventQueue.invokeLater(new Runnable() {
            public void run() {
              try {
                back3 window = new back3();
              } catch (Exception e) {
                e.printStackTrace();
              }
              
            }
          });
        back3 frame = new back3();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(520, 415);
        frame.setVisible(true);
        
    }
}
