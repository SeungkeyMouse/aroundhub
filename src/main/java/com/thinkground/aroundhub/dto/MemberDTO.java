package com.thinkground.aroundhub.dto;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {
    private String name;
    private String email;
    private String organization;

  /*  public MemberDTO(String name, String email, String organization) {
        this.name = name;
        this.email = email;
        this.organization = organization;
    }*/

}
