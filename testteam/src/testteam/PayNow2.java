package testteam;

<<<<<<< HEAD
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

public class PayNow2 {

	private JFrame frame;
	private JTextField textField;
	NoAutoSt n;
	int nowP;
	JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PayNow2 window = new PayNow2(null);
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
	public PayNow2(NoAutoSt n) {
		this.n = n;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		MakeRoom makeRoom = new MakeRoom();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lblNewLabel = new JLabel("총금액: " + nowP + "");// 글자

		JButton btnNewButton = new JButton("결제하기");

		textField = new JTextField();
		textField.setColumns(20);

		JLabel lblNewLabel_1 = new JLabel("돈을 넣어주세요.");

		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					n.PayGo(Integer.valueOf(textField.getText()));
				} catch (NumberFormatException o) {
					lblNewLabel_1.setText("정수를 입력하세요.");
				}
			}
		});

		JButton btnNewButton_1 = new JButton("뒤로가기");

		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});

		JLabel lblNewLabel_2 = new JLabel("1인당 1회 10만원을 초과할 수 없습니다.");

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(56)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup().addComponent(btnNewButton_1)
										.addPreferredGap(ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
										.addComponent(
												btnNewButton, GroupLayout.PREFERRED_SIZE, 97,
												GroupLayout.PREFERRED_SIZE)
										.addGap(61))
								.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 308,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 250,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(textField, GroupLayout.PREFERRED_SIZE, 238,
														GroupLayout.PREFERRED_SIZE))
										.addContainerGap(70, Short.MAX_VALUE))))
				.addGroup(groupLayout.createSequentialGroup().addGap(102).addComponent(lblNewLabel_2)
						.addContainerGap(116, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(25).addComponent(lblNewLabel_2)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE).addGap(37)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
						.addContainerGap(29, Short.MAX_VALUE)));
		frame.getContentPane().setLayout(groupLayout);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void falsePayNow() {
		frame.setVisible(false);
	}

	public void nowPay(int a) {
		nowP = a;
		lblNewLabel.setText("총금액: " + nowP + "");
=======
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PayNow2 {

	private JFrame frame;
	private JTextField textField;
	NoAutoSt n;
	int nowP;
	JLabel lblNewLabel;
	NoAutoSt na;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PayNow2 window = new PayNow2(null);
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
	public PayNow2(NoAutoSt n) {
		this.n = n;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		MakeRoom makeRoom = new MakeRoom();
		frame = new JFrame();
		frame.setTitle("결제하기 메뉴");
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lblNewLabel = new JLabel("총 금액 : null");// 글자
		lblNewLabel.setBounds(56, 46, 308, 37);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("HY중고딕", Font.BOLD, 13));

		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(288, 194, 77, 29);
		btnNewButton.setIcon(new ImageIcon(PayNow2.class.getResource("/image/결제하기버튼.jpg")));

		lblNewLabel = new JLabel("총 금액 : null");// 글자
		lblNewLabel.setBounds(56, 46, 308, 37);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("HY중고딕", Font.BOLD, 13));
		textField = new JTextField();
		textField.setColumns(20);
		textField.setBounds(56, 127, 308, 30);
		textField.setFont(new Font("HY중고딕", Font.BOLD, 13));
		textField.setColumns(10);
		textField = new JTextField();
		textField.setColumns(20);
		textField.setBounds(56, 127, 308, 30);
		textField.setFont(new Font("HY중고딕", Font.BOLD, 13));
		textField.setColumns(10);
		textField = new JTextField();
		textField.setColumns(20);
		textField.setBounds(56, 127, 308, 30);
		textField.setFont(new Font("HY중고딕", Font.BOLD, 13));
		textField.setColumns(10);
		textField = new JTextField();
		textField.setColumns(20);
		textField.setBounds(56, 127, 308, 30);
		textField.setFont(new Font("HY중고딕", Font.BOLD, 13));
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("돈을 넣어주세요.");
		lblNewLabel_1.setBounds(56, 93, 250, 24);
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("HY중고딕", Font.BOLD, 13));

		textField = new JTextField();
		textField.setBounds(56, 127, 308, 30);
		textField.setFont(new Font("HY중고딕", Font.BOLD, 13));
		textField.setColumns(10);

		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					BigInteger a = new BigInteger(textField.getText());
					n.PayGo(a);
				} catch (Exception o) {
					lblNewLabel_1.setText("정수를 입력해 주세요.");
				}
			}
		});

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(56, 194, 77, 29);
		btnNewButton_1.setIcon(new ImageIcon(PayNow2.class.getResource("/image/뒤로가기1.jpg")));
		btnNewButton_1.setSelectedIcon(new ImageIcon(PayNow2.class.getResource("/image/뒤로가기1.jpg")));
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton_1);
		frame.getContentPane().add(btnNewButton);
		frame.getContentPane().add(lblNewLabel);
		frame.getContentPane().add(lblNewLabel_1);
		frame.getContentPane().add(textField);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void falsePayNow() {
		frame.setVisible(false);
	}

	public void nowPay(int a) {
		nowP = a;
		lblNewLabel.setText("총금액: " + nowP + "원");
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git
	}
}