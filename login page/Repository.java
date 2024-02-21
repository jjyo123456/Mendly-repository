package com.example.dtb;

import androidx.lifecycle.LiveData;

import java.util.List;

public class Repository {
    Daointerface daoiterfaceascontactdao ;

    public Repository(Daointerface daoiterfaceascontactdao) {
        this.daoiterfaceascontactdao = daoiterfaceascontactdao;
    }

    public void addcontact(entityclass contact){
        daoiterfaceascontactdao.insertt(contact);
    }
    public void deletecontact(entityclass contact){
        daoiterfaceascontactdao.delet(contact);
    }

    public LiveData<List<entityclass>> getall(){
       LiveData<List<entityclass>> livedatastoredallcontactsofdao = daoiterfaceascontactdao.getallcontacts();
       return  livedatastoredallcontactsofdao;
    }
}
