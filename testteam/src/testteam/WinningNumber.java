package testteam;

import java.awt.Color;
import java.awt.Component;
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
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.ImageIcon;
import java.awt.Font;

public class WinningNumber {
	JFrame frame;
	String numberText;
	String firstNumber;
	private JLabel albl, albl1, albl2, albl3, albl4, albl5, albl6;
	private JLabel blbl, blbl1, blbl2, blbl3, blbl4, blbl5, blbl6;
	private JLabel clbl, clbl1, clbl2, clbl3, clbl4, clbl5, clbl6;
	private JLabel dlbl, dlbl1, dlbl2, dlbl3, dlbl4, dlbl5, dlbl6;
	private JLabel elbl, elbl1, elbl2, elbl3, elbl4, elbl5, elbl6;
	private JLabel nlbl1, nlbl2, nlbl3, nlbl4, nlbl5, nlbl6, nlbl7;
	private JButton btn2;
	private Map<Integer, List<NumberSave>> userNumber;
	private Map<Integer, String> autoNotAuto;
	private JLabel lbl3, lbl8;
	private List<NumberSave> numbers;
	private int count = 0;
	private JLabel lblB;
	private JLabel lblC;
	private JLabel lblD;
	private JLabel lblE;
	private JLabel lblA;
	private JLabel lblx;
	private JLabel lbly;
	private JLabel lblz;
	private JLabel lblp2;
	private JLabel lblp3;
	private JLabel lblp4;
	private JLabel lblp5;
	private JLabel lblp1;

	public String getNumberText() {
		return numberText;
	}

	public void setNumberText(String numberText) {
		this.numberText = numberText;
	}

	public void 자동여러장구매시(Map<Integer, List<NumberSave>> userNumber, Map<Integer, String> autoNotAuto) {
		System.out.println("자동 여러장 구매시 메소드 실행");
		this.userNumber = userNumber;
		this.autoNotAuto = autoNotAuto;
		
		for (int i = 1; i <= this.userNumber.size(); i++) {
			numbers = this.userNumber.get(i);
			String autoType = this.autoNotAuto.get(i);

			for (int j = 0; j < numbers.size(); j++) {
				NumberSave number = numbers.get(j);
				String lottoNumber = String.valueOf(number.getNumber());

				// Assign the lotto number to the corresponding label based on the index
				if (i == 1) {
					switch (j) {
					case 0:
						albl1.setText(lottoNumber);
						break;
					case 1:
						albl2.setText(lottoNumber);
						break;
					case 2:
						albl3.setText(lottoNumber);
						break;
					case 3:
						albl4.setText(lottoNumber);
						break;
					case 4:
						albl5.setText(lottoNumber);
						break;
					case 5:
						albl6.setText(lottoNumber);
						break;
					default:
						break;
					}
				} else if (i == 2) {
					switch (j) {
					case 0:
						blbl1.setText(lottoNumber);
						break;
					case 1:
						blbl2.setText(lottoNumber);
						break;
					case 2:
						blbl3.setText(lottoNumber);
						break;
					case 3:
						blbl4.setText(lottoNumber);
						break;
					case 4:
						blbl5.setText(lottoNumber);
						break;
					case 5:
						blbl6.setText(lottoNumber);
						break;
					default:
						break;
					}
				} else if (i == 3) {
					switch (j) {
					case 0:
						clbl1.setText(lottoNumber);
						break;
					case 1:
						clbl2.setText(lottoNumber);
						break;
					case 2:
						clbl3.setText(lottoNumber);
						break;
					case 3:
						clbl4.setText(lottoNumber);
						break;
					case 4:
						clbl5.setText(lottoNumber);
						break;
					case 5:
						clbl6.setText(lottoNumber);
						break;
					default:
						break;
					}
				} else if (i == 4) {
					switch (j) {
					case 0:
						dlbl1.setText(lottoNumber);
						break;
					case 1:
						dlbl2.setText(lottoNumber);
						break;
					case 2:
						dlbl3.setText(lottoNumber);
						break;
					case 3:
						dlbl4.setText(lottoNumber);
						break;
					case 4:
						dlbl5.setText(lottoNumber);
						break;
					case 5:
						dlbl6.setText(lottoNumber);
						break;
					default:
						break;
					}
				} else if (i == 5) {
					switch (j) {
					case 0:
						elbl1.setText(lottoNumber);
						break;
					case 1:
						elbl2.setText(lottoNumber);
						break;
					case 2:
						elbl3.setText(lottoNumber);
						break;
					case 3:
						elbl4.setText(lottoNumber);
						break;
					case 4:
						elbl5.setText(lottoNumber);
						break;
					case 5:
						elbl6.setText(lottoNumber);
						break;
					default:
						break;
					}
				}
			}

			// Assign the auto type to the corresponding label
			if (i == 1) {
				albl.setText(autoType);
				lblA.setText("A");
			} else if (i == 2) {
				blbl.setText(autoType);
				lblB.setText("B");
			} else if (i == 3) {
				clbl.setText(autoType);
				lblC.setText("C");
			} else if (i == 4) {
				dlbl.setText(autoType);
				lblD.setText("D");
			} else if (i == 5) {
				elbl.setText(autoType);
				lblE.setText("E");
			}

		}
        lbly.setText(String.valueOf(userNumber.size()));
		글자색깔변경();
	}

