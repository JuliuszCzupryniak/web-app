package webapp.webapp.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "category")
public class Category {
    @Id
    @Column(name = "id_category")
    private int id_category;
    @Column(name = "name_category")
    private String name_category;
    @Column(name = "image_category")
    private byte[] image_catgeory;

    public Category() {
    }

    public Category(int id_category, String name_category, byte[] image_catgeory) {
        this.id_category = id_category;
        this.name_category = name_category;
        this.image_catgeory = image_catgeory;
    }

    public int getId_category() {
        return id_category;
    }

    public void setId_category(int id_category) {
        this.id_category = id_category;
    }

    public String getName_category() {
        return name_category;
    }

    public void setName_category(String name_category) {
        this.name_category = name_category;
    }

    public byte[] getImage_catgeory() {
        return image_catgeory;
    }

    public void setImage_catgeory(byte[] image_catgeory) {
        this.image_catgeory = image_catgeory;
    }
}
