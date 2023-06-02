package testteam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

public class Manual extends JFrame {
<<<<<<< HEAD
   JButton[] button = new JButton[45];
   JLayeredPane lp = new JLayeredPane();
   Map<Integer, List<NumberSave>> numSa = new HashMap<>();
   Map<Integer, String> userAt = new HashMap<>();
   MakeRoom m = new MakeRoom();
   NoAutoSt noA;
   int number;
   int MakeNoA;
   int countAll = 0;
   int counta = 0;
   AtomicInteger customCount;
=======
	JButton[] button = new JButton[45];
	JLayeredPane lp = new JLayeredPane();
	Map<Integer, List<NumberSave>> numSa = new HashMap<>();
	Map<Integer, String> userAt = new HashMap<>();
	MakeRoom m = new MakeRoom();
	NoAutoSt noA;
	int number;
	int MakeNoA;
	int countAll = 0;
	int counta = 0;
	AtomicInteger customCount;
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git

<<<<<<< HEAD
   public Manual(NoAutoSt noA) {
      this.noA = noA;
   }
=======
	public Manual(NoAutoSt noA) {
		this.noA = noA;
	}

	public void makeButton(int MakeNoA) {
		this.MakeNoA = MakeNoA;
		int count = 0;
		numSa.put(MakeNoA, new ArrayList<>());
		// 초기화 버튼
		JButton jbut = new JButton();
		jbut.setBounds(50, 480, 100, 40);
		jbut.setText("초기화");
		jbut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		lp.add(jbut);

		// 완료 버튼
		JButton jbut1 = new JButton();
		jbut1.setBounds(300, 480, 100, 40);
		jbut1.setText("완료");
		jbut1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Collections.sort(numSa.get(MakeNoA));
				noA.setlbl2();
				customCount.set(0);
				if(counta == 6) {
					수동인지확인();
				}
				setVisible(false);
			}
		});
		lp.add(jbut1);

		// 자동완성 버튼
		JButton jbut2 = new JButton();
		jbut2.setBounds(175, 480, 100, 40);
		jbut2.setText("자동완성");
		jbut2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				반자동(MakeNoA);
			}
		});
		lp.add(jbut2);

		customCount = new AtomicInteger(0);
		for (int i = 0; i < button.length; i++) {// 숫자 버튼 생성
			button[i] = new JButton();
			button[i].setBounds(35 + ((i % 7) * 60), 60 + (count * 60), 50, 50);
			String a = String.valueOf(i + 1);
			button[i].setText(a);
			if (i % 7 == 6) {
				count++;
			}
			final int index = i + 1;
			button[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton source = (JButton) e.getSource();
					수동(source, index);
				}
			});
			lp.add(button[i]);
		}
		add(lp);
		setSize(500, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git

<<<<<<< HEAD
   public void makeButton(int MakeNoA) {
      this.MakeNoA = MakeNoA;
      int count = 0;
      numSa.put(MakeNoA, new ArrayList<>());
      // 초기화 버튼
      JButton jbut = new JButton();
      jbut.setBounds(50, 480, 100, 40);
      jbut.setText("초기화");
      jbut.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            reset();
         }
      });
      lp.add(jbut);
=======
	private void performOtherAction(JButton source, int a) {
		List<NumberSave> numbers = numSa.get(MakeNoA);
		numbers.removeIf(numberSave -> numberSave.getNumber() == a);
		customCount.decrementAndGet();
		counta--;
	}
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git

<<<<<<< HEAD
      // 완료 버튼
      JButton jbut1 = new JButton();
      jbut1.setBounds(300, 480, 100, 40);
      jbut1.setText("완료");
      jbut1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            Collections.sort(numSa.get(MakeNoA));
            noA.setlbl2();
            customCount.set(0);
            if(counta == 6) {
               수동인지확인();
            }
            setVisible(false);
         }
      });
      lp.add(jbut1);
=======
	public void reset() {
		countAll = 0;
		numSa.get(MakeNoA).clear();
	}
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git

