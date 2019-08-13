package com.zensar.spring.performers;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer {
	
	private String song;
	private Instrument instrument;
	
	
	public void perform() {
		System.out.println("InstrumentaList is playing" +song);

	}
	
	public void setSong(String song ) {
		this.song = song;
		System.out.println("song is set");
	}
	
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("instrument is set");
	}


}
