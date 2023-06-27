package io.github.ealenxie.goodcang.assistant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/27 10:22
 */
@Getter
@Setter
public class HandleInfo {
    /**
     * 回复结果信息
     */
    @JsonProperty("result")
    private String result;
    /**
     * 回复附件
     */
    @JsonProperty("attachment_file_list")
    private List<AttachmentFile> attachmentFileList;
}
