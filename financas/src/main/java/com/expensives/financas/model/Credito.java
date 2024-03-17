package com.expensives.financas.model;

import java.time.LocalDate;

public class Credito {
    private Integer id;
    private String descricao;
    private LocalDate dataReferencia;
    private LocalDate dataRecebimento;
    private Double valorCredito;
    private Double valorRecebido;
    private Double valorDiferenca;
    private String tipoRecebimento;
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
    public LocalDate getDataRecebimento() {
        return dataRecebimento;
    }
    public void setDataRecebimento(LocalDate dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }
    public Double getValorCredito() {
        return valorCredito;
    }
    public void setValorCredito(Double valorCredito) {
        this.valorCredito = valorCredito;
    }
    public Double getValorRecebido() {
        return valorRecebido;
    }
    public void setValorRecebido(Double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }
    public Double getValorDiferenca() {
        return valorDiferenca;
    }
    public void setValorDiferenca(Double valorDiferenca) {
        this.valorDiferenca = valorDiferenca;
    }
    public String getTipoRecebimento() {
        return tipoRecebimento;
    }
    public void setTipoRecebimento(String tipoRecebimento) {
        this.tipoRecebimento = tipoRecebimento;
    }

    
}
