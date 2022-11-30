package word;

public class Cut implements TextTransform {
	private String removed = "";

	@Override
	public void invokeOn(TextModifier text, int startIndex, int endIndex) {
		if (text.getText().toString().length() <= 0) {
			return;
		}
		if (startIndex == endIndex) {
			text.setCut("");
			return;
		}
		this.removed = "";
		for (int i = startIndex; i < endIndex; i++) {
			this.removed += text.getText().charAt(i);
		}

		text.getText().replace(startIndex, endIndex, "");
		text.setCut(removed);
	}
}
