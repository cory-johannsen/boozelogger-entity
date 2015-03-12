package boozelogger.entity;


import javax.persistence.*;
import java.util.Date;

/**
 * User: cjohannsen
 * Date: 4/30/14
 * Time: 10:56 AM
 */
@Entity
@Table(name="vessel")
public class Vessel {

    private Long id;
    private String name;
    private String description;
    private Double volume;
    private UnitOfMeasurement unit;
    private Date createdAt;

    public Vessel() {
        this(null, null, null, null, null, new Date());
    }

    public Vessel(Long id, String name, String description, Double volume, UnitOfMeasurement unit, Date createdAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.volume = volume;
        this.unit = unit;
        this.createdAt = createdAt;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name="volume", columnDefinition = "numeric")
    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Enumerated(EnumType.STRING)
    @Column(name="unit")
    public UnitOfMeasurement getUnit() {
        return unit;
    }

    public void setUnit(UnitOfMeasurement unit) {
        this.unit = unit;
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
