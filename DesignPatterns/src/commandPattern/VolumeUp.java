package commandPattern;

public class VolumeUp implements Command {
	private RemoteControl remote;

	public VolumeUp(RemoteControl remote) {
		this.remote = remote;
	}

	@Override
	public void execute() {
		int currentVolume = remote.getVolume();
		remote.setVolume(currentVolume + 1);

	}

}
