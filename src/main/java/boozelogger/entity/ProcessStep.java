package boozelogger.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * User: cjohannsen
 * Date: 5/1/14
 * Time: 8:04 AM
 */
@Entity
@Table(name="process_step")
public class ProcessStep {

    private Long id;
    private String name;
    private String description;
    private Date createdAt;

    public ProcessStep() {
        this(null, null, null, new Date());
    }

    public ProcessStep(Long id, String name, String description, Date createdAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = new Date();
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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_at")
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
