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
@Table(name="distillation_log")
public class DistillationLog extends Log {

    private Distillation distillation;
    private List<DistillationLogEntry> entries;

    public DistillationLog() {
        this(null, null, null, null, new Date(), new ArrayList<DistillationLogEntry>());
    }

    public DistillationLog(Long id, Distillation distillation, String notes, Vessel vessel, Date createdAt, List<DistillationLogEntry> entries) {
        super(id, notes, vessel, createdAt);
        this.distillation = distillation;
        this.entries = entries;
    }

    @OneToOne(mappedBy = "distillationLog")
    public Distillation getDistillation() {
        return distillation;
    }

    public void setDistillation(Distillation distillation) {
        this.distillation = distillation;
    }

    @OneToMany
    @JoinColumn(name="distillation_log_id")
    @OrderBy("id ASC")
    public List<DistillationLogEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<DistillationLogEntry> entries) {
        this.entries = entries;
    }
}
