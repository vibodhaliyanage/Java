public class FinanceReport extends AbstractReportGenerator {
    @Override
    protected void writeContent() {
        System.out.println("Finance content: Revenue, Expenses, Profit");
    }

    @Override
    protected void writeFooter() {
        System.out.println("Finance footer: Prepared by Finance Dept.");
    }
}
