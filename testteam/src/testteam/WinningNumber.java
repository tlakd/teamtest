package testteam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;

public class WinningNumber {
    JFrame frame;
    JLabel albl1;
	String numberText;
	String firstNumber;

    public String getNumberText() {
		return numberText;
	}

	public void setNumberText(String numberText) {
		this.numberText = numberText;
	}

	public void 자동여러장구매시(Map<Integer, List<NumberSave>> userNumber, Map<Integer, String> autoNotAuto) {
        for (int i = 1; i <= userNumber.size(); i++) {
            List<NumberSave> numbers = userNumber.get(i);
            String autoType = autoNotAuto.get(i);
            

            System.out.println("유저 번호: " + numbers);
            System.out.println(numbers.get(0));
            System.out.println("라벨 변경");
            albl1.setText(String.valueOf(numbers.get(0)));
            System.out.println("자동/반자동/수동: " + autoType);
            System.out.println("------------------------------");
           
            
        }
    }
      
	 //userNumber는 사용자의 로또 번호를 저장하는 맵입니다.
	 //autoNotAuto는 자동 반자동 수동인지 확인해주는 맵입니다

	/**
	 * Launch the application.g
	 */
	public static void main(String[] args) {
		
		
	}

	/**
	 * Create the application.
	 */
	public WinningNumber() {
		    initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		

		
	
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JLabel lbl1 = new JLabel("1등 당첨 번호:");
		springLayout.putConstraint(SpringLayout.NORTH, lbl1, 24, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lbl1, 39, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lbl1, -311, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(lbl1);
		
		JLabel lbl2 = new JLabel("보너스 번호:");
		springLayout.putConstraint(SpringLayout.NORTH, lbl2, 0, SpringLayout.NORTH, lbl1);
		springLayout.putConstraint(SpringLayout.WEST, lbl2, 303, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lbl2, -60, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(lbl2);
		
		JButton btn1 = new JButton("이전 화면");
		springLayout.putConstraint(SpringLayout.SOUTH, btn1, -10, SpringLayout.SOUTH, frame.getContentPane());
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//메인화면으로 돌아가야함 나중에 바꿔야 함
				frame.dispose();
				
			}
		});
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("다음 번호");
		springLayout.putConstraint(SpringLayout.WEST, btn2, 230, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btn1, -25, SpringLayout.WEST, btn2);
		springLayout.putConstraint(SpringLayout.NORTH, btn2, 0, SpringLayout.NORTH, btn1);
		springLayout.putConstraint(SpringLayout.SOUTH, btn2, 0, SpringLayout.SOUTH, btn1);
		 
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
	      
	        });
	        frame.getContentPane().add(btn2);
		
		JLabel lbl3 = new JLabel("경 축 !! 2등 당첨 되었습니다");
		springLayout.putConstraint(SpringLayout.NORTH, lbl3, 187, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lbl3, 147, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, btn1, 6, SpringLayout.SOUTH, lbl3);
		frame.getContentPane().add(lbl3);
		
		JLabel lbl4 = new JLabel("내 선택 첫번째 번호 :");
		frame.getContentPane().add(lbl4);
		
        
        JLabel albl = new JLabel("자동");
        springLayout.putConstraint(SpringLayout.NORTH, albl, 77, SpringLayout.NORTH, frame.getContentPane());
        springLayout.putConstraint(SpringLayout.WEST, albl, 0, SpringLayout.WEST, btn1);
        frame.getContentPane().add(albl);
        
        JLabel blbl = new JLabel("수동");
        springLayout.putConstraint(SpringLayout.NORTH, blbl, 6, SpringLayout.SOUTH, albl);
        springLayout.putConstraint(SpringLayout.WEST, blbl, 0, SpringLayout.WEST, btn1);
        frame.getContentPane().add(blbl);
        
        JLabel clbl = new JLabel("자동");
        springLayout.putConstraint(SpringLayout.NORTH, clbl, 6, SpringLayout.SOUTH, blbl);
        springLayout.putConstraint(SpringLayout.WEST, clbl, 0, SpringLayout.WEST, btn1);
        frame.getContentPane().add(clbl);
        
        JLabel dlbl = new JLabel("반자동");
        springLayout.putConstraint(SpringLayout.NORTH, dlbl, 6, SpringLayout.SOUTH, clbl);
        springLayout.putConstraint(SpringLayout.WEST, dlbl, 0, SpringLayout.WEST, btn1);
        frame.getContentPane().add(dlbl);
        
        JLabel elbl = new JLabel("수동");
        springLayout.putConstraint(SpringLayout.NORTH, elbl, 4, SpringLayout.SOUTH, dlbl);
        springLayout.putConstraint(SpringLayout.WEST, elbl, 0, SpringLayout.WEST, btn1);
        frame.getContentPane().add(elbl);
        
        this.albl1 = new JLabel("18");
        springLayout.putConstraint(SpringLayout.WEST, lbl4, 0, SpringLayout.WEST, albl1);
        springLayout.putConstraint(SpringLayout.SOUTH, lbl4, -6, SpringLayout.NORTH, albl1);
        springLayout.putConstraint(SpringLayout.NORTH, albl1, 77, SpringLayout.NORTH, frame.getContentPane());
        springLayout.putConstraint(SpringLayout.WEST, albl1, 22, SpringLayout.EAST, albl);
        albl1.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(albl1);
        System.out.println("라벨 생성");
    
        
        JLabel albl2 = new JLabel("2번");
        albl2.setHorizontalAlignment(SwingConstants.CENTER);
        springLayout.putConstraint(SpringLayout.WEST, albl2, 9, SpringLayout.EAST, albl1);
        springLayout.putConstraint(SpringLayout.SOUTH, albl2, 0, SpringLayout.SOUTH, albl);
        frame.getContentPane().add(albl2);
        
        JLabel albl3 = new JLabel("3번");
        springLayout.putConstraint(SpringLayout.NORTH, albl3, 0, SpringLayout.NORTH, albl);
        springLayout.putConstraint(SpringLayout.WEST, albl3, 6, SpringLayout.EAST, albl2);
        albl3.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(albl3);
        
        JLabel albl4 = new JLabel("4번");
        springLayout.putConstraint(SpringLayout.NORTH, albl4, 0, SpringLayout.NORTH, albl);
        albl4.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(albl4);
        
        JLabel albl5 = new JLabel("5번");
        springLayout.putConstraint(SpringLayout.WEST, albl5, 268, SpringLayout.WEST, frame.getContentPane());
        springLayout.putConstraint(SpringLayout.EAST, albl4, -6, SpringLayout.WEST, albl5);
        springLayout.putConstraint(SpringLayout.NORTH, albl5, 0, SpringLayout.NORTH, albl);
        albl5.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(albl5);
        
        JLabel albl6 = new JLabel("6번");
        springLayout.putConstraint(SpringLayout.NORTH, albl6, 0, SpringLayout.NORTH, albl);
        springLayout.putConstraint(SpringLayout.EAST, albl6, 0, SpringLayout.EAST, btn2);
        albl6.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(albl6);
        
        JLabel blbl1 = new JLabel("1번");
        blbl1.setHorizontalAlignment(SwingConstants.CENTER);
        springLayout.putConstraint(SpringLayout.NORTH, blbl1, 0, SpringLayout.NORTH, blbl);
        springLayout.putConstraint(SpringLayout.EAST, blbl1, 0, SpringLayout.EAST, albl1);
        frame.getContentPane().add(blbl1);
        
        JLabel blbl2 = new JLabel("2번");
        springLayout.putConstraint(SpringLayout.NORTH, blbl2, 0, SpringLayout.NORTH, blbl);
        springLayout.putConstraint(SpringLayout.WEST, blbl2, 0, SpringLayout.WEST, albl2);
        springLayout.putConstraint(SpringLayout.SOUTH, blbl2, 0, SpringLayout.SOUTH, blbl);
        blbl2.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(blbl2);
        
        JLabel blbl3 = new JLabel("3번");
        springLayout.putConstraint(SpringLayout.NORTH, blbl3, 0, SpringLayout.NORTH, blbl);
        springLayout.putConstraint(SpringLayout.WEST, blbl3, 0, SpringLayout.WEST, albl3);
        blbl3.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(blbl3);
        
        JLabel blbl4 = new JLabel("4번");
        springLayout.putConstraint(SpringLayout.NORTH, blbl4, 0, SpringLayout.NORTH, blbl);
        springLayout.putConstraint(SpringLayout.WEST, blbl4, 0, SpringLayout.WEST, albl4);
        blbl4.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(blbl4);
        
        JLabel blbl5 = new JLabel("5번");
        springLayout.putConstraint(SpringLayout.NORTH, blbl5, 0, SpringLayout.NORTH, blbl);
        springLayout.putConstraint(SpringLayout.WEST, blbl5, 0, SpringLayout.WEST, albl5);
        blbl5.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(blbl5);
        
        JLabel blbl6 = new JLabel("6번");
        blbl6.setHorizontalAlignment(SwingConstants.CENTER);
        springLayout.putConstraint(SpringLayout.NORTH, blbl6, 0, SpringLayout.NORTH, blbl);
        springLayout.putConstraint(SpringLayout.EAST, blbl6, 0, SpringLayout.EAST, btn2);
        frame.getContentPane().add(blbl6);
        
        JLabel nlbl1 = new JLabel("1번");
        springLayout.putConstraint(SpringLayout.NORTH, nlbl1, 0, SpringLayout.NORTH, lbl1);
        springLayout.putConstraint(SpringLayout.EAST, nlbl1, 0, SpringLayout.EAST, albl);
        nlbl1.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(nlbl1);
        
        JLabel nlbl2 = new JLabel("2번");
        springLayout.putConstraint(SpringLayout.NORTH, lbl4, 17, SpringLayout.SOUTH, nlbl2);
        springLayout.putConstraint(SpringLayout.NORTH, nlbl2, 0, SpringLayout.NORTH, lbl1);
        nlbl2.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(nlbl2);
        
        JLabel nlbl3 = new JLabel("3번");
        springLayout.putConstraint(SpringLayout.EAST, nlbl2, -22, SpringLayout.WEST, nlbl3);
        springLayout.putConstraint(SpringLayout.NORTH, nlbl3, 0, SpringLayout.NORTH, lbl1);
        springLayout.putConstraint(SpringLayout.WEST, nlbl3, 0, SpringLayout.WEST, albl2);
        nlbl3.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(nlbl3);
        
        JLabel nlbl4 = new JLabel("4번");
        springLayout.putConstraint(SpringLayout.NORTH, nlbl4, 0, SpringLayout.NORTH, lbl1);
        nlbl4.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(nlbl4);
        
        JLabel nlbl5 = new JLabel("5번");
        springLayout.putConstraint(SpringLayout.EAST, nlbl4, -18, SpringLayout.WEST, nlbl5);
        springLayout.putConstraint(SpringLayout.NORTH, nlbl5, 0, SpringLayout.NORTH, lbl1);
        springLayout.putConstraint(SpringLayout.WEST, nlbl5, 0, SpringLayout.WEST, albl4);
        nlbl5.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(nlbl5);
        
        JLabel nlbl6 = new JLabel("6번");
        springLayout.putConstraint(SpringLayout.NORTH, nlbl6, 0, SpringLayout.NORTH, lbl1);
        springLayout.putConstraint(SpringLayout.EAST, nlbl6, 0, SpringLayout.EAST, lbl4);
        nlbl6.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(nlbl6);
        
        JLabel nlbl7 = new JLabel("보너스");
        nlbl7.setHorizontalAlignment(SwingConstants.CENTER);
        springLayout.putConstraint(SpringLayout.WEST, nlbl7, 6, SpringLayout.EAST, lbl2);
        springLayout.putConstraint(SpringLayout.SOUTH, nlbl7, 0, SpringLayout.SOUTH, lbl1);
        frame.getContentPane().add(nlbl7);
        
        JLabel clbl1 = new JLabel("1번");
        springLayout.putConstraint(SpringLayout.NORTH, clbl1, 0, SpringLayout.NORTH, clbl);
        springLayout.putConstraint(SpringLayout.WEST, clbl1, 0, SpringLayout.WEST, lbl4);
        clbl1.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(clbl1);
        
        JLabel clbl2 = new JLabel("2번");
        springLayout.putConstraint(SpringLayout.NORTH, clbl2, 0, SpringLayout.NORTH, clbl);
        springLayout.putConstraint(SpringLayout.EAST, clbl2, 0, SpringLayout.EAST, albl2);
        clbl2.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(clbl2);
        
        JLabel clbl3 = new JLabel("3번");
        springLayout.putConstraint(SpringLayout.WEST, clbl3, 0, SpringLayout.WEST, albl3);
        springLayout.putConstraint(SpringLayout.SOUTH, clbl3, 0, SpringLayout.SOUTH, clbl);
        frame.getContentPane().add(clbl3);
        
        JLabel clbl4 = new JLabel("4번");
        springLayout.putConstraint(SpringLayout.WEST, clbl4, 0, SpringLayout.WEST, albl4);
        springLayout.putConstraint(SpringLayout.SOUTH, clbl4, 0, SpringLayout.SOUTH, clbl);
        frame.getContentPane().add(clbl4);
        
        JLabel clbl5 = new JLabel("5번");
        springLayout.putConstraint(SpringLayout.WEST, clbl5, 0, SpringLayout.WEST, albl5);
        springLayout.putConstraint(SpringLayout.SOUTH, clbl5, 0, SpringLayout.SOUTH, clbl);
        frame.getContentPane().add(clbl5);
        
        JLabel clbl6 = new JLabel("6번");
        springLayout.putConstraint(SpringLayout.NORTH, clbl6, 0, SpringLayout.NORTH, clbl);
        springLayout.putConstraint(SpringLayout.EAST, clbl6, 0, SpringLayout.EAST, btn2);
        clbl6.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(clbl6);
        
        JLabel dlbl1 = new JLabel("1번");
        dlbl1.setHorizontalAlignment(SwingConstants.CENTER);
        springLayout.putConstraint(SpringLayout.NORTH, dlbl1, 0, SpringLayout.NORTH, dlbl);
        springLayout.putConstraint(SpringLayout.WEST, dlbl1, 0, SpringLayout.WEST, lbl4);
        frame.getContentPane().add(dlbl1);
        
        JLabel dlbl2 = new JLabel("2번");
        dlbl2.setHorizontalAlignment(SwingConstants.CENTER);
        springLayout.putConstraint(SpringLayout.NORTH, dlbl2, 0, SpringLayout.NORTH, dlbl);
        springLayout.putConstraint(SpringLayout.WEST, dlbl2, 0, SpringLayout.WEST, albl2);
        frame.getContentPane().add(dlbl2);
        
        JLabel dlbl3 = new JLabel("3번");
        dlbl3.setHorizontalAlignment(SwingConstants.CENTER);
        springLayout.putConstraint(SpringLayout.WEST, dlbl3, 0, SpringLayout.WEST, albl3);
        springLayout.putConstraint(SpringLayout.SOUTH, dlbl3, 0, SpringLayout.SOUTH, dlbl);
        frame.getContentPane().add(dlbl3);
        
        JLabel dlbl4 = new JLabel("4번");
        dlbl4.setHorizontalAlignment(SwingConstants.CENTER);
        springLayout.putConstraint(SpringLayout.WEST, dlbl4, 0, SpringLayout.WEST, albl4);
        springLayout.putConstraint(SpringLayout.SOUTH, dlbl4, 0, SpringLayout.SOUTH, dlbl);
        frame.getContentPane().add(dlbl4);
        
        JLabel dlbl5 = new JLabel("5번");
        dlbl5.setHorizontalAlignment(SwingConstants.CENTER);
        springLayout.putConstraint(SpringLayout.WEST, dlbl5, 0, SpringLayout.WEST, albl5);
        springLayout.putConstraint(SpringLayout.SOUTH, dlbl5, 0, SpringLayout.SOUTH, dlbl);
        frame.getContentPane().add(dlbl5);
        
        JLabel dlbl6 = new JLabel("6번");
        dlbl6.setHorizontalAlignment(SwingConstants.CENTER);
        springLayout.putConstraint(SpringLayout.WEST, dlbl6, 0, SpringLayout.WEST, albl6);
        springLayout.putConstraint(SpringLayout.SOUTH, dlbl6, 0, SpringLayout.SOUTH, dlbl);
        frame.getContentPane().add(dlbl6);
        
        JLabel elbl1 = new JLabel("1번");
        elbl1.setHorizontalAlignment(SwingConstants.CENTER);
        springLayout.putConstraint(SpringLayout.WEST, elbl1, 0, SpringLayout.WEST, lbl4);
        springLayout.putConstraint(SpringLayout.SOUTH, elbl1, 0, SpringLayout.SOUTH, elbl);
        frame.getContentPane().add(elbl1);
        
        JLabel elbl2 = new JLabel("2번");
        elbl2.setHorizontalAlignment(SwingConstants.CENTER);
        springLayout.putConstraint(SpringLayout.NORTH, elbl2, 0, SpringLayout.NORTH, elbl);
        springLayout.putConstraint(SpringLayout.WEST, elbl2, 0, SpringLayout.WEST, albl2);
        frame.getContentPane().add(elbl2);
        
        JLabel elbl3 = new JLabel("3번");
        springLayout.putConstraint(SpringLayout.NORTH, elbl3, 0, SpringLayout.NORTH, elbl);
        springLayout.putConstraint(SpringLayout.EAST, elbl3, 0, SpringLayout.EAST, albl3);
        elbl3.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(elbl3);
        
        JLabel elbl4 = new JLabel("4번");
        elbl4.setHorizontalAlignment(SwingConstants.CENTER);
        springLayout.putConstraint(SpringLayout.NORTH, elbl4, 0, SpringLayout.NORTH, elbl);
        springLayout.putConstraint(SpringLayout.WEST, elbl4, 0, SpringLayout.WEST, albl4);
        frame.getContentPane().add(elbl4);
        
        JLabel elbl5 = new JLabel("5번");
        elbl5.setHorizontalAlignment(SwingConstants.CENTER);
        springLayout.putConstraint(SpringLayout.NORTH, elbl5, 0, SpringLayout.NORTH, elbl);
        springLayout.putConstraint(SpringLayout.WEST, elbl5, 0, SpringLayout.WEST, albl5);
        frame.getContentPane().add(elbl5);
        
        JLabel elbl6 = new JLabel("6번");
        springLayout.putConstraint(SpringLayout.NORTH, elbl6, 0, SpringLayout.NORTH, elbl);
        springLayout.putConstraint(SpringLayout.WEST, elbl6, 0, SpringLayout.WEST, albl6);
        elbl6.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(elbl6);
        
        
      
    
        
        MakeRoom a = new MakeRoom();
        a.makeLottoNumberNew();
       
        
        List<NumberSave> lottoNumbers = a.getLottoNumbers();
        int bonusNumber = lottoNumbers.get(6).getNumber();
        
        Collections.sort(lottoNumbers.subList(0, 6), new Comparator<NumberSave>() {
            @Override
            public int compare(NumberSave number1, NumberSave number2) {
                int num1 = number1.getNumber();
                int num2 = number2.getNumber();
                return Integer.compare(num1, num2);
            }
        });
        
    
      //  for (NumberSave number : lottoNumbers.subList(0, 6)) {
      //      System.out.println(number.getNumber());
     //   }
      //  System.out.println(bonusNumber);
    
      
        
        
        
        
        int numNlbl1 = lottoNumbers.get(0).getNumber();
        nlbl1.setText(String.valueOf(numNlbl1));
        int numNlbl2 = lottoNumbers.get(1).getNumber();
        nlbl2.setText(String.valueOf(numNlbl2));
        int numNlbl3 = lottoNumbers.get(2).getNumber();
        nlbl3.setText(String.valueOf(numNlbl3));
        int numNlbl4 = lottoNumbers.get(3).getNumber();
        nlbl4.setText(String.valueOf(numNlbl4));
        int numNlbl5 = lottoNumbers.get(4).getNumber();
        nlbl5.setText(String.valueOf(numNlbl5));
        int numNlbl6 = lottoNumbers.get(5).getNumber();
        nlbl6.setText(String.valueOf(numNlbl6));
        int numNlbl7 = lottoNumbers.get(6).getNumber();
        nlbl7.setText(String.valueOf(numNlbl7));
       
	}
	
}
