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
@Table(name = "distillation_log_entry")
public class DistillationLogEntry extends LogEntry {

    private Double abv;
    private Double volume;
    private UnitOfMeasurement unit;

    public DistillationLogEntry() {
        this(null, null, null, null, null, null, null);
    }

    public DistillationLogEntry(Integer id, Double temperature, String notes, Date createdAt, Double abv, Double volume, UnitOfMeasurement unit) {
        super(id, temperature, notes, createdAt);
        this.abv = abv;
        this.volume = volume;
        this.unit = unit;
    }

    @Column(name = "abv", columnDefinition = "numeric")
    public Double getAbv() {
        return abv;
    }

    public void setAbv(Double abv) {
        this.abv = abv;
    }

    @Column(name = "volume", columnDefinition = "numeric")
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
}
