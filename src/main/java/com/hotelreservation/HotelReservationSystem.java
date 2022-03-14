/* @Purpose: Ability to Add Hotel in a Hotel Reservation System With Name And Rates For Regular Customer
 * @File : Hotel Reservation system
 * @Author : Akshay Kumar
 */

package com.hotelreservation;

import java.util.ArrayList;

public class HotelReservationSystem {
	public ArrayList<Hotel> arrayList;

	/*
	 * @Purpose : Adding Hotel Reservation System
	 * 
	 * @Param : Arraylist of Hotels
	 */
	public HotelReservationSystem() {
		arrayList = new ArrayList<>();
	}

	/*
	 * @Purpose : ArrayList of Hotel
	 * 
	 * @Param : Hotel
	 * 
	 * @Return : Arraylist
	 */
	public ArrayList<Hotel> getArrayList() {
		return arrayList;
	}

	/*
	 * @Purpose : Set the Arraylist
	 * 
	 * @Param : ArrayList
	 */
	public void setArrayList(ArrayList<Hotel> arrayList) {
		this.arrayList = arrayList;
	}

	/*
	 * @Purpose : Adding Hotels
	 * 
	 * @Param : Hotel
	 */
	public void add(Hotel hotel) {
		arrayList.add(hotel);
	}

	/*
	 * @Purpose : For Getting Array Size
	 * 
	 * @Return : Size Of Arraylist
	 */
	public Integer size() {
		return arrayList.size();
	}

}
