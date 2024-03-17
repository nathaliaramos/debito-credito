package com.expensives.financas.repository;

import com.expensives.financas.model.Credito;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CreditoRepository {

    private List<Credito> creditos = new ArrayList<>();
    private Integer ultimoId = 0; 

    public List<Credito> obterTodos() {
        return creditos;
    }

    public Credito adicionar(Credito credito) {
        ultimoId++; 
        credito.setId(ultimoId);
        creditos.add(credito);
        return credito;
    }
}
