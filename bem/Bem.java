package bem;

public class Bem {
  private Double valor;
  private TipoBem tipoBem;

  public Bem(Double valor, TipoBem tipoBem) {
    this.valor = valor;
    this.tipoBem = new TipoBem(tipoBem);
  }

  public Double getValor() {
    return valor;
  }

  public TipoBem getTipoBem() {
    return tipoBem;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public void setTipoBem(TipoBem tipoBem) {
    this.tipoBem = tipoBem;
  }

}