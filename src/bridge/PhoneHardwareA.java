package bridge;

public class PhoneHardwareA extends PhoneHardware{

    @Override
    public void runSoftware() {
        System.out.print("phoneA run ");
        software.run();
    }
}
