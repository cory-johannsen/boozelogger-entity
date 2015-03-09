package boozelogger.entity;

import javax.persistence.*;
import java.util.*;

/**
 * User: cjohannsen
 * Date: 4/30/14
 * Time: 10:50 AM
 */
@Entity
@Table(name="recipe")
public class Recipe {

    private Long id;
    private String name;
    private RecipeType recipeType;
    private Date createdAt;
    private Set<RecipeComponent> components;
    private Process process;

    public Recipe() {
        this(null, null, null, null, new HashSet<RecipeComponent>(), null);
    }

    public Recipe(String name, RecipeType recipeType) {
        this(null, name, recipeType, null, null, null);
    }

    public Recipe(String name, RecipeType recipeType, Set<RecipeComponent> components, Process process) {
        this(null, name, recipeType, null, components, process);
    }

    public Recipe(Long id, String name, RecipeType recipeType, Date createdAt, Set<RecipeComponent> components, Process process) {
        this.id = id;
        this.name = name;
        this.recipeType = recipeType;
        this.createdAt = createdAt;
        this.components = components;
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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_at")
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @OneToMany(fetch=FetchType.EAGER)
    @JoinColumn(name = "recipe_id")
    public Set<RecipeComponent> getComponents() {
        return components;
    }

    public void setComponents(Set<RecipeComponent> components) {
        this.components = components;
    }

    @Enumerated(EnumType.STRING)
    @Column(name="type")
    public RecipeType getRecipeType() {
        return recipeType;
    }

    public void setRecipeType(RecipeType recipeType) {
        this.recipeType = recipeType;
    }

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "process_id")
    public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }
}
