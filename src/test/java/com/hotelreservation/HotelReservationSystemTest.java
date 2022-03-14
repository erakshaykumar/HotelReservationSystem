/* @Purpose: Ability to Add Hotel in a Hotel Reservation System With Name And Rates For Regular Customer
 * @File : Hotel Reservation System
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
		try {
			System.out.println("Welcome to the Hotel Registration system");
			Hotel hotel1 = new Hotel("LakeWood", 110);
			HotelReservationSystem hotelSystem = new HotelReservationSystem();
			hotelSystem.add(hotel1);
			Integer size = 1;
			hotelSystem.getArrayList().forEach(hotelNameList -> System.out.println(hotelNameList));
			Assert.assertEquals(size, hotelSystem.size());
		} catch (Exception e) {
			System.out.println("Issue In Adding Hotel1");
		}

		try {
			Hotel hotel2 = new Hotel("BridgeWood", 160);
			HotelReservationSystem hotelSystem = new HotelReservationSystem();
			hotelSystem.add(hotel2);
			Integer size = 1;
			hotelSystem.getArrayList().forEach(hotelNameList -> System.out.println(hotelNameList));
			Assert.assertEquals(size, hotelSystem.size());
		} catch (Exception e) {
			System.out.println("Issue In Adding Hotel2");
		}

		try {
			Hotel hotel3 = new Hotel("RidgeWood", 220);
			HotelReservationSystem hotelSystem = new HotelReservationSystem();
			hotelSystem.add(hotel3);
			Integer size = 1;
			hotelSystem.getArrayList().forEach(hotelNameList -> System.out.println(hotelNameList));
			Assert.assertEquals(size, hotelSystem.size());
		} catch (Exception e) {
			System.out.println("Issue In Adding Hotel3");
		}
	}
}