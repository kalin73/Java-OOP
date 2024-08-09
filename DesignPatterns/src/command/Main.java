package command;

import command.commands.CloseFileCommand;
import command.commands.DeleteFileCommand;
import command.commands.OpenFileCommand;
import command.commands.WriteFileCommand;

public class Main {

    public static void main(String[] args) {
        final FileSystemReceiver fileSystemReceiver = getFileSystemReceiver();
        final OpenFileCommand openFileCommand = new OpenFileCommand(fileSystemReceiver);

        FileInvoker.execute(openFileCommand);
        FileInvoker.execute(new WriteFileCommand(fileSystemReceiver));
        FileInvoker.execute(new CloseFileCommand(fileSystemReceiver));
        FileInvoker.execute(new DeleteFileCommand(fileSystemReceiver));
    }

    public static FileSystemReceiver getFileSystemReceiver() {
        String osName = System.getProperty("os.name");
        System.out.println("OS: " + osName);

        if (osName.toLowerCase().contains("windows")) {
            return new WindowsFileSystemReceiver();
        }
        return new UnixFileSystemReceiver();
    }
}
