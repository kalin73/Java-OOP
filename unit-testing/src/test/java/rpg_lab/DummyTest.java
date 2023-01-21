package rpg_lab;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DummyTest {
	private static final int ATTACK = 10;
	private static final int DURABILITY = 10;
	private static final int HEALTH = 10;
	private static final int EXP = 10;

	private Axe axe;
	private Dummy dummy;

	@Before
	public void setUp() {
		this.axe = new Axe(ATTACK, DURABILITY);
		this.dummy = new Dummy(HEALTH, EXP);
	}

	@Test
	public void testLosingHpIfAttacked() {
		axe.attack(dummy);
		int expected = HEALTH - ATTACK;

		assertEquals(expected, dummy.getHealth());

	}

	@Test(expected = IllegalStateException.class)
	public void deadDummyThrowsExceeption() {
		axe.attack(dummy);
		axe.attack(dummy);

	}

	@Test
	public void testDummyCanGiveExpWhenKilled() {
		axe.attack(dummy);
		int expected = EXP;

		assertEquals(expected, dummy.giveExperience());
	}

	@Test(expected = IllegalStateException.class)
	public void testAliveDummyCantGiveEXP() {
		dummy.giveExperience();
	}
}
