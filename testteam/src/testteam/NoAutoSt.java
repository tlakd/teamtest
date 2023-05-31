package testteam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

public class NoAutoSt extends JFrame {
	JLayeredPane lp = new JLayeredPane();
	JButton[] jbt1 = new JButton[5];// A~E 버튼
	JButton[] jbt2 = new JButton[5];// 자동
	JButton[] jbt3 = new JButton[5];// 확인
	JButton[] jbt4 = new JButton[5];// 리셋
	JLabel[][] lbl2 = new JLabel[5][6];
	Manual[] m = new Manual[5];
	boolean[] payMinus = new boolean[5];
	JLabel lbl;
	int pay = 0;

	public void mainSt() {
		char a = 'A';

		lbl = new JLabel("총 금액: ");
		lbl.setBounds(250, 350, 150, 40);
		lp.add(lbl);
		for (int i = 0; i < jbt1.length; i++) {
			jbt1[i] = new JButton();
			jbt1[i].setBounds(25, 30 + (i * 60), 60, 40);
			jbt1[i].setText(String.valueOf(a));
			a++;
			lp.add(jbt1[i]);

			jbt2[i] = new JButton();
			jbt2[i].setBounds(400, 30 + (i * 60), 60, 40);
			jbt2[i].setText("자동");
			lp.add(jbt2[i]);

			jbt3[i] = new JButton();
			jbt3[i].setBounds(480, 30 + (i * 60), 60, 40);
			jbt3[i].setText("확인");
			lp.add(jbt3[i]);

			jbt4[i] = new JButton();
			jbt4[i].setBounds(560, 30 + (i * 60), 60, 40);
			jbt4[i].setText("리셋");
			lp.add(jbt4[i]);

			final int index = i + 1;
			m[i] = new Manual(this);
			jbt1[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (m[index - 1].numSa.get(index) == null) {
						m[index - 1].numSa.put(index, new ArrayList<>());
					}
					m[index - 1].makeButton(index);
				}
			});

			jbt2[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (m[index - 1].numSa.get(index) == null) {
						m[index - 1].numSa.put(index, new ArrayList<>());
					}
					m[index - 1].반자동(index);
					System.out.println(m[index - 1].numSa.get(index).toString());
					setlbl2();
				}
			});

			jbt3[i].addActionListener(new ActionListener() {// 확인
				@Override
				public void actionPerformed(ActionEvent e) {
					if (m[index - 1].numSa.get(index) == null || m[index - 1].numSa.get(index).size() < 6) {
						JOptionPane.showMessageDialog(null, "6개의 숫자를 고르지 않았습니다.");
					} else {
						pay += 1000;
						text();
						jbt3[index - 1].setEnabled(false);
						payMinus[index - 1] = true;
					}
				}
			});

			jbt4[i].addActionListener(new ActionListener() {// 리셋
				@Override
				public void actionPerformed(ActionEvent e) {
					m[index - 1].numSa.get(index).clear();
					setlbl2();
					if (payMinus[index - 1]) {
						pay -= 1000;
						text();
						jbt3[index - 1].setEnabled(true);
						payMinus[index - 1] = false;
					}
				}
			});
		}

		JButton jbt5 = new JButton("메인매뉴");
		jbt5.setBounds(50, 350, 90, 40);
		jbt5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 5; i++) {
					jbt3[i].setEnabled(true);
					m[i].numSa.get(i + 1).clear();
				}
				pay = 0;
			}
		});
		lp.add(jbt5);

		for (int i = 0; i < lbl2.length; i++) {
			for (int j = 0; j < lbl2[i].length; j++) {
				lbl2[i][j] = new JLabel();
				lbl2[i][j].setBounds(120 + (j * 40), 30 + (i * 60), 60, 40);
				lbl2[i][j].setText("0");
				lp.add(lbl2[i][j]);

			}
		}

		JButton jbPay = new JButton("결제하기");
		jbPay.setBounds(500, 350, 90, 40);
		lp.add(jbPay);

		jbPay.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		add(lp);
		setSize(665, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setlbl2();
	}

	public void setlbl2() {
		for (int i = 0; i < m.length; i++) {
			if (m[i].numSa.get(i + 1) == null) {
				for (int j = 0; j < lbl2[i].length; j++) {
					lbl2[i][j].setText("0");
				}
			} else {
				List<NumberSave> numbers = m[i].numSa.get(i + 1);
				for (int j = 0; j < numbers.size(); j++) {
					lbl2[i][j].setText(numbers.get(j).toString());
				}
				for (int j = numbers.size(); j < lbl2[i].length; j++) {
					lbl2[i][j].setText("0");
				}
			}
		}
	}

	public void text() {
		lbl.setText("총 금액: " + pay + "원");
	}

	public static void main(String[] args) {
		NoAutoSt n = new NoAutoSt();
		n.mainSt();
	}
}
