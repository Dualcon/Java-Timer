package com.wikidreams.timertask;

import java.util.TimerTask;

public class MyTask extends TimerTask {

	public MyTask() {
		super();
	}

	@Override
	public void run() {
		System.out.println("I run after 5 seconds.");
	}

}
