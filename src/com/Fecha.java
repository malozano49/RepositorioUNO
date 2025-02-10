package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Fecha {

	public static final String FORMAT = "yyyy/mm/dd";
	
	public static void main(String[] args) throws ParseException {
		LocalDate currentDate = LocalDate.now();		        
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    String birthDate = "";   
	    birthDate = "01-01-2024";
		Date temp = sdf.parse(birthDate);
		Instant instant = temp.toInstant();
        LocalDate nacim = instant.atZone(ZoneId.systemDefault()).toLocalDate();
        if (nacim.isAfter(currentDate)) {
        	System.out.println("pasa");
        }
        
//        LocalDate dt1 = LocalDate.parse("2018-11-27");
     //   LocalDate dt1 = LocalDate.parse("2023-10-30");
        LocalDate dt1 = instant.atZone(ZoneId.systemDefault()).toLocalDate();
        // Parses the second date 
     //   LocalDate dt2 = LocalDate.parse("2017-11-27"); 
        LocalDate dt2 = LocalDate.parse("2017-11-27");
        // Checks 
        if(dt1.isAfter(dt2)) {
        	System.out.println(dt1.isAfter(dt2));
        }
	}
	public static int diffDays(Date dateIni, Date dateEnd){
	
		/**
		 * 	LocalDateTime localDateTimeNow = LocalDateTime.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMAT);
		String srtLocalDateTimeNow = localDateTimeNow.format(formatter);
		SimpleDateFormat format = new SimpleDateFormat(FORMAT);
		Date dateNow = format.parse(srtLocalDateTimeNow);
		Date dateBD = format.parse("2023/08/29");
		int dias = diffDays(dateBD,dateNow);
		
		System.out.println("\ndias L: " + dias);
	
		 * */
		long startTime = dateIni.getTime();
	     long endTime = dateEnd.getTime();
	     long diffTime = endTime - startTime;
	     return (int)TimeUnit.DAYS.convert(diffTime, TimeUnit.MILLISECONDS);
	}

}
