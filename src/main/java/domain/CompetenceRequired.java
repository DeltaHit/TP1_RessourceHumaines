package domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "ta_competence_required")
@IdClass(CompetenceRequiredId.class)
public class CompetenceRequired implements Serializable {
    
    
    @JoinColumn(name = "id_emploi")
    @Column(insertable = false, updatable = false)
    private int id_emploi;
    public int getId_emploi()               { return id_emploi; }
    public void setId_emploi(int id_emploi) { this.id_emploi = id_emploi; }
    
    
    @JoinColumn(name = "id_competence")
    @Column(insertable = false, updatable = false)
    private int id_competence;
    public int getId_competence()                   { return id_competence; }
    public void setId_competence(int id_competence) { this.id_competence = id_competence; }
    
    @ManyToOne
    @JoinColumn(name = "id_emploi", insertable = false)
    private Emploi emploi;
    public Emploi getEmploi() { return emploi; }
    public void setEmploi(Emploi emploi) {
        
        this.emploi = emploi;
        id_emploi = emploi.getId();
    }
    
    @ManyToOne
    @JoinColumn(name = "id_competence", insertable = false)
    private Competence competence;
    public Competence getCompetence() { return competence; }
    public void setCompetence(Competence competence) {
        
        this.competence = competence;
        id_competence = competence.getId();
    }
    
    
    @Id
    @Column(name = "level")
    private int level; // Ex : "H18", "A19", "E19"
    public int getLevel()           { return level; }
    public void setLevel(int level) { this.level = level; }
    
    
    // ************************************************************************
    
    
    public CompetenceRequired() {
        
        this.emploi = new Emploi();
        this.competence = new Competence();
        this.level = 0;
    }
    
    public CompetenceRequired(Emploi emploi, Competence competence, int level) {
        
        this.id_emploi = emploi.getId();
        this.id_competence = competence.getId();
        this.emploi = emploi;
        this.competence = competence;
        this.level = level;
    }
    
    // ************************************************************************
    
    
    @Override
    public boolean equals(Object o) {
        
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompetenceRequired competenceAcquired = (CompetenceRequired) o;
        return getId_emploi() == competenceAcquired.getId_emploi() && getId_competence() == competenceAcquired.getId_competence();
    }
    
    @Override
    public int hashCode() { return Objects.hash(getId_emploi(), getId_competence(), level); }
    
    @Override
    public String toString() {
        
        return "CompetenceRequired{" + "id_term=" + level + ", id_emploi=" + emploi + ", id_competence=" + competence + '}';
    }
}
