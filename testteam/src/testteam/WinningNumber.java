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
			} else if (i == 2) {
				blbl.setText(autoType);
			} else if (i == 3) {
				clbl.setText(autoType);
			} else if (i == 4) {
				dlbl.setText(autoType);
			} else if (i == 5) {
				elbl.setText(autoType);
			}

		}
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
			break;
		case 4:
			lbl3.setText("경 축 !! 4등 당첨 되었습니다.");
			break;
		case 5:
			if (nlbl7.getText().equals(albl1.getText()) || nlbl7.getText().equals(albl2.getText())
					|| nlbl7.getText().equals(albl3.getText()) || nlbl7.getText().equals(albl4.getText())
					|| nlbl7.getText().equals(albl5.getText()) || nlbl7.getText().equals(albl6.getText())) {
				lbl3.setText("경 축 !! 2등 당첨 되었습니다.");
			} else {
				lbl3.setText("경 축 !! 3등 당첨 되었습니다.");
			}
			break;
		case 6:
			lbl3.setText("경 축 !! 1등 당첨 되었습니다.");
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
			break;
		case 4:
			lbl3.setText("경 축 !! 4등 당첨 되었습니다.");
			break;
		case 5:
			if (nlbl7.getText().equals(blbl1.getText()) || nlbl7.getText().equals(blbl2.getText())
					|| nlbl7.getText().equals(blbl3.getText()) || nlbl7.getText().equals(blbl4.getText())
					|| nlbl7.getText().equals(blbl5.getText()) || nlbl7.getText().equals(blbl6.getText())) {
				lbl3.setText("경 축 !! 2등 당첨 되었습니다.");
			} else {
				lbl3.setText("경 축 !! 3등 당첨 되었습니다.");
			}
			break;
		case 6:
			lbl3.setText("경 축 !! 1등 당첨 되었습니다.");
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
			break;
		case 4:
			lbl3.setText("경 축 !! 4등 당첨 되었습니다.");
			break;
		case 5:
			if (nlbl7.getText().equals(clbl1.getText()) || nlbl7.getText().equals(clbl2.getText())
					|| nlbl7.getText().equals(clbl3.getText()) || nlbl7.getText().equals(clbl4.getText())
					|| nlbl7.getText().equals(clbl5.getText()) || nlbl7.getText().equals(clbl6.getText())) {
				lbl3.setText("경 축 !! 2등 당첨 되었습니다.");
			} else {
				lbl3.setText("경 축 !! 3등 당첨 되었습니다.");
			}
			break;
		case 6:
			lbl3.setText("경 축 !! 1등 당첨 되었습니다.");
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
			break;
		case 4:
			lbl3.setText("경 축 !! 4등 당첨 되었습니다.");
			break;
		case 5:
			if (nlbl7.getText().equals(dlbl1.getText()) || nlbl7.getText().equals(dlbl2.getText())
					|| nlbl7.getText().equals(dlbl3.getText()) || nlbl7.getText().equals(dlbl4.getText())
					|| nlbl7.getText().equals(dlbl5.getText()) || nlbl7.getText().equals(dlbl6.getText())) {
				lbl3.setText("경 축 !! 2등 당첨 되었습니다.");
			} else {
				lbl3.setText("경 축 !! 3등 당첨 되었습니다.");
			}
			break;
		case 6:
			lbl3.setText("경 축 !! 1등 당첨 되었습니다.");
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
			break;
		case 4:
			lbl3.setText("경 축 !! 4등 당첨 되었습니다.");
			break;
		case 5:
			if (nlbl7.getText().equals(elbl1.getText()) || nlbl7.getText().equals(elbl2.getText())
					|| nlbl7.getText().equals(elbl3.getText()) || nlbl7.getText().equals(elbl4.getText())
					|| nlbl7.getText().equals(elbl5.getText()) || nlbl7.getText().equals(elbl6.getText())) {
				lbl3.setText("경 축 !! 2등 당첨 되었습니다.");
			} else {
				lbl3.setText("경 축 !! 3등 당첨 되었습니다.");
			}
			break;
		case 6:
			lbl3.setText("경 축 !! 1등 당첨 되었습니다.");
			break;
		}
		if (colorCountA < 3 && colorCountB < 3 && colorCountC < 3 && colorCountD < 3 && colorCountE < 3) {
			lbl3.setText("낙첨 되었습니다.");
		}

		if (colorCountA == 3 && colorCountB == 3)
			lbl3.setText("경 축 !! 5등 두 개 당첨 되었습니다.");

		else if (colorCountA == 3 && colorCountC == 3) {
			lbl3.setText("경 축 !! 5등  두 개 당첨 되었습니다.");
		}
		else if (colorCountA == 3 && colorCountD == 3) {
			lbl3.setText("경 축 !! 5등  두 개 당첨 되었습니다.");
		}
		else if (colorCountA == 3 && colorCountE == 3) {
			lbl3.setText("경 축 !! 5등  두 개 당첨 되었습니다.");
		}
		else if (colorCountB == 3 && colorCountC == 3) {
			lbl3.setText("b경 축 !! 5등  두 개 당첨 되었습니다.");
		}
		else if (colorCountB == 3 && colorCountD == 3) {
			lbl3.setText("경 축 !! 5등  두 개 당첨 되었습니다.");
		}
		else if (colorCountB == 3 && colorCountE == 3) {
			lbl3.setText("경 축 !! 5등  두 개 당첨 되었습니다.");
		}
		else if (colorCountC == 3 && colorCountD == 3) {
			lbl3.setText("경 축 !! 5등  두 개 당첨 되었습니다.");
		}
		else if (colorCountC == 3 && colorCountE == 3) {
			lbl3.setText("경 축 !! 5등  두 개 당첨 되었습니다.");
		}
		else if (colorCountD == 3 && colorCountE == 3) {
			lbl3.setText("경 축 !! 5등  두 개 당첨 되었습니다.");
		}

		else if (colorCountA == 4 && colorCountB == 4) {
			lbl3.setText("경 축 !! 4등  두 개 당첨 되었습니다.");
		}
		else if (colorCountA == 4 && colorCountC == 4) {
			lbl3.setText("경 축 !! 4등  두 개 당첨 되었습니다.");
		}
		else if (colorCountA == 4 && colorCountD == 4) {
			lbl3.setText("경 축 !! 4등  두 개 당첨 되었습니다.");
		}
		else if (colorCountA == 4 && colorCountE == 4) {
			lbl3.setText("경 축 !! 4등  두 개 당첨 되었습니다.");
		}
		else if (colorCountB == 4 && colorCountC == 4) {
			lbl3.setText("경 축 !! 4등  두 개 당첨 되었습니다.");
		}
		else if (colorCountB == 4 && colorCountD == 4) {
			lbl3.setText("경 축 !! 4등  두 개 당첨 되었습니다.");
		}
		else if (colorCountB == 4 && colorCountE == 4) {
			lbl3.setText("경 축 !! 4등  두 개 당첨 되었습니다.");
		}
		else if (colorCountC == 4 && colorCountD == 4) {
			lbl3.setText("경 축 !! 4등  두 개 당첨 되었습니다.");
		}
		else if (colorCountC == 4 && colorCountE == 4) {
			lbl3.setText("경 축 !! 4등  두 개 당첨 되었습니다.");
		}
		else if (colorCountD == 4 && colorCountE == 4) {
			lbl3.setText("경 축 !! 4등  두 개 당첨 되었습니다.");
		}

		if (colorCountA == 5 && colorCountB == 5)
			lbl3.setText("경 축 !! 3등  두 개 당첨 되었습니다.");

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

	// userNumber는 사용자의 로또 번호를 저장하는 맵입니다.
	// autoNotAuto는 자동 반자동 수동인지 확인해주는 맵입니다

	/**
	 * Launch the application.g
	 */
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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lbl1 = new JLabel("1등 당첨 번호:");
		lbl1.setBounds(39, 24, 84, 15);
		frame.getContentPane().add(lbl1);

		JLabel lbl2 = new JLabel("보너스 번호:");
		lbl2.setBounds(303, 24, 71, 15);
		frame.getContentPane().add(lbl2);

		JButton btn1 = new JButton("이전 화면");
		btn1.setBounds(0, 208, 98, 43);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 메인화면으로 돌아가야함 나중에 바꿔야 함
				frame.dispose();

			}
		});
		frame.getContentPane().add(btn1);

		btn2 = new JButton("다음 번호");
		btn2.setBounds(268, 208, 85, 43);

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
			                break;
			            case 1:
			                blbl1.setText(userNumber.get(i).get(0).toString());
			                blbl2.setText(userNumber.get(i).get(1).toString());
			                blbl3.setText(userNumber.get(i).get(2).toString());
			                blbl4.setText(userNumber.get(i).get(3).toString());
			                blbl5.setText(userNumber.get(i).get(4).toString());
			                blbl6.setText(userNumber.get(i).get(5).toString());
			                break;
			            case 2:
			                clbl1.setText(userNumber.get(i).get(0).toString());
			                clbl2.setText(userNumber.get(i).get(1).toString());
			                clbl3.setText(userNumber.get(i).get(2).toString());
			                clbl4.setText(userNumber.get(i).get(3).toString());
			                clbl5.setText(userNumber.get(i).get(4).toString());
			                clbl6.setText(userNumber.get(i).get(5).toString());
			                break;
			            case 3:
			                dlbl1.setText(userNumber.get(i).get(0).toString());
			                dlbl2.setText(userNumber.get(i).get(1).toString());
			                dlbl3.setText(userNumber.get(i).get(2).toString());
			                dlbl4.setText(userNumber.get(i).get(3).toString());
			                dlbl5.setText(userNumber.get(i).get(4).toString());
			                dlbl6.setText(userNumber.get(i).get(5).toString());
			                break;
			            case 4:
			                elbl1.setText(userNumber.get(i).get(0).toString());
			                elbl2.setText(userNumber.get(i).get(1).toString());
			                elbl3.setText(userNumber.get(i).get(2).toString());
			                elbl4.setText(userNumber.get(i).get(3).toString());
			                elbl5.setText(userNumber.get(i).get(4).toString());
			                elbl6.setText(userNumber.get(i).get(5).toString());
			                break;
			        }
			       }else {
		                // usernumber.size()보다 큰 인덱스의 레이블을 공백으로 처리합니다.
		                int index = i % 5;
		                switch (index) {
		                    case 0:
		                        albl1.setText("");
		                        albl2.setText("");
		                        albl3.setText("");
		                        albl4.setText("");
		                        albl5.setText("");
		                        albl6.setText("");
		                        break;
		                    case 1:
		                        blbl1.setText("");
		                        blbl2.setText("");
		                        blbl3.setText("");
		                        blbl4.setText("");
		                        blbl5.setText("");
		                        blbl6.setText("");
		                        break;
		                    case 2:
		                        clbl1.setText("");
		                        clbl2.setText("");
		                        clbl3.setText("");
		                        clbl4.setText("");
		                        clbl5.setText("");
		                        clbl6.setText("");
		                        break;
		                    case 3:
		                        dlbl1.setText("");
		                        dlbl2.setText("");
		                        dlbl3.setText("");
		                        dlbl4.setText("");
		                        dlbl5.setText("");
		                        dlbl6.setText("");
		                        break;
		                    case 4:
		                        elbl1.setText("");
		                        elbl2.setText("");
		                        elbl3.setText("");
		                        elbl4.setText("");
		                        elbl5.setText("");
		                        elbl6.setText("");
		                        break;
		                }
		            }
		        }

		        글자색깔변경();
		    }
		});
		frame.getContentPane().add(btn2);

		lbl3 = new JLabel("11");
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setBounds(71, 187, 303, 15);
		frame.getContentPane().add(lbl3);

		lbl8 = new JLabel("내 선택 1 번째 번호 :");
		lbl8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl8.setBounds(130, 56, 171, 15);
		frame.getContentPane().add(lbl8);

		albl = new JLabel("11");
		albl.setHorizontalAlignment(SwingConstants.CENTER);
		albl.setBounds(102, 77, 40, 15);
		frame.getContentPane().add(albl);

		blbl = new JLabel("11");
		blbl.setHorizontalAlignment(SwingConstants.CENTER);
		blbl.setBounds(102, 98, 40, 15);
		frame.getContentPane().add(blbl);

		clbl = new JLabel("11");
		clbl.setHorizontalAlignment(SwingConstants.CENTER);
		clbl.setBounds(102, 119, 40, 15);
		frame.getContentPane().add(clbl);

		dlbl = new JLabel("11");
		dlbl.setHorizontalAlignment(SwingConstants.CENTER);
		dlbl.setBounds(102, 140, 40, 15);
		frame.getContentPane().add(dlbl);

		elbl = new JLabel("11");
		elbl.setHorizontalAlignment(SwingConstants.CENTER);
		elbl.setBounds(102, 159, 40, 15);
		frame.getContentPane().add(elbl);

		this.albl1 = new JLabel("11");
		albl1.setBounds(154, 77, 22, 15);
		albl1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(albl1);

		albl2 = new JLabel("11");
		albl2.setBounds(183, 77, 22, 15);
		albl2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(albl2);

		albl3 = new JLabel("11");
		albl3.setBounds(210, 77, 22, 15);
		albl3.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(albl3);

		albl4 = new JLabel("11");
		albl4.setBounds(240, 77, 22, 15);
		albl4.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(albl4);

		albl5 = new JLabel("11");
		albl5.setBounds(268, 77, 23, 15);
		albl5.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(albl5);

		albl6 = new JLabel("11");
		albl6.setBounds(303, 77, 22, 15);
		albl6.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(albl6);

		blbl1 = new JLabel("11");
		blbl1.setBounds(154, 98, 22, 15);
		blbl1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(blbl1);

		blbl2 = new JLabel("11");
		blbl2.setBounds(183, 98, 22, 15);
		blbl2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(blbl2);

		blbl3 = new JLabel("11");
		blbl3.setBounds(210, 98, 22, 15);
		blbl3.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(blbl3);

		blbl4 = new JLabel("11");
		blbl4.setBounds(240, 98, 22, 15);
		blbl4.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(blbl4);

		blbl5 = new JLabel("11");
		blbl5.setBounds(268, 98, 23, 15);
		blbl5.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(blbl5);

		blbl6 = new JLabel("11");
		blbl6.setBounds(303, 98, 22, 15);
		blbl6.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(blbl6);

		nlbl1 = new JLabel("11");
		nlbl1.setBounds(130, 24, 22, 15);
		nlbl1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(nlbl1);

		nlbl2 = new JLabel("11");
		nlbl2.setBounds(154, 24, 22, 15);
		nlbl2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(nlbl2);

		nlbl3 = new JLabel("11");
		nlbl3.setBounds(176, 24, 22, 15);
		nlbl3.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(nlbl3);

		nlbl4 = new JLabel("11");
		nlbl4.setBounds(196, 24, 22, 15);
		nlbl4.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(nlbl4);

		nlbl5 = new JLabel("11");
		nlbl5.setBounds(214, 24, 22, 15);
		nlbl5.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(nlbl5);

		nlbl6 = new JLabel("11");
		nlbl6.setBounds(240, 24, 22, 15);
		nlbl6.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(nlbl6);

		nlbl7 = new JLabel("11");
		nlbl7.setBounds(380, 24, 28, 15);
		nlbl7.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(nlbl7);

		clbl1 = new JLabel("11");
		clbl1.setBounds(154, 119, 22, 15);
		clbl1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(clbl1);

		clbl2 = new JLabel("11");
		clbl2.setBounds(185, 119, 20, 15);
		clbl2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(clbl2);

		clbl3 = new JLabel("11");
		clbl3.setHorizontalAlignment(SwingConstants.CENTER);
		clbl3.setBounds(210, 119, 22, 15);
		frame.getContentPane().add(clbl3);

		clbl4 = new JLabel("11");
		clbl4.setHorizontalAlignment(SwingConstants.CENTER);
		clbl4.setBounds(240, 119, 22, 15);
		frame.getContentPane().add(clbl4);

		clbl5 = new JLabel("11");
		clbl5.setHorizontalAlignment(SwingConstants.CENTER);
		clbl5.setBounds(268, 119, 23, 15);
		frame.getContentPane().add(clbl5);

		clbl6 = new JLabel("11");
		clbl6.setBounds(303, 119, 22, 15);
		clbl6.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(clbl6);

		dlbl1 = new JLabel("11");
		dlbl1.setBounds(154, 140, 22, 15);
		dlbl1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(dlbl1);

		dlbl2 = new JLabel("11");
		dlbl2.setBounds(185, 140, 20, 15);
		dlbl2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(dlbl2);

		dlbl3 = new JLabel("11");
		dlbl3.setBounds(210, 140, 22, 15);
		dlbl3.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(dlbl3);

		dlbl4 = new JLabel("11");
		dlbl4.setBounds(240, 140, 22, 15);
		dlbl4.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(dlbl4);

		dlbl5 = new JLabel("11");
		dlbl5.setBounds(268, 140, 23, 15);
		dlbl5.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(dlbl5);

		dlbl6 = new JLabel("11");
		dlbl6.setBounds(303, 140, 22, 15);
		dlbl6.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(dlbl6);

		elbl1 = new JLabel("11");
		elbl1.setBounds(154, 159, 22, 15);
		elbl1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(elbl1);

		elbl2 = new JLabel("11");
		elbl2.setBounds(185, 159, 20, 15);
		elbl2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(elbl2);

		elbl3 = new JLabel("11");
		elbl3.setBounds(210, 159, 22, 15);
		elbl3.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(elbl3);

		elbl4 = new JLabel("11");
		elbl4.setBounds(240, 159, 22, 15);
		elbl4.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(elbl4);

		elbl5 = new JLabel("11");
		elbl5.setBounds(268, 159, 23, 15);
		elbl5.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(elbl5);

		elbl6 = new JLabel("11");
		elbl6.setBounds(303, 159, 22, 15);
		elbl6.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(elbl6);
		
		JButton btn3 = new JButton("이전 번호");
		btn3.setBounds(136, 205, 96, 49);
		frame.getContentPane().add(btn3);
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			    if (count > 1) {
			        count--; // Decrease count variable if it is greater than 1
			    } else {
				            JOptionPane.showMessageDialog(null, "첫 번호입니다.");
			        return;
			    }
			    lbl8.setText("내 선택 " + String.valueOf(count) + " 번째 번호 :");
			    for (int i = (count - 1) * 5; i < count * 5 && i < userNumber.size(); i++) {
			        int index = (i - 1) % 5;
			        switch (index) {
			            case 0:
			                albl1.setText(userNumber.get(i).get(0).toString());
			                albl2.setText(userNumber.get(i).get(1).toString());
			                albl3.setText(userNumber.get(i).get(2).toString());
			                albl4.setText(userNumber.get(i).get(3).toString());
			                albl5.setText(userNumber.get(i).get(4).toString());
			                albl6.setText(userNumber.get(i).get(5).toString());
			                break;
			            case 1:
			                blbl1.setText(userNumber.get(i).get(0).toString());
			                blbl2.setText(userNumber.get(i).get(1).toString());
			                blbl3.setText(userNumber.get(i).get(2).toString());
			                blbl4.setText(userNumber.get(i).get(3).toString());
			                blbl5.setText(userNumber.get(i).get(4).toString());
			                blbl6.setText(userNumber.get(i).get(5).toString());
			                break;
			            case 2:
			                clbl1.setText(userNumber.get(i).get(0).toString());
			                clbl2.setText(userNumber.get(i).get(1).toString());
			                clbl3.setText(userNumber.get(i).get(2).toString());
			                clbl4.setText(userNumber.get(i).get(3).toString());
			                clbl5.setText(userNumber.get(i).get(4).toString());
			                clbl6.setText(userNumber.get(i).get(5).toString());
			                break;
			            case 3:
			                dlbl1.setText(userNumber.get(i).get(0).toString());
			                dlbl2.setText(userNumber.get(i).get(1).toString());
			                dlbl3.setText(userNumber.get(i).get(2).toString());
			                dlbl4.setText(userNumber.get(i).get(3).toString());
			                dlbl5.setText(userNumber.get(i).get(4).toString());
			                dlbl6.setText(userNumber.get(i).get(5).toString());
			                break;
			            case 4:
			                elbl1.setText(userNumber.get(i).get(0).toString());
			                elbl2.setText(userNumber.get(i).get(1).toString());
			                elbl3.setText(userNumber.get(i).get(2).toString());
			                elbl4.setText(userNumber.get(i).get(3).toString());
			                elbl5.setText(userNumber.get(i).get(4).toString());
			                elbl6.setText(userNumber.get(i).get(5).toString());
			                break;
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
