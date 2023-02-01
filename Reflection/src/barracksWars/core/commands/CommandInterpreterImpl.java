package barracksWars.core.commands;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import barracksWars.annotations.Inject;
import barracksWars.interfaces.CommandInterpreter;
import barracksWars.interfaces.Executable;
import barracksWars.interfaces.Repository;
import barracksWars.interfaces.UnitFactory;

public class CommandInterpreterImpl implements CommandInterpreter {
	private static final String COMMAND_PACKAGE_NAME = "barracksWars.core.commands.";
	private Repository repository;
	private UnitFactory unitFactory;

	public CommandInterpreterImpl(Repository repository, UnitFactory unitFactory) {
		this.repository = repository;
		this.unitFactory = unitFactory;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Executable interpretCommand(String[] data, String commandName) {
		String className = parseCommandToClassName(commandName);
		Executable command = null;

		try {
			Class clazz = Class.forName(className);
			Constructor<Command> constructor = clazz.getDeclaredConstructors()[0];
			Field[] fields = clazz.getDeclaredFields();
			command = constructor.newInstance(new Object[] { data });

			for (Field field : fields) {
				if (field.isAnnotationPresent(Inject.class)) {
					if (field.getType().equals(Repository.class)) {
						field.setAccessible(true);
						field.set(command, repository);

					} else if (field.getType().equals(UnitFactory.class)) {
						field.setAccessible(true);
						field.set(command, unitFactory);
					}
				}
			}

			return command;

		} catch (ClassNotFoundException | SecurityException | InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			System.out.println("Invalid command!");
		}
		return null;
	}

	private String parseCommandToClassName(String commandName) {
		String firstLetterUpperCase = commandName.substring(0, 1).toUpperCase();
		String restOfCommandName = commandName.substring(1);

		return COMMAND_PACKAGE_NAME + firstLetterUpperCase + restOfCommandName + "Command";
	}
}
