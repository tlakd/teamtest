package testteam;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

public class PreviousRoundWinningNumber {
  
	private int selectedNumber; // 선택된 회차
	private List<Integer> lottoNumbers; // 선택된 회차의 로또 번호


  private JFrame frame;

  public PreviousRoundWinningNumber() {
    initialize();
    
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.getContentPane().setBackground(Color.white);
    SpringLayout springLayout = new SpringLayout();
    frame.getContentPane().setLayout(springLayout);
    
    URL url = PreviousRoundWinningNumber.class.getClassLoader().getResource("이전회차 당첨번호 이미지5.jpg");
    new ImageIcon(url);
    
    JButton btn = new JButton("");
    btn.setIcon(new ImageIcon(PreviousRoundWinningNumber.class.getResource("/image/이전메뉴크게2.jpg")));
    btn.setSelectedIcon(new ImageIcon(PreviousRoundWinningNumber.class.getResource("/image/이전메뉴크게2.jpg")));
    btn.setOpaque(false);
    btn.setContentAreaFilled(false);
    btn.setBorderPainted(false);
    springLayout.putConstraint(SpringLayout.NORTH, btn, 295, SpringLayout.NORTH, frame.getContentPane());
    btn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        //메인화면으로 돌아가야 함 나중에 바꿔야 함
        frame.dispose();
      }
    });
    frame.getContentPane().add(btn);
    
    JLabel lbl2 = new JLabel("회차 선택 :");
    lbl2.setForeground(Color.DARK_GRAY);
    springLayout.putConstraint(SpringLayout.WEST, btn, 20, SpringLayout.WEST, lbl2);
    lbl2.setFont(new Font("맑은 고딕", Font.BOLD, 14));
    frame.getContentPane().add(lbl2);
    
    
    JLabel lbl3 = new JLabel("회 당첨결과");
    springLayout.putConstraint(SpringLayout.NORTH, lbl3, 94, SpringLayout.NORTH, frame.getContentPane());
    springLayout.putConstraint(SpringLayout.WEST, lbl3, 190, SpringLayout.WEST, frame.getContentPane());
    lbl3.setForeground(Color.WHITE);
    lbl3.setFont(new Font("휴먼모음T", Font.BOLD, 30));
    frame.getContentPane().add(lbl3);
    
    JLabel lbl4 = new JLabel("?");
    springLayout.putConstraint(SpringLayout.NORTH, lbl4, 94, SpringLayout.NORTH, frame.getContentPane());
    springLayout.putConstraint(SpringLayout.WEST, lbl4, 130, SpringLayout.WEST, frame.getContentPane());
    springLayout.putConstraint(SpringLayout.EAST, lbl4, -290, SpringLayout.EAST, frame.getContentPane());
    lbl4.setForeground(Color.WHITE);
    lbl4.setFont(new Font("휴먼모음T", Font.BOLD, 30));
    frame.getContentPane().add(lbl4);
    frame.setBounds(100, 100, 510, 415);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel lbl5 = new JLabel("1");
    lbl5.setForeground(Color.BLUE);
    springLayout.putConstraint(SpringLayout.NORTH, lbl5, 193, SpringLayout.NORTH, frame.getContentPane());
    springLayout.putConstraint(SpringLayout.EAST, lbl5, -415, SpringLayout.EAST, frame.getContentPane());
    lbl5.setFont(new Font("Yu Gothic UI", Font.BOLD, 30));
    frame.getContentPane().add(lbl5);
    
    JLabel lbl6 = new JLabel("2");
    lbl6.setForeground(Color.BLUE);
    springLayout.putConstraint(SpringLayout.NORTH, lbl6, 193, SpringLayout.NORTH, frame.getContentPane());
    springLayout.putConstraint(SpringLayout.EAST, lbl6, -365, SpringLayout.EAST, frame.getContentPane());
    lbl6.setFont(new Font("Yu Gothic UI", Font.BOLD, 30));
    frame.getContentPane().add(lbl6);
    
    JLabel lbl7 = new JLabel("3");
    lbl7.setForeground(Color.BLUE);
    springLayout.putConstraint(SpringLayout.NORTH, lbl7, 193, SpringLayout.NORTH, frame.getContentPane());
    springLayout.putConstraint(SpringLayout.EAST, lbl7, -315, SpringLayout.EAST, frame.getContentPane());
    lbl7.setFont(new Font("Yu Gothic UI", Font.BOLD, 30));
    frame.getContentPane().add(lbl7);
    
    JLabel lbl8 = new JLabel("4");
    lbl8.setForeground(Color.BLUE);
    springLayout.putConstraint(SpringLayout.NORTH, lbl8, 193, SpringLayout.NORTH, frame.getContentPane());
    springLayout.putConstraint(SpringLayout.EAST, lbl8, -265, SpringLayout.EAST, frame.getContentPane());
    lbl8.setFont(new Font("Yu Gothic UI", Font.BOLD, 30));
    frame.getContentPane().add(lbl8);
    
    JLabel lbl9 = new JLabel("5");
    lbl9.setForeground(Color.BLUE);
    springLayout.putConstraint(SpringLayout.NORTH, lbl9, 193, SpringLayout.NORTH, frame.getContentPane());
    springLayout.putConstraint(SpringLayout.EAST, lbl9, -215, SpringLayout.EAST, frame.getContentPane());
    lbl9.setFont(new Font("Yu Gothic UI", Font.BOLD, 30));
    frame.getContentPane().add(lbl9);
    
    JLabel lbl10 = new JLabel("6");
    lbl10.setForeground(Color.BLUE);
    springLayout.putConstraint(SpringLayout.NORTH, lbl10, 193, SpringLayout.NORTH, frame.getContentPane());
    springLayout.putConstraint(SpringLayout.EAST, lbl10, -165, SpringLayout.EAST, frame.getContentPane());
    lbl10.setFont(new Font("Yu Gothic UI", Font.BOLD, 30));
    frame.getContentPane().add(lbl10);
    
    JLabel lbl11 = new JLabel("7");
    lbl11.setForeground(Color.RED);
    springLayout.putConstraint(SpringLayout.NORTH, lbl11, 193, SpringLayout.NORTH, frame.getContentPane());
    springLayout.putConstraint(SpringLayout.WEST, lbl11, 420, SpringLayout.WEST, frame.getContentPane());
    springLayout.putConstraint(SpringLayout.EAST, lbl11, -40, SpringLayout.EAST, frame.getContentPane());
    lbl11.setFont(new Font("Yu Gothic UI", Font.BOLD, 30));
    frame.getContentPane().add(lbl11);
    
    JComboBox<Integer> selectBox = new JComboBox<>();
    springLayout.putConstraint(SpringLayout.EAST, selectBox, -24, SpringLayout.EAST, frame.getContentPane());
    springLayout.putConstraint(SpringLayout.NORTH, lbl2, 3, SpringLayout.NORTH, selectBox);
    springLayout.putConstraint(SpringLayout.EAST, lbl2, -7, SpringLayout.WEST, selectBox);
    springLayout.putConstraint(SpringLayout.NORTH, selectBox, 10, SpringLayout.NORTH, frame.getContentPane());
    MakeRoom a = new MakeRoom(); // 

    for (int i = 1; i <= 101; i++) {
      selectBox.addItem(i);
    }
