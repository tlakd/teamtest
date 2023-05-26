package testteam;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class AutoLottoUser1 {
	private JFrame frame;
	private JTextField textField;
	private String sum = "0";
	private int sum2 = 0;
	private int pay;

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
		frame.setBounds(100, 100, 755, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNewLabel = new JLabel("1인당 1회 10만원을 초과할 수 없습니다.");

		textField = new JTextField();
		textField.setText("총금액 : ");
		textField.setColumns(10);

		JButton btnNum1 = new JButton("1");

		JButton btnNum2 = new JButton("2");
		btnNum2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		JButton btnNum3 = new JButton("3");

		JButton btnNum4 = new JButton("4");

		JButton btnNum5 = new JButton("5");

		JButton btnNum6 = new JButton("6");

		JButton btnNum7 = new JButton("7");

		JButton btnNum8 = new JButton("8");

		JButton btnNum9 = new JButton("9");

		JButton btnNum0 = new JButton("0");

		JButton btnNum1000 = new JButton("1000");

		JButton btnNum2000 = new JButton("2000");

		JButton btnNum3000 = new JButton("3000");

		JButton btnNum4000 = new JButton("4000");

		JButton btnNum5000 = new JButton("5000");

		JButton btnNo = new JButton("취소");

		JButton btnOk = new JButton("확인");

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
				sum2 = Integer.valueOf(btnNum1000.getText());
				NowPay();
			}
		});
		btnNum2000.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum2 = Integer.valueOf(btnNum2000.getText());
				NowPay();
			}
		});
		btnNum3000.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum2 = Integer.valueOf(btnNum3000.getText());
				NowPay();
			}
		});
		btnNum4000.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum2 = Integer.valueOf(btnNum4000.getText());
				NowPay();
			}
		});
		btnNum5000.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sum2 = Integer.valueOf(btnNum5000.getText());
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
				System.out.println(pay);
				PayNow a = new PayNow(AutoLottoUser1.this);
				a.getFrame().setVisible(true);
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup().addGap(262).addComponent(lblNewLabel,
										GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup().addGap(164).addComponent(textField,
										GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup().addGap(48).addGroup(groupLayout
										.createParallelGroup(Alignment.TRAILING, false).addComponent(btnNum4,
												Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(btnNum1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 58,
												Short.MAX_VALUE)
										.addComponent(btnNum7, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGap(18)
										.addGroup(groupLayout
												.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
														.createSequentialGroup().addGroup(groupLayout
																.createParallelGroup(Alignment.LEADING, false)
																.addComponent(btnNum8, GroupLayout.DEFAULT_SIZE,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(btnNum5, GroupLayout.DEFAULT_SIZE,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(btnNum2, GroupLayout.DEFAULT_SIZE, 59,
																		Short.MAX_VALUE)
																.addComponent(btnNum0, 0, 0, Short.MAX_VALUE))
														.addGap(18)
														.addGroup(groupLayout
																.createParallelGroup(Alignment.LEADING, false)
																.addComponent(btnNum9, GroupLayout.DEFAULT_SIZE,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(btnNum3, GroupLayout.DEFAULT_SIZE, 55,
																		Short.MAX_VALUE)
																.addComponent(btnNum6, GroupLayout.DEFAULT_SIZE,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
												.addComponent(btnNo, GroupLayout.PREFERRED_SIZE, 76,
														GroupLayout.PREFERRED_SIZE))
										.addGap(159)
										.addGroup(groupLayout
												.createParallelGroup(Alignment.LEADING)
												.addComponent(btnOk, GroupLayout.PREFERRED_SIZE, 84,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(btnNum5000, GroupLayout.DEFAULT_SIZE, 125,
																Short.MAX_VALUE)
														.addComponent(btnNum4000, GroupLayout.DEFAULT_SIZE, 125,
																Short.MAX_VALUE)
														.addComponent(
																btnNum3000, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addGroup(Alignment.TRAILING, groupLayout
																.createParallelGroup(Alignment.LEADING, false)
																.addComponent(btnNum2000, Alignment.TRAILING,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(btnNum1000, Alignment.TRAILING,
																		GroupLayout.DEFAULT_SIZE, 125,
																		Short.MAX_VALUE))))))
						.addContainerGap(199, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(30).addComponent(lblNewLabel).addGap(18)
				.addComponent(textField, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup().addGap(18)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnNum1, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
										.addComponent(btnNum2, GroupLayout.PREFERRED_SIZE, 35,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnNum3, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup().addGap(18).addComponent(btnNum1000,
								GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addGap(18)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(btnNum5, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
												.addComponent(btnNum6, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
										.addComponent(btnNum4, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
								.addGap(18)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(btnNum8, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
												.addComponent(btnNum9, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
										.addComponent(btnNum7, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
								.addGap(18)
								.addComponent(btnNum0, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addGap(55))
						.addGroup(groupLayout.createSequentialGroup().addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnNum2000, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnNum3000, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnNum4000, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnNum5000, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addGap(39)))
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnOk, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNo, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
				.addGap(53)));

		frame.getContentPane().setLayout(groupLayout);
	}

	public void NowPay() {
		int a = Integer.valueOf(sum);
		textField.setText(sum2 + "원" + a + "장 총금액 : " + (a * sum2) + "원");
	}

	public JFrame getFrame() {
		return frame;
	}

	public int getPay() {
		return pay;
	}
}
