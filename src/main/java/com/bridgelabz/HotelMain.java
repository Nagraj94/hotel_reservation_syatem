package com.bridgelabz;

public class HotelMain {

        public static void main(String[] args) {
            HotelReservationService hotelReservationService = new HotelReservationService();
            hotelReservationService.addHotel();

            System.out.println("Cheapest Best Rated hotel for Regular Customers");
            System.out.println();
            hotelReservationService.bestRatedCheapHotel(HotelReservationService.CustomerType.REGULAR_CUSTOMER);
            System.out.println();

            System.out.println("Cheapest Best Rated hotel for Reward Customers");
            System.out.println();
            hotelReservationService.bestRatedCheapHotel(HotelReservationService.CustomerType.REWARD_CUSTOMER);

        }
    }
