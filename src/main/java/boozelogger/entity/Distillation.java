package boozelogger.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * User: cjohannsen
 * Date: 4/30/14
 * Time: 10:56 AM
 */
@Entity
@Table(name = "distillation")
public class Distillation {

    private Integer id;
    private Ferment ferment;
    private List<Vessel> vessels;
    private Date createdAt;

    public Distillation() {
    }

    public Distillation(Integer id, Ferment ferment, List<Vessel> vessels, Date createdAt) {
        this.id = id;
        this.ferment = ferment;
        this.vessels = vessels;
        this.createdAt = createdAt;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @OneToOne
    @JoinColumn(name = "ferment_id")
    public Ferment getFerment() {
        return ferment;
    }

    public void setFerment(Ferment ferment) {
        this.ferment = ferment;
    }

    @OneToMany
    @JoinTable(
            name="distillation_vessel",
            joinColumns={ @JoinColumn(name="distillation_id", referencedColumnName="id") },
            inverseJoinColumns={ @JoinColumn(name="vessel_id", referencedColumnName="id") }
    )

    public List<Vessel> getVessels() {
        return vessels;
    }

    public void setVessels(List<Vessel> vessel) {
        this.vessels = vessel;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_at")
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
