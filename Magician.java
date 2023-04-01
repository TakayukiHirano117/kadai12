package kadai_11;

public class Magician extends Character{
	// フィールド
	private int hp;
	private String name = "魔法使い";
	private int at;
	private int df;
	private int mp;
	
	// コンストラクタ
	 Magician(String name) {
		 this.hp = 100;
		 this.name = name;
	 }
	 
	 Magician() {
		 
	 }
	 
	 // getter ・ setterメソッド
	 public String getName() {
		 return this.name;
	 }
	 
	 public void setName(String name) {
		 if(!(3 <= name.length() && name.length() <= 10)) {
			 throw new IllegalArgumentException("名前は3文字以上10文字以下で入力してください。");
		 }
		 this.name = name;
	 }
	 
	 public int getHp() {
		 return this.hp;
	 }
	 
	 public void setHp(int hp) {
		 if(hp < 0) {
			 this.hp = 1;
		 } else if(hp > 100) {
			 this.hp = 100;
		 } else {
			 this.hp = hp;
		 }
	 }
	 
	 public int getAt() {
		 return this.at;
	 }
	 
	 public void setAt(int at) {
		 if(at < 0) {
			 this.at = 1;
		 } else if(at > 100) {
			 this.at = 100;
		 } else {
			 this.at = at;
		 }
	 }
	 
	 public int getDf() {
		 return this.df;
	 }
	 
	 public void setDf(int df) {
		 if(df < 0) {
			 this.df = 0;
		 } else if(df > 100) {
			this.df = 100; 
		 } else {
			 this.df = df;
		 }
	 }
	 
	 public int getMp() {
		 return this.mp;
	 }
	 
	 public void setMp(int mp) {
		 if(mp < 0) {
			 this.mp = 0;
		 } else if (mp > 100) {
			 this.mp = 100;
		 } else {
			 this.mp = mp;
		 }
	 }
	 

	 // メソッド
	 public void attack() {
		 // 5ダメージ
		 System.out.println(this.name + "の打撃攻撃!");
	 }
	 
	 public void defense() {
		 System.out.println(this.name + "が防御をした");
		 if(this.df + 10 > 100) {
			 System.out.println("これ以上防御力を上げることはできない!");
			 this.df = 100;
		 } else {
			 System.out.println("防御力が10upし" + this.df + "になった");
			 this.df = this.df + 10;
		 }
	 }
	 
	 public String magicAttack() {
//		 System.out.println(this.name + "の魔法攻撃!");
		 // 15ダメージ
		 if((this.mp - 5) < 0) {
			 String s = "しかし、MPが足りない!";
			 return s;
		 } else {
			 this.mp = this.mp - 5;
			 String s = "5mpを消費して敵にダメージを与えた";
			 return s;
		 }
		 
	 }

	 public void recovery() {
		 if(this.mp - 5 < 0) {
			 System.out.println("しかし、MPが足りない!");
		 } else {
			 this.mp = this.mp - 5;
			 System.out.println(this.name + "が回復魔法を使用した");
			 this.hp = this.hp + 20;
//			 System.out.println("hpが20回復し" + this.hp + "になった");
		 }
		 
	 }
	 
	 public void heal() {
		 System.out.println(this.name + "が休憩した");
		 if(this.hp + 10 > 100) {
			 System.out.println("これ以上休憩することはできない!");
			 this.hp = 100;
		 } else {
			 System.out.println("hpが10回復し" + this.hp + "になった");
			 this.hp = this.hp + 10;
		 }
	}
}
