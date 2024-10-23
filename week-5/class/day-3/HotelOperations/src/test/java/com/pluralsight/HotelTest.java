package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @org.junit.jupiter.api.Test
    void book10SuitesWhenAvailable() {
        //test our hotel so that I can book a suite if they are available
        //arrange
        Hotel testHotel = new Hotel("Test Hotel", 100, 100, 90, 90);

        //act
        boolean result = testHotel.bookRoom(10, true);

        //assert
        assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void book10SuitesWhenNotAvailable() {
        //test our hotel so that I can book a suite if they are available
        //arrange
        Hotel testHotel = new Hotel("Test Hotel", 100, 100, 100, 100);

        //act
        boolean result = testHotel.bookRoom(10, true);

        //assert
        assertFalse(result);
    }

    @org.junit.jupiter.api.Test
    void book10SuitesWhenAvailableAndBook10SuitesAfterFirstBooking() {
        //arrange
        Hotel testHotel = new Hotel("Test Hotel", 100, 100, 90, 90);

        //act
        boolean result = testHotel.bookRoom(10, true);
        boolean resultForFailure = testHotel.bookRoom(10, true);

        //assert
        assertTrue(result);
        assertFalse(resultForFailure);
    }
}