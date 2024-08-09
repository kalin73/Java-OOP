package command;

import command.commands.Command;

public final class FileInvoker {

    public static void execute(Command command) {
        command.execute();
    }
}
