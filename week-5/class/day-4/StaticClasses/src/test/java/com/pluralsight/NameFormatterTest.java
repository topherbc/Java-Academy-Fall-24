package com.pluralsight;

import javax.naming.Name;

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
}