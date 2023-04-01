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
				
				// 下の処理を関数にまとめたい
				setCharParam(characters[count-1]);
				
//				System.out.println(characters[count-1].getName() + "を生成します");
//				Scanner scan = new Scanner(System.in);
//				System.out.println("名前を設定してください。");
//				characters[count-1].setName(scan.nextLine());
//				System.out.println("体力を設定してください。");
//				characters[count-1].setHp(scan.nextInt());
//				System.out.println("攻撃力を設定してください。");
//				characters[count-1].setAt(scan.nextInt());
//				System.out.println("防御力を設定してください。");
//				characters[count-1].setDf(scan.nextInt());
				
				outputCharParam(characters[count-1]);
				
//				System.out.println("ヒーロー「" + characters[count-1].getName() + "」が生成されました。");
//				System.out.println("名前" + characters[count-1].getName());
//				System.out.println("体力" + characters[count-1].getHp());
//				System.out.println("攻撃力" + characters[count-1].getAt());
//				System.out.println("防御力" + characters[count-1].getDf());
				
			} else if(rand_char == 2) {
				// 魔法使いの生成
				characters[count-1] = new Magician();
				
				setCharParam(characters[count-1]);
				
//				System.out.println(characters[count-1].getName() + "を生成します");
//				Scanner scan = new Scanner(System.in);
//				System.out.println("名前を設定してください。");
//				characters[count-1].setName(scan.nextLine());
//				System.out.println("体力を設定してください。");
//				characters[count-1].setHp(scan.nextInt());
//				System.out.println("攻撃力を設定してください。");
//				characters[count-1].setAt(scan.nextInt());
//				System.out.println("防御力を設定してください。");
//				characters[count-1].setDf(scan.nextInt());
				
//				System.out.println("魔力を設定してください。");
//				if(characters[count-1] instanceof Magician) {
//					((Magician) characters[count-1]).setMp(scan.nextInt());
//				}
				
				outputCharParam(characters[count-1]);
				
//				System.out.println("魔法使い「" + characters[count-1].getName() + "」が生成されました。");
//				System.out.println("名前" + characters[count-1].getName());
//				System.out.println("体力" + characters[count-1].getHp());
//				System.out.println("攻撃力" + characters[count-1].getAt());
//				System.out.println("防御力" + characters[count-1].getDf());
//				System.out.println("魔力" + ((Magician) characters[count-1]).getMp());
				
			} else if(rand_char == 3) {
				// 盗賊の生成	
				characters[count-1] = new Thief();
				
				setCharParam(characters[count-1]);
				
//				System.out.println(characters[count-1].getName() + "を生成します");
//				Scanner scan = new Scanner(System.in);
//				System.out.println("名前を設定してください。");
//				characters[count-1].setName(scan.nextLine());
//				System.out.println("体力を設定してください。");
//				characters[count-1].setHp(scan.nextInt());
//				System.out.println("攻撃力を設定してください。");
//				characters[count-1].setAt(scan.nextInt());
//				System.out.println("防御力を設定してください。");
//				characters[count-1].setDf(scan.nextInt());
				
				outputCharParam(characters[count-1]);
				
//				System.out.println("盗賊「" + characters[count-1].getName() + "」が生成されました。");
//				System.out.println("名前" + characters[count-1].getName());
//				System.out.println("体力" + characters[count-1].getHp());
//				System.out.println("攻撃力" + characters[count-1].getAt());
//				System.out.println("防御力" + characters[count-1].getDf());
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
				
//				System.out.println(creatures[count-1].getName() + "を生成します");
//				Scanner scan = new Scanner(System.in);
//				System.out.println("名前を設定してください。");
//				creatures[count-1].setName(scan.nextLine());
//				System.out.println("体力を設定してください。");
//				creatures[count-1].setHp(scan.nextInt());
//				System.out.println("攻撃力を設定してください。");
//				creatures[count-1].setAt(scan.nextInt());
//				System.out.println("防御力を設定してください。");
//				creatures[count-1].setDf(scan.nextInt());
				
				outputCreaParam(creatures[count-1]);
				
//				System.out.println("サイクロプス「" + characters[count-1].getName() + "」が生成されました。");
//				System.out.println("名前" + characters[count-1].getName());
//				System.out.println("体力" + characters[count-1].getHp());
//				System.out.println("攻撃力" + characters[count-1].getAt());
//				System.out.println("防御力" + characters[count-1].getDf());
				
			} else if(rand_crea == 2) {
				creatures[count-1] = new Dragon();
				
				setCreaParam(creatures[count-1]);
				
//				System.out.println(creatures[count-1].getName() + "を生成します");
//				Scanner scan = new Scanner(System.in);
//				System.out.println("名前を設定してください。");
//				creatures[count-1].setName(scan.nextLine());
//				System.out.println("体力を設定してください。");
//				creatures[count-1].setHp(scan.nextInt());
//				System.out.println("攻撃力を設定してください。");
//				creatures[count-1].setAt(scan.nextInt());
//				System.out.println("防御力を設定してください。");
//				creatures[count-1].setDf(scan.nextInt());
				
				outputCreaParam(creatures[count-1]);
				
//				System.out.println("ドラゴン「" + creatures[count-1].getName() + "」が生成されました。");
//				System.out.println("名前" + creatures[count-1].getName());
//				System.out.println("体力" + creatures[count-1].getHp());
//				System.out.println("攻撃力" + creatures[count-1].getAt());
//				System.out.println("防御力" + creatures[count-1].getDf());
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
			
			double rand_magician = Math.random() * 4 + 1;
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
			 double rand_creature = Math.random() * creatures.length;
			 int select_creature = (int)rand_creature;
			 
			 // クリーチャーがどのキャラクターを攻撃するかを決定
			 double rand_character = Math.random() * characters.length;
			 int select_character = (int)rand_character;
			 
			
			// キャラクター側の行動
			for(int i = 0; i < characters.length; i++) {
				// ヒーローの行動
				if(characters[i] instanceof Hero) {
					
					if(!(characters[i].getHp() <= 0)) {
						if(select_act_hero == 1) {
							// 攻撃
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
					
				} else if(characters[i] instanceof Thief) {
					// 盗賊の行動
				}
			}
			
			
//			if(characters[]) {
				
//			}
			
			// 体力が0になったやつは配列から削除
			for(int i = 0; i < characters.length; i++) {
				if(characters[i].getHp() <= 0) {
					
				}
			}
			
			// クリーチャー側も
			
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
	
	public static void removeChar(Character[] characters) {
		List<String> list = new ArrayList<String>(Arrays.asList(characters));
	}
	
	public static Creature[] removeCrea(Creature[] creatures) {
		
	}
	
}
