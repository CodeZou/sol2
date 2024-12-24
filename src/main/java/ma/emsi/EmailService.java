package ma.emsi;

public class EmailService implements NotificationService {

    public void notify(Employee employee) {
        System.out.println("Envoi d'un email à " + employee.getName() + " avec le statut : " + employee.getStatus());
    }
}
