package com.nslearning.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class DrawingImpl {
	
	private static final Logger LOG = Logger.getLogger(DrawingImpl.class.getName());
	
	public static void main(String[] args) {
		// Lambda expression without params
		Drawable d = () -> {
			LOG.info("Drawing something...");
			};
		d.draw();	
		
		// Lambda expression with a single param
		ExtendedDrawable ed = (name) -> {
			LOG.info(String.format("Drawing... %s",name));
		};
		ed.drawable("Circle");
		
		//Lambda expression with multiple params
		Addable add = (a,b) -> {
			LOG.info(String.format("%d + %d = %d", a,b,a+b));
		};
		add.add(5, 8);
		
		//Lambda expression with ForEach Loop
		List<String> numberList = Arrays.asList("One","Two","Three","Four","Five");
		numberList.forEach((n)-> LOG.info("Number = " + n));
		
		//Lambda expression creating threads
		Runnable rone = ()-> {
			LOG.info("From Thread rone");
		};
		rone.run();
		
		Runnable rtwo = ()-> {
			LOG.info("From Thread rtwo");
		};
		rtwo.run();
	}
	
	

}
