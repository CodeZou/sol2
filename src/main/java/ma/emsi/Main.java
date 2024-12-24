package ma.emsi;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IoCContainer container = new IoCContainer();

        // Enregistrement des services dans le conteneur
        container.registerService(EmailService.class, new EmailService());
        container.registerService(SMSService.class, new SMSService());

        // Récupération et injection du service email
        NotificationService emailService = container.getService(EmailService.class);
        EmployeeManager emailManager = new EmployeeManager(emailService);

        // Test avec le service email
        Employee employee = new Employee("Alice", "En formation");
        emailManager.changeEmployeeStatus(employee, "Employé actif");

        // Récupération et injection du service SMS
        NotificationService smsService = container.getService(SMSService.class);
        EmployeeManager smsManager = new EmployeeManager(smsService);

        // Test avec le service SMS
        smsManager.changeEmployeeStatus(employee, "En réunion");


    }
}