	private void 글자색깔변경() {
		Component[] components = { albl1, albl2, albl3, albl4, albl5, albl6, blbl1, blbl2, blbl3, blbl4, blbl5, blbl6,
				clbl1, clbl2, clbl3, clbl4, clbl5, clbl6, dlbl1, dlbl2, dlbl3, dlbl4, dlbl5, dlbl6, elbl1, elbl2, elbl3,
				elbl4, elbl5, elbl6 };
		for (Component component : components) {
			component.setForeground(Color.BLACK);
		}
		System.out.println("글자색깔변경 메소드 실행");
		Component[] component1 = { albl1, albl2, albl3, albl4, albl5, albl6, blbl1, blbl2, blbl3, blbl4, blbl5, blbl6,
				clbl1, clbl2, clbl3, clbl4, clbl5, clbl6, dlbl1, dlbl2, dlbl3, dlbl4, dlbl5, dlbl6, elbl1, elbl2, elbl3,
				elbl4, elbl5, elbl6 };

		String[] nlblTexts = { nlbl1.getText(), nlbl2.getText(), nlbl3.getText(), nlbl4.getText(), nlbl5.getText(),
				nlbl6.getText() };

		for (String nlblText : nlblTexts) {
			for (Component component : component1) {
				if (nlblText.equals(((JLabel) component).getText())) {
					((JLabel) component).setForeground(Color.RED);
				}
			}
		}

		int colorCountA = 0;

		if (albl1.getForeground() == Color.RED) {
			colorCountA++;
		}
		if (albl2.getForeground() == Color.RED) {
			colorCountA++;
		}
		if (albl3.getForeground() == Color.RED) {
			colorCountA++;
		}
		if (albl4.getForeground() == Color.RED) {
			colorCountA++;
		}
		if (albl5.getForeground() == Color.RED) {
			colorCountA++;
		}
		if (albl6.getForeground() == Color.RED) {
			colorCountA++;
		}

		switch (colorCountA) {
		case 3:
			lbl3.setText("경 축 !! 5등 당첨 되었습니다.");
			lblp1.setText("당첨");
			break;
		case 4:
			lbl3.setText("경 축 !! 4등 당첨 되었습니다.");
			lblp1.setText("당첨");
			break;
		case 5:
			if (nlbl7.getText().equals(albl1.getText()) || nlbl7.getText().equals(albl2.getText())
					|| nlbl7.getText().equals(albl3.getText()) || nlbl7.getText().equals(albl4.getText())
					|| nlbl7.getText().equals(albl5.getText()) || nlbl7.getText().equals(albl6.getText())) {
				lbl3.setText("경 축 !! 2등 당첨 되었습니다.");
				lblp1.setText("당첨");
			} else {
				lbl3.setText("경 축 !! 3등 당첨 되었습니다.");
				lblp1.setText("당첨");
			}
			break;
		case 6:
			lbl3.setText("경 축 !! 1등 당첨 되었습니다.");
			lblp1.setText("당첨");
			break;
		}

		int colorCountB = 0;

		if (blbl1.getForeground() == Color.RED) {
			colorCountB++;
		}
		if (blbl2.getForeground() == Color.RED) {
			colorCountB++;
		}
		if (blbl3.getForeground() == Color.RED) {
			colorCountB++;
		}
		if (blbl4.getForeground() == Color.RED) {
			colorCountB++;
		}
		if (blbl5.getForeground() == Color.RED) {
			colorCountB++;
		}
		if (blbl6.getForeground() == Color.RED) {
			colorCountB++;
		}

		switch (colorCountB) {
		case 3:
			lbl3.setText("경 축 !! 5등 당첨 되었습니다.");
			lblp2.setText("당첨");
			break;
		case 4:
			lbl3.setText("경 축 !! 4등 당첨 되었습니다.");
			lblp2.setText("당첨");
			break;
		case 5:
			if (nlbl7.getText().equals(blbl1.getText()) || nlbl7.getText().equals(blbl2.getText())
					|| nlbl7.getText().equals(blbl3.getText()) || nlbl7.getText().equals(blbl4.getText())
					|| nlbl7.getText().equals(blbl5.getText()) || nlbl7.getText().equals(blbl6.getText())) {
				lbl3.setText("경 축 !! 2등 당첨 되었습니다.");
				lblp2.setText("당첨");
			} else {
				lbl3.setText("경 축 !! 3등 당첨 되었습니다.");
				lblp2.setText("당첨");
			}
			break;
		case 6:
			lbl3.setText("경 축 !! 1등 당첨 되었습니다.");
			lblp2.setText("당첨");
			break;
		}

		int colorCountC = 0;

		if (clbl1.getForeground() == Color.RED) {
			colorCountC++;
		}
		if (clbl2.getForeground() == Color.RED) {
			colorCountC++;
		}
		if (clbl3.getForeground() == Color.RED) {
			colorCountC++;
		}
		if (clbl4.getForeground() == Color.RED) {
			colorCountC++;
		}
		if (clbl5.getForeground() == Color.RED) {
			colorCountC++;
		}
		if (clbl6.getForeground() == Color.RED) {
			colorCountC++;
		}

		switch (colorCountC) {
		case 3:
			lbl3.setText("경 축 !! 5등 당첨 되었습니다.");
			lblp3.setText("당첨");
			break;
		case 4:
			lbl3.setText("경 축 !! 4등 당첨 되었습니다.");
			lblp3.setText("당첨");
			break;
		case 5:
			if (nlbl7.getText().equals(clbl1.getText()) || nlbl7.getText().equals(clbl2.getText())
					|| nlbl7.getText().equals(clbl3.getText()) || nlbl7.getText().equals(clbl4.getText())
					|| nlbl7.getText().equals(clbl5.getText()) || nlbl7.getText().equals(clbl6.getText())) {
				lbl3.setText("경 축 !! 2등 당첨 되었습니다.");
				lblp3.setText("당첨");
			} else {
				lbl3.setText("경 축 !! 3등 당첨 되었습니다.");
				lblp3.setText("당첨");
			}
			break;
		case 6:
			lbl3.setText("경 축 !! 1등 당첨 되었습니다.");
			lblp3.setText("당첨");
			break;
		}

		int colorCountD = 0;

		if (dlbl1.getForeground() == Color.RED) {
			colorCountD++;
		}
		if (dlbl2.getForeground() == Color.RED) {
			colorCountD++;
		}
		if (dlbl3.getForeground() == Color.RED) {
			colorCountD++;
		}
		if (dlbl4.getForeground() == Color.RED) {
			colorCountD++;
		}
		if (dlbl5.getForeground() == Color.RED) {
			colorCountD++;
		}
		if (dlbl6.getForeground() == Color.RED) {
			colorCountD++;
		}

		switch (colorCountD) {
		case 3:
			lbl3.setText("경 축 !! 5등 당첨 되었습니다.");
			lblp4.setText("당첨");
			break;
		case 4:
			lbl3.setText("경 축 !! 4등 당첨 되었습니다.");
			lblp4.setText("당첨");
			break;
		case 5:
			if (nlbl7.getText().equals(dlbl1.getText()) || nlbl7.getText().equals(dlbl2.getText())
					|| nlbl7.getText().equals(dlbl3.getText()) || nlbl7.getText().equals(dlbl4.getText())
					|| nlbl7.getText().equals(dlbl5.getText()) || nlbl7.getText().equals(dlbl6.getText())) {
				lbl3.setText("경 축 !! 2등 당첨 되었습니다.");
				lblp4.setText("당첨");
			} else {
				lbl3.setText("경 축 !! 3등 당첨 되었습니다.");
				lblp4.setText("당첨");
			}
			break;
		case 6:
			lbl3.setText("경 축 !! 1등 당첨 되었습니다.");
			lblp4.setText("당첨");
			break;
		}

		int colorCountE = 0;

		if (elbl1.getForeground() == Color.RED) {
			colorCountE++;
		}
		if (elbl2.getForeground() == Color.RED) {
			colorCountE++;
		}
		if (elbl3.getForeground() == Color.RED) {
			colorCountE++;
		}
		if (elbl4.getForeground() == Color.RED) {
			colorCountE++;
		}
		if (elbl5.getForeground() == Color.RED) {
			colorCountE++;
		}
		if (elbl6.getForeground() == Color.RED) {
			colorCountE++;
		}

		switch (colorCountE) {
		case 3:
			lbl3.setText("경 축 !! 5등 당첨 되었습니다.");
			lblp5.setText("당첨");
			break;
		case 4:
			lbl3.setText("경 축 !! 4등 당첨 되었습니다.");
			lblp5.setText("당첨");
			break;
		case 5:
			if (nlbl7.getText().equals(elbl1.getText()) || nlbl7.getText().equals(elbl2.getText())
					|| nlbl7.getText().equals(elbl3.getText()) || nlbl7.getText().equals(elbl4.getText())
					|| nlbl7.getText().equals(elbl5.getText()) || nlbl7.getText().equals(elbl6.getText())) {
				lbl3.setText("경 축 !! 2등 당첨 되었습니다.");
				lblp5.setText("당첨");
			} else {
				lbl3.setText("경 축 !! 3등 당첨 되었습니다.");
				lblp5.setText("당첨");
			}
			break;
		case 6:
			lbl3.setText("경 축 !! 1등 당첨 되었습니다.");
			lblp5.setText("당첨");
			break;
		}
		if (colorCountA < 3 && colorCountB < 3 && colorCountC < 3 && colorCountD < 3 && colorCountE < 3) {
			lbl3.setText("낙첨 되었습니다.");
		}

		if (colorCountA == 3 && colorCountB == 3) {
			lbl3.setText("경 축 !! 5등 두 개 당첨 되었습니다.");
			lblp1.setText("당첨");
			lblp2.setText("당첨");
		}
		
		

		else if (colorCountA == 3 && colorCountC == 3) {
			lbl3.setText("경 축 !! 5등  두 개 당첨 되었습니다.");
			lblp1.setText("당첨");
			lblp3.setText("당첨");
		}
		else if (colorCountA == 3 && colorCountD == 3) {
			lbl3.setText("경 축 !! 5등  두 개 당첨 되었습니다.");
			lblp1.setText("당첨");
			lblp4.setText("당첨");
		}
		else if (colorCountA == 3 && colorCountE == 3) {
			lbl3.setText("경 축 !! 5등  두 개 당첨 되었습니다.");
			lblp1.setText("당첨");
			lblp5.setText("당첨");
		}
		else if (colorCountB == 3 && colorCountC == 3) {
			lbl3.setText("b경 축 !! 5등  두 개 당첨 되었습니다.");
			lblp2.setText("당첨");
			lblp3.setText("당첨");
		}
		else if (colorCountB == 3 && colorCountD == 3) {
			lbl3.setText("경 축 !! 5등  두 개 당첨 되었습니다.");
			lblp2.setText("당첨");
			lblp4.setText("당첨");
		}
		else if (colorCountB == 3 && colorCountE == 3) {
			lbl3.setText("경 축 !! 5등  두 개 당첨 되었습니다.");
			lblp2.setText("당첨");
			lblp5.setText("당첨");
		}
		else if (colorCountC == 3 && colorCountD == 3) {
			lbl3.setText("경 축 !! 5등  두 개 당첨 되었습니다.");
			lblp3.setText("당첨");
			lblp4.setText("당첨");
		}
		else if (colorCountC == 3 && colorCountE == 3) {
			lbl3.setText("경 축 !! 5등  두 개 당첨 되었습니다.");
			lblp3.setText("당첨");
			lblp5.setText("당첨");
		}
		else if (colorCountD == 3 && colorCountE == 3) {
			lbl3.setText("경 축 !! 5등  두 개 당첨 되었습니다.");
			lblp4.setText("당첨");
			lblp5.setText("당첨");
		}

		
		
		else if (colorCountA == 4 && colorCountB == 4) {
			lbl3.setText("경 축 !! 4등  두 개 당첨 되었습니다.");
			lblp1.setText("당첨");
			lblp2.setText("당첨");
		}
		else if (colorCountA == 4 && colorCountC == 4) {
			lbl3.setText("경 축 !! 4등  두 개 당첨 되었습니다.");
			lblp1.setText("당첨");
			lblp3.setText("당첨");
		}
		else if (colorCountA == 4 && colorCountD == 4) {
			lbl3.setText("경 축 !! 4등  두 개 당첨 되었습니다.");
			lblp1.setText("당첨");
			lblp4.setText("당첨");
		}
		else if (colorCountA == 4 && colorCountE == 4) {
			lbl3.setText("경 축 !! 4등  두 개 당첨 되었습니다.");
			lblp1.setText("당첨");
			lblp5.setText("당첨");
		}
		else if (colorCountB == 4 && colorCountC == 4) {
			lbl3.setText("경 축 !! 4등  두 개 당첨 되었습니다.");
			lblp2.setText("당첨");
			lblp3.setText("당첨");
		}
		else if (colorCountB == 4 && colorCountD == 4) {
			lbl3.setText("경 축 !! 4등  두 개 당첨 되었습니다.");
			lblp2.setText("당첨");
			lblp4.setText("당첨");
		}
		else if (colorCountB == 4 && colorCountE == 4) {
			lbl3.setText("경 축 !! 4등  두 개 당첨 되었습니다.");
			lblp2.setText("당첨");
			lblp5.setText("당첨");
		}
		else if (colorCountC == 4 && colorCountD == 4) {
			lbl3.setText("경 축 !! 4등  두 개 당첨 되었습니다.");
			lblp3.setText("당첨");
			lblp4.setText("당첨");
		}
		else if (colorCountC == 4 && colorCountE == 4) {
			lbl3.setText("경 축 !! 4등  두 개 당첨 되었습니다.");
			lblp3.setText("당첨");
			lblp5.setText("당첨");
		}
		else if (colorCountD == 4 && colorCountE == 4) {
			lbl3.setText("경 축 !! 4등  두 개 당첨 되었습니다.");
			lblp4.setText("당첨");
			lblp5.setText("당첨");
		}

		
		
		if (colorCountA == 5 && colorCountB == 5) {
			lbl3.setText("경 축 !! 3등  두 개 당첨 되었습니다.");
			lblp1.setText("당첨");
			lblp2.setText("당첨");
		}

		if (colorCountA == 5 && colorCountC == 5) {
			lbl3.setText("경 축 !! 3등  두 개 당첨 되었습니다.");
		}
		if (colorCountA == 5 && colorCountD == 5) {
			lbl3.setText("경 축 !! 3등  두 개 당첨 되었습니다.");
		}
		if (colorCountA == 5 && colorCountE == 5) {
			lbl3.setText("경 축 !! 3등  두 개 당첨 되었습니다.");
		}
		if (colorCountB == 5 && colorCountC == 5) {
			lbl3.setText("경 축 !! 3등  두 개 당첨 되었습니다.");
		}
		if (colorCountB == 5 && colorCountD == 5) {
			lbl3.setText("경 축 !! 3등  두 개 당첨 되었습니다.");
		}
		if (colorCountB == 5 && colorCountE == 5) {
			lbl3.setText("경 축 !! 3등  두 개 당첨 되었습니다.");
		}
		if (colorCountC == 5 && colorCountD == 5) {
			lbl3.setText("경 축 !! 3등  두 개 당첨 되었습니다.");
		}
		if (colorCountC == 5 && colorCountE == 5) {
			lbl3.setText("경 축 !! 3등  두 개 당첨 되었습니다.");
		}
		if (colorCountD == 5 && colorCountE == 5) {
			lbl3.setText("경 축 !! 3등  두 개 당첨 되었습니다.");
		}

	}

