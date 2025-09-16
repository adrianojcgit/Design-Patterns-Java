import adapters.HDMIToOldMonitorAdapter;
import adapters.HDMIToVGAAdapter;
import devices.Computer;
import devices.OldMonitor;
import devices.TV;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Computer pc = new Computer();
        TV tv = new TV();
        pc.connectPort(tv);
        pc.sendImageAndSound("Cat and rainbow", "Nyan cat song");

        System.out.println("------ Monitor ----------");

        Computer pc2 = new Computer();
        OldMonitor monitor = new OldMonitor();
        //pc2.connectPort(monitor.getConnector());  //Don't work! That's the reason why we create the adapter
        pc2.connectPort(new HDMIToVGAAdapter(monitor));
        pc2.sendImageAndSound("Cat and rainbow", "Nyan cat song");

        System.out.println("------ Monitor Class Adapter ----------");

        Computer pc3 = new Computer();
        HDMIToOldMonitorAdapter monitorAdaptee = new HDMIToOldMonitorAdapter();
        pc3.connectPort(monitorAdaptee);
        pc3.sendImageAndSound("Cat and rainbow", "Nyan cat song");
    }
}