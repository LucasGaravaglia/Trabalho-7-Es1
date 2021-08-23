package pessoa;

import java.util.ArrayList;

import bem.Bem;
import comunicacao.Email;
import comunicacao.Telefone;
import direito.Direito;
import endereco.EnderecoEspecifico;

public class Contribuinte extends PessoaFisica {
  private ArrayList<Bem> bens;
  private ArrayList<Direito> direitos;
  private ArrayList<Rendimento> rendimentos;

  public Contribuinte(String nome, ArrayList<Telefone> telefones, ArrayList<Email> emails,
      EnderecoEspecifico enderecoResidencial, String sobrenome, String nomeSocial, String cpf, String rg,
      Character sexo, ArrayList<Bem> bens, ArrayList<Direito> direitos, ArrayList<Rendimento> rendimentos) {
    super(nome, telefones, emails, enderecoResidencial, sobrenome, nomeSocial, cpf, rg, sexo);
    this.bens = new ArrayList<>(bens);
    this.direitos = new ArrayList<>(direitos);
    this.rendimentos = new ArrayList<>(rendimentos);
  }

  public ArrayList<Bem> getBens() {
    return bens;
  }

  public void setBens(ArrayList<Bem> bens) {
    this.bens = bens;
  }

  public ArrayList<Direito> getDireitos() {
    return direitos;
  }

  public void setDireitos(ArrayList<Direito> direitos) {
    this.direitos = direitos;
  }

  public ArrayList<Rendimento> getRendimentos() {
    return rendimentos;
  }

  public void setRendimentos(ArrayList<Rendimento> rendimentos) {
    this.rendimentos = rendimentos;
  }

}