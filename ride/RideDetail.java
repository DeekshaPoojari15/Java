package com.ride;

public class RideDetail {

	public void alibaba(float hours,int ad, int ch) {
		// TODO Auto-generated method stub
		int adult=50;
		int child=40;
		System.out.println("Adult ride fare:"+hours*adult*ad);
		System.out.println("Child ride fare:"+hours*child*ch);
		System.out.println("Adult ride fare:"+((hours*child*ch)+(hours*adult*ad)));
		
	}
	
	public void alphineslide(float hrs,int ad, int ch) {
		// TODO Auto-generated method stub
		int adult=60;
		int child=30;
		System.out.println("Adult ride fare:"+hrs*adult*ad);
		System.out.println("Child ride fare:"+hrs*child*ch);
		System.out.println("Adult ride fare:"+((hrs*child*ch)+(hrs*adult*ad)));
		
	}
	
	public void bumppercars(float hrs,int ad, int ch) {
		// TODO Auto-generated method stub
		int adult=45;
		int child=25;
		System.out.println("Adult ride fare:"+hrs*adult*ad);
		System.out.println("Child ride fare:"+hrs*child*ch);
		System.out.println("Adult ride fare:"+((hrs*child*ch)+(hrs*adult*ad)));
		
	}
	
	public void balloonrace(float hrs,int ad, int ch) {
		// TODO Auto-generated method stub
		int adult=70;
		int child=60;
		System.out.println("Adult ride fare:"+hrs*adult*ad);
		System.out.println("Child ride fare:"+hrs*child*ch);
		System.out.println("Adult ride fare:"+((hrs*child*ch)+(hrs*adult*ch)));
		
	}
}
