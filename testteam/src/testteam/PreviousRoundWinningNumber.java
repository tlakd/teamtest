package testteam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import java.awt.Font;

public class PreviousRoundWinningNumber {
  
  private List<Integer> lottoNumbers; // 로또 번호를 저장할 변수


  private JFrame frame;

  public PreviousRoundWinningNumber() {
    initialize();
    
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.getContentPane().setBackground(Color.WHITE);
    SpringLayout springLayout = new SpringLayout();
    frame.getContentPane().setLayout(springLayout);
    
    JButton btn = new JButton("이전메뉴");
    springLayout.putConstraint(SpringLayout.NORTH, btn, -49, SpringLayout.SOUTH, frame.getContentPane());
    springLayout.putConstraint(SpringLayout.SOUTH, btn, -10, SpringLayout.SOUTH, frame.getContentPane());
    springLayout.putConstraint(SpringLayout.EAST, btn, -10, SpringLayout.EAST, frame.getContentPane());
    btn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        //메인화면으로 돌아가야 함 나중에 바꿔야 함
        frame.dispose();
      }
    });
    frame.getContentPane().add(btn);
    
    JLabel lbl2 = new JLabel("회차 선택 :");
    springLayout.putConstraint(SpringLayout.WEST, btn, 14, SpringLayout.WEST, lbl2);
    lbl2.setFont(new Font("굴림", Font.PLAIN, 14));
    frame.getContentPane().add(lbl2);
    
    
    JLabel lbl3 = new JLabel("회차 당첨번호");
    springLayout.putConstraint(SpringLayout.NORTH, lbl3, 68, SpringLayout.NORTH, frame.getContentPane());
    lbl3.setFont(new Font("굴림", Font.PLAIN, 18));
    frame.getContentPane().add(lbl3);
    
    JLabel lbl4 = new JLabel("?");
    springLayout.putConstraint(SpringLayout.WEST, lbl3, 6, SpringLayout.EAST, lbl4);
    springLayout.putConstraint(SpringLayout.NORTH, lbl4, 68, SpringLayout.NORTH, frame.getContentPane());
    springLayout.putConstraint(SpringLayout.WEST, lbl4, 140, SpringLayout.WEST, frame.getContentPane());
    springLayout.putConstraint(SpringLayout.EAST, lbl4, -264, SpringLayout.EAST, frame.getContentPane());
    lbl4.setFont(new Font("굴림", Font.PLAIN, 18));
    frame.getContentPane().add(lbl4);
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    JLabel lblNewLabel = new JLabel("당첨번호");
    springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, lbl4);
    lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 15));
    frame.getContentPane().add(lblNewLabel);
    
    JLabel lblNewLabel_1 = new JLabel("보너스");
    springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 3, SpringLayout.NORTH, lblNewLabel);
    springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, 0, SpringLayout.EAST, lbl2);
    frame.getContentPane().add(lblNewLabel_1);
    
    JLabel lbl5 = new JLabel("1번");
    springLayout.putConstraint(SpringLayout.WEST, lbl5, 64, SpringLayout.WEST, frame.getContentPane());
    frame.getContentPane().add(lbl5);
    
    JLabel lbl6 = new JLabel("2번");
    springLayout.putConstraint(SpringLayout.NORTH, lbl5, 0, SpringLayout.NORTH, lbl6);
    springLayout.putConstraint(SpringLayout.EAST, lbl5, -19, SpringLayout.WEST, lbl6);
    frame.getContentPane().add(lbl6);
    
    JLabel lbl7 = new JLabel("3번");
    springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 31, SpringLayout.SOUTH, lbl7);
    springLayout.putConstraint(SpringLayout.NORTH, lbl6, 0, SpringLayout.NORTH, lbl7);
    springLayout.putConstraint(SpringLayout.EAST, lbl6, -19, SpringLayout.WEST, lbl7);
    springLayout.putConstraint(SpringLayout.WEST, lbl7, 0, SpringLayout.WEST, lbl4);
    frame.getContentPane().add(lbl7);
    
    JLabel lbl8 = new JLabel("4번");
    springLayout.putConstraint(SpringLayout.NORTH, lbl8, 34, SpringLayout.SOUTH, lbl3);
    springLayout.putConstraint(SpringLayout.NORTH, lbl7, 0, SpringLayout.NORTH, lbl8);
    frame.getContentPane().add(lbl8);
    
    JLabel lbl9 = new JLabel("5번");
    springLayout.putConstraint(SpringLayout.WEST, lbl9, 216, SpringLayout.WEST, frame.getContentPane());
    springLayout.putConstraint(SpringLayout.EAST, lbl8, -15, SpringLayout.WEST, lbl9);
    springLayout.putConstraint(SpringLayout.NORTH, lbl9, 0, SpringLayout.NORTH, lbl5);
    frame.getContentPane().add(lbl9);
    
    JLabel lbl10 = new JLabel("6번");
    springLayout.putConstraint(SpringLayout.NORTH, lbl10, 0, SpringLayout.NORTH, lbl5);
    springLayout.putConstraint(SpringLayout.WEST, lbl10, 17, SpringLayout.EAST, lbl9);
    frame.getContentPane().add(lbl10);
    
    JLabel lbl11 = new JLabel("보너스 번호");
    springLayout.putConstraint(SpringLayout.NORTH, lbl11, 0, SpringLayout.NORTH, lbl5);
    springLayout.putConstraint(SpringLayout.WEST, lbl11, -1, SpringLayout.WEST, btn);
    springLayout.putConstraint(SpringLayout.EAST, lbl11, -48, SpringLayout.EAST, frame.getContentPane());
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

        int selectedNumber = (int) selectBox.getSelectedItem();
        lbl4.setText(Integer.toString(selectedNumber));
        List<Integer> lottoNumbers;
        if (lottoNumberMap.containsKey(selectedNumber)) {
          lottoNumbers = lottoNumberMap.get(selectedNumber);
        } else {
          lottoNumbers = generateLottoNumbers();
          lottoNumberMap.put(selectedNumber, lottoNumbers);
        }
        generateAndSetLottoNumbers();
      
      }

      private void generateAndSetLottoNumbers() {
    	    List<Integer> numbers = generateLottoNumbers();

    	    lbl5.setText(formatNumber(numbers.get(0)));
    	    lbl6.setText(formatNumber(numbers.get(1)));
    	    lbl7.setText(formatNumber(numbers.get(2)));
    	    lbl8.setText(formatNumber(numbers.get(3)));
    	    lbl9.setText(formatNumber(numbers.get(4)));
    	    lbl10.setText(formatNumber(numbers.get(5)));
    	    lbl11.setText(formatNumber(numbers.get(6)));

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
    
    