a.makeLottoNumberNew(selectBox);
    
    Map<Integer, List<Integer>> lottoNumberMap = new HashMap<>(); // 회차별 로또 번호 저장

    selectBox.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            selectedNumber = (int) selectBox.getSelectedItem();
            lbl4.setText(Integer.toString(selectedNumber));
            
            if (lottoNumberMap.containsKey(selectedNumber)) {
                lottoNumbers = lottoNumberMap.get(selectedNumber);
            } else {
                lottoNumbers = generateLottoNumbers();
                lottoNumberMap.put(selectedNumber, lottoNumbers);
            }
            
            generateAndSetLottoNumbers();
        }

      private void generateAndSetLottoNumbers() {
    	    lbl5.setText(formatNumber(lottoNumbers.get(0)));
    	    lbl6.setText(formatNumber(lottoNumbers.get(1)));
    	    lbl7.setText(formatNumber(lottoNumbers.get(2)));
    	    lbl8.setText(formatNumber(lottoNumbers.get(3)));
    	    lbl9.setText(formatNumber(lottoNumbers.get(4)));
    	    lbl10.setText(formatNumber(lottoNumbers.get(5)));
    	    lbl11.setText(formatNumber(lottoNumbers.get(6)));

    	    lbl5.setHorizontalAlignment(SwingConstants.CENTER);
    	    lbl6.setHorizontalAlignment(SwingConstants.CENTER);
    	    lbl7.setHorizontalAlignment(SwingConstants.CENTER);
    	    lbl8.setHorizontalAlignment(SwingConstants.CENTER);
    	    lbl9.setHorizontalAlignment(SwingConstants.CENTER);
    	    lbl10.setHorizontalAlignment(SwingConstants.CENTER);
    	    lbl11.setHorizontalAlignment(SwingConstants.CENTER);
    	}


      private String formatNumber(int number) {
          return String.format("%2d", number);
      }
      private List<Integer> generateLottoNumbers() {
          List<Integer> numbers = new ArrayList<>();
          while (numbers.size() < 6) {
              int number = (int) (Math.random() * 45) + 1;
              if (!numbers.contains(number)) {
                  numbers.add(number);
              }
          }
          Collections.sort(numbers);
          int bonusNumber = (int) (Math.random() * 45) + 1;
          numbers.add(bonusNumber);

          return numbers;
      }



    });
    frame.getContentPane().add(selectBox);
    
    JLabel lblNewLabel_2 = new JLabel("New label");
    lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
    lblNewLabel_2.setForeground(Color.WHITE);
    springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_2, -12, SpringLayout.NORTH, lbl2);
    springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, frame.getContentPane());
    lblNewLabel_2.setIcon(new ImageIcon(PreviousRoundWinningNumber.class.getResource("/image/이전회차 당첨번호 이미지5.jpg")));
    frame.getContentPane().add(lblNewLabel_2);
    
  }
  
  public static void main(String[] args) {
      
      
      EventQueue.invokeLater(new Runnable() {
        public void run() {
          try {
            PreviousRoundWinningNumber window = new PreviousRoundWinningNumber();
            window.frame.setVisible(true);
          } catch (Exception e) {
            e.printStackTrace();
          }
          
        }
      });
      
  }
  }
    
    