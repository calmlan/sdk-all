package io.github.ealenxie.common.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/2/28 23:15
 */
@Getter
@Setter
public class DeclareProductList {

    @JsonProperty("declare_product_list")
    private List<DeclareProduct> declareProducts;
}
