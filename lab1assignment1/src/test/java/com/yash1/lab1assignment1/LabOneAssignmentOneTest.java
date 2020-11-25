package com.yash1.lab1assignment1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LabOneAssignmentOneTest {
	public static int ANY_INTEGER_AS_INPUT_1=1;
	public static int ANY_INTEGER_AS_INPUT_2=2;
	public static int ANY_INTEGER_AS_INPUT_3=3;
	public static int ANY_INTEGER_AS_INPUT_4=4;
	public static int ANY_INTEGER_AS_INPUT_5=5;
	public static int ANY_INTEGER_AS_INPUT_6=10;
	public static int ANY_INTEGER_AS_INPUT_7=100;
	public static int ANY_INTEGER_AS_INPUT_8=999;
	private LabOneAssignmentOne labOneAssignmentOne;
	
	@Before
	public void setup() {
		labOneAssignmentOne = new LabOneAssignmentOne();
	}
	

	@Test
	public void test_CalculateSum_Given1AsNumber_ShouldReturn1Asnumber () {
		int result = labOneAssignmentOne.calculateSum(ANY_INTEGER_AS_INPUT_1);
		assertEquals(1, result);
		
	}

	@Test
	public void test_CalculateSum_Given2AsNumber_ShouldReturn8Asnumber () {
		int result = labOneAssignmentOne.calculateSum(ANY_INTEGER_AS_INPUT_2);
		assertEquals(8, result);
	}


	@Test
	public void test_CalculateSum_Given3AsNumber_ShouldReturn27Asnumber () {
		int result = labOneAssignmentOne.calculateSum(ANY_INTEGER_AS_INPUT_3);
		assertEquals(27, result);
	}


	@Test
	public void test_CalculateSum_Given4AsNumber_ShouldReturn64Asnumber () {
		int result = labOneAssignmentOne.calculateSum(ANY_INTEGER_AS_INPUT_4);
		assertEquals(64, result);
	}


	@Test
	public void test_CalculateSum_Given5AsNumber_ShouldReturn125Asnumber () {
		int result = labOneAssignmentOne.calculateSum(ANY_INTEGER_AS_INPUT_5);
		assertEquals(125, result);
	}


	@Test
	public void test_CalculateSum_Given10AsNumber_ShouldReturn1Asnumber () {
		int result = labOneAssignmentOne.calculateSum(ANY_INTEGER_AS_INPUT_6);
		assertEquals(1, result);
	}


	@Test
	public void test_CalculateSum_Given100AsNumber_ShouldReturn1Asnumber () {
		int result = labOneAssignmentOne.calculateSum(ANY_INTEGER_AS_INPUT_7);
		assertEquals(1, result);
	}

	@Test
	public void test_CalculateSum_Given999AsNumber_ShouldReturn2187Asnumber () {
		int result = labOneAssignmentOne.calculateSum(ANY_INTEGER_AS_INPUT_8);
		assertEquals(2187, result);
	}


}
