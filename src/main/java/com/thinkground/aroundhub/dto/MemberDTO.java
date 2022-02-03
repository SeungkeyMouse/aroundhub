package com.thinkground.aroundhub.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDTO {
    private String name;
    private String email;
    private String organization;

    public MemberDTO(String name, String email, String organization) {
        this.name = name;
        this.email = email;
        this.organization = organization;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", organization='" + organization + '\'' +
                '}';
    }
}
