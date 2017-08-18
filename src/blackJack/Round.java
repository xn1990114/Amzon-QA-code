package blackJack;

import java.util.ArrayList;
import java.util.List;

public class Round {
	private Deck deck;
	private int id;
	private List<Hand> players;
	public Round(int id,int playercount){
		this.id=id;
		this.deck=new Deck();
		this.players=new ArrayList<Hand>();
		int i=0;
		while(this.players.size()<playercount){
			this.players.add(new Hand(i));
			i++;
		}
	}
	
	public int getId(){
		return this.id;
	}
	
	public Deck getDeck(){
		return this.deck;
	}
	
	public List<Hand> getPlayers(){
		return this.players;
	}
	
	public void draw(Hand player){
		player.getHold().add(deck.draw());
	}
	
	
	public List<Hand> findWinners(){
		List<Hand> winners=new ArrayList<Hand>();
		int maxpoint=0;
		for(Hand p:players){
			if(p.getTotal()>maxpoint){
				winners.clear();
				winners.add(p);
				maxpoint=p.getTotal();
			}
			else if(p.getTotal()==maxpoint){
				winners.add(p);
				
			}
		}
		return winners;
	}
}
