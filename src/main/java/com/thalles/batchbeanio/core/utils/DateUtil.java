package com.thalles.batchbeanio.core.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	public static Date fromJulianDate(String julianDate){
		Calendar calendar = Calendar.getInstance();
		truncateDate(calendar);
		
		String prefixoAno = String.valueOf(calendar.get(Calendar.YEAR)).substring(0, 2);
		String ano = prefixoAno + julianDate.substring(0, 2);
		
		calendar.set(Calendar.YEAR, Integer.parseInt(ano));
		calendar.set(Calendar.DAY_OF_YEAR, 0);
		calendar.add(Calendar.DAY_OF_YEAR, Integer.parseInt(julianDate.substring(2, 5)));
		
		return calendar.getTime();
	}
	
	public static void truncateDate(final Calendar calendar) {
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
	}
	
}
