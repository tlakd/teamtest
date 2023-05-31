package testteam;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		frame.setBounds(100, 100, 599, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNewLabel = new JLabel("1인당 1회 10만원을 초과할 수 없습니다.");
		lblNewLabel.setBounds(182, 30, 246, 15);

		textField = new JTextField();
		textField.setBounds(106, 63, 376, 66);
		textField.setText("총금액 : ");
		textField.setColumns(10);

		JButton btnNum1 = new JButton("1");
		btnNum1.setBounds(48, 147, 58, 36);

		JButton btnNum2 = new JButton("2");
		btnNum2.setBounds(124, 148, 59, 35);

		JButton btnNum3 = new JButton("3");
		btnNum3.setBounds(201, 147, 55, 36);

		JButton btnNum4 = new JButton("4");
		btnNum4.setBounds(48, 201, 58, 31);

		JButton btnNum5 = new JButton("5");
		btnNum5.setBounds(124, 202, 59, 29);

		JButton btnNum6 = new JButton("6");
		btnNum6.setBounds(201, 201, 55, 31);

		JButton btnNum7 = new JButton("7");
		btnNum7.setBounds(48, 250, 58, 33);

		JButton btnNum8 = new JButton("8");
		btnNum8.setBounds(124, 250, 59, 32);

		JButton btnNum9 = new JButton("9");
		btnNum9.setBounds(201, 250, 55, 33);

		JButton btnNum0 = new JButton("0");
		btnNum0.setBounds(124, 301, 59, 33);

		JButton btnNum1000 = new JButton("1000원");
		btnNum1000.setBounds(346, 147, 125, 36);

		JButton btnNum2000 = new JButton("2000원");
		btnNum2000.setBounds(346, 193, 125, 32);

		JButton btnNum3000 = new JButton("3000원");
		btnNum3000.setBounds(346, 235, 125, 32);

		JButton btnNum4000 = new JButton("4000원");
		btnNum4000.setBounds(346, 277, 125, 31);

		JButton btnNum5000 = new JButton("5000원");
		btnNum5000.setBounds(346, 318, 125, 32);

		JButton btnNo = new JButton("취소");
		btnNo.setBounds(124, 389, 76, 35);

		JButton btnOk = new JButton("확인");
		btnOk.setBounds(361, 389, 84, 35);

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

	}

	public void NowPay() {
		int a = Integer.valueOf(sum);
		textField.setText(sum2 + "원" + a + "장 총금액 : " + (a * sum2) + "원");
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

		}

	}

}