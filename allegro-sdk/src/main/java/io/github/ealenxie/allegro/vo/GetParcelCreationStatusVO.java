package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jadechiang
 * @since 2023/3/28 9:39
 */
@Getter
@Setter
public class GetParcelCreationStatusVO {
    @JsonProperty("id")
    private String id;
    @JsonProperty("parcelId")
    private String parcelId;
    @JsonProperty("status")
    private String status;
    @JsonProperty("errors")
    private List<Error> errors;
}
