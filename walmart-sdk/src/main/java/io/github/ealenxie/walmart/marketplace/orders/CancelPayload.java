package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/6 10:20
 */
@NoArgsConstructor
@Data
public class CancelPayload {


    /**
     * orderCancellation
     */
    @JsonProperty("orderCancellation")
    private OrderCancellation orderCancellation;
}
