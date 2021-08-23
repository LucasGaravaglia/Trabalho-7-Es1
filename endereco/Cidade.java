package endereco;

public class Cidade {
  private String nome;
  private Uf uf;

  public Cidade(String nome, Uf uf) {
    this.nome = nome;
    this.uf = uf;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Uf getUf() {
    return uf;
  }

  public void setUf(Uf uf) {
    this.uf = uf;
  }

}