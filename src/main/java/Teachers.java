import java.time.LocalDate;

public class Teachers {
    private String name;
    private String surname;
    private LocalDate startMuqavile;
    private LocalDate  endMuqavile;

    public Teachers(String name, String surname, LocalDate startMuqavile, LocalDate endMuqavile) {
        this.name = name;
        this.surname = surname;
        this.startMuqavile = startMuqavile;
        this.endMuqavile = endMuqavile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getStartMuqavile() {
        return startMuqavile;
    }

    public void setStartMuqavile(LocalDate startMuqavile) {
        this.startMuqavile = startMuqavile;
    }

    public LocalDate getEndMuqavile() {
        return endMuqavile;
    }

    public void setEndMuqavile(LocalDate endMuqavile) {
        this.endMuqavile = endMuqavile;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", startMuqavile=" + startMuqavile +
                ", endMuqavile=" + endMuqavile +
                '}';
    }
}
