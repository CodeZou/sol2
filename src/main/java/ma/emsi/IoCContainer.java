package ma.emsi;
import java.util.HashMap;
import java.util.Map;
public class IoCContainer {
    // Map pour stocker les instances de services
    private Map<Class<?>, Object> services = new HashMap<>();

    // Méthode pour enregistrer un service
    public <T> void registerService(Class<T> serviceClass, T serviceInstance) {
        services.put(serviceClass, serviceInstance);
    }

    // Méthode pour récupérer un service
    public <T> T getService(Class<T> serviceClass) {
        return serviceClass.cast(services.get(serviceClass));
    }
}
