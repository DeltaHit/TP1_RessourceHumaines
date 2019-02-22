package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "type_emploi")
public class TypeEmploi {
    
    @Id
    @Column(name = "id_type_emploi")
    private int id;
    public int getId()        { return id; }
    public void setId(int id) { this.id = id; }
    
    @Column(name = "name") String name;
    public String getName()          { return name; }
    public void setName(String name) { this.name = name; }
    
    @Column(name = "description") String description;
    public String getDescription()                 { return description; }
    public void setDescription(String description) { this.description = description; }
    
    
}
