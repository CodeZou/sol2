package ma.emsi;

public class SMSService implements NotificationService {
    @Override
    public void notify(Employee employee) {
        System.out.println("Envoi d'un SMS à " + employee.getName() + " avec le statut : " + employee.getStatus());
    }
}
