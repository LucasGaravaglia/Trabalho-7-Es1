package endereco;

public class EnderecoEspecifico {
  private Integer nroCasa;
  private String complemento;
  private Endereco endereco;

  public EnderecoEspecifico(Integer nroCasa, String complemento, Endereco endereco) {
    this.nroCasa = nroCasa;
    this.complemento = complemento;
    this.endereco = endereco;
  }

  public Integer getNroCasa() {
    return nroCasa;
  }

  public void setNroCasa(Integer nroCasa) {
    this.nroCasa = nroCasa;
  }

  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

}