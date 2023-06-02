package testteam;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AutoLottoUser1 {
	private JFrame frame;
	private JTextField textField;
	private String sum = "0";
	private int sum2 = 0;
	private int pay = Integer.valueOf(sum) * sum2;
	PayNow a = new PayNow(this);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AutoLottoUser1 window = new AutoLottoUser1();
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
	public AutoLottoUser1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("로또 구매하기 메뉴");

		URL url = AutoLottoUser1.class.getClassLoader().getResource("금액계산기 수정 배경.jpg");
		new ImageIcon(url);

		frame.setBounds(100, 100, 511, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		textField = new JTextField();
		textField.setFont(new Font("HY중고딕", Font.BOLD, 13));
		textField.setBounds(145, 101, 298, 27);
		// textField.setText("총금액 : ");
		textField.setColumns(10);

		JButton btnNum1 = new JButton("1");
		btnNum1.setFont(new Font("굴림", Font.BOLD, 0));
		btnNum1.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/1번.jpg")));
		btnNum1.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/1번.jpg")));
		btnNum1.setBounds(242, 182, 49, 31);
		btnNum1.setOpaque(false);
		btnNum1.setBorderPainted(false);

		JButton btnNum2 = new JButton("2");
		btnNum2.setFont(new Font("굴림", Font.BOLD, 0));
		btnNum2.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/2번.jpg")));
		btnNum2.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/2번.jpg")));
		btnNum2.setBounds(312, 182, 49, 31);
		btnNum2.setOpaque(false);
		btnNum2.setBorderPainted(false);

		JButton btnNum3 = new JButton("3");
		btnNum3.setFont(new Font("굴림", Font.BOLD, 0));
		btnNum3.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/3번.jpg")));
		btnNum3.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/3번.jpg")));
		btnNum3.setBounds(379, 182, 49, 31);
		btnNum3.setOpaque(false);
		btnNum3.setBorderPainted(false);

		JButton btnNum4 = new JButton("4");
		btnNum4.setFont(new Font("굴림", Font.BOLD, 0));
		btnNum4.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/4번.jpg")));
		btnNum4.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/4번.jpg")));
		btnNum4.setBounds(242, 228, 49, 31);
		btnNum4.setOpaque(false);
		btnNum4.setBorderPainted(false);

		JButton btnNum5 = new JButton("5");
		btnNum5.setFont(new Font("굴림", Font.BOLD, 0));
		btnNum5.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/5번.jpg")));
		btnNum5.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/5번.jpg")));
		btnNum5.setBounds(310, 228, 49, 31);
		btnNum5.setOpaque(false);
		btnNum5.setBorderPainted(false);

		JButton btnNum6 = new JButton("6");
		btnNum6.setFont(new Font("굴림", Font.BOLD, 0));
		btnNum6.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/6번.jpg")));
		btnNum6.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/6번.jpg")));
		btnNum6.setBounds(379, 228, 49, 31);
		btnNum6.setOpaque(false);
		btnNum6.setBorderPainted(false);

		JButton btnNum7 = new JButton("7");
		btnNum7.setFont(new Font("굴림", Font.BOLD, 0));
		btnNum7.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/7번.jpg")));
		btnNum7.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/7번.jpg")));
		btnNum7.setBounds(242, 276, 49, 31);
		btnNum7.setOpaque(false);
		btnNum7.setBorderPainted(false);

		JButton btnNum8 = new JButton("8");
		btnNum8.setFont(new Font("굴림", Font.BOLD, 0));
		btnNum8.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/8번.jpg")));
		btnNum8.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/8번.jpg")));
		btnNum8.setBounds(310, 277, 49, 31);
		btnNum8.setOpaque(false);
		btnNum8.setBorderPainted(false);

		JButton btnNum9 = new JButton("9");
		btnNum9.setFont(new Font("굴림", Font.BOLD, 0));
		btnNum9.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/9번.jpg")));
		btnNum9.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/9번.jpg")));
		btnNum9.setBounds(379, 276, 49, 31);
		btnNum9.setOpaque(false);
		btnNum9.setBorderPainted(false);

		JButton btnNum0 = new JButton("0");
		btnNum0.setFont(new Font("굴림", Font.PLAIN, 0));
		btnNum0.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/0번.jpg")));
		btnNum0.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/0번.jpg")));
		btnNum0.setBounds(310, 325, 49, 31);
		btnNum0.setOpaque(false);
		btnNum0.setBorderPainted(false);

		JButton btnNum1000 = new JButton("");
		btnNum1000.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/1000원.jpg")));
		btnNum1000.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/1000원.jpg")));
		btnNum1000.setBounds(76, 180, 96, 32);
		btnNum1000.setOpaque(false);
		btnNum1000.setBorderPainted(false);

		JButton btnNum2000 = new JButton("");
		btnNum2000.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/2000원.jpg")));
		btnNum2000.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/2000원.jpg")));
		btnNum2000.setBounds(76, 218, 96, 32);
		btnNum2000.setOpaque(false);
		btnNum2000.setBorderPainted(false);

		JButton btnNum3000 = new JButton("");
		btnNum3000.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/3000원.jpg")));
		btnNum3000.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/3000원.jpg")));
		btnNum3000.setBounds(76, 253, 96, 32);
		btnNum3000.setOpaque(false);
		btnNum3000.setBorderPainted(false);

		JButton btnNum4000 = new JButton("");
		btnNum4000.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/4000원.jpg")));
		btnNum4000.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/4000원.jpg")));
		btnNum4000.setBounds(76, 288, 96, 32);
		btnNum4000.setOpaque(false);
		btnNum4000.setBorderPainted(false);

		JButton btnNum5000 = new JButton("");
		btnNum5000.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/5000원.jpg")));
		btnNum5000.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/5000원.jpg")));
		btnNum5000.setBounds(76, 324, 96, 32);
		btnNum5000.setOpaque(false);
		btnNum5000.setBorderPainted(false);

		JButton btnNo = new JButton("");
		btnNo.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/취소.jpg")));
		btnNo.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/취소.jpg")));
		btnNo.setBounds(242, 325, 49, 31);
		btnNo.setOpaque(false);
		btnNo.setBorderPainted(false);

		JButton btnOk = new JButton("");
		btnOk.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/확인버튼.jpg")));
		btnOk.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/확인버튼.jpg")));
		btnOk.setFont(new Font("굴림", Font.PLAIN, 9));
		btnOk.setBounds(379, 325, 49, 31);
		btnOk.setOpaque(false);
		btnOk.setBorderPainted(false);

		// 버튼 액션
		btnNum0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum += btnNum0.getText();
				NowPay();
			}
		});
		btnNum1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum += btnNum1.getText();
				NowPay();
			}
		});
		btnNum2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum += btnNum2.getText();
				NowPay();
			}
		});
		btnNum3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum += btnNum3.getText();
				NowPay();
			}
		});
		btnNum4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum += btnNum4.getText();
				NowPay();
			}
		});
		btnNum5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum += btnNum5.getText();
				NowPay();
			}
		});
		btnNum6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum += btnNum6.getText();
				NowPay();
			}
		});
		btnNum7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum += btnNum7.getText();
				NowPay();
			}
		});
		btnNum8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum += btnNum8.getText();
				NowPay();
			}
		});
		btnNum9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum += btnNum9.getText();
				NowPay();
			}
		});

		btnNum1000.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum2 = 1000;
				NowPay();
			}
		});
		btnNum2000.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum2 = 2000;
				NowPay();
			}
		});
		btnNum3000.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum2 = 3000;
				NowPay();
			}
		});
		btnNum4000.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum2 = 4000;
				NowPay();
			}
		});
		btnNum5000.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum2 = 5000;
				NowPay();
			}
		});

		btnNo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum = "0";
				sum2 = 0;
				NowPay();
			}
		});

		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pay = Integer.valueOf(sum) * sum2;
				if (pay == 0) {
					JOptionPane.showMessageDialog(null, "원이나 장수가 0입니다. 다시입력해주세요.", "경고", JOptionPane.WARNING_MESSAGE);
				} else if (pay > 100000) {
					JOptionPane.showMessageDialog(null, "1인당 1회 10만원을 초과할 수 없습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				} else {
					a.getFrame().setVisible(true);
					a.nowPay(pay);
				}
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(textField);
		frame.getContentPane().add(btnNum4);
		frame.getContentPane().add(btnNum1);
		frame.getContentPane().add(btnNum7);
		frame.getContentPane().add(btnNum8);
		frame.getContentPane().add(btnNum5);
		frame.getContentPane().add(btnNum2);
		frame.getContentPane().add(btnNum0);
		frame.getContentPane().add(btnNum9);
		frame.getContentPane().add(btnNum3);
		frame.getContentPane().add(btnNum6);
		frame.getContentPane().add(btnNo);
		frame.getContentPane().add(btnOk);
		frame.getContentPane().add(btnNum5000);
		frame.getContentPane().add(btnNum4000);
		frame.getContentPane().add(btnNum3000);
		frame.getContentPane().add(btnNum2000);
		frame.getContentPane().add(btnNum1000);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/금액계산기 수정3.jpg")));
		lblNewLabel_1.setBounds(0, 0, 496, 377);
		frame.getContentPane().add(lblNewLabel_1);
	}

	public void NowPay() {
		int a = Integer.valueOf(sum);
		textField.setText(sum2 + "원  " + a + "장  총금액 : " + (a * sum2) + "원");
	}

	public JFrame getFrame() {
		return frame;
	}

	public void PayGo(BigInteger q) {
		int sumP = Integer.valueOf(sum);
		MakeRoom makeRoom = new MakeRoom();
		if (makeRoom.pay(pay, q)) {
			for (int i = 0; i < sumP * (sum2 / 1000); i++) {
				makeRoom.makeAutoNumber();
				a.falsePayNow();
				frame.setVisible(false);
			}
			makeRoom.exeWin();
			// makeRoom.exeAut();

		}

	}

}