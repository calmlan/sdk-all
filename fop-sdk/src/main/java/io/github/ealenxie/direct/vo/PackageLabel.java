package io.github.ealenxie.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 16:50
 */
@Getter
@Setter
public class PackageLabel {


    @JsonProperty("containerNo")
    private String containerNo;
    @JsonProperty("labelUrl")
    private String labelUrl;
}
