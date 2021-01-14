package webapp.webapp.dtos;

import lombok.Data;

@Data
public class CategoryRequest {
    private int id_category;
    private String name_category;
    private byte[] image_catgeory;
}
