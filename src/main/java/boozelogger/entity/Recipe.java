package boozelogger.entity;

import javax.persistence.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * User: cjohannsen
 * Date: 4/30/14
 * Time: 10:50 AM
 */
@Entity
@Table(name="recipe")
public class Recipe {

    private Integer id;
    private String name;
    private RecipeType recipeType;
    private Date createdAt;
    private List<RecipeComponent> components;
    private Process process;

    public Recipe() {
        this(null, null, null, null, new ArrayList<RecipeComponent>(), null);
    }

    public Recipe(String name, RecipeType recipeType) {
        this(null, name, recipeType, null, null, null);
    }

    public Recipe(String name, RecipeType recipeType, List<RecipeComponent> components, Process process) {
        this(null, name, recipeType, null, components, process);
    }

    public Recipe(Integer id, String name, RecipeType recipeType, Date createdAt, List<RecipeComponent> components, Process process) {
        this.id = id;
        this.name = name;
        this.recipeType = recipeType;
        this.createdAt = createdAt;
        this.components = components;
        this.process = process;
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

    @OneToMany(fetch=FetchType.EAGER)
    @JoinColumn(name = "recipe_id")
    public List<RecipeComponent> getComponents() {
        return components;
    }

    public void setComponents(List<RecipeComponent> components) {
        this.components = components;
    }

    @Enumerated(EnumType.STRING)
    @Column(name="recipeType")
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
