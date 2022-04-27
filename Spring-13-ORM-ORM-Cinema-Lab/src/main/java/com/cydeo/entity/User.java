package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user_account")
@NoArgsConstructor
public class User extends BaseEntity{

    private String email;
    private String password;
    private String username;


    @OneToOne(fetch = FetchType.LAZY)  //this side is owner side
    @JoinColumn(name = "account_details_id")
    private Account account; //hibernate will create account_id, but we need account_details_id as per data.sql query, so we need to add @JoinColumn

}
