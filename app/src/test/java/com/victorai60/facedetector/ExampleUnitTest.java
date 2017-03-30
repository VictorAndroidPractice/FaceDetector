package com.victorai60.facedetector;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testA() {
        List<String> strs = new ArrayList<>();
        strs.add("A");
        strs.add("B");
        strs.add("C");
        for (String str : strs) {
            if ("A".equals(str)) {
                System.out.println(str);
                return;
            }
            System.out.println("A");
        }
        System.out.println("Finish");
    }
}