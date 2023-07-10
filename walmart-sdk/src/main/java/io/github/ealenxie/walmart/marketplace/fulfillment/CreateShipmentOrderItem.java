package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/10 14:06
 */
@NoArgsConstructor
@Data
public class CreateShipmentOrderItem {
    /**
     * productId
     */
    @JsonProperty("productId")
    private String productId;
    /**
     * productType
     */
    @JsonProperty("productType")
    private String productType;
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * itemDesc
     */
    @JsonProperty("itemDesc")
    private String itemDesc;
    /**
     * itemQty
     */
    @JsonProperty("itemQty")
    private Integer itemQty;
    /**
     * vendorPackQty
     */
    @JsonProperty("vendorPackQty")
    private Integer vendorPackQty;
    /**
     * innerPackQty
     */
    @JsonProperty("innerPackQty")
    private Integer innerPackQty;
    /**
     * expectedDeliveryDate
     */
    @JsonProperty("expectedDeliveryDate")
    private String expectedDeliveryDate;
}
