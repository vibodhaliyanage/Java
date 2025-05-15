public class Main3 {
    public static void main(String[] args) {
        AbstractReportGenerator finance = new FinanceReport();
        finance.generateReport();

        AbstractReportGenerator hr = new HRReport();
        hr.generateReport();
    }
}
