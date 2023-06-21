package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/3/27 10:50
 */
@Getter
@Setter
public class Options {
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
}
