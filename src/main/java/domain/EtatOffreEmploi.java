package domain;


import utils.IdInterface;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "etat_offre_emploi")
public class EtatOffreEmploi  implements IdInterface {
    
    @Id
    @Column(name = "id_etat_offre_emploi")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    public int getId()        { return id; }
    public void setId(int id) { this.id = id; }
    
    @Column(name = "name") String name;
    public String getName()          { return name; }
    public void setName(String name) { this.name = name; }
    
    @Column(name = "description") String description;
    public String getDescription()                 { return description; }
    public void setDescription(String description) { this.description = description; }
    
    // ************************************************************************
    
    public EtatOffreEmploi() {}
    
    public EtatOffreEmploi(String name, String description) {
        
        this.name = name;
        this.description = description;
    }
    public EtatOffreEmploi(int id, String name, String description) {
        
        this.id = id;
        this.name = name;
        this.description = description;
    }
    
    // ************************************************************************
    
    @Override
    public boolean equals(Object o) {
        
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EtatOffreEmploi that = (EtatOffreEmploi) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(description, that.description);
    }
    @Override
    public int hashCode() { return Objects.hash(id, name, description); }
    
    @Override
    public String toString() {
        
        return "EtatOffreEmploi{" + "id=" + id + ", name='" + name + '\'' + ", description='" + description + '\'' + '}';
    }
}
