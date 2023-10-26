package global.jupiter.finalproject.model;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity                     // jpa
@Table(name = "library")    // jpa
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Library {

    // primary key 자동생성 전략 설정
    // auto, identity(mariadb), sequence(old oracle), table
    @Id // pk, jpa
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // jpa
    private Long lbno;


    @NotBlank(message = "도서관명은 필수입니다.") // validation, 문자열0, 공백 체크
    private String lbname;
    private String sido;
    private String gugun;
    private String lbtype;
    private String clsday;
    private String addr;
    private String phone;
    private String homepage;
    private String lat;
    private String lon;



    @CreatedDate    // jpa, 레코드 생성시 해댕값, 자동입력
    @Column(insertable = false, updatable = false) // 입력, 수정시 해당 컬럼 제외하고 sql문 생성
    private LocalDateTime regdata;

}
