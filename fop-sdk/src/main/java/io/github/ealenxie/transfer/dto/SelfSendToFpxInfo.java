package io.github.ealenxie.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 12:40
 */
@Getter
@Setter
public class SelfSendToFpxInfo {
    @JsonProperty("bookingEarliestTime")
    private String bookingEarliestTime;
    @JsonProperty("bookingLatestTime")
    private String bookingLatestTime;
}
