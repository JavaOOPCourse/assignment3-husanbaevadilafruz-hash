public class CloudStorageService extends Service implements PremiumFeature, Billable {

    private boolean premium;

    public CloudStorageService(String name, int id) {
        super(name, id);
        this.premium = false;
    }

    @Override
    public void performService() {
        if (!active) {
            System.out.println(serviceName + " is inactive. Cannot access storage.");
            return;
        }
        System.out.println("Accessing cloud storage...");
    }

    @Override
    public void upgradeToPremium() {
        premium = true;
        System.out.println(serviceName + " upgraded to Premium (extra storage).");
    }

    @Override
    public void generateBill() {
        System.out.println("Generating bill for cloud storage usage.");
    }
}
