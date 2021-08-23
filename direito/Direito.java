package direito;

public class Direito {
  private Double valor;
  private TipoDireito tipoDireito;

  public Direito(Double valor, TipoDireito tipoDireito) {
    this.valor = valor;
    this.tipoDireito = new TipoDireito(tipoDireito);
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public TipoDireito getTipoDireito() {
    return tipoDireito;
  }

  public void setTipoDireito(TipoDireito tipoDireito) {
    this.tipoDireito = tipoDireito;
  }

}