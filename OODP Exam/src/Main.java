public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        EditorInvoker invoker = new EditorInvoker();

        Command cmd1 = new WriteCommand(editor, "Hello ");
        Command cmd2 = new WriteCommand(editor, "World!");

        invoker.executeCommand(cmd1);
        invoker.executeCommand(cmd2);

        invoker.undoLast();  // Undo "World!"
        invoker.undoLast();  // Undo "Hello "
    }
}