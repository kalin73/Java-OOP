package barracksWars.core.factories;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import barracksWars.interfaces.Unit;
import barracksWars.interfaces.UnitFactory;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME = "barracksWars.models.units.";

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Unit createUnit(String unitType) {
		try {
			Class clazz = Class.forName(UNITS_PACKAGE_NAME + unitType);
			Constructor<Unit> constructor = clazz.getDeclaredConstructor();
			return constructor.newInstance();

		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;

	}
}
