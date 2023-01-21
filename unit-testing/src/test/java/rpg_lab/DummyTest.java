package rpg_lab;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DummyTest {
	private static final int ATTACK = 10;
	private static final int DURABILITY = 10;
	private static final int HEALTH = 100;
	private static final int EXP = 10;
	private static final int DEAD_DUMMY_HP = 0;

	private Axe axe;
	private Dummy aliveDummy;
	private Dummy deadDummy;

	@Before
	public void setUp() {
		this.axe = new Axe(ATTACK, DURABILITY);
		this.aliveDummy = new Dummy(HEALTH, EXP);
		this.deadDummy = new Dummy(DEAD_DUMMY_HP, EXP);
	}

	@Test
	public void testLosingHpIfAttacked() {
		axe.attack(aliveDummy);
		int expected = HEALTH - ATTACK;

		assertEquals(expected, aliveDummy.getHealth());

	}

	@Test(expected = IllegalStateException.class)
	public void deadDummyThrowsExceeption() {
		axe.attack(deadDummy);

	}

}
