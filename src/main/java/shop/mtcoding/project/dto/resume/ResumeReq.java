package shop.mtcoding.project.dto.resume;

import java.sql.Timestamp;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class ResumeReq {
    @Getter
    @Setter
    @ToString
    public static class ResumeWriteReqDto {
        private Integer resumeId; // 리턴용
        
        private Integer userId;
        @NotNull(message = "제목을 입력해주세요")
        private String title;
        private String content;
        @NotNull(message = "학력 사항을 선택해주세요")
        private String education;
        @NotNull(message = "경력 사항을 선택해주세요")
        private String career;
        private String link;
        @NotNull(message = "공개여부를 선택해주세요")
        private Integer state;
        private Timestamp createdAt;
        @NotEmpty(message = "기술을 선택해주세요")  
        private List<String> skillList;


    }

    @Getter
    @Setter
    @ToString
    public static class ResumeUpdateReqDto {
        private Integer resumeId; // 리턴용
        private Integer userId;
        private String title;
        private String content;
        private String education;
        private String career;
        private String link;
        private Integer state;
        private Timestamp createdAt;
        private List<String> skillList;
    }

    @Getter
    @Setter
    @ToString
    public static class ResumeCheckboxReqDto {
        private List<String> address;
        private List<String> skillList;
        private String career;
    }
}
