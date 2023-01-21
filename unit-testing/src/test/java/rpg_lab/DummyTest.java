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
	private Dummy deadDummy;

	@Before
	public void setUp() {
		this.axe = new Axe(ATTACK, DURABILITY);
		this.dummy = new Dummy(HEALTH, EXP);
		this.deadDummy = new Dummy(0, EXP);
	}

	@Test
	public void testLosingHpIfAttacked() {
		axe.attack(dummy);
		int expected = HEALTH - ATTACK;

		assertEquals(expected, dummy.getHealth());

	}

	@Test(expected = IllegalStateException.class)
	public void deadDummyThrowsExceeption() {
		axe.attack(deadDummy);

	}

	@Test
	public void testDummyCanGiveExpWhenKilled() {
		int expected = EXP;

		assertEquals(expected, deadDummy.giveExperience());
	}

	@Test(expected = IllegalStateException.class)
	public void testAliveDummyCantGiveEXP() {
		dummy.giveExperience();
	}
}
