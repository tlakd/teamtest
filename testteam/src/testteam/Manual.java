package testteam;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

public class Manual extends JFrame {
	JButton[] button = new JButton[45];
	JLayeredPane lp = new JLayeredPane();
	Map<Integer, List<NumberSave>> numSa = new HashMap<Integer, List<NumberSave>>();
	Map<Integer, String> userAt = new HashMap<>();
	MakeRoom m = new MakeRoom();
	NoAutoSt noA;
	int number;
	int MakeNoA;
	int countAll = 0;

	public Manual(NoAutoSt noA) {
		this.noA = noA;
	}

	public void makeButton(int MakeNoA) {
		this.MakeNoA = MakeNoA;
		int count = 0;
		numSa.put(MakeNoA, new ArrayList<>());
		// 초기화 버튼
		JButton jbut = new JButton();
		jbut.setBounds(50, 480, 100, 40);
		jbut.setText("초기화");
		jbut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		lp.add(jbut);

		// 완료 버튼
		JButton jbut1 = new JButton();
		jbut1.setBounds(300, 480, 100, 40);
		jbut1.setText("완료");
		jbut1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Collections.sort(numSa.get(MakeNoA));
				noA.setlbl2();
				setVisible(false);
			}
		});
		lp.add(jbut1);

		// 자동완성 버튼
		JButton jbut2 = new JButton();
		jbut2.setBounds(175, 480, 100, 40);
		jbut2.setText("자동완성");
		jbut2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				반자동(MakeNoA);
			}
		});
		lp.add(jbut2);

		for (int i = 0; i < button.length; i++) {// 숫자 버튼 생성
			button[i] = new JButton();
			button[i].setBounds(35 + ((i % 7) * 60), 60 + (count * 60), 50, 50);
			String a = String.valueOf(i + 1);
			button[i].setText(a);
			if (i % 7 == 6) {
				count++;
			}
			final int index = i + 1;
			button[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton source = (JButton) e.getSource();
					if (numSa.containsKey(MakeNoA)) {
						if (numSa.get(MakeNoA).size() < 6) {// 6개까지 중복
							if (!containsNumber(numSa.get(MakeNoA), index)) {
								NumberSave newNumber = new NumberSave(index);
								numSa.get(MakeNoA).add(newNumber);
							} else {
								performOtherAction(source, index); // 다른 액션 수행
							}
						} else if (!containsNumber(numSa.get(MakeNoA), index)) {
							JOptionPane.showMessageDialog(null, "숫자 6개까지 선택 가능합니다.");
						} else {
							performOtherAction(source, index); // 다른 액션 수행
						}
					} else {
						List<NumberSave> numbers = new ArrayList<NumberSave>();
						NumberSave newNumber = new NumberSave(index);
						numbers.add(newNumber);
						numSa.put(MakeNoA, numbers);
					}
				}
			});
			lp.add(button[i]);
		}
		add(lp);
		setSize(500, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void performOtherAction(JButton source, int a) {
		List<NumberSave> numbers = numSa.get(m.userCount);
		numbers.removeIf(number -> number.getNumber() == a);
	}

	public void reset() {
		countAll = 0;
		numSa.get(MakeNoA).clear();
	}

	public void 수동부분저장() {// 나중에 한번에 저장
		if (!m.userNumber.containsKey(m.userCount)) {
			m.userNumber.put(m.userCount, new ArrayList<>());
		}
		for (int i = 1; i < 6; i++) {
			if (numSa.get(i) == null) {
				continue;
			} else {
				List<NumberSave> numbers = numSa.get(i);
				if (numbers != null) {
					for (NumberSave number : numbers) {
						m.userNumber.get(m.userCount).add(number);
					}
				}
				m.userCount++;
			}
		}

		// 저장된 값 확인을 위한 출력
		for (int i = 1; i <= m.userCount; i++) {
			List<NumberSave> userNumbers = m.userNumber.get(i);
			if (userNumbers != null) {
				System.out.print("User " + i + " Numbers: ");
				for (NumberSave number : userNumbers) {
					System.out.print(number.getNumber() + " ");
				}
				System.out.println();
			}
		}
	}

	private boolean containsNumber(List<NumberSave> numbers, int number) {
		for (NumberSave num : numbers) {
			if (num.getNumber() == number) {
				return true;
			}
		}
		return false;
	}

	public void 반자동(int MakeNoA) {
		makeRo(MakeNoA);
		while (numSa.get(MakeNoA).size() < 6) {
			int q = (int) (Math.random() * 45) + 1;
			NumberSave newNumber = new NumberSave(q);
			if (!numSa.get(MakeNoA).contains(newNumber)) {
				numSa.get(MakeNoA).add(newNumber);
				countAll++;
			}
		}
		if (countAll == 6) {
			userAt.put(MakeNoA, "자 동");
		} else if (countAll < 6) {
			userAt.put(MakeNoA, "반자동");
		} else {
			userAt.put(MakeNoA, "수 동");
		}
	}

	public void makeRo(int a) {
		if (!numSa.containsKey(MakeNoA)) {
			numSa.put(MakeNoA, new ArrayList<>());
		}
	}
}
