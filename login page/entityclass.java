package com.example.dtb;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "contacts_table")
public class entityclass {


    @PrimaryKey
    @ColumnInfo(name = "contact_id")
    int id;

    @ColumnInfo(name = "contact_namee")
    String Namee;

    @ColumnInfo(name = "contact_gmail")
    String gmail;


    public entityclass(int a ,String jackkkk, String mail) {
        this.id=a;
        this.Namee=jackkkk;
        this.gmail=mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamee() {
        return Namee;
    }

    public void setNamee(String namee) {
        Namee = namee;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
}
