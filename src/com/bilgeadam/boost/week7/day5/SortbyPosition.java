package com.bilgeadam.boost.week7.day5;

import java.util.Comparator;

public class SortbyPosition implements Comparator<Enemy> {

	@Override
	public int compare(Enemy e1, Enemy e2) {
		if(e1.getPosition()<e2.getPosition()) {
			return -1;
		}
		else if(e1.getPosition()>e2.getPosition()){
			return 1;
		}
		return 0;
	}

	
}
