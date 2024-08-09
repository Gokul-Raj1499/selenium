package Bookingtestpkg;
import org.testng.annotations.Test;

import Bookingpkg.Booking;

public class Bookingtest extends Baseclass{

@Test
public void test() throws InterruptedException {

	Booking bk=new Booking(driver); 
	bk.close();
	bk.source("Bangalore");
	bk.destination("Ahmedabad");
	bk.datepicker();
	bk.search();
	
}
}
