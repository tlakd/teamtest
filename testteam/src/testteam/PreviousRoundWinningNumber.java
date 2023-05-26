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
		
		JButton btn = new JButton("이전으로");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		springLayout.putConstraint(SpringLayout.SOUTH, btn, -24, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btn, -24, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(btn);
		
		JLabel lbl1 = new JLabel("이전 회차 당첨 번호");
		springLayout.putConstraint(SpringLayout.NORTH, lbl1, 62, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lbl1, 48, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lbl1, -270, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(lbl1);
		
		JLabel lbl2 = new JLabel("회차 선택 :");
		springLayout.putConstraint(SpringLayout.NORTH, lbl2, 114, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lbl2, 48, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lbl2);
		
		
		JLabel lbl3 = new JLabel("회차");
		springLayout.putConstraint(SpringLayout.EAST, lbl3, -108, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(lbl3);
		
		JLabel lbl4 = new JLabel("?");
		springLayout.putConstraint(SpringLayout.WEST, lbl4, 114, SpringLayout.EAST, lbl1);
		springLayout.putConstraint(SpringLayout.EAST, lbl4, 0, SpringLayout.WEST, lbl3);
		frame.getContentPane().add(lbl4);
		
		JLabel lbl5 = new JLabel("회차를 선택하세요");
		springLayout.putConstraint(SpringLayout.SOUTH, lbl4, -20, SpringLayout.NORTH, lbl5);
		springLayout.putConstraint(SpringLayout.SOUTH, lbl3, -20, SpringLayout.NORTH, lbl5);
		springLayout.putConstraint(SpringLayout.NORTH, lbl5, 0, SpringLayout.NORTH, lbl2);
		springLayout.putConstraint(SpringLayout.WEST, lbl5, -172, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lbl5, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(lbl5);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JComboBox<Integer> selectBox = new JComboBox<>();
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
						sb.append(" "); // 번호 간격을 공백으로 설정
					} else {
						sb.append("      "); // 맨 마지막 번호에 더 많은 공백 추가
					}
				}
				return sb.toString();
			}

		});

		springLayout.putConstraint(SpringLayout.SOUTH, lbl1, -15, SpringLayout.NORTH, selectBox);
		springLayout.putConstraint(SpringLayout.NORTH, selectBox, -3, SpringLayout.NORTH, lbl2);
		springLayout.putConstraint(SpringLayout.WEST, selectBox, 17, SpringLayout.EAST, lbl2);
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
