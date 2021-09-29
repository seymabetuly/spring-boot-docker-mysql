package com.example.demo.request_response;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberRequest {
    @ApiModelProperty(notes = "Member ID")
    private int id;

    @ApiModelProperty(notes = "Name of the member")
    private String name;

    @ApiModelProperty(notes = "Surname of the member")
    private String surname;

    @ApiModelProperty(notes = "Identity number of the member")
    private int identityNo;
}
