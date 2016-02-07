package com.wikidreams.timertask;

import java.util.Timer;
import java.util.TimerTask;

public class App {

	public static void main(String[] args) {

		// Using an extended TimerTask class.
		Timer timer = new Timer();
		timer.schedule(new MyTask(), 5000);


		// Another example is using an anonymous inner Class.
		// Anonymous classes enable you to make your code more concise. They enable you to declare and instantiate a class at the same time. They are like local classes except that they do not have a name.
		// Use them if you need to use a local class only once.
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				System.out.println("I run after 5 secounds too.");
			}


		};
		timer.schedule(task, 5000);

	}

}
