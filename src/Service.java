public abstract class Service {
    protected String serviceName;
    protected int serviceId;
    protected boolean active;

    public Service(String serviceName, int serviceId) {
        this.serviceName = serviceName;
        this.serviceId = serviceId;
        this.active = false;
    }

    public void activateService() {
        active = true;
        System.out.println(serviceName + " activated.");
    }

    public void deactivateService() {
        active = false;
        System.out.println(serviceName + " deactivated.");
    }

    public boolean isActive() {
        return active;
    }

    public String getServiceName() {
        return serviceName;
    }

    public abstract void performService();
}
