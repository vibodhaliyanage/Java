class TextEditor {
    private StringBuilder text = new StringBuilder();

    public void write(String word) {
        text.append(word);
        System.out.println("Text: " + text.toString());
    }

    public void erase(int length) {
        text.delete(text.length() - length, text.length());
        System.out.println("Text after undo: " + text.toString());
    }
}