package testteam;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

public class PayNow {

	private JFrame frame;
	private JTextField textField;
	AutoLottoUser1 auto;
	int nowP;
	JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PayNow window = new PayNow(null);
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
	public PayNow(AutoLottoUser1 auto) {
		this.auto = auto;
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

		lblNewLabel = new JLabel("총금액: " + nowP + "");

		JButton btnNewButton = new JButton("결제하기");

		textField = new JTextField();
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("돈을 넣어주세요.");

		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					auto.PayGo(Integer.valueOf(textField.getText()));
				} catch (Exception o) {
					lblNewLabel_1.setText("정수를 입력해 주세요.");
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

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(56)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING,
								groupLayout.createSequentialGroup().addComponent(btnNewButton_1)
										.addPreferredGap(ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
										.addComponent(
												btnNewButton, GroupLayout.PREFERRED_SIZE, 97,
												GroupLayout.PREFERRED_SIZE)
										.addGap(61))
						.addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout
								.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 308, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 250,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE))
								.addContainerGap(70, Short.MAX_VALUE)))));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(46)
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
	}
}
