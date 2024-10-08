package behavioral.command.commands;

import behavioral.command.FileSystemReceiver;

public class DeleteFileCommand implements Command {
    private final FileSystemReceiver fileSystemReceiver;

    public DeleteFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.deleteFile();
    }
}
