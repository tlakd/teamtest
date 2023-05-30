//집에서 테스트 중입니다.
import java.awt.Graphics;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
 
public class back1 extends JFrame {
    JScrollPane scrollPane;
    ImageIcon icon;
 
    public back1() {
        icon = new ImageIcon("메인화면2.jpg");
       
        //배경 Panel 생성후 컨텐츠페인으로 지정      
        JPanel background = new JPanel() {
            public void paintComponent(Graphics g) {
                g.drawImage(icon.getImage(), 0, 0, null);
                setOpaque(false); //그림을 표시하게 설정,투명하게 조절
                super.paintComponent(g);
            }
        };
        scrollPane = new JScrollPane(background);
        background.setLayout(null);
        
        JButton btnNewButton = new JButton("");
        btnNewButton.setBounds(44, 308, 82, 33);
        
        URL url = back1.class.getResource("1번 메뉴1.jpg");
        URL url_1 = back1.class.getResource("1번 메뉴2.jpg");
        
        ImageIcon icon = new ImageIcon(url);
        ImageIcon icon1_1 = new ImageIcon(url_1);
        btnNewButton.setIcon(icon);
        btnNewButton.setSelectedIcon(icon);
        btnNewButton.setPressedIcon(icon1_1);
        background.add(btnNewButton);
        
        URL url2 = back1.class.getResource("2번 메뉴1.jpg");
        URL url2_1 = back1.class.getResource("2번 메뉴2.jpg");
        
        ImageIcon icon2 = new ImageIcon(url2);
        ImageIcon icon2_1 = new ImageIcon(url2_1);
        
        JButton btnNewButton2 = new JButton("");
        btnNewButton2.setBounds(150, 308, 82, 31);
        btnNewButton2.setIcon(icon2);
        btnNewButton2.setSelectedIcon(icon2);
        btnNewButton2.setPressedIcon(icon2_1);
        background.add(btnNewButton2);
        
        URL url3 = back1.class.getResource("3번 메뉴.jpg");
        URL url3_1 = back1.class.getResource("3번 메뉴1.jpg");
        
        ImageIcon icon3 = new ImageIcon(url3);
        ImageIcon icon3_1 = new ImageIcon(url3_1);
        
        JButton btnNewButton3 = new JButton("");
        btnNewButton3.setBounds(254, 308, 82, 31);
        btnNewButton3.setIcon(icon3);
        btnNewButton3.setSelectedIcon(icon3);
        btnNewButton3.setPressedIcon(icon3_1);
        background.add(btnNewButton3);
        
        URL url4 = back1.class.getResource("4번 메뉴.jpg");
        URL url4_1 = back1.class.getResource("4번 메뉴1.jpg");
        
        ImageIcon icon4 = new ImageIcon(url3);
        ImageIcon icon4_1 = new ImageIcon(url3_1);
        
        JButton btnNewButton4 = new JButton("");
        btnNewButton4.setIcon(icon4);
        btnNewButton4.setSelectedIcon(icon4);
        btnNewButton4.setBounds(363, 308, 82, 31);
        background.add(btnNewButton4);
        btnNewButton4.setPressedIcon(icon4_1);
        setContentPane(scrollPane);
    }
 
    public static void main(String[] args) {
        back1 frame = new back1();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(520, 415);
        frame.setVisible(true);
    }
}
