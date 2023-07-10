package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 13:36
 */
@NoArgsConstructor
@Data
public class FetchOrderPromiseOptionsPayload {


    /**
     * requestId
     */
    @JsonProperty("requestId")
    private String requestId;
    /**
     * destinations
     */
    @JsonProperty("destinations")
    private List<Destination> destinations;
    /**
     * offerSelections
     */
    @JsonProperty("offerSelections")
    private List<OfferSelection> offerSelections;
}
