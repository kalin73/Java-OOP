package behavioral.command.commands;

import behavioral.command.FileSystemReceiver;

public class WriteFileCommand implements Command {
    private final FileSystemReceiver fileSystemReceiver;

    public WriteFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.writeFile();
    }
}
