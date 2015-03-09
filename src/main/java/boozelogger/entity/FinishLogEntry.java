package boozelogger.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

/**
 * User: cjohannsen
 * Date: 4/30/14
 * Time: 10:56 AM
 */
@Entity
@Table(name = "finish_log_entry")
public class FinishLogEntry extends LogEntry {

    private FinishLog finishLog;
    private String flavor;
    private String color;

    public FinishLogEntry() {
        this(null, null, null, null, null, null, null);
    }

    public FinishLogEntry(Long id, FinishLog finishLog, Double temperature, String notes, Date createdAt, String flavor, String color) {
        super(id, temperature, notes, createdAt);
        this.flavor = flavor;
        this.color = color;
        this.finishLog = finishLog;
    }

    @Column(name="flavor")
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Column(name="color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @ManyToOne
    public FinishLog getFinishLog() {
        return finishLog;
    }

    public void setFinishLog(FinishLog finishLog) {
        this.finishLog = finishLog;
    }
}
