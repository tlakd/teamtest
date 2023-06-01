package testteam;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

<<<<<<< HEAD
=======
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
<<<<<<< HEAD
=======
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git

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
<<<<<<< HEAD
		frame.setBounds(100, 100, 599, 516);
=======
		frame.setTitle("로또 구매하기 메뉴");
		
		URL url = AutoLottoUser1.class.getClassLoader().getResource("금액계산기 수정 배경.jpg");
	    new ImageIcon(url);
		
		frame.setBounds(100, 100, 511, 416);
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

<<<<<<< HEAD
		JLabel lblNewLabel = new JLabel("1인당 1회 10만원을 초과할 수 없습니다.");
		lblNewLabel.setBounds(182, 30, 246, 15);

=======
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git
		textField = new JTextField();
<<<<<<< HEAD
		textField.setBounds(106, 63, 376, 66);
		textField.setText("총금액 : ");
=======
		textField.setFont(new Font("HY중고딕", Font.BOLD, 13));
		textField.setBounds(145, 101, 298, 27);
		//textField.setText("총금액 : ");
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git
		textField.setColumns(10);
		
		JButton btnNum1 = new JButton("1");
<<<<<<< HEAD
		btnNum1.setBounds(48, 147, 58, 36);
=======
		btnNum1.setFont(new Font("굴림", Font.BOLD, 0));
		btnNum1.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/1번.jpg")));
		btnNum1.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/1번.jpg")));
		btnNum1.setBounds(75, 182, 49, 31);
		btnNum1.setOpaque(false);
		btnNum1.setBorderPainted(false);
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git

		JButton btnNum2 = new JButton("2");
<<<<<<< HEAD
		btnNum2.setBounds(124, 148, 59, 35);
=======
		btnNum2.setFont(new Font("굴림", Font.BOLD, 0));
		btnNum2.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/2번.jpg")));
		btnNum2.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/2번.jpg")));
		btnNum2.setBounds(145, 182, 49, 31);
		btnNum2.setOpaque(false);
		btnNum2.setBorderPainted(false);
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git

		JButton btnNum3 = new JButton("3");
<<<<<<< HEAD
		btnNum3.setBounds(201, 147, 55, 36);
=======
		btnNum3.setFont(new Font("굴림", Font.BOLD, 0));
		btnNum3.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/3번.jpg")));
		btnNum3.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/3번.jpg")));
		btnNum3.setBounds(212, 182, 49, 31);
		btnNum3.setOpaque(false);
		btnNum3.setBorderPainted(false);
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git

		JButton btnNum4 = new JButton("4");
<<<<<<< HEAD
		btnNum4.setBounds(48, 201, 58, 31);
=======
		btnNum4.setFont(new Font("굴림", Font.BOLD, 0));
		btnNum4.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/4번.jpg")));
		btnNum4.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/4번.jpg")));
		btnNum4.setBounds(75, 228, 49, 31);
		btnNum4.setOpaque(false);
		btnNum4.setBorderPainted(false);
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git

		JButton btnNum5 = new JButton("5");
<<<<<<< HEAD
		btnNum5.setBounds(124, 202, 59, 29);
=======
		btnNum5.setFont(new Font("굴림", Font.BOLD, 0));
		btnNum5.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/5번.jpg")));
		btnNum5.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/5번.jpg")));
		btnNum5.setBounds(143, 228, 49, 31);
		btnNum5.setOpaque(false);
		btnNum5.setBorderPainted(false);
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git

		JButton btnNum6 = new JButton("6");
<<<<<<< HEAD
		btnNum6.setBounds(201, 201, 55, 31);
=======
		btnNum6.setFont(new Font("굴림", Font.BOLD, 0));
		btnNum6.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/6번.jpg")));
		btnNum6.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/6번.jpg")));
		btnNum6.setBounds(212, 228, 49, 31);
		btnNum6.setOpaque(false);
		btnNum6.setBorderPainted(false);
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git

		JButton btnNum7 = new JButton("7");
<<<<<<< HEAD
		btnNum7.setBounds(48, 250, 58, 33);
=======
		btnNum7.setFont(new Font("굴림", Font.BOLD, 0));
		btnNum7.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/7번.jpg")));
		btnNum7.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/7번.jpg")));
		btnNum7.setBounds(75, 276, 49, 31);
		btnNum7.setOpaque(false);
		btnNum7.setBorderPainted(false);
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git

		JButton btnNum8 = new JButton("8");
<<<<<<< HEAD
		btnNum8.setBounds(124, 250, 59, 32);
=======
		btnNum8.setFont(new Font("굴림", Font.BOLD, 0));
		btnNum8.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/8번.jpg")));
		btnNum8.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/8번.jpg")));
		btnNum8.setBounds(143, 277, 49, 31);
		btnNum8.setOpaque(false);
		btnNum8.setBorderPainted(false);
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git

		JButton btnNum9 = new JButton("9");
<<<<<<< HEAD
		btnNum9.setBounds(201, 250, 55, 33);
=======
		btnNum9.setFont(new Font("굴림", Font.BOLD, 0));
		btnNum9.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/9번.jpg")));
		btnNum9.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/9번.jpg")));
		btnNum9.setBounds(212, 276, 49, 31);
		btnNum9.setOpaque(false);
		btnNum9.setBorderPainted(false);
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git

		JButton btnNum0 = new JButton("0");
<<<<<<< HEAD
		btnNum0.setBounds(124, 301, 59, 33);
