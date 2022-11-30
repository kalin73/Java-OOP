package word;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandImpl implements CommandInterface {
	
    private Map<String, TextTransform> commandTransforms;
    private TextModifier text;

    public CommandImpl(StringBuilder text) {
        this.commandTransforms = new HashMap<>();
		this.text = new TextModifier(text);
    }

    @Override
    public void init() {
        this.commandTransforms.clear();
        for (Command p : this.initCommands()) {
            this.commandTransforms.putIfAbsent(p.getText(), p.getTextTransform());
        }
    }

    @Override
    public void handleInput(String input) {
        String[] tokens = input.split("\\s+");

        String commandName = tokens[0];
        int startInd = Integer.parseInt(tokens[1]);
        int endInd = Integer.parseInt(tokens[2]);
        
        if (startInd < 0 || endInd < 0) {
            return;
        }
        
        this.commandTransforms.get(commandName).invokeOn(this.text, startInd, endInd);
    }

    protected List<Command> initCommands() {
        List<Command> commands = new ArrayList<>();
        commands.add(new Command("uppercase", new ToUpperTransform()));
        commands.add(new Command("cut", new Cut()));
        commands.add(new Command("paste", new Paste()));
        
        return commands;
    }
}
