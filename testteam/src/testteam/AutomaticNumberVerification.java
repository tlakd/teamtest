package testteam;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class AutomaticNumberVerification {
	
	
	private Map<Integer, List<NumberSave>> userNumber;
	private Map<Integer, String> autoNotAuto;
	

	public void 자동번호출력(Map<Integer, List<NumberSave>> userNumber, Map<Integer, String> autoNotAuto) {
		System.out.println("자동번호 출력 메소드 실행");
		this.userNumber = userNumber;
		this.autoNotAuto = autoNotAuto;
		
		String[] letters = {"A", "B", "C", "D", "E"};
		int letterIndex = 0;

		for (int i = 1; i <= this.autoNotAuto.size(); i++) {
		    if (this.autoNotAuto.get(i).equals("자 동")) {
		        System.out.println(this.userNumber.get(i));
		        String lottoNumber = this.userNumber.get(i).toString();
		        
		        textArea.append(letters[letterIndex] + " ");
		        letterIndex = (letterIndex + 1) % 5;
		        textArea.append(this.autoNotAuto.get(i) + " ");
		        
		        lottoNumber = lottoNumber.replace("[", "").replace("]", "");
		        textArea.append(lottoNumber + "\n");
		    }
		}

	}

	public JFrame frame;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AutomaticNumberVerification window = new AutomaticNumberVerification();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}

	/**
	 * Create the application.
	 */
	public AutomaticNumberVerification() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl1 = new JLabel("당신의 추첨 번호입니다");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setBounds(86, 10, 272, 15);
		frame.getContentPane().add(lbl1);
		
		textArea = new JTextArea(" ");
		textArea.setBounds(101, 60, 238, 150);
		frame.getContentPane().add(textArea);

		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(114, 56, 200, 150);
		frame.getContentPane().add(scrollPane);
		
		JButton btn = new JButton("확인");
		btn.setBounds(157, 216, 97, 35);
		frame.getContentPane().add(btn);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});

	   
	}
}
