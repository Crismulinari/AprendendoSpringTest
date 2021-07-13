package com.onedigitalinnovation.personapi.entity;


import com.onedigitalinnovation.personapi.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    private long id;

    private PhoneType type;

    private String number;

}
