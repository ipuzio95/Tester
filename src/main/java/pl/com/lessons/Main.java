package pl.com.lessons;

import java.util.Date;

import pl.com.lessons.calendar.CalendarHelper;

public class Main {

	public static void main(String[] args) {
		String date = CalendarHelper.formatDate(CalendarHelper.FORMAT_DATETIME, new Date());
		// Sys ctrl space
		System.out.println(date);
	}

}
