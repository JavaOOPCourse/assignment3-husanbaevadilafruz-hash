public class StreamingService extends Service implements PremiumFeature {

    private boolean premium;

    public StreamingService(String name, int id) {
        super(name, id);
        this.premium = false;
    }

    @Override
    public void performService() {
        if (!active) {
            System.out.println(serviceName + " is inactive. Cannot stream.");
            return;
        }
        System.out.println("Streaming video content...");
    }

    @Override
    public void upgradeToPremium() {
        premium = true;
        System.out.println(serviceName + " upgraded to Premium (HD, no ads).");
    }
}