	public static void main(String[] args) {
		
	}

	/**
	 * Create the application.
	 * 
	 * @wbp.parser.entryPoint
	 */
	public WinningNumber() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 510, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lbl1 = new JLabel("당첨 번호");
		lbl1.setFont(new Font("HY견고딕", Font.BOLD, 17));
		lbl1.setBounds(39, 248, 84, 24);
		frame.getContentPane().add(lbl1);

		JLabel lbl2 = new JLabel("+");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		lbl2.setBounds(370, 248, 35, 25);
		frame.getContentPane().add(lbl2);

		JButton btn1 = new JButton("");
		btn1.setIcon(new ImageIcon(WinningNumber.class.getResource("/image/홈버튼.jpg")));
		btn1.setSelectedIcon(new ImageIcon(WinningNumber.class.getResource("/image/홈버튼.jpg")));
		btn1.setBounds(8, 7, 48, 43);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 MainBack mainBack = new MainBack();
			}
		});
		frame.getContentPane().add(btn1);

		btn2 = new JButton("");
		btn2.setSelectedIcon(new ImageIcon(WinningNumber.class.getResource("/image/다음5.jpg")));
		btn2.setIcon(new ImageIcon(WinningNumber.class.getResource("/image/다음5.jpg")));
		btn2.setBounds(432, 481, 50, 36);

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
			    int tempCount = count;

			    if (count == 0) {
			        tempCount++;
			    }

			    tempCount++;

			    if ((tempCount - 1) * 5 >= userNumber.size()) {
			        // 로또 번호를 더 이상 참조할 수 없을 때 경고문을 표시합니다.
			        JOptionPane.showMessageDialog(null, "더 이상 로또 번호가 없습니다.", "경고", JOptionPane.WARNING_MESSAGE);
			        return;
			    }

			    count = tempCount;
			    lbl8.setText("내 선택 " + String.valueOf(count) + " 번째 번호 :");
			        for (int i = (count - 1) * 5; i < count * 5; i++) {
			            if (i < userNumber.size()) {
			                int index = i % 5;
			                switch (index) {
			                    case 0:
			                albl1.setText(userNumber.get(i).get(0).toString());
			                albl2.setText(userNumber.get(i).get(1).toString());
			                albl3.setText(userNumber.get(i).get(2).toString());
			                albl4.setText(userNumber.get(i).get(3).toString());
			                albl5.setText(userNumber.get(i).get(4).toString());
			                albl6.setText(userNumber.get(i).get(5).toString());
			                
			                lblp1.setText("");
			    			lblp2.setText("");
			    			lblp3.setText("");
			    			lblp4.setText("");
			    			lblp5.setText("");
			                
			                if(autoNotAuto.get(i).equals("자 동")) {
			                albl.setText("자 동");
			                lblA.setText("A");
			                
			                }
			                break;
			            case 1:
			                blbl1.setText(userNumber.get(i).get(0).toString());
			                blbl2.setText(userNumber.get(i).get(1).toString());
			                blbl3.setText(userNumber.get(i).get(2).toString());
			                blbl4.setText(userNumber.get(i).get(3).toString());
			                blbl5.setText(userNumber.get(i).get(4).toString());
			                blbl6.setText(userNumber.get(i).get(5).toString());
			                
			                lblp1.setText("");
			    			lblp2.setText("");
			    			lblp3.setText("");
			    			lblp4.setText("");
			    			lblp5.setText("");
			                
			                if(autoNotAuto.get(i).equals("자 동")) {
				                blbl.setText("자 동");
			                lblB.setText("B");
			                }
			                break;
			            case 2:
			                clbl1.setText(userNumber.get(i).get(0).toString());
			                clbl2.setText(userNumber.get(i).get(1).toString());
			                clbl3.setText(userNumber.get(i).get(2).toString());
			                clbl4.setText(userNumber.get(i).get(3).toString());
			                clbl5.setText(userNumber.get(i).get(4).toString());
			                clbl6.setText(userNumber.get(i).get(5).toString());
			                
			                lblp1.setText("");
			    			lblp2.setText("");
			    			lblp3.setText("");
			    			lblp4.setText("");
			    			lblp5.setText("");
			                
			                if(autoNotAuto.get(i).equals("자 동")) {
				                clbl.setText("자 동");
			                lblC.setText("C");
			                }
			                break;
			            case 3:
			                dlbl1.setText(userNumber.get(i).get(0).toString());
			                dlbl2.setText(userNumber.get(i).get(1).toString());
			                dlbl3.setText(userNumber.get(i).get(2).toString());
			                dlbl4.setText(userNumber.get(i).get(3).toString());
			                dlbl5.setText(userNumber.get(i).get(4).toString());
			                dlbl6.setText(userNumber.get(i).get(5).toString());
			                
			                lblp1.setText("");
			    			lblp2.setText("");
			    			lblp3.setText("");
			    			lblp4.setText("");
			    			lblp5.setText("");
			                
			                if(autoNotAuto.get(i).equals("자 동")) {
				                dlbl.setText("자 동");
			                lblD.setText("D");}
			                break;
			            case 4:
			                elbl1.setText(userNumber.get(i).get(0).toString());
			                elbl2.setText(userNumber.get(i).get(1).toString());
			                elbl3.setText(userNumber.get(i).get(2).toString());
			                elbl4.setText(userNumber.get(i).get(3).toString());
			                elbl5.setText(userNumber.get(i).get(4).toString());
			                elbl6.setText(userNumber.get(i).get(5).toString());
			                
			                lblp1.setText("");
			    			lblp2.setText("");
			    			lblp3.setText("");
			    			lblp4.setText("");
			    			lblp5.setText("");
			                
			                if(autoNotAuto.get(i).equals("자 동")) {
				                elbl.setText("자 동");
			                lblE.setText("E");
			                }
			                break;
			        }
			       }else {
		                // usernumber.size()보다 큰 인덱스의 레이블을 공백으로 처리합니다.
		                int index = i % 5;
		                switch (index) {
		                    case 0:
		                    	lblp1.setText("");
				    			lblp2.setText("");
				    			lblp3.setText("");
				    			lblp4.setText("");
				    			lblp5.setText("");
				    			
		                        albl1.setText("");
		                        albl2.setText("");
		                        albl3.setText("");
		                        albl4.setText("");
		                        albl5.setText("");
		                        albl6.setText("");
		                        albl.setText("");
		                        lblA.setText("");
		                        break;
		                    case 1:
		                    	lblp1.setText("");
				    			lblp2.setText("");
				    			lblp3.setText("");
				    			lblp4.setText("");
				    			lblp5.setText("");
				    			
		                        blbl1.setText("");
		                        blbl2.setText("");
		                        blbl3.setText("");
		                        blbl4.setText("");
		                        blbl5.setText("");
		                        blbl6.setText("");
		                        blbl.setText("");
		                        lblB.setText("");
		                        break;
		                    case 2:
		                    	lblp1.setText("");
				    			lblp2.setText("");
				    			lblp3.setText("");
				    			lblp4.setText("");
				    			lblp5.setText("");
				    			
		                        clbl1.setText("");
		                        clbl2.setText("");
		                        clbl3.setText("");
		                        clbl4.setText("");
		                        clbl5.setText("");
		                        clbl6.setText("");
		                        clbl.setText("");
		                        lblC.setText("");
		                        break;
		                    case 3:
		                    	lblp1.setText("");
				    			lblp2.setText("");
				    			lblp3.setText("");
				    			lblp4.setText("");
				    			lblp5.setText("");
				    			
		                        dlbl1.setText("");
		                        dlbl2.setText("");
		                        dlbl3.setText("");
		                        dlbl4.setText("");
		                        dlbl5.setText("");
		                        dlbl6.setText("");
		                        dlbl.setText("");
		                        lblD.setText("");
		                        break;
		                    case 4:
		                    	lblp1.setText("");
				    			lblp2.setText("");
				    			lblp3.setText("");
				    			lblp4.setText("");
				    			lblp5.setText("");
				    			
		                        elbl1.setText("");
		                        elbl2.setText("");
		                        elbl3.setText("");
		                        elbl4.setText("");
		                        elbl5.setText("");
		                        elbl6.setText("");
		                        elbl.setText("");
		                        lblE.setText("");
		                        break;
		                }
		            }
		        }
			

		        글자색깔변경();
		    }
		});
		frame.getContentPane().add(btn2);

		lbl3 = new JLabel("당첨 유무");
		lbl3.setFont(new Font("HY견고딕", Font.BOLD, 23));
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setBounds(93, 81, 303, 36);
		frame.getContentPane().add(lbl3);

		lbl8 = new JLabel("내 선택 1 번째 번호");
		lbl8.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		lbl8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl8.setBounds(154, 488, 186, 21);
		frame.getContentPane().add(lbl8);

		albl = new JLabel("자동");
		albl.setFont(new Font("HY견고딕", Font.PLAIN, 15));
		albl.setHorizontalAlignment(SwingConstants.CENTER);
		albl.setBounds(119, 312, 40, 15);
		frame.getContentPane().add(albl);

		blbl = new JLabel("자동");
		blbl.setFont(new Font("HY견고딕", Font.PLAIN, 15));
		blbl.setHorizontalAlignment(SwingConstants.CENTER);
		blbl.setBounds(119, 348, 40, 15);
		frame.getContentPane().add(blbl);

		clbl = new JLabel("자동");
		clbl.setFont(new Font("HY견고딕", Font.PLAIN, 15));
		clbl.setHorizontalAlignment(SwingConstants.CENTER);
		clbl.setBounds(119, 380, 40, 15);
		frame.getContentPane().add(clbl);

		dlbl = new JLabel("자동");
		dlbl.setFont(new Font("HY견고딕", Font.PLAIN, 15));
		dlbl.setHorizontalAlignment(SwingConstants.CENTER);
		dlbl.setBounds(119, 416, 40, 15);
		frame.getContentPane().add(dlbl);

		elbl = new JLabel("자동");
		elbl.setFont(new Font("HY견고딕", Font.PLAIN, 15));
		elbl.setHorizontalAlignment(SwingConstants.CENTER);
		elbl.setBounds(119, 451, 40, 15);
		frame.getContentPane().add(elbl);

		this.albl1 = new JLabel("1");
		albl1.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		albl1.setBounds(170, 308, 35, 25);
		albl1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(albl1);

		albl2 = new JLabel("2");
		albl2.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		albl2.setBounds(220, 308, 35, 25);
		albl2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(albl2);

		albl3 = new JLabel("3");
		albl3.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		albl3.setBounds(270, 308, 35, 25);
		albl3.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(albl3);

		albl4 = new JLabel("4");
		albl4.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		albl4.setBounds(320, 308, 35, 25);
		albl4.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(albl4);

		albl5 = new JLabel("5");
		albl5.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		albl5.setBounds(370, 308, 35, 25);
		albl5.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(albl5);

		albl6 = new JLabel("6");
		albl6.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		albl6.setBounds(420, 308, 35, 25);
		albl6.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(albl6);

		blbl1 = new JLabel("1");
		blbl1.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		blbl1.setBounds(170, 345, 35, 25);
		blbl1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(blbl1);

		blbl2 = new JLabel("2");
		blbl2.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		blbl2.setBounds(220, 345, 35, 25);
		blbl2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(blbl2);

		blbl3 = new JLabel("3");
		blbl3.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		blbl3.setBounds(270, 345, 35, 25);
		blbl3.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(blbl3);

		blbl4 = new JLabel("4");
		blbl4.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		blbl4.setBounds(320, 345, 35, 25);
		blbl4.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(blbl4);

		blbl5 = new JLabel("5");
		blbl5.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		blbl5.setBounds(370, 345, 35, 25);
		blbl5.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(blbl5);

		blbl6 = new JLabel("6");
		blbl6.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		blbl6.setBounds(420, 345, 35, 25);
		blbl6.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(blbl6);

		nlbl1 = new JLabel("1");
		nlbl1.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		nlbl1.setBounds(130, 248, 35, 25);
		nlbl1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(nlbl1);

		nlbl2 = new JLabel("2");
		nlbl2.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		nlbl2.setBounds(170, 248, 35, 25);
		nlbl2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(nlbl2);

		nlbl3 = new JLabel("3");
		nlbl3.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		nlbl3.setBounds(210, 248, 35, 25);
		nlbl3.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(nlbl3);

		nlbl4 = new JLabel("4");
		nlbl4.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		nlbl4.setBounds(250, 248, 35, 25);
		nlbl4.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(nlbl4);

		nlbl5 = new JLabel("5");
		nlbl5.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		nlbl5.setBounds(290, 248, 35, 25);
		nlbl5.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(nlbl5);

		nlbl6 = new JLabel("6");
		nlbl6.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		nlbl6.setBounds(330, 248, 35, 25);
		nlbl6.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(nlbl6);

		nlbl7 = new JLabel("7");
		nlbl7.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		nlbl7.setBounds(410, 248, 35, 25);
		nlbl7.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(nlbl7);

		clbl1 = new JLabel("1");
		clbl1.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		clbl1.setBounds(170, 378, 35, 25);
		clbl1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(clbl1);

		clbl2 = new JLabel("2");
		clbl2.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		clbl2.setBounds(220, 378, 35, 25);
		clbl2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(clbl2);

		clbl3 = new JLabel("3");
		clbl3.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		clbl3.setHorizontalAlignment(SwingConstants.CENTER);
		clbl3.setBounds(270, 378, 35, 25);
		frame.getContentPane().add(clbl3);

		clbl4 = new JLabel("4");
		clbl4.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		clbl4.setHorizontalAlignment(SwingConstants.CENTER);
		clbl4.setBounds(320, 378, 35, 25);
		frame.getContentPane().add(clbl4);

		clbl5 = new JLabel("5");
		clbl5.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		clbl5.setHorizontalAlignment(SwingConstants.CENTER);
		clbl5.setBounds(370, 378, 35, 25);
		frame.getContentPane().add(clbl5);

		clbl6 = new JLabel("6");
		clbl6.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		clbl6.setBounds(420, 378, 35, 25);
		clbl6.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(clbl6);

		dlbl1 = new JLabel("1");
		dlbl1.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		dlbl1.setBounds(170, 413, 35, 25);
		dlbl1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(dlbl1);

		dlbl2 = new JLabel("2");
		dlbl2.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		dlbl2.setBounds(220, 413, 35, 25);
		dlbl2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(dlbl2);

		dlbl3 = new JLabel("3");
		dlbl3.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		dlbl3.setBounds(270, 413, 35, 25);
		dlbl3.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(dlbl3);

		dlbl4 = new JLabel("4");
		dlbl4.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		dlbl4.setBounds(320, 413, 35, 25);
		dlbl4.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(dlbl4);

		dlbl5 = new JLabel("5");
		dlbl5.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		dlbl5.setBounds(370, 413, 35, 25);
		dlbl5.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(dlbl5);

		dlbl6 = new JLabel("6");
		dlbl6.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		dlbl6.setBounds(420, 413, 35, 25);
		dlbl6.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(dlbl6);

		elbl1 = new JLabel("1");
		elbl1.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		elbl1.setBounds(170, 448, 35, 25);
		elbl1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(elbl1);

		elbl2 = new JLabel("2");
		elbl2.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		elbl2.setBounds(220, 448, 35, 25);
		elbl2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(elbl2);

		elbl3 = new JLabel("3");
		elbl3.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		elbl3.setBounds(270, 448, 35, 25);
		elbl3.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(elbl3);

		elbl4 = new JLabel("4");
		elbl4.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		elbl4.setBounds(320, 448, 35, 25);
		elbl4.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(elbl4);

		elbl5 = new JLabel("5");
		elbl5.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		elbl5.setBounds(370, 448, 35, 25);
		elbl5.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(elbl5);

		elbl6 = new JLabel("6");
		elbl6.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		elbl6.setBounds(420, 448, 35, 25);
		elbl6.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(elbl6);
		
		JButton btn3 = new JButton("");
		btn3.setSelectedIcon(new ImageIcon(WinningNumber.class.getResource("/image/이전5.jpg")));
		btn3.setIcon(new ImageIcon(WinningNumber.class.getResource("/image/이전5.jpg")));
		btn3.setBounds(15, 481, 50, 36);
		frame.getContentPane().add(btn3);
		
		lblB = new JLabel("B");
		lblB.setFont(new Font("HY견고딕", Font.PLAIN, 15));
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		lblB.setBounds(87, 348, 28, 15);
		frame.getContentPane().add(lblB);
		
		lblC = new JLabel("C");
		lblC.setFont(new Font("HY견고딕", Font.PLAIN, 15));
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setBounds(87, 380, 28, 15);
		frame.getContentPane().add(lblC);
		
		lblD = new JLabel("D");
		lblD.setFont(new Font("HY견고딕", Font.PLAIN, 15));
		lblD.setHorizontalAlignment(SwingConstants.CENTER);
		lblD.setBounds(87, 416, 28, 15);
		frame.getContentPane().add(lblD);
		
		lblE = new JLabel("E");
		lblE.setFont(new Font("HY견고딕", Font.PLAIN, 15));
		lblE.setHorizontalAlignment(SwingConstants.CENTER);
		lblE.setBounds(88, 450, 28, 15);
		frame.getContentPane().add(lblE);
		
		lblA = new JLabel("A");
		lblA.setFont(new Font("HY견고딕", Font.PLAIN, 15));
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setBounds(87, 312, 28, 15);
		frame.getContentPane().add(lblA);
		
		lblx = new JLabel("총 구매 매수 :");
		lblx.setHorizontalAlignment(SwingConstants.RIGHT);
		lblx.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		lblx.setBounds(159, 174, 109, 25);
		frame.getContentPane().add(lblx);
		
		lbly = new JLabel("11");
		lbly.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		lbly.setHorizontalAlignment(SwingConstants.CENTER);
		lbly.setBounds(278, 174, 35, 25);
		frame.getContentPane().add(lbly);
		
		lblz = new JLabel("개");
		lblz.setFont(new Font("HY견고딕", Font.PLAIN, 17));
		lblz.setHorizontalAlignment(SwingConstants.CENTER);
		lblz.setBounds(309, 174, 35, 25);
		frame.getContentPane().add(lblz);
		
		lblp2 = new JLabel("당첨");
		lblp2.setFont(new Font("HY견고딕", Font.PLAIN, 15));
		lblp2.setHorizontalAlignment(SwingConstants.CENTER);
		lblp2.setBounds(28, 343, 35, 25);
		frame.getContentPane().add(lblp2);
		
		lblp3 = new JLabel("당첨");
		lblp3.setFont(new Font("HY견고딕", Font.PLAIN, 15));
		lblp3.setHorizontalAlignment(SwingConstants.CENTER);
		lblp3.setBounds(28, 377, 35, 25);
		frame.getContentPane().add(lblp3);
		
		lblp4 = new JLabel("당첨");
		lblp4.setFont(new Font("HY견고딕", Font.PLAIN, 15));
		lblp4.setHorizontalAlignment(SwingConstants.CENTER);
		lblp4.setBounds(28, 410, 35, 25);
		frame.getContentPane().add(lblp4);
		
		lblp5 = new JLabel("당첨");
		lblp5.setFont(new Font("HY견고딕", Font.PLAIN, 15));
		lblp5.setHorizontalAlignment(SwingConstants.CENTER);
		lblp5.setBounds(28, 445, 35, 25);
		frame.getContentPane().add(lblp5);
		
		lblp1 = new JLabel("당첨");
		lblp1.setFont(new Font("HY견고딕", Font.PLAIN, 15));
		lblp1.setHorizontalAlignment(SwingConstants.CENTER);
		lblp1.setBounds(28, 309, 35, 25);
		frame.getContentPane().add(lblp1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("HY견고딕", Font.PLAIN, 13));
		lblNewLabel.setIcon(new ImageIcon(WinningNumber.class.getResource("/image/로또 당첨 배경만4.jpg")));
		lblNewLabel.setBounds(-1, -23, 500, 573);
		frame.getContentPane().add(lblNewLabel);
		
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			    int tempCount = count;

			    if (count == 0) {
			        JOptionPane.showMessageDialog(null, "첫 번호입니다.", "경고", JOptionPane.WARNING_MESSAGE);
			        return;
			    }

			    tempCount--;

			    if (tempCount <= 0) {
			        JOptionPane.showMessageDialog(null, "첫 번째 번호입니다.", "경고", JOptionPane.WARNING_MESSAGE);
			        return;
			    }

			    count = tempCount;
			    lbl8.setText("내 선택 " + String.valueOf(count) + " 번째 번호 :");

			    int startIndex = (tempCount - 1) * 5;

			    for (int i = startIndex; i < startIndex + 5; i++) {
			        if (i < userNumber.size() && userNumber.get(i) != null && userNumber.get(i).size() >= 6) {
			            int index = i % 5;
			           
			            
			            switch (index) {
			                case 0:
			                	lblp1.setText("");
				    			lblp2.setText("");
				    			lblp3.setText("");
				    			lblp4.setText("");
				    			lblp5.setText("");
				    			
			                    albl1.setText(userNumber.get(i).get(0).toString());
			                    albl2.setText(userNumber.get(i).get(1).toString());
			                    albl3.setText(userNumber.get(i).get(2).toString());
			                    albl4.setText(userNumber.get(i).get(3).toString());
			                    albl5.setText(userNumber.get(i).get(4).toString());
			                    albl6.setText(userNumber.get(i).get(5).toString());
			                    if(autoNotAuto.get(i).equals("자 동")) {
			                    	albl.setText("자 동");
			                    	lblA.setText("A");
			                    }
			                    break;
			                case 1:
			                	lblp1.setText("");
				    			lblp2.setText("");
				    			lblp3.setText("");
				    			lblp4.setText("");
				    			lblp5.setText("");
				    			
			                    blbl1.setText(userNumber.get(i).get(0).toString());
			                    blbl2.setText(userNumber.get(i).get(1).toString());
			                    blbl3.setText(userNumber.get(i).get(2).toString());
			                    blbl4.setText(userNumber.get(i).get(3).toString());
			                    blbl5.setText(userNumber.get(i).get(4).toString());
			                    blbl6.setText(userNumber.get(i).get(5).toString());
			                    if(autoNotAuto.get(i).equals("자 동")) {
			                    	blbl.setText("자 동");
			                    	lblB.setText("B");			                    	
			                    }
			                    if (count ==1) {
			                    	lblp1.setText("");
					    			lblp2.setText("");
					    			lblp3.setText("");
					    			lblp4.setText("");
					    			lblp5.setText("");
					    			
			                    	albl1.setText(userNumber.get(1).get(0).toString());
				                    albl2.setText(userNumber.get(1).get(1).toString());
				                    albl3.setText(userNumber.get(1).get(2).toString());
				                    albl4.setText(userNumber.get(1).get(3).toString());
				                    albl5.setText(userNumber.get(1).get(4).toString());
				                    albl6.setText(userNumber.get(1).get(5).toString());
				                    if(autoNotAuto.get(i).equals("자 동")) {
				                    	albl.setText("자 동");
				                    	lblA.setText("A");
				                    }
				                    lblp1.setText("");
					    			lblp2.setText("");
					    			lblp3.setText("");
					    			lblp4.setText("");
					    			lblp5.setText("");
					    			
				                    blbl1.setText(userNumber.get(2).get(0).toString());
				                    blbl2.setText(userNumber.get(2).get(1).toString());
				                    blbl3.setText(userNumber.get(2).get(2).toString());
				                    blbl4.setText(userNumber.get(2).get(3).toString());
				                    blbl5.setText(userNumber.get(2).get(4).toString());
				                    blbl6.setText(userNumber.get(2).get(5).toString());
				                    if(autoNotAuto.get(i).equals("자 동")) {
				                    	blbl.setText("자 동");
				                    	lblB.setText("B");
				                    }
			                    }
			                    break;
			                case 2:
			                	lblp1.setText("");
				    			lblp2.setText("");
				    			lblp3.setText("");
				    			lblp4.setText("");
				    			lblp5.setText("");
				    			
			                    clbl1.setText(userNumber.get(i).get(0).toString());
			                    clbl2.setText(userNumber.get(i).get(1).toString());
			                    clbl3.setText(userNumber.get(i).get(2).toString());
			                    clbl4.setText(userNumber.get(i).get(3).toString());
			                    clbl5.setText(userNumber.get(i).get(4).toString());
			                    clbl6.setText(userNumber.get(i).get(5).toString());
			                    if(autoNotAuto.get(i).equals("자 동")) {
			                    	clbl.setText("자 동");
			                    	lblC.setText("C");
			                    }
			                    if (count ==1) {
			                    	lblp1.setText("");
					    			lblp2.setText("");
					    			lblp3.setText("");
					    			lblp4.setText("");
					    			lblp5.setText("");
					    			
				                    clbl1.setText(userNumber.get(3).get(0).toString());
				                    clbl2.setText(userNumber.get(3).get(1).toString());
				                    clbl3.setText(userNumber.get(3).get(2).toString());
				                    clbl4.setText(userNumber.get(3).get(3).toString());
				                    clbl5.setText(userNumber.get(3).get(4).toString());
				                    clbl6.setText(userNumber.get(3).get(5).toString());
				                    if(autoNotAuto.get(i).equals("자 동")) {
				                    	clbl.setText("자 동");
				                    	lblC.setText("C");
				                    }
			                    }
			                    break;
			                case 3:
			                	lblp1.setText("");
				    			lblp2.setText("");
				    			lblp3.setText("");
				    			lblp4.setText("");
				    			lblp5.setText("");
				    			
			                    dlbl1.setText(userNumber.get(i).get(0).toString());
			                    dlbl2.setText(userNumber.get(i).get(1).toString());
			                    dlbl3.setText(userNumber.get(i).get(2).toString());
			                    dlbl4.setText(userNumber.get(i).get(3).toString());
			                    dlbl5.setText(userNumber.get(i).get(4).toString());
			                    dlbl6.setText(userNumber.get(i).get(5).toString());
			                    if(autoNotAuto.get(i).equals("자 동")) {
			                    	dlbl.setText("자 동");
			                    	lblD.setText("D");
			                    }
			                    if (count ==1) {
			                    	lblp1.setText("");
					    			lblp2.setText("");
					    			lblp3.setText("");
					    			lblp4.setText("");
					    			lblp5.setText("");
					    			
				                    dlbl1.setText(userNumber.get(4).get(0).toString());
				                    dlbl2.setText(userNumber.get(4).get(1).toString());
				                    dlbl3.setText(userNumber.get(4).get(2).toString());
				                    dlbl4.setText(userNumber.get(4).get(3).toString());
				                    dlbl5.setText(userNumber.get(4).get(4).toString());
				                    dlbl6.setText(userNumber.get(4).get(5).toString());
				                    if(autoNotAuto.get(i).equals("자 동")) {
				                    	dlbl.setText("자 동");
				                    	lblD.setText("D");
				                    }
			                    }
			                    break;
			                case 4:
			                	lblp1.setText("");
				    			lblp2.setText("");
				    			lblp3.setText("");
				    			lblp4.setText("");
				    			lblp5.setText("");
				    			
			                    elbl1.setText(userNumber.get(i).get(0).toString());
			                    elbl2.setText(userNumber.get(i).get(1).toString());
			                    elbl3.setText(userNumber.get(i).get(2).toString());
			                    elbl4.setText(userNumber.get(i).get(3).toString());
			                    elbl5.setText(userNumber.get(i).get(4).toString());
			                    elbl6.setText(userNumber.get(i).get(5).toString());
			                    if(autoNotAuto.get(i).equals("자 동")) {
			                    	elbl.setText("자 동");
			                    	lblE.setText("E");
			                    }
			                    if (count ==1) {
			                    	lblp1.setText("");
					    			lblp2.setText("");
					    			lblp3.setText("");
					    			lblp4.setText("");
					    			lblp5.setText("");
					    			
				                    elbl1.setText(userNumber.get(5).get(0).toString());
				                    elbl2.setText(userNumber.get(5).get(1).toString());
				                    elbl3.setText(userNumber.get(5).get(2).toString());
				                    elbl4.setText(userNumber.get(5).get(3).toString());
				                    elbl5.setText(userNumber.get(5).get(4).toString());
				                    elbl6.setText(userNumber.get(5).get(5).toString());
				                    if(autoNotAuto.get(i).equals("자 동")) {
				                    	elbl.setText("자 동");
				                    	lblE.setText("E");
				                    }
			                    }
				                    
			              
			                    break;
			            }
			        } 
			    }

			    글자색깔변경();
			}




		});

		MakeRoom a = new MakeRoom();
		a.makeLottoNumberNew();

		Map<Integer, List<NumberSave>> lottoNumbers = a.getLottoNumber();

		for (Map.Entry<Integer, List<NumberSave>> entry : lottoNumbers.entrySet()) {
			int lottoIndex = entry.getKey();
			List<NumberSave> numbers = entry.getValue();

			if (numbers.size() >= 7) {
				List<NumberSave> sortedNumbers = new ArrayList<>(numbers.subList(0, 6));
				Collections.sort(sortedNumbers, new Comparator<NumberSave>() {
					@Override
					public int compare(NumberSave number1, NumberSave number2) {
						int num1 = number1.getNumber();
						int num2 = number2.getNumber();
						return Integer.compare(num1, num2);
					}
				});

				nlbl1.setText(String.valueOf(sortedNumbers.get(0).getNumber()));
				nlbl2.setText(String.valueOf(sortedNumbers.get(1).getNumber()));
				nlbl3.setText(String.valueOf(sortedNumbers.get(2).getNumber()));
				nlbl4.setText(String.valueOf(sortedNumbers.get(3).getNumber()));
				nlbl5.setText(String.valueOf(sortedNumbers.get(4).getNumber()));
				nlbl6.setText(String.valueOf(sortedNumbers.get(5).getNumber()));
				nlbl7.setText(String.valueOf(numbers.get(6).getNumber()));
			}
		}

	}
}