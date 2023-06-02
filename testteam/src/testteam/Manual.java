package testteam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

public class Manual extends JFrame {
	JButton[] button = new JButton[45];
	JLayeredPane lp = new JLayeredPane();
	private int clickCount = 0;
	List<Integer> numSa = new ArrayList<Integer>();
	MakeRoom m = new MakeRoom();

	public void makeButton() {// 여기서 부르기
		int count = 0;
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
		JButton jbut1 = new JButton();
		jbut1.setBounds(300, 480, 100, 40);
		jbut1.setText("완료");
		jbut1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		lp.add(jbut1);
		JButton jbut2 = new JButton();
		jbut2.setBounds(175, 480, 100, 40);
		jbut2.setText("자동완성");
		jbut2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				m.makeAutoNumber();
				setVisible(false);
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
					if (clickCount < 6) {// 6개까지 중복
						if (!numSa.contains(index)) {
							numSa.add(index);
							clickCount++;
						} else {
							performOtherAction(source, index); // 다른 액션 수행
						}
					} else if (!numSa.contains(index)) {
						JOptionPane.showMessageDialog(null, "숫자 6개 까지 선택 가능합니다.");
					} else {
						performOtherAction(source, index); // 다른 액션 수행
					}
				}
			});
			lp.add(button[i]);
		}
		add(lp);
		setSize(500, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void performOtherAction(JButton source, int a) {
		numSa.remove(Integer.valueOf(a));
		clickCount--;
	}

	public void reset() {
		clickCount = 0;
		numSa.clear();
	}

	public static void main(String[] args) {// 이거는 나중에 지우면 되고
		Manual m = new Manual();
		m.makeButton();
	}
}
