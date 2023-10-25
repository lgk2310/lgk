package cn.lgk.entity;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Data
public class Insect {
    private int id;
    private int cid;
    private String name;
    private int life;
    private String area;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date discovery_time;
    private String cname;
}
