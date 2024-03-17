package com.expensives.financas.repository;

import com.expensives.financas.model.Debito;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DebitoRepository {

    private List<Debito> debitos = new ArrayList<>();
    private Integer ultimoId = 0;

    public List<Debito> obterTodos() {
        return debitos;
    }

    public Debito adicionar(Debito debito) {
        ultimoId++;
        debito.setId(ultimoId);
        debitos.add(debito);
        return debito;
    }
}
