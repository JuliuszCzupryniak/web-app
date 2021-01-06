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
}
