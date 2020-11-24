package com.yash1.lab1assignment5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LabOneAssignmentFiveTest {

	private LabOneAssignmentFive labOneAssignmentFive;

	@Before
	public void setup() {
		labOneAssignmentFive=new LabOneAssignmentFive();
	}

	@Test
	public void test_CalculateSum_Given1AsNumber_ShouldReturn0Asnumber()  {
		int result = labOneAssignmentFive.calculateSum(1);
		assertEquals(0, result);
	}

	@Test
	public void test_CalculateSum_Given2AsNumber_ShouldReturn0Asnumber()  {
		int result = labOneAssignmentFive.calculateSum(2);
		assertEquals(0, result);
	}

	@Test
	public void test_CalculateSum_Given3AsNumber_ShouldReturn3Asnumber()  {
		int result = labOneAssignmentFive.calculateSum(3);
		assertEquals(3, result);
	}

	@Test
	public void test_CalculateSum_Given4AsNumber_ShouldReturn3Asnumber()  {
		int result = labOneAssignmentFive.calculateSum(4);
		assertEquals(3, result);
	}

	@Test
	public void test_CalculateSum_Given5AsNumber_ShouldReturn8Asnumber()  {
		int result = labOneAssignmentFive.calculateSum(5);
		assertEquals(8, result);
	}
	/*	@Test(expected = NumberFormatException.class)
	public void test_CalculateSum_Given_5AsNumber_ThrowsNumberFormatException()  {
		int result = labOneAssignmentFive.calculateSum(-5);
		//assertEquals(8, result);
	}
	 */
	@Test
	public void test_CalculateSum_Given6AsNumber_ShouldReturn14Asnumber()  {
		int result = labOneAssignmentFive.calculateSum(6);
		assertEquals(14, result);
	}
	@Test
	public void test_CalculateSum_Given7AsNumber_ShouldReturn14Asnumber()  {
		int result = labOneAssignmentFive.calculateSum(7);
		assertEquals(14, result);
	}
	@Test
	public void test_CalculateSum_Given8AsNumber_ShouldReturn14Asnumber()  {
		int result = labOneAssignmentFive.calculateSum(8);
		assertEquals(14, result);
	}


}