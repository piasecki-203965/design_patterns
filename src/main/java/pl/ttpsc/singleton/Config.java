package pl.ttpsc.singleton;

public class Config {

    private static Config instance;

    private Config() {
    }

    public static synchronized Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }
}
