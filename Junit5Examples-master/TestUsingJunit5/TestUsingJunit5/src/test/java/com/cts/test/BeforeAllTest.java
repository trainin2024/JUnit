package com.cts.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.cts.Calculator;

@RunWith(JUnitPlatform.class)
//@Disabled
public class BeforeAllTest {

	//@DisplayName("Add operation test")
	@RepeatedTest(5)
	void addNumber(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
		Assertions.assertEquals(0, Calculator.add(10, 10), "10 + 10 must be 2");
	}
	
	@BeforeAll
	public static void init(){
		System.out.println("Before All init() method called");
	}
	@AfterAll
	public static void initAfter(){
		System.out.println("All All init() method called");
	}
	
	
}
