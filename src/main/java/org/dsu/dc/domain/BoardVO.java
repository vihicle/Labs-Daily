package org.dsu.dc.domain;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import lombok.Data;

@Data
public class BoardVO {
	private long bno;
	private long STUDNO;
	private String NAME;
	private long PCNO;
	private Date STARTTIME;
	private Date FINISHTIME;
	
	public String getUseTime() {
		long start = STARTTIME.getTime();
		long end = FINISHTIME.getTime();
		
		long use = end - start;
		int sec = (int) (use / 1000) % 60;
		int min = (int) (use / (1000 * 60) % 60);
		int hours = (int) (use / (1000 * 60 * 60) % 24);
		String usetime = (hours + "시 " + min + "분 " + sec + "초");
		return usetime;
	}
}
