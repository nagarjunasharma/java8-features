package com.nslearning.methodreference;

import java.util.function.BiFunction;

public class TalkImpl {
	
	
	public static void main(String[] args) {
		// method reference example - static method
		Talkable talkable = TalkableImpl::talkSomething;
		talkable.talk();
		
		// method reference example - instance method
		ScienceTalkableImpl scienceTalk = new ScienceTalkableImpl();
		Talkable scienceTalkable = scienceTalk::talkSomething;
		scienceTalkable.talk();
		
		// method reference bifunction example
		BiFunction<Integer, Integer, Integer> addable = new Arithmetic()::add;
		System.out.println("Result : " + addable.apply(150, 200));
		
		//method reference constructor example
		Talkable gossipTalkable = GossipTalk::new;
		gossipTalkable.talk();
	}

}

class TalkableImpl {

	public static void talkSomething() {
		System.out.println("I am talking...");

	}

}

class ScienceTalkableImpl {

	public void talkSomething() {
		System.out.println("I am talking science...");
	}

}

