/* @Purpose: Ability to Add Hotel in a Hotel Reservation System With Name And Rates For Regular Customer
 * @File : Hotel Reservation system
 * @Author : Akshay Kumar
 */

package com.hotelreservation;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationSystemTest {
	/*
	 * @Purpose : Checking Proper Adding Of Hotels
	 * 
	 * @Param : ArrayList of Hotel To Compare
	 */
	@Test
	public void GivenHotels_AddedToTheHotelReservationSystem() {
		System.out.println("Welcome to the Hotel Registration system");
		Hotel hotel1 = new Hotel("LakeWood", 110);
		HotelReservationSystem hotelSystem = new HotelReservationSystem();
		hotelSystem.add(hotel1);
		Integer size = 1;
		hotelSystem.getArrayList().forEach(h -> System.out.println(h));
		Assert.assertEquals(size, hotelSystem.size());
	}
}