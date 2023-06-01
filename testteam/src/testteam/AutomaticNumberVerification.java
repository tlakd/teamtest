package testteam;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.DefaultCaret;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//import javax.swing.text.DefaultCaret;

public class AutomaticNumberVerification {
	
	
	private Map<Integer, List<NumberSave>> userNumber;
	private Map<Integer, String> autoNotAuto;
	

	public void 자동번호출력(Map<Integer, List<NumberSave>> userNumber, Map<Integer, String> autoNotAuto) {
		System.out.println("자동번호 출력 메소드 실행");
		this.userNumber = userNumber;
		this.autoNotAuto = autoNotAuto;
		
		String[] letters = {" A", " B", " C", " D", " E"};
		int letterIndex = 0;

		for (int i = 1; i <= this.autoNotAuto.size(); i++) {
		    if (this.autoNotAuto.get(i).equals("자 동")) {
		        System.out.println(this.userNumber.get(i));
		        String lottoNumber = this.userNumber.get(i).toString();
		        
		        
		        textArea.append(" " + letters[letterIndex] + " ");
		        letterIndex = (letterIndex + 1) % 5;
		        textArea.append("   " + this.autoNotAuto.get(i) + "   ");
		        
		        lottoNumber = lottoNumber.replaceAll("[\\[\\]\\s,]+", "    ");
		        
		        String[] numbers = lottoNumber.split("\\s+");
		        StringBuilder modifiedLottoNumber = new StringBuilder();
		        for (String number : numbers) {
		            if (number.length() == 1) {
		                modifiedLottoNumber.append("0");
		            }
		            modifiedLottoNumber.append(number).append("     ");
		        }
		        lottoNumber = modifiedLottoNumber.toString().trim();
		        
		        textArea.append(lottoNumber + "\n");
		        
                
		        
		        int fontStyle = Font.BOLD;
		        Font font = new Font("맑은 고딕", Font.PLAIN, 14);
		        font = font.deriveFont(fontStyle);
		        textArea.setFont(font);
		        textArea.setForeground(Color.BLACK);
		        textArea.setFont(font);
		        
		    }
		}

	}
	
	

	public JFrame frame;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AutomaticNumberVerification window = new AutomaticNumberVerification();
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
	public AutomaticNumberVerification() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("로또 영수증");
		frame.setBounds(100, 100, 510, 678);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textArea = new JTextArea("");
		textArea.setLineWrap(true);
		textArea.setForeground(Color.BLACK);
		textArea.setFont(new Font("HY견고딕", Font.PLAIN, 14));
		textArea.setEditable(false);
		textArea.setEnabled(false);
		textArea.setBackground(Color.WHITE);
		textArea.setBounds(101, 60, 238, 150);
		
		DefaultCaret caret = (DefaultCaret) textArea.getCaret();
        caret.setDot(10); // 커서 위치 설정
        caret.setVisible(false);
		
		frame.getContentPane().add(textArea);

		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(60, 320, 350, 125);
		frame.getContentPane().add(scrollPane);
		
		JButton btn = new JButton("");
		btn.setIcon(new ImageIcon(AutomaticNumberVerification.class.getResource("/image/확인큰것.jpg")));
		btn.setSelectedIcon(new ImageIcon(AutomaticNumberVerification.class.getResource("/image/확인큰것.jpg")));
		btn.setBounds(203, 600, 79, 31);
		frame.getContentPane().add(btn);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(AutomaticNumberVerification.class.getResource("/image/로또 출력물1 중간배경색 수정1.jpg")));
		lblNewLabel.setBounds(0, 0, 494, 640);
		frame.getContentPane().add(lblNewLabel);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});

	   
	}
}