package com.telefonica.offerengine.Data;

import java.util.*;
import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idoffer;

    @Column(name = "code")
    private String code = (String) UUID
        .randomUUID()
        .toString()
        .toUpperCase()
        .subSequence(0, 8);

    @Column(name = "datestart")
    private Date datestart;

    @Column(name = "dateend")
    private Date dateend;

    public Offer(Date datestart, Date dateend) {
        this.datestart = datestart;
        this.dateend = dateend;
    }
}
