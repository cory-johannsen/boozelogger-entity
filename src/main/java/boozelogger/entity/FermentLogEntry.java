package boozelogger.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * User: cjohannsen
 * Date: 4/30/14
 * Time: 10:55 AM
 */
@Entity
@Table(name = "ferment_log_entry")
public class FermentLogEntry extends LogEntry {

    private Double specificGravity;

    public FermentLogEntry() {
        this(null, null, null, null, null);
    }

    public FermentLogEntry(Integer id, Double temperature, String notes, Date createdAt, Double specificGravity) {
        super(id, temperature, notes, createdAt);
        this.specificGravity = specificGravity;
    }

    @Column(name = "specific_gravity", columnDefinition = "numeric")
    public Double getSpecificGravity() {
        return specificGravity;
    }

    public void setSpecificGravity(Double specificGravity) {
        this.specificGravity = specificGravity;
    }
}
