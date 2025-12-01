package controllers;

import java.util.ArrayList;
import java.util.List;
import models.*;

public class OperatingSystemControllers {

    private List<OperatingSystem> records;

    public OperatingSystemControllers() {
        this.records = new ArrayList<>();
    }

    public List<OperatingSystem> getDaftar() {
        return this.records;
    }

    public void tambahW(String name, String version) {
        records.add(new Windows(name, version));
    }

    public void tambahU(String name, String version, String desktopEnvironmentName) {
        records.add(new Ubuntu(name, version, desktopEnvironmentName));
    }

    public void tambahL(String name, String version, String desktopEnvironmentName) {
        records.add(new Linux(name, version, desktopEnvironmentName));
    }
}
