package quru.qa;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Konstantin Fedorov on 12.07.2021.
 */
public class Server {
    String name;
    int cpuCount;
    int ramGb;
    int ssdGb;
    int hddGb;
    List<String> services;
    boolean power;

    public Server(String name, int cpuCount, int ramGb, int ssdGb, int hddGb) {
        this.name = name;
        this.cpuCount = cpuCount;
        this.ramGb = ramGb;
        this.ssdGb = ssdGb;
        this.hddGb = hddGb;
        this.services = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCpuCount() {
        return cpuCount;
    }

    public void setCpuCount(int cpuCount) {
        this.cpuCount = cpuCount;
    }

    public int getRamGb() {
        return ramGb;
    }

    public void setRamGb(int ramGb) {
        this.ramGb = ramGb;
    }

    public int getSsdGb() {
        return ssdGb;
    }

    public void setSsdGb(int ssdGb) {
        this.ssdGb = ssdGb;
    }

    public int getHddGb() {
        return hddGb;
    }

    public void setHddGb(int hddGb) {
        this.hddGb = hddGb;
    }

    public boolean isPower() {
        return power;
    }

    public List<String> getServices() {
        return services;
    }

    public void addService(String servicesName) {
        services.add(servicesName);
    }

    public void powerOn() {
        this.power = true;
    }

    public void powerOff() {
        this.power = false;
    }

    @Override
    public String toString() {
        return "Server {" +
                "name='" + name + '\'' +
                ", cpuCount=" + cpuCount +
                ", ramGb=" + ramGb +
                ", ssdGb=" + ssdGb +
                ", hddGb=" + hddGb +
                ", services=" + services +
                ", power=" + power +
                '}';
    }
}
