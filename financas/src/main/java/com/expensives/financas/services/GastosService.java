package com.expensives.financas.services;

import com.expensives.financas.model.Debito;
import com.expensives.financas.model.Credito;
import com.expensives.financas.repository.DebitoRepository;
import com.expensives.financas.repository.CreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GastosService {

    @Autowired
    private DebitoRepository debitoRepository;

    @Autowired
    private CreditoRepository creditoRepository;

    public List<Debito> obterTodosDebitos() {
        return debitoRepository.obterTodos();
    }

    public Debito adicionarDebito(Debito debito) {
        return debitoRepository.adicionar(debito);
    }

    public List<Credito> obterTodosCreditos() {
        return creditoRepository.obterTodos();
    }

    public Credito adicionarCredito(Credito credito) {
        return creditoRepository.adicionar(credito);
    }
}
