package pl.sda.java5;

import org.glassfish.jersey.server.ResourceConfig;

public class Konfiguracja extends ResourceConfig {
    public Konfiguracja() {
        register(Kalkulator.class);
    }
}