<<<<<<< HEAD
      // 자동완성 버튼
      JButton jbut2 = new JButton();
      jbut2.setBounds(175, 480, 100, 40);
      jbut2.setText("자동완성");
      jbut2.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            반자동(MakeNoA);
         }
      });
      lp.add(jbut2);

      customCount = new AtomicInteger(0);
      for (int i = 0; i < button.length; i++) {// 숫자 버튼 생성
         button[i] = new JButton();
         button[i].setBounds(35 + ((i % 7) * 60), 60 + (count * 60), 50, 50);
         String a = String.valueOf(i + 1);
         button[i].setText(a);
         if (i % 7 == 6) {
            count++;
         }
         final int index = i + 1;
         button[i].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JButton source = (JButton) e.getSource();
               수동(source, index);
            }
         });
         lp.add(button[i]);
      }
      add(lp);
      setSize(500, 600);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
   }

   private void performOtherAction(JButton source, int a) {
      List<NumberSave> numbers = numSa.get(MakeNoA);
      numbers.removeIf(numberSave -> numberSave.getNumber() == a);
      customCount.decrementAndGet();
      counta--;
   }

   public void reset() {
      countAll = 0;
      numSa.get(MakeNoA).clear();
   }

   public void 수동부분저장() {
      for (int i = 1; i < 6; i++) {
         if (numSa.get(i) == null) {
            continue;
         }

         List<NumberSave> numbers = numSa.get(i);
         for (NumberSave number : numbers) {
            if (!m.userNumber.containsKey(m.userCount)) {
               m.userNumber.put(m.userCount, new ArrayList<>());
            }
            m.userNumber.get(m.userCount).add(number);
            // 6개씩 저장하면 새로운 사용자 번호 생성
            if (m.userNumber.get(m.userCount).size() == 6) {
               m.userCount++;
            }
         }
      }
   }

   private boolean containsNumber(List<NumberSave> numbers, int number) {
      for (NumberSave num : numbers) {
         if (num.getNumber() == number) {
            return true;
         }
      }
      return false;
   }

   public void 반자동(int MakeNoA) {
      makeRo(MakeNoA);
      while (numSa.get(MakeNoA).size() < 6) {
         int q = (int) (Math.random() * 45) + 1;
         NumberSave newNumber = new NumberSave(q);
         if (!numSa.get(MakeNoA).contains(newNumber)) {
            numSa.get(MakeNoA).add(newNumber);
            countAll++;
         }
      }
      Collections.sort(numSa.get(MakeNoA));
      if (countAll == 6) {
         userAt.put(MakeNoA, "자 동");
      } else if (countAll < 6) {
         userAt.put(MakeNoA, "반자동");
      }
   }

   public void 수동인지확인() {
      userAt.put(MakeNoA, "반자동");
   }
   
   public void 수동(JButton source, int index) {
      if (numSa.containsKey(MakeNoA)) {
         if (customCount.get() < 6) {// 6개까지 중복
            if (!containsNumber(numSa.get(MakeNoA), index)) {
               NumberSave newNumber = new NumberSave(index);
               numSa.get(MakeNoA).add(newNumber);
               customCount.incrementAndGet();
               counta ++;
            } else {
               performOtherAction(source, index); // 다른 액션 수행
            }
         } else if (!containsNumber(numSa.get(MakeNoA), index)) {
            JOptionPane.showMessageDialog(null, "숫자 6개까지 선택 가능합니다.");
         } else {
            performOtherAction(source, index); // 다른 액션 수행
         }
      } else {
         List<NumberSave> numbers = new ArrayList<NumberSave>();
         NumberSave newNumber = new NumberSave(index);
         numbers.add(newNumber);
         numSa.put(MakeNoA, numbers);
      }
   }

   public void makeRo(int a) {
      if (!numSa.containsKey(MakeNoA)) {
         numSa.put(MakeNoA, new ArrayList<>());
      }
   }
=======
	public void 수동부분저장() {
		for (int i = 1; i < 6; i++) {
			if (numSa.get(i) == null) {
				continue;
			}

			List<NumberSave> numbers = numSa.get(i);
			for (NumberSave number : numbers) {
				if (!m.userNumber.containsKey(m.userCount)) {
					m.userNumber.put(m.userCount, new ArrayList<>());
				}
				m.userNumber.get(m.userCount).add(number);
				// 6개씩 저장하면 새로운 사용자 번호 생성
				if (m.userNumber.get(m.userCount).size() == 6) {
					m.userCount++;
				}
			}
		}
	}

	private boolean containsNumber(List<NumberSave> numbers, int number) {
		for (NumberSave num : numbers) {
			if (num.getNumber() == number) {
				return true;
			}
		}
		return false;
	}

	public void 반자동(int MakeNoA) {
		makeRo(MakeNoA);
		while (numSa.get(MakeNoA).size() < 6) {
			int q = (int) (Math.random() * 45) + 1;
			NumberSave newNumber = new NumberSave(q);
			if (!numSa.get(MakeNoA).contains(newNumber)) {
				numSa.get(MakeNoA).add(newNumber);
				countAll++;
			}
		}
		Collections.sort(numSa.get(MakeNoA));
		if (countAll == 6) {
			userAt.put(MakeNoA, "자 동");
		} else if (countAll < 6) {
			userAt.put(MakeNoA, "반자동");
		}
	}

	public void 수동인지확인() {
		userAt.put(MakeNoA, "반자동");
	}
	
	public void 수동(JButton source, int index) {
		if (numSa.containsKey(MakeNoA)) {
			if (customCount.get() < 6) {// 6개까지 중복
				if (!containsNumber(numSa.get(MakeNoA), index)) {
					NumberSave newNumber = new NumberSave(index);
					numSa.get(MakeNoA).add(newNumber);
					customCount.incrementAndGet();
					counta ++;
				} else {
					performOtherAction(source, index); // 다른 액션 수행
				}
			} else if (!containsNumber(numSa.get(MakeNoA), index)) {
				JOptionPane.showMessageDialog(null, "숫자 6개까지 선택 가능합니다.");
			} else {
				performOtherAction(source, index); // 다른 액션 수행
			}
		} else {
			List<NumberSave> numbers = new ArrayList<NumberSave>();
			NumberSave newNumber = new NumberSave(index);
			numbers.add(newNumber);
			numSa.put(MakeNoA, numbers);
		}
	}

	public void makeRo(int a) {
		if (!numSa.containsKey(MakeNoA)) {
			numSa.put(MakeNoA, new ArrayList<>());
		}
	}
>>>>>>> branch 'master' of https://github.com/tlakd/teamtest.git
}