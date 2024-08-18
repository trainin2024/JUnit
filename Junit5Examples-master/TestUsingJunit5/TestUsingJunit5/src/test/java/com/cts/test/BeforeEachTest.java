package com.cts.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.cts.Calculator;

@RunWith(JUnitPlatform.class)
public class BeforeEachTest {

	@DisplayName("Add operation test")
	@RepeatedTest(5)
	void addNumber(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
		Assertions.assertEquals(2, Calculator.add(1, 1), "1 + 1 should equal 2");
	}
	
	@BeforeAll
	public static void init(){
		System.out.println("BeforeAll init() method called");
	}
	
	@BeforeEach
	public void initEach(){
		System.out.println("BeforeEach initEach() method called");
	}
	@AfterEach
	public  void initAfter(){
		System.out.println("After each test called");
	}
	
}