package com.refinitiv.ema.examples.training.consumer.series100.ex100_MP_Streaming;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MyLogHandler extends Handler{
	 
	 
	@Override
	public void publish(LogRecord record) {
		// TODO Auto-generated method stub
		System.out.println("##### Log: "+record.getLoggerName()+" #####");
		System.out.println("Level: "+ record.getLevel());
		System.out.println("Message: \n"+ record.getMessage());

	}


	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void close() throws SecurityException {
		// TODO Auto-generated method stub
		
	}
	
}