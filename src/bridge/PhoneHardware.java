package bridge;

public abstract class PhoneHardware {

    protected PhoneSoftware software;

    public PhoneSoftware getSoftware() {
        return software;
    }

    public void setSoftware(PhoneSoftware software) {
        this.software = software;
    }

    protected abstract void runSoftware();
}
