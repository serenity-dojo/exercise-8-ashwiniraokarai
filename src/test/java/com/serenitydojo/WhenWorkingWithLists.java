package com.serenitydojo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercises with ArrayLists
 */

// When working with Lists in Java
public class WhenWorkingWithLists {

    // We can create a list containing a specified list of values
    @Test
    public void creatingAListOfValues() {
        List<String> colors = null;

        // TODO: Create an immutable list of Strings containing the values "red", "green" and "blue"
        //  using the Arrays.asList() method

        assertThat(colors).containsExactly("red", "green", "blue");
    }

    // We can add a value an empty list
    @Test
    public void addingAValueToAnEmptyList() {
        List<String> colors = null;

        // TODO: Create a new ArrayList, and add "red" and "green" this list

        assertThat(colors).containsExactly("red", "green");
    }

    // We can add a value to the end an existing list
    @Test
    public void addingAValueToTheEndList() {
        List<String> colors = new ArrayList<>(Arrays.asList("red", "green", "blue"));

        // TODO: Add "yellow" to the END of this list

        assertThat(colors).containsExactly("red", "green", "blue", "yellow");
    }

    // We can add a value to the start an existing list
    @Test
    public void addingAValueToTheStartOfAList() {
        List<String> colors = new ArrayList<>(Arrays.asList("red", "green", "blue"));

        // TODO: Add "yellow" to the START of this list

        assertThat(colors).containsExactly("yellow", "red", "green", "blue");
    }

    // We can delete a value from an existing list
    @Test
    public void deletingAValueInAList() {
        List<String> colors = new ArrayList<>(Arrays.asList("red", "green", "blue"));

        // TODO: Remote "green" from the list

        assertThat(colors).containsExactly( "red", "blue");
    }

    // We can find the number of elements in a list
    @Test
    public void findingTheLengthOfAList() {
        List<String> colors = new ArrayList<>(Arrays.asList("red", "green", "blue"));

        int numberOfElements = 0;
        // TODO: Remote "green" from the list

        assertThat(numberOfElements).isEqualTo(3);
    }
}
