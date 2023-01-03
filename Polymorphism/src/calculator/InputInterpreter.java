package calculator;

public class InputInterpreter {
	private CalculationEngine engine;
	private Memory memory = new Memory();

	public InputInterpreter(CalculationEngine engine) {
		this.engine = engine;
	}

	public boolean interpret(String input) {
		try {
			engine.pushNumber(Integer.parseInt(input));
		} catch (Exception ex) {
			if (input.equals("mr")) {
				engine.pushNumber(memory.getStorage().pop());
			} else {
				engine.pushOperation(this.getOperation(input));
			}
		}
		return true;
	}

	public Operation getOperation(String operation) {
		if (operation.equals("*")) {
			return new MultiplicationOperation();

		} else if (operation.equals("/")) {
			return new DevisionOperation();

		} else if (operation.equals("ms")) {
			return new SaveToMemory(memory);
		}

		return null;
	}
}
