package testteam;

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
	}
}