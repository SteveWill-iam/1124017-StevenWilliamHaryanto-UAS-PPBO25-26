package models;

public abstract class OperatingSystem {

    private String name;
    private String version;

    public OperatingSystem(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public abstract String getBootInfo();
}
