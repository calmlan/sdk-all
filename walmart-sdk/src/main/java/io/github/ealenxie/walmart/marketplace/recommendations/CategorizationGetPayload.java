package io.github.ealenxie.walmart.marketplace.recommendations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 12:20
 */
@NoArgsConstructor
@Data
public class CategorizationGetPayload {

    /**
     * categorizationType
     */
    @JsonProperty("categorizationType")
    private String categorizationType;
    /**
     * meta
     */
    @JsonProperty("meta")
    private Meta meta;
    /**
     * filterCriteria
     */
    @JsonProperty("filterCriteria")
    private FilterCriteria filterCriteria;
}
