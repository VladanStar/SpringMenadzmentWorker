package com.vladancupric;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("menadzer")
public class Menadzer implements Posao {

	public void uradiPosao() {
		// TODO Auto-generated method stub
		System.out.println("Plan rada je napravljen");
		
		
	}

}
