package dio.projeto.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Empresa {
    public String status;
    public String ultimaAtualizacao;
    @Id
    public String cnpj;
    public String tipo;
    public String porte;
    public String nome;
    public String fantasia;
    public String abertura;
    //public AtividadePrincipal atividadePrincipal;
    //public List<AtividadesSecundaria> atividadesSecundarias = null;
    public String naturezaJuridica;
    public String logradouro;
    public String numero;
    public String complemento;
    public String cep;
    public String bairro;
    public String municipio;
    public String uf;
    public String email;
    public String telefone;
    public String efr;
    public String situacao;
    public String dataSituacao;
    public String motivoSituacao;
    public String situacaoEspecial;
    public String dataSituacaoEspecial;
    public String capitalSocial;
    //public List<Qsa> qsa = null;
    //public Billing billing;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(String ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getAbertura() {
        return abertura;
    }

    public void setAbertura(String abertura) {
        this.abertura = abertura;
    }

    public String getNaturezaJuridica() {
        return naturezaJuridica;
    }

    public void setNaturezaJuridica(String naturezaJuridica) {
        this.naturezaJuridica = naturezaJuridica;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEfr() {
        return efr;
    }

    public void setEfr(String efr) {
        this.efr = efr;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getDataSituacao() {
        return dataSituacao;
    }

    public void setDataSituacao(String dataSituacao) {
        this.dataSituacao = dataSituacao;
    }

    public String getMotivoSituacao() {
        return motivoSituacao;
    }

    public void setMotivoSituacao(String motivoSituacao) {
        this.motivoSituacao = motivoSituacao;
    }

    public String getSituacaoEspecial() {
        return situacaoEspecial;
    }

    public void setSituacaoEspecial(String situacaoEspecial) {
        this.situacaoEspecial = situacaoEspecial;
    }

    public String getDataSituacaoEspecial() {
        return dataSituacaoEspecial;
    }

    public void setDataSituacaoEspecial(String dataSituacaoEspecial) {
        this.dataSituacaoEspecial = dataSituacaoEspecial;
    }

    public String getCapitalSocial() {
        return capitalSocial;
    }

    public void setCapitalSocial(String capitalSocial) {
        this.capitalSocial = capitalSocial;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "status='" + status + '\'' +
                ", ultimaAtualizacao='" + ultimaAtualizacao + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", tipo='" + tipo + '\'' +
                ", porte='" + porte + '\'' +
                ", nome='" + nome + '\'' +
                ", fantasia='" + fantasia + '\'' +
                ", abertura='" + abertura + '\'' +
                ", naturezaJuridica='" + naturezaJuridica + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", cep='" + cep + '\'' +
                ", bairro='" + bairro + '\'' +
                ", municipio='" + municipio + '\'' +
                ", uf='" + uf + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", efr='" + efr + '\'' +
                ", situacao='" + situacao + '\'' +
                ", dataSituacao='" + dataSituacao + '\'' +
                ", motivoSituacao='" + motivoSituacao + '\'' +
                ", situacaoEspecial='" + situacaoEspecial + '\'' +
                ", dataSituacaoEspecial='" + dataSituacaoEspecial + '\'' +
                ", capitalSocial='" + capitalSocial + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(status, empresa.status) && Objects.equals(ultimaAtualizacao, empresa.ultimaAtualizacao) && Objects.equals(cnpj, empresa.cnpj) && Objects.equals(tipo, empresa.tipo) && Objects.equals(porte, empresa.porte) && Objects.equals(nome, empresa.nome) && Objects.equals(fantasia, empresa.fantasia) && Objects.equals(abertura, empresa.abertura) && Objects.equals(naturezaJuridica, empresa.naturezaJuridica) && Objects.equals(logradouro, empresa.logradouro) && Objects.equals(numero, empresa.numero) && Objects.equals(complemento, empresa.complemento) && Objects.equals(cep, empresa.cep) && Objects.equals(bairro, empresa.bairro) && Objects.equals(municipio, empresa.municipio) && Objects.equals(uf, empresa.uf) && Objects.equals(email, empresa.email) && Objects.equals(telefone, empresa.telefone) && Objects.equals(efr, empresa.efr) && Objects.equals(situacao, empresa.situacao) && Objects.equals(dataSituacao, empresa.dataSituacao) && Objects.equals(motivoSituacao, empresa.motivoSituacao) && Objects.equals(situacaoEspecial, empresa.situacaoEspecial) && Objects.equals(dataSituacaoEspecial, empresa.dataSituacaoEspecial) && Objects.equals(capitalSocial, empresa.capitalSocial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, ultimaAtualizacao, cnpj, tipo, porte, nome, fantasia, abertura, naturezaJuridica, logradouro, numero, complemento, cep, bairro, municipio, uf, email, telefone, efr, situacao, dataSituacao, motivoSituacao, situacaoEspecial, dataSituacaoEspecial, capitalSocial);
    }
}
