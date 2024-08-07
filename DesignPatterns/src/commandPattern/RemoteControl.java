package commandPattern;

public class RemoteControl implements Command {
	private int volume;
	private int program;

	public RemoteControl() {
		this.volume = 0;
		this.program = 0;
	}

	public int getVolume() {
		return this.volume;
	}

	public int getProgram() {
		return this.program;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public void execute() {

	}

}
