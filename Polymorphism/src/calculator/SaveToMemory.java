package calculator;

public class SaveToMemory implements Operation {
	private Memory memory;

	public SaveToMemory(Memory memory) {
		this.memory = memory;
	}

	@Override
	public void addOperand(int operand) {
		this.memory.getStorage().push(operand);
	}

	@Override
	public int getResult() {
		return this.memory.getStorage().peek();
	}

	@Override
	public boolean isCompleted() {
		return false;
	}

}
