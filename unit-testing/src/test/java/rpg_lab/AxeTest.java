package rpg_lab;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AxeTest {
	private static final int ATTACK = 10;
	private static final int DURABILITY = 10;
	private static final int HEALTH = 100;
	private static final int EXP = 10;

	Axe axe;
	Axe brokenAxe;
	Dummy dummy;

	@Before
	public void setUp() {
		axe = new Axe(ATTACK, DURABILITY);
		brokenAxe = new Axe(ATTACK, 0);
		dummy = new Dummy(HEALTH, EXP);
	}

	@Test
	public void testAxeLosingDurability() {
		axe.attack(dummy);
		int expected = DURABILITY - 1;

		assertEquals(expected, axe.getDurabilityPoints());
	}

	@Test(expected = IllegalStateException.class)
	public void testAttackTrhowsWhenAxeIsBroken() {
		brokenAxe.attack(dummy);

	}
}
