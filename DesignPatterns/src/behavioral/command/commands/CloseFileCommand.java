package behavioral.command.commands;

import behavioral.command.FileSystemReceiver;

public class CloseFileCommand implements Command {
    private final FileSystemReceiver fileSystemReceiver;

    public CloseFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.closeFile();
    }
}
