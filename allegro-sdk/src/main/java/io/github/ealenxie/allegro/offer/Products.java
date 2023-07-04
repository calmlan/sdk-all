package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/4 10:37
 */
@NoArgsConstructor
@Data
public class Products {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * description
     */
    @JsonProperty("description")
    private Description description;
    /**
     * category
     */
    @JsonProperty("category")
    private ProductsCategory category;
    /**
     * images
     */
    @JsonProperty("images")
    private List<Images> images;
    /**
     * parameters
     */
    @JsonProperty("parameters")
    private List<ProductsParameters> parameters;
    /**
     * isDraft
     */
    @JsonProperty("isDraft")
    private Boolean isDraft;
}
