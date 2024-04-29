package edu.cqie.danli;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Server {
    private String url;
    private String ip;
    private String add;
    private String username;
    private String password;
    private Integer weight;
}
