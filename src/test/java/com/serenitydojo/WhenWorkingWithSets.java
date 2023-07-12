package com.serenitydojo;


import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercises with Sets
 */

public class WhenWorkingWithSets {

    // We can create a set and add values to the set
    @Test
    public void creatingANewSet() {
        Set<String> colors = null;

        // TODO: Create a new HashSet and add the values "red", "green", and "blue"
        colors = new HashSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        assertThat(colors).containsExactlyInAnyOrder("red", "green", "blue");
    }

    // We can create a set containing a specified list of values")
    @Test
    public void creatingASetOfValues() {
        Set<String> colors = null;

        // TODO: Create a set of Strings containing the values "red", "green" and "blue"
        //  using the Set.of() method

        colors = Set.of("red","green","blue");

        assertThat(colors).containsExactlyInAnyOrder("red", "green", "blue");
    }

    // A Set cannot contain duplicates")
    @Test
    public void addAValueTwice() {
        Set<String>colors = new HashSet<>(Set.of("red", "green", "blue"));

        // TODO: Read the following code, and assign the correct value to expectedSize to make the test pass
        colors.add("red");
        colors.add("yellow");
        colors.add("red");

        int expectedSize = 4;

        assertThat(colors.size()).isEqualTo(expectedSize);
    }

    // We can check whether a set is empty")
    @Test
    public void canCheckIfEmpty() {
        Set<String> colors = new HashSet<>();

        // TODO: Change this code so that it correctly determines whether the set is empty
        Boolean startedEmpty = colors.isEmpty();

        colors.add("red");
        colors.add("green");
        colors.add("blue");

        // TODO: Change this code so that it correctly determines whether the set now empty or not
        Boolean endedUpEmpty = colors.isEmpty();

        assertThat(startedEmpty).isTrue();
        assertThat(endedUpEmpty).isFalse();
    }

}
