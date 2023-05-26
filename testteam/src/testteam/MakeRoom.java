package testteam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MakeRoom {
	Map<Integer, List<NumberSave>> lottoNumber = new HashMap<>();
	Map<Integer, List<NumberSave>> userNumber = new HashMap<>();
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

	public void makeAutoNumber() {// 사용자의 로또번호 자동생성 초안
		if (!userNumber.containsKey(userCount)) {
			userNumber.put(userCount, new ArrayList<>());
		}
		while (userNumber.get(userCount).size() < 6) {
			int q = (int) (Math.random() * 45) + 1;
			NumberSave newNumber = new NumberSave(q);
			if (!userNumber.get(userCount).contains(newNumber)) {
				userNumber.get(userCount).add(newNumber);
			}
		}
		userCount++;
	}

	public void makeLottoNumber() {// 이때 까지의 로또 1등번호 뽑기 초안 7자리 처음 만들때
		for (int i = 0; i <= lottoCount; i++) {
			makeMachineLotto(i);
		}
	}

	public void makeLottoNumberNew() {// 다음 회차 될때 로또 1등번호 뽑기 초안
		lottoCount++;
		makeMachineLotto(lottoCount);
		userCount = 1;
		MaxPay = 100000;
	}

	public void lookList(int i) {// 유저 번호 순서대로 나열
		Collections.sort(userNumber.get(i));

	}

	public void pay(int i) {// 결제 초안
		if ((MaxPay = MaxPay - (userCount * 1000)) < 0) {
			// 여기에 경고문구 가는 거
		} else if (i < (userCount * 1000)) {
			// 결제 금액이 작다
		} else {
			// 결제 완료
		}
	}
}
