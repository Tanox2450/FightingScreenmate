package pf.items;

import java.util.ArrayList;
import java.util.List;

public class Arena {

	private List<Fighter> fighters = new ArrayList<>();

	public Arena() {
		addFighter();
		addFighter();
	}

	public List<Fighter> getFighters() {
		return fighters;
	}

	public void setFighters(List<Fighter> fighters) {
		this.fighters = fighters;
	}

	private void addFighter() {
		fighters.add(new Fighter());
	}

	public void engage() {

	}
}
