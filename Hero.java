package kadai_11;

public class Hero extends Character {
	
	// フィールド
	private int hp;
	private String name = "ヒーロー";
	private int at;
	private int df;
	
	// コンストラクタ
	 Hero(String name, int hp) {
		this.hp = hp;
		this.name = name;
		this.at = at;
		this.df = df;
	 }
	 
	 Hero() {
		 
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
	
	 //　メソッド
	public void attack() {
		System.out.println(this.name + "の攻撃!");
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
