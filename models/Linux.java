package models;

public class Linux extends OperatingSystem{

    private String desktopEnvironmentName;

    public Linux(String name, String version, String desktopEnvironmentName) {
        super(name, version);
        this.desktopEnvironmentName = desktopEnvironmentName;
    }

}
