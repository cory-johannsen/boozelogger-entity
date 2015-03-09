package boozelogger.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * User: cjohannsen
 * Date: 5/2/14
 * Time: 8:34 AM
 */
@Entity
@Table(name="finish_log")
public class FinishLog extends Log {

    private Finish finish;
    private List<FinishLogEntry> entries;

    public FinishLog() {
        this(null, null, null, null, null, new ArrayList<FinishLogEntry>());
    }

    public FinishLog(Integer id, Finish finish, String notes, Vessel vessel, Date createdAt, List<FinishLogEntry> entries) {
        super(id, notes, vessel, createdAt);
        this.entries = entries;
        this.finish = finish;
    }

    @OneToMany
    @JoinColumn(name="finish_log_id")
    public List<FinishLogEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<FinishLogEntry> entries) {
        this.entries = entries;
    }

    @OneToOne
    @JoinColumn(name="finish_id")
    public Finish getFinish() {
        return finish;
    }

    public void setFinish(Finish finish) {
        this.finish = finish;
    }
}
