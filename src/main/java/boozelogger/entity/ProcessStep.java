package boozelogger.entity;

import javax.persistence.*;

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
    private Process process;

    public ProcessStep() {
        this(null, null, null, null);
    }

    public ProcessStep(Long id, String name, String description, Process process) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.process = process;
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

    @ManyToOne
    @JoinColumn(name="process_id")
    public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }
}
