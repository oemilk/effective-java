package chapter02.item01;

import java.util.HashMap;
import java.util.Map;

public class Services {

    // Maps service name to services
    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    private static final Map<String, Provider> providers = new HashMap<>();

    // prevents instantiation
    private Services() {
    }

    public static void registerDefaultProvider(Provider provider) {
        registerProvider(DEFAULT_PROVIDER_NAME, provider);
    }

    public static void registerProvider(String name, Provider provider) {
        providers.put(name, provider);
    }

    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    public static Service newInstance(String name) {
        Provider provider = providers.get(name);
        if (provider == null) {
            throw new IllegalArgumentException("No provider registered with name : " + name);
        }
        return provider.newService();
    }

}
