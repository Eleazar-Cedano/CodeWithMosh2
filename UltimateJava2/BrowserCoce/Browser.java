package UltimateJava2.BrowserCoce;

public class Browser {
    public void navigate(String address){
    String ip = findIpAddress(address);
    String html =sendHttpRequest(ip);
        System.out.println(html);
    } // ends navigate()

    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }

    private String findIpAddress(String address) {
        return "127.0.0.1";
    }

} // ends Browser() Class
