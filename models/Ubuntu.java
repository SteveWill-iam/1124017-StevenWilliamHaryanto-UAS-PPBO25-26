package models;

public class Ubuntu extends Linux {

    public Ubuntu(String name, String version, String desktopEnvironmentName) {
        super(name, version, desktopEnvironmentName);
    }

    @Override
    public String getBootInfo() {
        return "Ubuntu " + this.version;
    }

}
