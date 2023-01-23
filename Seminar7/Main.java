import controllers.NoteController;
import loggers.FileLogger;
import loggers.LogRepositoryFileDecorator;
import model.FileAppendOperationImpl;
import model.FileOperationImpl;
import model.JsonRepositoryFile;
import model.Repository;
import views.ViewNote;

public class Main {
    public static void main(String[] args) {

        FileOperationImpl fileOperation =
                new FileOperationImpl("notes.json");
        Repository repository =
                new LogRepositoryFileDecorator(
                new JsonRepositoryFile(fileOperation),
                new FileLogger(new FileAppendOperationImpl("log")));
        //Repository repository = new LogRepositoryFileDecorator(new JsonRepositoryFile(fileOperation), new ConsoleLogger());
        NoteController noteController = new NoteController(repository);
        new ViewNote(noteController).run();
    }
}