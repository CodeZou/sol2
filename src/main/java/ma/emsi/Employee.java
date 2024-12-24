package ma.emsi;

public class Employee {
    private String name;
    private String status;

    // Constructeur
    public Employee(String name, String status) {
        this.name = name;
        this.status = status;
    }

    // Méthode pour obtenir le nom
    public String getName() {
        return name;
    }

    // Méthode pour obtenir le statut
    public String getStatus() {
        return status;
    }

    // Méthode pour modifier le statut
    public void setStatus(String status) {
        this.status = status;
    }
}
