package com.green.biz;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchMaxTest {

	@Test
	public void test() {
		
		CalcUtil testSearchMax=new CalcUtil();
		
		int[]arr1=new int[] {1, 3, 4, 2};//
		int[]arr2=new int[] {-12, -1, -3, -4, -2};

		assertEquals("testSearchMax1", 4, testSearchMax.searchMax(arr1));
		assertEquals("testSearchMax2", -1, testSearchMax.searchMax(arr2));
////
	}

}
