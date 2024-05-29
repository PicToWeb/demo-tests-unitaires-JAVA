package fr.diginamic.utils;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@Test
	void testLevenshteinDistanceMAJ() {
		assertEquals(0,StringUtils.levenshteinDistance("CHIEN", "CHIEN"));
	}
	@Test
	void testLevenshteinDistanceNUll() {
		assertEquals(0,StringUtils.levenshteinDistance(null, ""));
	}
	@Test
	void testLevenshteinDistanceOk() {
		assertEquals(1,StringUtils.levenshteinDistance("machins", "machine"));
	}

}
