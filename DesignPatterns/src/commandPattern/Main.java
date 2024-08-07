package commandPattern;

public class Main {

	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();
		System.out.println(remote.getVolume());

		Command volumeUp = new VolumeUp(remote);
		volumeUp.execute();
		System.out.println(remote.getVolume());
	}

}
