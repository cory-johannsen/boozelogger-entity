package boozelogger.entity;

import javax.persistence.*;
import java.util.ArrayList;
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
    private DistillationLog distillationLog;

    public Distillation() {
        this(null, null, new ArrayList<Vessel>(), new DistillationLog(), new Date());
    }

    public Distillation(Integer id, Ferment ferment, List<Vessel> vessels, DistillationLog distillationLog, Date createdAt) {
        this.id = id;
        this.ferment = ferment;
        this.vessels = vessels;
        this.distillationLog = distillationLog;
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

    @OneToOne
    @JoinColumn(name = "distillation_log_id")
    public DistillationLog getDistillationLog() {
        return distillationLog;
    }

    public void setDistillationLog(DistillationLog distillationLog) {
        this.distillationLog = distillationLog;
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
