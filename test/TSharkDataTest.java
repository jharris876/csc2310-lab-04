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
        data = new TSharkData("\"5\",\"1.436394000\",\"UDP\",\"17\",\"192.168.68.105\",\"192.168.68.255\",,,\"889\",\"889\"");
        assertEquals("Frame Number", "5", data.getFrameNumber());
        data = new TSharkData("\"6\",\"1.536100000\",\"ARP\",,,,,,,\"");
        assertEquals("Frame Number", "6", data.getFrameNumber());
        data = new TSharkData("\"9\",\"1.779635000\",\"DNS\",\"17\",\"192.168.68.126\",\"71.10.216.1\",,,\"60389\",\"53\"");
        assertEquals("Frame Number", "9", data.getFrameNumber());
    }

    @Test
    public void getFrameTime() {
        data = new TSharkData("\"8\",\"1.774700000\",\"TCP\",\"6\",\"192.168.68.126\",\"52.114.159.112\",\"55358\",\"443\",,");
        assertEquals("Frame Time", "1.774700000", data.getFrameTime());
        data = new TSharkData("\"5\",\"1.436394000\",\"UDP\",\"17\",\"192.168.68.105\",\"192.168.68.255\",,,\"889\",\"889\"");
        assertEquals("Frame Time", "1.436394000", data.getFrameTime());
        data = new TSharkData("\"6\",\"1.536100000\",\"ARP\",,,,,,,\"");
        assertEquals("Frame Time", "1.536100000", data.getFrameTime());
        data = new TSharkData("\"9\",\"1.779635000\",\"DNS\",\"17\",\"192.168.68.126\",\"71.10.216.1\",,,\"60389\",\"53\"");
        assertEquals("Frame Time", "1.779635000", data.getFrameTime());
    }

    @Test
    public void getProtocol() {
        data = new TSharkData("\"8\",\"1.774700000\",\"TCP\",\"6\",\"192.168.68.126\",\"52.114.159.112\",\"55358\",\"443\",,");
        assertEquals("Protocol", "TCP", data.getProtocol());
        data = new TSharkData("\"5\",\"1.436394000\",\"UDP\",\"17\",\"192.168.68.105\",\"192.168.68.255\",,,\"889\",\"889\"");
        assertEquals("Protocol", "UDP", data.getProtocol());
        data = new TSharkData("\"6\",\"1.536100000\",\"ARP\",,,,,,,\"");
        assertEquals("Protocol", "ARP", data.getProtocol());
        data = new TSharkData("\"9\",\"1.779635000\",\"DNS\",\"17\",\"192.168.68.126\",\"71.10.216.1\",,,\"60389\",\"53\"");
        assertEquals("Protocol", "DNS", data.getProtocol());
    }

    @Test
    public void getProtocolID() {
        data = new TSharkData("\"8\",\"1.774700000\",\"TCP\",\"6\",\"192.168.68.126\",\"52.114.159.112\",\"55358\",\"443\",,");
        assertEquals("Protocol ID", "6", data.getProtocolID());
        data = new TSharkData("\"5\",\"1.436394000\",\"UDP\",\"17\",\"192.168.68.105\",\"192.168.68.255\",,,\"889\",\"889\"");
        assertEquals("Protocol ID", "17", data.getProtocolID());
        data = new TSharkData("\"6\",\"1.536100000\",\"ARP\",,,,,,,\"");
        assertEquals("Protocol ID", "", data.getProtocolID());
        data = new TSharkData("\"9\",\"1.779635000\",\"DNS\",\"17\",\"192.168.68.126\",\"71.10.216.1\",,,\"60389\",\"53\"");
        assertEquals("Protocol ID", "17", data.getProtocolID());
    }

    @Test
    public void getSrcIP() {
        data = new TSharkData("\"8\",\"1.774700000\",\"TCP\",\"6\",\"192.168.68.126\",\"52.114.159.112\",\"55358\",\"443\",,");
        assertEquals("Source IP", "192.168.68.126", data.getSrcIP());
        data = new TSharkData("\"5\",\"1.436394000\",\"UDP\",\"17\",\"192.168.68.105\",\"192.168.68.255\",,,\"889\",\"889\"");
        assertEquals("Source IP", "192.168.68.105", data.getSrcIP());
        data = new TSharkData("\"6\",\"1.536100000\",\"ARP\",,,,,,,\"");
        assertEquals("Source IP", "", data.getSrcIP());
        data = new TSharkData("\"9\",\"1.779635000\",\"DNS\",\"17\",\"192.168.68.126\",\"71.10.216.1\",,,\"60389\",\"53\"");
        assertEquals("Source IP", "192.168.68.126", data.getSrcIP());
    }

    @Test
    public void getSrcPort() {
        data = new TSharkData("\"8\",\"1.774700000\",\"TCP\",\"6\",\"192.168.68.126\",\"52.114.159.112\",\"55358\",\"443\",,");
        assertEquals("Source Port", "55358", data.getSrcPort());
        data = new TSharkData("\"5\",\"1.436394000\",\"UDP\",\"17\",\"192.168.68.105\",\"192.168.68.255\",,,\"889\",\"889\"");
        assertEquals("Source Port", "889", data.getSrcPort());
        data = new TSharkData("\"6\",\"1.536100000\",\"ARP\",,,,,,,\"");
        assertEquals("Source Port", "", data.getSrcPort());
        data = new TSharkData("\"9\",\"1.779635000\",\"DNS\",\"17\",\"192.168.68.126\",\"71.10.216.1\",,,\"60389\",\"53\"");
        assertEquals("Source Port", "60389", data.getSrcPort());
    }

    @Test
    public void getDstIP() {
        data = new TSharkData("\"8\",\"1.774700000\",\"TCP\",\"6\",\"192.168.68.126\",\"52.114.159.112\",\"55358\",\"443\",,");
        assertEquals("Destination IP", "52.114.159.112", data.getDstIP());
        data = new TSharkData("\"5\",\"1.436394000\",\"UDP\",\"17\",\"192.168.68.105\",\"192.168.68.255\",,,\"889\",\"889\"");
        assertEquals("Destination IP", "192.168.68.255", data.getDstIP());
        data = new TSharkData("\"6\",\"1.536100000\",\"ARP\",,,,,,,\"");
        assertEquals("Destination IP", "", data.getDstIP());
        data = new TSharkData("\"9\",\"1.779635000\",\"DNS\",\"17\",\"192.168.68.126\",\"71.10.216.1\",,,\"60389\",\"53\"");
        assertEquals("Destination IP", "71.10.216.1", data.getDstIP());
    }

    @Test
    public void getDstPort() {
        data = new TSharkData("\"8\",\"1.774700000\",\"TCP\",\"6\",\"192.168.68.126\",\"52.114.159.112\",\"55358\",\"443\",,");
        assertEquals("Destination Port", "443", data.getDstPort());
        data = new TSharkData("\"5\",\"1.436394000\",\"UDP\",\"17\",\"192.168.68.105\",\"192.168.68.255\",,,\"889\",\"889\"");
        assertEquals("Destination Port", "889", data.getDstPort());
        data = new TSharkData("\"6\",\"1.536100000\",\"ARP\",,,,,,,\"");
        assertEquals("Destination Port", "", data.getDstPort());
        data = new TSharkData("\"9\",\"1.779635000\",\"DNS\",\"17\",\"192.168.68.126\",\"71.10.216.1\",,,\"60389\",\"53\"");
        assertEquals("Destination Port", "53", data.getDstPort());
    }
}