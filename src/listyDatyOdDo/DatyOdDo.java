package listyDatyOdDo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class DatyOdDo {

	public static void main(String[] args) {
		
		LocalDate dataStart = LocalDate.of(2017, 01, 01);
		LocalDate dataKoniec = LocalDate.of(2017, 01, 31);
		
		System.out.println(dataStart);
		System.out.println(dataStart);
		
		List<LocalDate> listaDat;
		
		final long days = dataStart.until(dataKoniec,ChronoUnit.DAYS);
		
		listaDat = LongStream.rangeClosed(0, days).mapToObj(dataStart::plusDays).collect(Collectors.toList());
		
		System.out.println(listaDat);

	}

}
