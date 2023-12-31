package com.tb.domain.yida.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ThirdShipSchedulingDto {

    private Date date;
    private String process;
    private String docNo;
    private String pNo;
    private String pName;
    private String priority;
    private Integer planNum;
    private String team;
    private Integer finish1;
    private Integer finish2;
    private Integer finish3;
    private Integer totalFinish;
    private Integer equipment;
    private Integer person;
    private Integer totalHours;
    private String mark;
    private String status;
    private String formInstId;
}
