package num04;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTimeTest {
	public static void main(String[] args) {
		// 年月日，时分秒
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		// java8
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt.getYear());
		System.out.println(dt.getMonthValue());
		System.out.println(dt.getDayOfMonth());
		System.out.println(dt.getHour());
		System.out.println(dt.getMinute());
		System.out.println(dt.getSecond());
		
		// 时间戳 
		System.out.println(Calendar.getInstance().getTimeInMillis());
		System.out.println(System.currentTimeMillis());
		System.out.println(Clock.systemDefaultZone().millis());
		
		// 某月最后一天
		Calendar time = Calendar.getInstance();
		System.out.println(time.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		// 格式化
		SimpleDateFormat old = new SimpleDateFormat("yyyy/MM/dd");
		Date date1 = new Date();
		System.out.println(old.format(date1));
		// java8
		DateTimeFormatter next = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate date2 = LocalDate.now();
		System.out.println(date2.format(next));
	}
}
