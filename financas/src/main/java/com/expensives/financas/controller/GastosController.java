package com.expensives.financas.controller;

import com.expensives.financas.model.Credito;
import com.expensives.financas.model.Debito;
import com.expensives.financas.services.GastosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gastos")
public class GastosController {

    @Autowired
    private GastosService gastosService;

    @GetMapping("/debitos")
    public List<Debito> obterTodosDebitos() {
        return gastosService.obterTodosDebitos();
    }

    @PostMapping("/debitos")
    public Debito adicionarDebito(@RequestBody Debito debito) {
        return gastosService.adicionarDebito(debito);
    }

    @GetMapping("/creditos")
    public List<Credito> obterTodosCreditos() {
        return gastosService.obterTodosCreditos();
    }

    @PostMapping("/creditos")
    public Credito adicionarCredito(@RequestBody Credito credito) {
        return gastosService.adicionarCredito(credito);
    }
}
