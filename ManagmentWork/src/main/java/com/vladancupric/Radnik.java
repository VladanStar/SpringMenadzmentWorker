package com.vladancupric;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("radnik")
public class Radnik implements Posao {

	public void uradiPosao() {
		// TODO Auto-generated method stub
		System.out.println("Dodeljen posao je izvrsen");
		
	}

}
