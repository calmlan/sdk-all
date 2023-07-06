package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Money;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/6 10:03
 */
@NoArgsConstructor
@Data
public class Tax {
    /**
     * taxName
     */
    @JsonProperty("taxName")
    private String taxName;
    /**
     * taxAmount
     */
    @JsonProperty("taxAmount")
    private Money taxAmount;
}
