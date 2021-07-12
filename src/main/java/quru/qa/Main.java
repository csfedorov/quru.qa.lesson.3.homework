package quru.qa;

/**
 * Created by Konstantin Fedorov on 12.07.2021.
 */
public class Main {
    public static void main(String[] args) {
        Server marvelNodeServer = new Server("marvel-node-1", 8, 32, 512, 4000);
        Server dcNodeServe = new Server("dc-node-1", 4, 16, 256, 3000);

        marvelNodeServer.powerOn();

        dcNodeServe.setCpuCount(8);
        dcNodeServe.setRamGb(16);
        dcNodeServe.setSsdGb(512);
        dcNodeServe.powerOn();

        marvelNodeServer.addService("yandex-site");
        marvelNodeServer.addService("yandex-market-service");
        dcNodeServe.addService("google-site");
        dcNodeServe.addService("google-play-market-service");

        System.out.println(marvelNodeServer);
        System.out.println(dcNodeServe);
    }
}
