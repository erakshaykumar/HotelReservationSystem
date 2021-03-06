/* @Purpose: Ability to Add Hotel in a Hotel Reservation System With Name And Rates For Regular Customer
 * @File : Hotel Reservation System
 * @Author : Akshay Kumar
 */

package com.hotelreservation;

public class HotelReservationMain {
	/*
	 * @Purpose: To Print the Object References
	 * 
	 * @Param: Elements Of Arraylist For Hotel Name
	 */
	public static void main(String[] args) {
		try {
			Hotel hotel1 = new Hotel("LakeWood", 110);
			Hotel hotel2 = new Hotel("BridgeWood", 160);
			Hotel hotel3 = new Hotel("RidgeWood", 220);
			HotelReservationSystem hotelSystem = new HotelReservationSystem();
			hotelSystem.add(hotel1);
			hotelSystem.add(hotel2);
			hotelSystem.add(hotel3);
			hotelSystem.getArrayList().forEach(hotelNameList -> System.out.println(hotelNameList));

		} catch (Exception e) {
			System.out.println("Problem In Adding Hotels");
		}
	}
}
