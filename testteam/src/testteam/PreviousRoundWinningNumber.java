package testteam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.SpringLayout;
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


	private JFrame frame;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
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
		
		JLabel lbl5 = new JLabel("회차를 선택하세요");
		springLayout.putConstraint(SpringLayout.WEST, lbl5, 66, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lbl5, 0, SpringLayout.EAST, frame.getContentPane());
		lbl5.setFont(new Font("굴림", Font.PLAIN, 20));
		frame.getContentPane().add(lbl5);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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

				String lottoNumberString = convertListToString(lottoNumbers);
				lbl5.setText(lottoNumberString);
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

			private String convertListToString(List<Integer> numbers) {
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < numbers.size(); i++) {
					sb.append(numbers.get(i));
					if (i < numbers.size() - 2) {
						sb.append("  "); // 번호 간격을 공백으로 설정
					} else {
						sb.append("        "); // 맨 마지막 번호에 더 많은 공백 추가
					}
				}
				return sb.toString();
			}

		});
		frame.getContentPane().add(selectBox);
		
		JLabel lblNewLabel = new JLabel("당첨번호");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 170, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lbl5, -27, SpringLayout.NORTH, lblNewLabel);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 123, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("보너스");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 2, SpringLayout.NORTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, 0, SpringLayout.EAST, lbl2);
		frame.getContentPane().add(lblNewLabel_1);

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
		MakeRoom a = new MakeRoom();
		a.makeLottoNumber();
		List<NumberSave> lottoNumbers = a.lottoNumber.get(1); // 로또 번호를 가져옵니다.
		for (NumberSave number : lottoNumbers) {
		    System.out.println(number);
		}
}
}
