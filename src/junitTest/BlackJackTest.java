package junitTest;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import blackJack.*;


public class BlackJackTest {

	@Test
	public void test() {
		Round r=new Round(1,10);
		r.getDeck().shuffle();
		for(Hand p:r.getPlayers()){
			r.draw(p);
			r.draw(p);
			r.draw(p);
		}
		List<Hand> winner=r.findWinners();
		for(Hand w:winner){
			w.printInfo();
		}
		Date d=new Date();
		System.out.println(new Date());
	}

}
