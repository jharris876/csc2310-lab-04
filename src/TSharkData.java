import java.util.Scanner;

public class TSharkData {

    private String frameNumber;
    private String frameTime;
    private String protocol;
    private String protocolID;
    private String srcIP;
    private String srcPort;
    private String dstIP;
    private String dstPort;

    public TSharkData(String data){
        Scanner scan = new Scanner(data);
        scan.useDelimiter(",");
        frameNumber = scan.next().replaceAll("\"", "");
        frameTime = scan.next().replaceAll("\"", "");
        protocol = scan.next().replaceAll("\"", "");
        protocolID = scan.next().replaceAll("\"", "");
        srcIP = scan.next().replaceAll("\"", "");
        dstIP= scan.next().replaceAll("\"", "");
        srcPort = scan.next().replaceAll("\"", "");
        dstPort = scan.next().replaceAll("\"", "");

        if(srcPort.isEmpty()){
            srcPort = scan.next().replaceAll("\"", "");
        }
        if(dstPort.isEmpty()){
            dstPort = scan.next().replaceAll("\"", "");
        }
    }

    public String getFrameNumber() {
        return frameNumber;
    }

    public String getFrameTime() {
        return frameTime;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getProtocolID() {
        return protocolID;
    }

    public String getSrcIP() {
        return srcIP;
    }

    public String getSrcPort() {
        return srcPort;
    }

    public String getDstIP() {
        return dstIP;
    }

    public String getDstPort() {
        return dstPort;
    }

}
