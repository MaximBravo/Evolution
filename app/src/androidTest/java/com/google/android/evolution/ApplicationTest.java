package com.google.android.evolution;

import android.app.Application;
import android.test.ApplicationTestCase;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }
    private HashMap<String, Integer> inv;
    private String[] opt = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
    @Before
    public void setUp() throws Exception {
        inv = new HashMap<String, Integer>();
        inv = MainActivity.createInventory(inv, opt);
    }

    @Test
    public void testRandomString() throws Exception {
        int numberOfRolls = 1000;
        for(int i = 0; i < numberOfRolls; i++) {
            inv = MainActivity.getRollTester(inv, opt);
        }
        assertEquals("", inv);
    }

}