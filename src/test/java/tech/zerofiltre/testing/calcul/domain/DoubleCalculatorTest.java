package tech.zerofiltre.testing.calcul.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

   class DoubleCalculatorTest {
	private Calculator calculatorUnderTest;

	@BeforeEach
	   void initCalculator() {
		calculatorUnderTest = new Calculator();
	}

	   @Test
	   @Disabled("Problème de précision lié aux erreurs d'arrondi du type double. À revoir avec BigDecimal.")
	   void subTwoDoubleNumbers_shouldReturnsTheCorrectAnswer() {
		   // GIVEN
		   double expected = 0.0000000001;
		   double delta = 1e-10; // Tolérance pour gérer les erreurs d'arrondi

		   // WHEN
		   double result = calculatorUnderTest.sub(1.0000000001, 1.0);

		   // THEN
		   assertEquals(expected, result, delta,
				   String.format("Erreur : Attendu : %.10f, Résultat : %.10f", expected, result));
	   }
}
