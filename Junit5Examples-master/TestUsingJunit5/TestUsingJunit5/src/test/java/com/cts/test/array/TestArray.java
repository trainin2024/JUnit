package com.cts.test.array;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
@RunWith(JUnitPlatform.class)
class TestArray {

	@Test
	void test() {
		int[] marks = {20,45,10,78};
		int [] expected = {10,21,45,78};
		Arrays.sort(marks);
		assertArrayEquals(expected, marks);
	}}
