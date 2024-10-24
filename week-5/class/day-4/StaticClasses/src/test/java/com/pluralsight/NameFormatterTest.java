package com.pluralsight;

import javax.naming.Name;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @org.junit.jupiter.api.Test
    void formatWithFirstNameandLastNameWithoutError() {
        //arrange
        String firstName = "MockTopher";
        String lastName = "MockTestlastName";
        String expectedResult = "MockTestlastName, MockTopher";

        //act
        String result = NameFormatter.format(firstName, lastName);

        //assert
        assertEquals(expectedResult, result);
    }

    @org.junit.jupiter.api.Test
    void formatWithFirstNameandLastNameWithFailure() {
        //arrange
        String firstName = "MockTopher";
        String lastName = "MockTestlastName";
        String expectedResult = "MockTopher, MockTestlastName";

        //act
        String result = NameFormatter.format(firstName, lastName);

        //assert
        assertNotEquals(expectedResult, result);
    }
}