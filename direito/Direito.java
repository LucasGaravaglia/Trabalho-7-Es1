package direito;

public class Direito {
  private double valor;
  private TipoDireito tipoBem;

  public Direito(double valor, TipoDireito tipoBem) {
    this.valor = valor;
    this.tipoBem = tipoBem;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public TipoDireito getTipoBem() {
    return tipoBem;
  }

  public void setTipoBem(TipoDireito tipoBem) {
    this.tipoBem = tipoBem;
  }

}