=======
		btnNum0.setFont(new Font("굴림", Font.PLAIN, 0));
		btnNum0.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/0번.jpg")));
		btnNum0.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/0번.jpg")));
		btnNum0.setBounds(143, 325, 49, 31);
		btnNum0.setOpaque(false);
		btnNum0.setBorderPainted(false);
		
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git

<<<<<<< HEAD
		JButton btnNum1000 = new JButton("1000원");
		btnNum1000.setBounds(346, 147, 125, 36);
=======
		JButton btnNum1000 = new JButton("");
		btnNum1000.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/1000원.jpg")));
		btnNum1000.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/1000원.jpg")));
		btnNum1000.setBounds(325, 180, 96, 32);
		btnNum1000.setOpaque(false);
		btnNum1000.setBorderPainted(false);
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git

<<<<<<< HEAD
		JButton btnNum2000 = new JButton("2000원");
		btnNum2000.setBounds(346, 193, 125, 32);
=======
		JButton btnNum2000 = new JButton("");
		btnNum2000.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/2000원.jpg")));
		btnNum2000.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/2000원.jpg")));
		btnNum2000.setBounds(325, 218, 96, 32);
		btnNum2000.setOpaque(false);
		btnNum2000.setBorderPainted(false);
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git

<<<<<<< HEAD
		JButton btnNum3000 = new JButton("3000원");
		btnNum3000.setBounds(346, 235, 125, 32);
=======
		JButton btnNum3000 = new JButton("");
		btnNum3000.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/3000원.jpg")));
		btnNum3000.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/3000원.jpg")));
		btnNum3000.setBounds(325, 253, 96, 32);
		btnNum3000.setOpaque(false);
		btnNum3000.setBorderPainted(false);
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git

<<<<<<< HEAD
		JButton btnNum4000 = new JButton("4000원");
		btnNum4000.setBounds(346, 277, 125, 31);
=======
		JButton btnNum4000 = new JButton("");
		btnNum4000.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/4000원.jpg")));
		btnNum4000.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/4000원.jpg")));
		btnNum4000.setBounds(325, 288, 96, 32);
		btnNum4000.setOpaque(false);
		btnNum4000.setBorderPainted(false);
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git

<<<<<<< HEAD
		JButton btnNum5000 = new JButton("5000원");
		btnNum5000.setBounds(346, 318, 125, 32);
=======
		JButton btnNum5000 = new JButton("");
		btnNum5000.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/5000원.jpg")));
		btnNum5000.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/5000원.jpg")));
		btnNum5000.setBounds(325, 324, 96, 32);
		btnNum5000.setOpaque(false);
		btnNum5000.setBorderPainted(false);
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git

<<<<<<< HEAD
		JButton btnNo = new JButton("취소");
		btnNo.setBounds(124, 389, 76, 35);
=======
		JButton btnNo = new JButton("");
		btnNo.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/취소.jpg")));
		btnNo.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/취소.jpg")));
		btnNo.setBounds(75, 325, 49, 31);
		btnNo.setOpaque(false);
		btnNo.setBorderPainted(false);
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git

<<<<<<< HEAD
		JButton btnOk = new JButton("확인");
		btnOk.setBounds(361, 389, 84, 35);
=======
		JButton btnOk = new JButton("");
		btnOk.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/확인버튼.jpg")));
		btnOk.setSelectedIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/확인버튼.jpg")));
		btnOk.setFont(new Font("굴림", Font.PLAIN, 9));
		btnOk.setBounds(212, 325, 49, 31);
		btnOk.setOpaque(false);
		btnOk.setBorderPainted(false);
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git

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
				try {
					sum = sum.substring(0, sum.length() - 1);
				} catch (Exception o) {
				}
				NowPay();
			}
		});

		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pay = Integer.valueOf(sum) * sum2;
				if (pay > 100000) {
					JOptionPane.showMessageDialog(null, "1인 10만원 이상 구매가 불가능 합니다.");
				} else {
					a.getFrame().setVisible(true);
					a.nowPay(pay);
				}
			}
		});
<<<<<<< HEAD

		JLabel lblNewLabel_1 = new JLabel("몇장을 구매할지 눌러주세요");
		lblNewLabel_1.setBounds(78, 352, 167, 15);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNum4);
		frame.getContentPane().add(btnNum1);
		frame.getContentPane().add(btnNum7);
		frame.getContentPane().add(btnNum5);
		frame.getContentPane().add(btnNum8);
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
		frame.getContentPane().add(textField);
		frame.getContentPane().add(lblNewLabel);
		frame.getContentPane().add(lblNewLabel_1);

=======
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
		lblNewLabel_1.setIcon(new ImageIcon(AutoLottoUser1.class.getResource("/image/금액계산기 수정2.jpg")));
		lblNewLabel_1.setBounds(0, 0, 496, 377);
		frame.getContentPane().add(lblNewLabel_1);
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git
	}

	public void NowPay() {
		int a = Integer.valueOf(sum);
		textField.setText(sum2 + "원  " + a + "장  총금액 : " + (a * sum2) + "원");
	}

	public JFrame getFrame() {
		return frame;
	}

	public void PayGo(int q) {
		int sumP = Integer.valueOf(sum);
		MakeRoom makeRoom = new MakeRoom();
		if (makeRoom.pay(pay, q)) {
			for (int i = 0; i < sumP * (sum2 / 1000); i++) {
				makeRoom.makeAutoNumber();
				a.falsePayNow();
				frame.setVisible(false);
			}
<<<<<<< HEAD

=======
			//makeRoom.exeWin();
			makeRoom.exeAut();
			
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git
		}

	}

}