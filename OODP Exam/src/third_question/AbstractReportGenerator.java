public abstract class AbstractReportGenerator {
    public final void generateReport() {
        openReport();
        writeHeader();
        writeContent();
        writeFooter();
        closeReport();
    }

    private void openReport() {
        System.out.println("Opening report...");
    }

    private void writeHeader() {
        System.out.println("Standard Header");
    }

    protected abstract void writeContent();

    protected void writeFooter() {
        // Hook method
    }

    private void closeReport() {
        System.out.println("Closing report...\n");
    }
}

