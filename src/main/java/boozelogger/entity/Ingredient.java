package boozelogger.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * User: cjohannsen
 * Date: 4/30/14
 * Time: 10:53 AM
 */
@Entity
@Table(name="ingredient")
public class Ingredient {

    private Integer id;
    private String name;
    private Date createdAt;

    public Ingredient() {
        this(null, null, null);
    }

    public Ingredient(String name) {
        this(null, name, new Date());
    }

    public Ingredient(Integer id, String name, Date createdAt) {
        this.id = id;
        this.name = name;
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

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
