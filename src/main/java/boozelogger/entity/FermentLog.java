package boozelogger.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * User: cjohannsen
 * Date: 5/2/14
 * Time: 8:27 AM
 */
@Entity
@Table(name="ferment_log")
public class FermentLog extends Log {

    private List<FermentLogEntry> entries;

    public FermentLog() {
        this(null, null, null, null, new ArrayList<FermentLogEntry>());
    }

    public FermentLog(Integer id, String notes, Vessel vessel, Date createdAt, List<FermentLogEntry> entries) {
        super(id, notes, vessel, createdAt);
        this.entries = entries;
    }

    @OneToMany
    @JoinColumn(name="ferment_log_id")
    public List<FermentLogEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<FermentLogEntry> entries) {
        this.entries = entries;
    }
}
