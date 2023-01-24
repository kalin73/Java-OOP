package p06_TirePressureMonitoringSystem;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class AlarmTest {
	private static final double LOW_PRESURE = 15.0;
	private static final double HIGH_PRESURE = 22.0;

	Alarm alarm;
	Sensor fakeSensor;

	@Before
	public void setUp() {
		fakeSensor = mock(Sensor.class);
		alarm = new Alarm(fakeSensor);
	}

	@Test
	public void testAlarmShouldBeOnBecauseLowPresure() {
		when(fakeSensor.popNextPressurePsiValue()).thenReturn(LOW_PRESURE);
		
		alarm.check(); 
		
		assertTrue(alarm.getAlarmOn());

	}

	@Test
	public void testAlarmShouldBeOnBecauseHighPresure() {
		when(fakeSensor.popNextPressurePsiValue()).thenReturn(HIGH_PRESURE);

		alarm.check();

		assertTrue(alarm.getAlarmOn());
	}

	@Test
	public void testAlarmWhenNormalPresure() {
		when(fakeSensor.popNextPressurePsiValue()).thenReturn(20.0);
		
		alarm.check();
		
		assertFalse(alarm.getAlarmOn());
	}
}
