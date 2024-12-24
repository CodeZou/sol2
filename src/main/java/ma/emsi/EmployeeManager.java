package ma.emsi;

public class EmployeeManager {
    private NotificationService notificationService;

    // Constructeur avec injection de dépendance
    public EmployeeManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    // Méthode pour changer le statut de l'employé et envoyer une notification
    public void changeEmployeeStatus(Employee employee, String newStatus) {
        employee.setStatus(newStatus);
        notificationService.notify(employee);
    }
}
