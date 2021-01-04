import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TSharkDataTest {

    private TSharkData data;

    @Before
    public void setUp(){
    }

    @Test
    public void getFrameNumber() {
        data = new TSharkData("\"8\",\"1.774700000\",\"TCP\",\"6\",\"192.168.68.126\",\"52.114.159.112\",\"55358\",\"443\",,");
        assertEquals("Frame Number", "8", data.getFrameNumber());
    }

    @Test
    public void getFrameTime() {
        data = new TSharkData("\"8\",\"1.774700000\",\"TCP\",\"6\",\"192.168.68.126\",\"52.114.159.112\",\"55358\",\"443\",,");
        assertEquals("Frame Time", "1.774700000", data.getFrameTime());
    }

    @Test
    public void getProtocol() {
        data = new TSharkData("\"8\",\"1.774700000\",\"TCP\",\"6\",\"192.168.68.126\",\"52.114.159.112\",\"55358\",\"443\",,");
        assertEquals("Protocol", "TCP", data.getProtocol());
        data = new TSharkData("\"24\",\"1.330864000\",\"IGMPv3\",\"2\",\"192.168.68.1\",\"224.0.0.1\",,,,");
        assertEquals("Protocol", "IGMPv3", data.getProtocol());
    }

    @Test
    public void getProtocolID() {
        data = new TSharkData("\"8\",\"1.774700000\",\"TCP\",\"6\",\"192.168.68.126\",\"52.114.159.112\",\"55358\",\"443\",,");
        assertEquals("Protocol ID", "6", data.getProtocolID());
        data = new TSharkData("\"70\",\"7.373409000\",\"UDP\",\"17\",\"192.168.68.105\",\"192.168.68.255\",,,\"57621\",\"57621\"");
        assertEquals("Protocol ID", "17", data.getProtocolID());
    }

    @Test
    public void getSrcIP() {
        data = new TSharkData("\"8\",\"1.774700000\",\"TCP\",\"6\",\"192.168.68.126\",\"52.114.159.112\",\"55358\",\"443\",,");
        assertEquals("Source IP", "192.168.68.126", data.getSrcIP());
    }

    @Test
    public void getSrcPort() {
        data = new TSharkData("\"8\",\"1.774700000\",\"TCP\",\"6\",\"192.168.68.126\",\"52.114.159.112\",\"55358\",\"443\",,");
        assertEquals("Source Port", "55358", data.getSrcPort());
    }

    @Test
    public void getDstIP() {
        data = new TSharkData("\"8\",\"1.774700000\",\"TCP\",\"6\",\"192.168.68.126\",\"52.114.159.112\",\"55358\",\"443\",,");
        assertEquals("Destination IP", "52.114.159.112", data.getDstIP());
    }

    @Test
    public void getDstPort() {
        data = new TSharkData("\"8\",\"1.774700000\",\"TCP\",\"6\",\"192.168.68.126\",\"52.114.159.112\",\"55358\",\"443\",,");
        assertEquals("Destination Port", "443", data.getDstPort());
    }
}