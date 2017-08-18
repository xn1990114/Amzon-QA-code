package blackJack;

public class Card {
	public final static int Club=0;
	public final static int Diamon=1;
	public final static int Heart=2;
	public final static int Spade=3;
	
	private int color;
	private int number;
	
	public Card(int color,int number){
		this.color=color;
		this.number=number;
	}
	public int getColor(){
		return this.color;
	}
	public int getNumber(){
		return this.number;
	}
	
}
