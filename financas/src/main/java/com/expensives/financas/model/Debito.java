package com.expensives.financas.model;

import java.time.LocalDate;

public class Debito {
    private Integer id;
    private String descricao;
    private LocalDate dataReferencia;
    private LocalDate dataPagamento;
    private Double valorDebito;
    private Double valorPago;
    private Double valorDiferenca;
    private String tipoDespesa;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDataReferencia() {
        return dataReferencia;
    }
    public void setDataReferencia(LocalDate dataReferencia) {
        this.dataReferencia = dataReferencia;
    }
    public LocalDate getDataPagamento() {
        return dataPagamento;
    }
    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    public Double getValorDebito() {
        return valorDebito;
    }
    public void setValorDebito(Double valorDebito) {
        this.valorDebito = valorDebito;
    }
    public Double getValorPago() {
        return valorPago;
    }
    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }
    public Double getValorDiferenca() {
        return valorDiferenca;
    }
    public void setValorDiferenca(Double valorDiferenca) {
        this.valorDiferenca = valorDiferenca;
    }
    public String getTipoDespesa() {
        return tipoDespesa;
    }
    public void setTipoDespesa(String tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }
}
