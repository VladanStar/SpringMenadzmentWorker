package com.vladancupric;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Firma {
	@Autowired
	@Qualifier("menadzer")
	private Posao menadzer;
	@Autowired
	@Qualifier("radnik")
	private Posao radnik;
	
	public void napraviPlan() {
		menadzer.uradiPosao();
	}
	public void sprovediPlan() {
		radnik.uradiPosao();
	}

}
