package rpg_lab;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class HeroTest {

	@Test
	public void testGainingXp() {

		Target fakeDummy = mock(Target.class);

		Weapon fakeAxe = mock(Weapon.class);

		when(fakeDummy.isDead()).thenReturn(true);
		when(fakeDummy.giveExperience()).thenReturn(10);

		// doNothing().when(fakeAxe).attack(any());

		Hero hero = new Hero("Kalin", fakeAxe);
		hero.attack(fakeDummy);
		int expected = 10;

		assertEquals(expected, hero.getExperience());

	}

	@Test
	public void testGettingLookWhenKill() {
		Weapon fakeLoot = mock(Weapon.class);
		Weapon fakeAxe = mock(Weapon.class);
		Target fakeDummy = mock(Target.class);

		when(fakeDummy.dropLoot()).thenReturn(fakeLoot);
		when(fakeDummy.isDead()).thenReturn(true);

		Hero hero = new Hero("Pesho", fakeAxe);
		hero.attack(fakeDummy);
		int expected = 1;

		assertEquals(expected, hero.getInventorySize());
	}

}
