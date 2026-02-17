public class ConsultationService extends Service implements Billable {

    public ConsultationService(String name, int id) {
        super(name, id);
    }

    @Override
    public void performService() {
        if (!active) {
            System.out.println(serviceName + " is inactive. Consultation unavailable.");
            return;
        }
        System.out.println("Conducting online consultation...");
    }

    @Override
    public void generateBill() {
        System.out.println("Generating bill for consultation session.");
    }
}
