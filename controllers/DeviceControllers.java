package controllers;

import java.util.ArrayList;
import java.util.List;
import models.*;

public class DeviceControllers {

    private List<Device> records;

    public DeviceControllers() {
        this.records = new ArrayList<>();
    }

    public List<Device> getDaftar() {
        return this.records;
    }

    public void tambah(String owner) {
        records.add(new Device(owner));
    }
}
