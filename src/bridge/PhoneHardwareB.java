package bridge;

public class PhoneHardwareB extends PhoneHardware{
    @Override
    public void runSoftware() {
        System.out.print("phoneB run ");
        software.run();
    }
}
