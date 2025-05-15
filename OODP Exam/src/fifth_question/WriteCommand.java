class WriteCommand implements Command {
    private TextEditor editor;
    private String word;

    public WriteCommand(TextEditor editor, String word) {
        this.editor = editor;
        this.word = word;
    }

    @Override
    public void execute() {
        editor.write(word);
    }

    @Override
    public void undo() {
        editor.erase(word.length());
    }
}