package endereco;

public class Endereco {
  private String cep;
  private Logradouro logradouro;
  private Bairro bairro;
  private Cidade cidade;

  public Endereco(String cep, Logradouro logradouro, Bairro bairro, Cidade cidade) {
    this.cep = cep;
    this.logradouro = logradouro;
    this.bairro = bairro;
    this.cidade = cidade;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public Logradouro getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(Logradouro logradouro) {
    this.logradouro = logradouro;
  }

  public Bairro getBairro() {
    return bairro;
  }

  public void setBairro(Bairro bairro) {
    this.bairro = bairro;
  }

  public Cidade getCidade() {
    return cidade;
  }

  public void setCidade(Cidade cidade) {
    this.cidade = cidade;
  }

}