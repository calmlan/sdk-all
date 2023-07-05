package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/5 13:26
 * @version 1.0
 */
@Getter
@Setter
public class SellerOfferCriteria {
    /**
     * offers
     */
    @JsonProperty("offers")
    private List<Offers> offers;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
}
