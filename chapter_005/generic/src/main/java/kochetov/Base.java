package kochetov;

/**
 * Class Base.
 * Created by Сергей on 05.04.2017.
 */
public abstract class Base {
    /**
     * Id of base.
     */
    private String id;
    /**
     * Get id of item.
     * @return id.
     */
    public String getId() {
        return this.id;
    }
    /**
     * Set if of item.
     * @param id id to set.
     */
    public void setId(String id) {
        this.id = id;
    }
}
