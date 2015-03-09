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

    private FermentLog fermentLog;
    private Double specificGravity;

    public FermentLogEntry() {
        this(null, null, null, null, null, new Date());
    }

    public FermentLogEntry(Integer id, FermentLog fermentLog, Double temperature, String notes, Double specificGravity, Date createdAt) {
        super(id, temperature, notes, createdAt);
        this.specificGravity = specificGravity;
    }

    @Column(name = "specific_gravity", columnDefinition = "numeric")
    public Double getSpecificGravity() {
        return specificGravity;
    }

    @ManyToOne
    public void setSpecificGravity(Double specificGravity) {
        this.specificGravity = specificGravity;
    }

    @ManyToOne
    public FermentLog getFermentLog() {
        return fermentLog;
    }

    public void setFermentLog(FermentLog fermentLog) {
        this.fermentLog = fermentLog;
    }
}
