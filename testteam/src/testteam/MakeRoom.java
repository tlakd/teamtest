package testteam;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class MakeRoom {
	Map<Integer, List<NumberSave>> lottoNumber = new HashMap<>();// 로또 번호 저장
	Map<Integer, List<NumberSave>> userNumber = new HashMap<>(); // 유저 번호 저장
	Map<Integer, String> autoNotAuto = new HashMap<>(); // 자동 반자동 수동
	int a = 0;

	public Map<Integer, List<NumberSave>> getLottoNumber() {
		return lottoNumber;
	}

	int userCount = 1;
	static int lottoCount = 101;
	int MaxPay = 100000;

	public void makeMachineLotto(int i) {// 로또번호 만드는 곳
		if (!lottoNumber.containsKey(i)) {
			lottoNumber.put(i, new ArrayList<>());
		}
		while (lottoNumber.get(i).size() < 7) {
			int q = (int) (Math.random() * 45) + 1;
			NumberSave newNumber = new NumberSave(q);
			if (!lottoNumber.get(i).contains(newNumber)) {
				lottoNumber.get(i).add(newNumber);
			}
		}
	}

	public void makeAutoNumber() {// 사용자의 로또번호 자동생성

		int count = 0;
		if (!userNumber.containsKey(userCount)) {
			userNumber.put(userCount, new ArrayList<>());
		}
		while (userNumber.get(userCount).size() < 6) {
			int q = (int) (Math.random() * 45) + 1;
			NumberSave newNumber = new NumberSave(q);
			if (!userNumber.get(userCount).contains(newNumber)) {
				userNumber.get(userCount).add(newNumber);
				count++;
			}
		}
		if (count == 6) {
			autoNotAuto.put(userCount, "자 동");
		} else if (count < 6) {
			autoNotAuto.put(userCount, "반자동");
		}
		Collections.sort(userNumber.get(userCount));
		userCount++;
		WinningNumber win = new WinningNumber();
		win.자동여러장구매시(userNumber, autoNotAuto);
	}

	public void exeWin() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinningNumber win = new WinningNumber();
					win.자동여러장구매시(userNumber, autoNotAuto);
					win.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void exeAut() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AutomaticNumberVerification window = new AutomaticNumberVerification();
					window.자동번호출력(userNumber, autoNotAuto);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void makeLottoNumber() {// 이때 까지의 로또 1등번호 뽑기 초안 7자리 처음 만들때
		for (int i = 0; i <= lottoCount; i++) {
			makeMachineLotto(i);
		}
	}

	public void makeLottoNumberNew(JComboBox<Integer> selectBox) {// 다음 회차 될때 로또 1등번호 뽑기 초안(로또 다음 회차 생성, 샀던 개수 초기화 살수있는
																	// 값 초기화, 이때 까지 유저가 샀던 기록 초기화)
		lottoCount++;
		makeMachineLotto(lottoCount);
		userCount = 1;
		MaxPay = 100000;
		userNumber.clear();
		autoNotAuto.clear();
		selectBox.addItem(lottoCount);
		a = 0;
	}
	

	public void makeLottoNumberNew() {// 다음 회차 될때 로또 1등번호 뽑기 초안(로또 다음 회차 생성, 샀던 개수 초기화 살수있는
		// 값 초기화, 이때 까지 유저가 샀던 기록 초기화)
		lottoCount++;
		makeMachineLotto(lottoCount);
		userCount = 1;
		MaxPay = 100000;
		userNumber.clear();
		autoNotAuto.clear();
		a = 0;
	}
	
	

	public boolean pay(int i, int j) {// 결제 초안
		int setCount = userCount - a;
		if (MaxPay - i < 0) {
			// 10만원 이상 경고문
			JOptionPane.showMessageDialog(null, "1인당 1회 10만원을 초과할 수 없습니다.");
			return false;
		} else if (j < i) {
			// 돈이 부족하다는 경고문
			JOptionPane.showMessageDialog(null, "결제 금액보다 투입금이 부족합니다.");
			return false;
		} else {
			MaxPay = MaxPay - i;
			a = userCount;
			JOptionPane.showMessageDialog(null, "결제가 완료되었습니다.\n거스름돈은: " + (j - i) + "원입니다.");// 잔돈부분추가
			return true;
		}

	}
}