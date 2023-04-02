package kadai_11;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Story {
	public static void main(String args[]) {
		
		// キャラクター側を何体生成するかを決める整数
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("キャラクターを何体生成しますか？");
		int characters_count = scanner1.nextInt();
		
		// クリーチャー側を何体生成するかを決める整数
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("クリーチャーを何体生成しますか？");
		int creatures_count = scanner2.nextInt();
		
		// キャラクター・クリーチャーをいれる配列
		Character[] characters = new Character[characters_count];
		Creature[] creatures = new Creature[creatures_count];
		
		int count = 1;
		while(count <= characters_count) {
			// どのキャラを作るか
			double rand1 = Math.random() * 3 + 1;
			int rand_char = (int)rand1;
			
			if(rand_char == 1) {
				// ヒーローの生成
				characters[count-1] = new Hero();
				
				setCharParam(characters[count-1]);
				
				outputCharParam(characters[count-1]);
				
			} else if(rand_char == 2) {
				// 魔法使いの生成
				characters[count-1] = new Magician();
				
				setCharParam(characters[count-1]);
				
				outputCharParam(characters[count-1]);

			} else if(rand_char == 3) {
				// 盗賊の生成	
				characters[count-1] = new Thief();
				
				setCharParam(characters[count-1]);

				outputCharParam(characters[count-1]);

			}
			
			count++;
			
		}
		
		count = 1;
		while(count <= creatures_count) {
			// どのクリーチャーを作るか
			double rand2 = Math.random() * 2 + 1;
			int rand_crea = (int)rand2;
			
			if(rand_crea == 1) {
				creatures[count-1] = new Cyclops();
				
				setCreaParam(creatures[count-1]);

				outputCreaParam(creatures[count-1]);
				
			} else if(rand_crea == 2) {
				creatures[count-1] = new Dragon();
				
				setCreaParam(creatures[count-1]);

				outputCreaParam(creatures[count-1]);
			}

			count++;
		}

		battle(characters, creatures);
		
	}
	
	public static void battle(Character[] characters, Creature[] creatures) {
		
		System.out.println("戦闘開始!!");
		
		while(characters.length > 0 || creatures.length > 0) {
			// ヒーロー、魔法使い、盗賊がどの行動をするか
			double rand_hero = Math.random() * 3 + 1;
			int select_act_hero = (int)rand_hero;
			
			double rand_magician = Math.random() * 5 + 1;
			int select_act_magician = (int)rand_magician;
			
			double rand_thief = Math.random() * 3 + 1;
			int select_act_thief = (int)rand_thief;
			
			// サイクロプス、ドラゴンがどの行動をするか
			double rand_cyclops = Math.random() * 2 + 1;
			int select_act_cyclops = (int)rand_cyclops;
			
			double rand_dragon = Math.random() * 2 + 1;
			int select_act_dragon = (int)rand_dragon;
			
			// 余裕があれば、各キャラごとに行動を決める、character, creatureにそれぞれフィールドが欲しい。
			// getAct()みたいなゲッターセッターメソッドを設ける。
//			for(int i = 0; i < characters.length; i++) {
//				
//			}
			
			int damage = 0;
			
			// キャラクターがどのクリーチャーを攻撃するかを決定(0から配列の長さまでの数値をランダムに取得)
//			 double rand_creature = Math.random() * creatures.length;
//			 int select_creature = (int)rand_creature;
			 
			 // クリーチャーがどのキャラクターを攻撃するかを決定
//			 double rand_character = Math.random() * characters.length;
//			 int select_character = (int)rand_character;
			 
			
			// キャラクター側の行動
			for(int i = 0; i < characters.length; i++) {
				// ヒーローの行動
				if(characters[i] instanceof Hero) {
					
					if(!(characters[i].getHp() <= 0)) {
						if(select_act_hero == 1) {
							// 攻撃
							double rand_creature = Math.random() * creatures.length;
							int select_creature = (int)rand_creature;
							
							characters[i].attack();
							System.out.println(characters[i].getName() + "から" + creatures[select_creature].getName() + "への攻撃!");
							
							if(characters[i].getAt() - creatures[select_creature].getDf() <= 0) {
								damage = 1;
							} else {
								damage = (characters[i].getAt() - creatures[select_creature].getDf());
							}
							
							System.out.println(creatures[select_creature].getName() + "にダメージを" + damage + "与えた!");
							int new_hp = creatures[select_creature].getHp() - damage;
							creatures[select_creature].setHp(new_hp);
							
						} else if(select_act_hero == 2) {
							// 防御
							if(characters[i].getDf() == 100) {
								System.out.println("これ以上防御力は上がらない!");
							} else if(characters[i].getDf() + 10 > 100) {
								characters[i].defense();
								characters[i].setDf(100);
							} else  {
								characters[i].defense();
							}
					
						} else if(select_act_hero == 3) {
							// 回復
							if(characters[i].getHp() == 100) {
								System.out.println(characters[i].getName() + "はこれ以上休憩できない!");
								
							} else if(characters[i].getHp() + 10 > 100) {
								
								((Hero) characters[i]).heal();
								System.out.println(characters[i].getName() + "のhpが10回復し100になった");
								characters[i].setHp(100);
								
							} else {
								
								((Hero) characters[i]).heal();
								System.out.println(characters[i].getName() + "のhpが10回復し" + characters[i].getHp() + "になった");
								
							}
							
						}
					}
					
				} else if(characters[i] instanceof Magician) {
					// 魔法使いの行動
					if(!(characters[i].getHp() <= 0)) {
						if(select_act_magician == 1) {
							
							double rand_creature = Math.random() * creatures.length;
							int select_creature = (int)rand_creature;
							
							characters[i].attack();
							System.out.println(characters[i].getName() + "から" + creatures[select_creature].getName() + "への攻撃!");
							
							if(characters[i].getAt() - creatures[select_creature].getDf() <= 0) {
								damage = 1;
							} else {
								damage = (characters[i].getAt() - creatures[select_creature].getDf());
							}
							
							System.out.println(creatures[select_creature].getName() + "にダメージを" + damage + "与えた!");
							int new_hp = creatures[select_creature].getHp() - damage;
							creatures[select_creature].setHp(new_hp);
							
						} else if(select_act_magician == 2) {
							
							if(characters[i].getDf() == 100) {
								System.out.println("これ以上防御力は上がらない!");
							} else if(characters[i].getDf() + 10 > 100) {
								characters[i].defense();
								characters[i].setDf(100);
							} else  {
								characters[i].defense();
							}
							
						} else if(select_act_magician == 3) {
							
							double rand_creature = Math.random() * creatures.length;
							int select_creature = (int)rand_creature;
							
							((Magician) characters[i]).magicAttack();
							
							if(15 - creatures[select_creature].getDf() <= 0) {
								damage = 1;
							} else {
								damage = 15 - creatures[select_creature].getDf();
							}
							
							System.out.println(characters[i].getName() + "の魔法攻撃!");
							
							if(((Magician) characters[i]).magicAttack() == "しかし、MPが足りない!") {
								System.out.println(((Magician) characters[i]).magicAttack());
							} else if(((Magician) characters[i]).magicAttack() == "5mpを消費して敵にダメージを与えた") {
								System.out.println("5mpを消費して敵にダメージを" + damage + "与えた！");
								int new_hp = creatures[select_creature].getHp() - damage;
								creatures[select_creature].setHp(new_hp);
							}
							
						} else if(select_act_magician == 4) {
							
							if(characters[i].getHp() == 100) {
								System.out.println(characters[i].getName() + "はこれ以上回復できない!");
							} else if(characters[i].getHp() + 20 > 100) {
								((Magician) characters[i]).recovery();
								System.out.println("hpが20回復し100になった");
								characters[i].setHp(100);
							} else {
								((Magician) characters[i]).recovery();
								System.out.println("hpが20回復し" + characters[i].getHp() + "になった");
							}
						
						} else if(select_act_magician == 5) {
							
							if(characters[i].getHp() == 100) {
								System.out.println(characters[i].getName() + "はこれ以上休憩できない!");
								
							} else if(characters[i].getHp() + 10 > 100) {
								
								((Magician) characters[i]).heal();
								System.out.println(characters[i].getName() + "のhpが10回復し100になった");
								characters[i].setHp(100);
								
							} else {
								
								((Magician) characters[i]).heal();
								System.out.println(characters[i].getName() + "のhpが10回復し" + characters[i].getHp() + "になった");
								
							}
						}
						
					}
					
				} else if(characters[i] instanceof Thief) {
					// 盗賊の行動
					if(!(characters[i].getHp() <= 0)) {
						if(select_act_thief == 1) {
							
							double rand_creature = Math.random() * creatures.length;
							int select_creature = (int)rand_creature;
							
							characters[i].attack();
							System.out.println(characters[i].getName() + "から" + creatures[select_creature].getName() + "への攻撃!");
							
							if(characters[i].getAt() - creatures[select_creature].getDf() <= 0) {
								damage = 1;
							} else {
								damage = (characters[i].getAt() - creatures[select_creature].getDf());
							}
							
							System.out.println(creatures[select_creature].getName() + "にダメージを" + damage + "与えた!");
							int new_hp = creatures[select_creature].getHp() - damage;
							creatures[select_creature].setHp(new_hp);
							
						} else if(select_act_thief == 2) {
							
							if(characters[i].getDf() == 100) {
								System.out.println(characters[i].getName() + "はこれ以上防御力は上がらない!");
							} else if(characters[i].getDf() + 10 > 100) {
								characters[i].defense();
								characters[i].setDf(100);
							} else  {
								characters[i].defense();
							}
							
						} else if(select_act_thief == 3) {
							
							if(characters[i].getHp() == 100) {
								System.out.println(characters[i].getName() + "はこれ以上休憩できない!");
								
							} else if(characters[i].getHp() + 10 > 100) {
								
								((Thief) characters[i]).heal();
								System.out.println(characters[i].getName() + "のhpが10回復し100になった");
								characters[i].setHp(100);
								
							} else {
								
								((Thief) characters[i]).heal();
								System.out.println(characters[i].getName() + "のhpが10回復し" + characters[i].getHp() + "になった");
								
							}
							
						}
						
					}
				}
			}
			
			for(int i = 0; i < creatures.length; i++) {
				
				if(creatures[i] instanceof Cyclops) {
					
						if(!(creatures[i].getHp() <= 0)) {
							if(select_act_cyclops == 1) {
								// 攻撃
								double rand_character = Math.random() * characters.length;
								int select_character = (int)rand_character;
								
								creatures[i].attack();
								System.out.println(creatures[i] + "から" + characters[select_character].getName() + "への攻撃!");
								
								if(creatures[i].getAt() - characters[select_character].getDf() <= 0) {
									damage = 1;
								} else {
									damage = (creatures[i].getAt() - characters[select_character].getDf());
								}
								
								System.out.println(characters[select_character].getName() + "にダメージを" + damage + "与えた!");
								int new_hp = characters[select_character].getHp() - damage;
								characters[select_character].setHp(new_hp);
								
							} else if(select_act_cyclops == 2) {
								// 防御
							}
						}
						
				} else if(creatures[i] instanceof Dragon) {
					if(!(creatures[i].getHp() <= 0)) {
						if(select_act_dragon == 1) {
							// 攻撃
							double rand_character = Math.random() * characters.length;
							int select_character = (int)rand_character;
							
							creatures[i].attack();
							System.out.println(creatures[i].getName() + "から" + characters[select_character].getName() + "への攻撃!");
							
							if(creatures[i].getAt() - characters[select_character].getDf() <= 0) {
								damage = 1;
							} else {
								damage = (creatures[i].getAt() - characters[select_character].getDf());
							}
							
							System.out.println(characters[select_character].getName() + "にダメージを" + damage + "与えた!");
							int new_hp = characters[select_character].getHp() - damage;
							characters[select_character].setHp(new_hp);
							
						} else if(select_act_dragon == 2) {
							// 防御
							if(creatures[i].getDf() == 100) {
								System.out.println(creatures[i].getName() + "はこれ以上防御力は上がらない!");
							} else if(creatures[i].getDf() + 10 > 100) {
								creatures[i].defense();
								creatures[i].setDf(100);
							} else  {
								creatures[i].defense();
							}
							
						}
					}
				}
					
					
				
			}
			
			// 体力が0になったやつを削除
			characters = removeChar(characters);
			creatures = removeCrea(creatures);
			
			// どちらかの配列の長さが0になったら戦闘終了
			if(creatures.length <= 0) {
				System.out.println("キャラクター側の勝利!!");
				break;
			} else if(characters.length <= 0) {
				System.out.println("クリーチャー側の勝利!!");
				break;
			}
			
			
		}
			
		
	}
	
	// 共通な能力値を設定
	public static void setCharParam(Character character) {
		
		System.out.println(character.getName() + "を生成します");
		Scanner scan = new Scanner(System.in);
		System.out.println("名前を設定してください。");
		character.setName(scan.nextLine());
		System.out.println("体力を設定してください。");
		character.setHp(scan.nextInt());
		System.out.println("攻撃力を設定してください。");
		character.setAt(scan.nextInt());
		System.out.println("防御力を設定してください。");
		character.setDf(scan.nextInt());
		
		if(character instanceof Magician) {
			System.out.println("魔力を設定してください。");
			((Magician) character).setMp(scan.nextInt());
		}
		
	}
	
	public static void setCreaParam(Creature creature) {
		
		System.out.println(creature.getName() + "を生成します");
		Scanner scan = new Scanner(System.in);
		System.out.println("名前を設定してください。");
		creature.setName(scan.nextLine());
		System.out.println("体力を設定してください。");
		creature.setHp(scan.nextInt());
		System.out.println("攻撃力を設定してください。");
		creature.setAt(scan.nextInt());
		System.out.println("防御力を設定してください。");
		creature.setDf(scan.nextInt());
		
	}
	
	// 能力値の出力
	public static void outputCharParam(Character character) {
		
		if(character instanceof Hero) {
			System.out.println("ヒーロー「" + character.getName() + "」が生成されました。");
		} else if(character instanceof Magician) {
			System.out.println("魔法使い「" + character.getName() + "」が生成されました。");
		} else if(character instanceof Thief) {
			System.out.println("盗賊「" + character.getName() + "」が生成されました。");
		}
		
		System.out.println("名前" + character.getName());
		System.out.println("体力" + character.getHp());
		System.out.println("攻撃力" + character.getAt());
		System.out.println("防御力" + character.getDf());
		
		if(character instanceof Magician) {
			System.out.println("魔力" + ((Magician) character).getMp());
		}
		
	}
	
	public static void outputCreaParam(Creature creature) {
		
		if(creature instanceof Cyclops) {
			System.out.println("サイクロプス「" + creature.getName() + "が生成されました。");
		} else if(creature instanceof Dragon) {
			System.out.println("ドラゴン「" + creature.getName() + "が生成されました。");
		}
		
		System.out.println("名前" + creature.getName());
		System.out.println("体力" + creature.getHp());
		System.out.println("攻撃力" + creature.getAt());
		System.out.println("防御力" + creature.getDf());
		
	}
	
	// 体力が0になったやつを削除
	public static Character[] removeChar(Character[] characters) {
		List<Character> list = new ArrayList<Character>(Arrays.asList(characters));
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getHp() <= 0) {
				list.remove(i);
			}
		}
		
		Character[] array = list.toArray(new Character[list.size()]);
		return array;
	}
	
	public static Creature[] removeCrea(Creature[] creatures) {
		List<Creature> list = new ArrayList<Creature>(Arrays.asList(creatures));
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getHp() <= 0) {
				list.remove(i);
			}
		}
		
		Creature[] array = list.toArray(new Creature[list.size()]);
		
		return array;
	}
	
}
