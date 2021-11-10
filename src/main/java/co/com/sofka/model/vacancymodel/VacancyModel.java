package co.com.sofka.model.vacancymodel;

public class VacancyModel {

    //Aquí debe ir Job Title
    private String vacancyName;
    private String hiringManager;
    private String numberPositions;
    private String description;
    //Podria hacer el Hiring Manager con un Enum

    //Setters and Getters
    public String getVacancyName() {
        return vacancyName;
    }

    public void setVacancyName() {
        this.vacancyName = generarVacantesAleatorios(1);
    }

    public String getHiringManager() {
        return hiringManager;
    }

    public void setHiringManager() {
        this.hiringManager = hiringManagerRandom(1);
    }

    public String getNumberPositions() {
        return numberPositions;
    }

    public void setNumberPositions(String numberPositions) {
        this.numberPositions = numberPositions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //Debo crear un metodo que genere nombres de vacantes aleatorios y llamarlo en el setVacancyName
    public String generarVacantesAleatorios(int cantidad) {
        String[] nameVacancyRandom = new String[cantidad];

        String[] puesto = { "Administrador", "Tecnico", "Asisitente", "Presidente", "Reclutador"};
        String[] area = { "Recursos Humanos", "Presidencia", "Bases de Datos", "Development", "Sistemas"};

        for (int i = 0; i < cantidad; i++) {
            nameVacancyRandom[i] = puesto[(int) (Math.floor(Math.random() * ((puesto.length - 1) - 0 + 1) + 0))] + " "
                    + area[(int) (Math.floor(Math.random() * ((area.length - 1) - 0 + 1) + 0))];
        }
        return nameVacancyRandom[0];
    }

    public String hiringManagerRandom(int cantidad) {
        String[] nombresAleatorios = new String[cantidad];
        String[] nombres = { "Odis Adalwin", "Peter Mac Anderson", "Purva Joshi", "Lisa Andrews"};

        for (int i = 0; i < cantidad; i++) {
            nombresAleatorios[i] = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))];
        }
        return nombresAleatorios[0];
    }




}
