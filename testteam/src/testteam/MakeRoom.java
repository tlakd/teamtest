package testteam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MakeRoom {
	Map<Integer, List<NumberSave>> lottoNumber = new HashMap<>();// 로또 번호 저장
	Map<Integer, List<NumberSave>> userNumber = new HashMap<>(); // 유저 번호 저장
	Map<Integer, String> autoNotAuto = new HashMap<>(); // 자동 반자동 수동

	int userCount = 1;
	int lottoCount = 101;
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

	public void makeAutoNumber(int a) {// 사용자의 로또번호 자동생성 초안
		for (int i = userCount; i < userCount + a; i++) {
			int count = 0;
			if (!userNumber.containsKey(i)) {
				userNumber.put(i, new ArrayList<>());
			}
			while (userNumber.get(i).size() < 6) {
				int q = (int) (Math.random() * 45) + 1;
				NumberSave newNumber = new NumberSave(q);
				if (!userNumber.get(i).contains(newNumber)) {
					userNumber.get(i).add(newNumber);
					count++;
				}
			}
			userCount++;
			if (count == 6) {
				autoNotAuto.put(i, "자 동");
			} else if (count < 6) {
				autoNotAuto.put(i, "반자동");
			}
		}
	}

	public void makeLottoNumber() {// 이때 까지의 로또 1등번호 뽑기 초안 7자리 처음 만들때
		for (int i = 0; i <= lottoCount; i++) {
			makeMachineLotto(i);
		}
	}

	public void makeLottoNumberNew() {// 다음 회차 될때 로또 1등번호 뽑기 초안(로또 다음 회차 생성, 샀던 개수 초기화 살수있는 값 초기화, 이때 까지 유저가 샀던 기록
										// 초기화)
		lottoCount++;
		makeMachineLotto(lottoCount);
		userCount = 1;
		MaxPay = 100000;
		userNumber.clear();
	}

	public void lookList(int i) {// 유저 번호 순서대로 나열
		Collections.sort(userNumber.get(i));

	}

	public void pay(int i) {// 결제 초안
		AutoLottoUser1 auot = new AutoLottoUser1();
		int a = 0;
		int setCount = userCount - a;
		if (MaxPay - auot.pay < 0) {
			// 여기에 경고문구 가는 거
		} else if (i < auot.pay) {
			// 결제 금액이 작다
		} else {
			MaxPay = MaxPay - auot.pay;
			a = userCount;
		}
	}

	public void 수동부분() {// 만들어야됨

	}

}
