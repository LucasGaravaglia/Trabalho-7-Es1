package bem;

public class Bem {
  private double valor;
  private TipoBem tipoBem;

  public Bem(double valor, TipoBem tipoBem) {
    this.valor = valor;
    this.tipoBem = tipoBem;
  }

  public double getValor() {
    return valor;
  }

  public TipoBem getTipoBem() {
    return tipoBem;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public void setTipoBem(TipoBem tipoBem) {
    this.tipoBem = tipoBem;
  }

}