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

public class WinningNumber {
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinningNumber window = new WinningNumber();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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
		MakeRoom a= new MakeRoom();
		a.makeLottoNumber();
		a.makeAutoNumber(2312);
		
		

		
	
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JLabel lbl1 = new JLabel("1등 당첨 번호:");
		springLayout.putConstraint(SpringLayout.NORTH, lbl1, 24, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lbl1, 79, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lbl1, -271, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(lbl1);
		
		JLabel lbl2 = new JLabel("5 6 23 28 33 45");
		springLayout.putConstraint(SpringLayout.NORTH, lbl2, 24, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lbl2, 2, SpringLayout.EAST, lbl1);
		springLayout.putConstraint(SpringLayout.EAST, lbl2, 97, SpringLayout.EAST, lbl1);
		frame.getContentPane().add(lbl2);
		
		JLabel lbl3 = new JLabel("보너스 번호:");
		springLayout.putConstraint(SpringLayout.NORTH, lbl3, 0, SpringLayout.NORTH, lbl1);
		springLayout.putConstraint(SpringLayout.WEST, lbl3, 6, SpringLayout.EAST, lbl2);
		springLayout.putConstraint(SpringLayout.EAST, lbl3, -95, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(lbl3);
		
		JLabel lbl4 = new JLabel("36");
		springLayout.putConstraint(SpringLayout.NORTH, lbl4, 0, SpringLayout.NORTH, lbl1);
		springLayout.putConstraint(SpringLayout.WEST, lbl4, 6, SpringLayout.EAST, lbl3);
		springLayout.putConstraint(SpringLayout.EAST, lbl4, -68, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(lbl4);
		
		JTextArea txtr1 = new JTextArea();
		springLayout.putConstraint(SpringLayout.NORTH, txtr1, 66, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, txtr1, 117, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, txtr1, -119, SpringLayout.EAST, frame.getContentPane());
		txtr1.setText("A 수동 5 6 23 28 33 36\r\nB 수동 5 6 23 28 33 36\r\nC 자동 5 6 23 28 33 36\r\nD 수동 5 6 23 28 33 36\r\nE 수동 5 6 23 28 33 36");
		frame.getContentPane().add(txtr1);
		
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
		
		JLabel lbl6 = new JLabel("경 축 !! 2등 당첨 되었습니다");
		springLayout.putConstraint(SpringLayout.SOUTH, txtr1, -9, SpringLayout.NORTH, lbl6);
		springLayout.putConstraint(SpringLayout.NORTH, lbl6, 187, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lbl6, 147, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, btn1, 6, SpringLayout.SOUTH, lbl6);
		frame.getContentPane().add(lbl6);
		
		JLabel lbl5 = new JLabel("내 선택 첫번째 번호 :");
		springLayout.putConstraint(SpringLayout.NORTH, lbl5, 6, SpringLayout.SOUTH, lbl1);
		springLayout.putConstraint(SpringLayout.WEST, lbl5, 155, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lbl5, -6, SpringLayout.NORTH, txtr1);
		frame.getContentPane().add(lbl5);
		
		Map<Integer, List<NumberSave>> lottoNumber = a.getLottoNumber(); // lottoNumber 맵 가져오기
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<Integer, List<NumberSave>> entry : lottoNumber.entrySet()) {
			List<NumberSave> numbers = entry.getValue();
			// 로또 번호 정렬
			Collections.sort(numbers);
			// 로또 번호 추가
			for (NumberSave number : numbers) {
				sb.append(number).append(" ");
			}
			sb.append("\n");
		}
		
		txtr1.setText(sb.toString());
//		
//		
//        List<Integer> autoLottoNumbers = a.getAutoLottoNumbers();
//
//        Collections.sort(autoLottoNumbers);
//
//        List<Integer> selectedNumbers = autoLottoNumbers.subList(0, 6);
//
//        String lbl2Text = selectedNumbers.stream()
//                .map(String::valueOf)
//                .collect(Collectors.joining(" "));
//        lbl2.setText(lbl2Text);
//
//        int lastNumber = autoLottoNumbers.get(autoLottoNumbers.size() - 1);
//
//        lbl4.setText(String.valueOf(lastNumber));
//		 
		
	}
		
		
	}
