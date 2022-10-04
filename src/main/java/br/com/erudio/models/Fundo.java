package br.com.erudio.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

public class Fundo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column()
    private String isin;

    @Column()
    private Integer cnpj;

    @Column()
    private String nome;

    @Column(name = "dt_posicao")
    private String dtPosicao;

    @Column(name = "nome_adm")
    private String nomeAdm;

    @Column(name = "cnpj_adm")
    private Integer cnpjAdm;

    @Column(name = "nome_gestor")
    private String nomeGestor;

    @Column(name = "cnpj_gestor")
    private Integer cnpjGestor;

    @Column(name = "nome_custodiante")
    private String nomeCustodiante;

    @Column(name = "cnpj_custodiante")
    private Integer cnpjCustodiante;

    @Column(name = "vl_cota")
    private Double valorCota;

    @Column(name = "quantidade")
    private Double quantidade;

    @Column(name = "pat_liq")
    private Double patLiq;

    @Column(name = "vl_ativos")
    private Double valorAtivos;

    @Column(name = "vl_receber")
    private Double valorReceber;

    @Column(name = "vl_pagar")
    private Double valorPagar;

    @Column(name = "vl_cotas_emitir")
    private Double valorCotasEmitir;

    @Column(name = "vl_cotas_resgatar")
    private Double valorCotasResgatar;

    @Column(name = "cod_anbid")
    private Integer codAnbid;

    @Column(name = "tipo_fundo")
    private Integer tipoFundo;

    public Fundo(long id, String isin, Integer cnpj, String nome, String dtPosicao, String nomeAdm, Integer cnpjAdm, String nomeGestor, Integer cnpjGestor, String nomeCustodiante, Integer cnpjCustodiante, Double valorCota, Double quantidade, Double patLiq, Double valorAtivos, Double valorReceber, Double valorPagar, Double valorCotasEmitir, Double valorCotasResgatar, Integer codAnbid, Integer tipoFundo) {
        this.id = id;
        this.isin = isin;
        this.cnpj = cnpj;
        this.nome = nome;
        this.dtPosicao = dtPosicao;
        this.nomeAdm = nomeAdm;
        this.cnpjAdm = cnpjAdm;
        this.nomeGestor = nomeGestor;
        this.cnpjGestor = cnpjGestor;
        this.nomeCustodiante = nomeCustodiante;
        this.cnpjCustodiante = cnpjCustodiante;
        this.valorCota = valorCota;
        this.quantidade = quantidade;
        this.patLiq = patLiq;
        this.valorAtivos = valorAtivos;
        this.valorReceber = valorReceber;
        this.valorPagar = valorPagar;
        this.valorCotasEmitir = valorCotasEmitir;
        this.valorCotasResgatar = valorCotasResgatar;
        this.codAnbid = codAnbid;
        this.tipoFundo = tipoFundo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtPosicao() {
        return dtPosicao;
    }

    public void setDtPosicao(String dtPosicao) {
        this.dtPosicao = dtPosicao;
    }

    public String getNomeAdm() {
        return nomeAdm;
    }

    public void setNomeAdm(String nomeAdm) {
        this.nomeAdm = nomeAdm;
    }

    public Integer getCnpjAdm() {
        return cnpjAdm;
    }

    public void setCnpjAdm(Integer cnpjAdm) {
        this.cnpjAdm = cnpjAdm;
    }

    public String getNomeGestor() {
        return nomeGestor;
    }

    public void setNomeGestor(String nomeGestor) {
        this.nomeGestor = nomeGestor;
    }

    public Integer getCnpjGestor() {
        return cnpjGestor;
    }

    public void setCnpjGestor(Integer cnpjGestor) {
        this.cnpjGestor = cnpjGestor;
    }

    public String getNomeCustodiante() {
        return nomeCustodiante;
    }

    public void setNomeCustodiante(String nomeCustodiante) {
        this.nomeCustodiante = nomeCustodiante;
    }

    public Integer getCnpjCustodiante() {
        return cnpjCustodiante;
    }

    public void setCnpjCustodiante(Integer cnpjCustodiante) {
        this.cnpjCustodiante = cnpjCustodiante;
    }

    public Double getValorCota() {
        return valorCota;
    }

    public void setValorCota(Double valorCota) {
        this.valorCota = valorCota;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPatLiq() {
        return patLiq;
    }

    public void setPatLiq(Double patLiq) {
        this.patLiq = patLiq;
    }

    public Double getValorAtivos() {
        return valorAtivos;
    }

    public void setValorAtivos(Double valorAtivos) {
        this.valorAtivos = valorAtivos;
    }

    public Double getValorReceber() {
        return valorReceber;
    }

    public void setValorReceber(Double valorReceber) {
        this.valorReceber = valorReceber;
    }

    public Double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(Double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public Double getValorCotasEmitir() {
        return valorCotasEmitir;
    }

    public void setValorCotasEmitir(Double valorCotasEmitir) {
        this.valorCotasEmitir = valorCotasEmitir;
    }

    public Double getValorCotasResgatar() {
        return valorCotasResgatar;
    }

    public void setValorCotasResgatar(Double valorCotasResgatar) {
        this.valorCotasResgatar = valorCotasResgatar;
    }

    public Integer getCodAnbid() {
        return codAnbid;
    }

    public void setCodAnbid(Integer codAnbid) {
        this.codAnbid = codAnbid;
    }

    public Integer getTipoFundo() {
        return tipoFundo;
    }

    public void setTipoFundo(Integer tipoFundo) {
        this.tipoFundo = tipoFundo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fundo fundo = (Fundo) o;
        return id == fundo.id && Objects.equals(isin, fundo.isin) && Objects.equals(cnpj, fundo.cnpj) && Objects.equals(nome, fundo.nome) && Objects.equals(dtPosicao, fundo.dtPosicao) && Objects.equals(nomeAdm, fundo.nomeAdm) && Objects.equals(cnpjAdm, fundo.cnpjAdm) && Objects.equals(nomeGestor, fundo.nomeGestor) && Objects.equals(cnpjGestor, fundo.cnpjGestor) && Objects.equals(nomeCustodiante, fundo.nomeCustodiante) && Objects.equals(cnpjCustodiante, fundo.cnpjCustodiante) && Objects.equals(valorCota, fundo.valorCota) && Objects.equals(quantidade, fundo.quantidade) && Objects.equals(patLiq, fundo.patLiq) && Objects.equals(valorAtivos, fundo.valorAtivos) && Objects.equals(valorReceber, fundo.valorReceber) && Objects.equals(valorPagar, fundo.valorPagar) && Objects.equals(valorCotasEmitir, fundo.valorCotasEmitir) && Objects.equals(valorCotasResgatar, fundo.valorCotasResgatar) && Objects.equals(codAnbid, fundo.codAnbid) && Objects.equals(tipoFundo, fundo.tipoFundo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isin, cnpj, nome, dtPosicao, nomeAdm, cnpjAdm, nomeGestor, cnpjGestor, nomeCustodiante, cnpjCustodiante, valorCota, quantidade, patLiq, valorAtivos, valorReceber, valorPagar, valorCotasEmitir, valorCotasResgatar, codAnbid, tipoFundo);
    }
}
