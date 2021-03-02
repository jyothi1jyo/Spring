package com.jyothi.ioc;

public class Tmobile implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling using tmobile line");
		
	}

	@Override
	public void data() {
		System.out.println("lets start with your data for tmobile line");
		
	}

}
