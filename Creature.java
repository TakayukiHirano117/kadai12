package kadai_11;

public abstract class Creature {
	
	private int hp;
	private String name;
	private int at;
	private int df;
	
	// getter, setterメソッド
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
		 } else if (hp > 100) {
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
		 } else if(this.at > 100) {
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
	
	public abstract void attack();
	public abstract void defense();
	
}
