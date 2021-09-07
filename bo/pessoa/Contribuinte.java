package bo.pessoa;

import java.util.ArrayList;

import bo.bensedireitos.BensEDireitos;
import bo.comunicacao.Email;
import bo.comunicacao.Telefone;
import bo.endereco.EnderecoEspecifico;

public class Contribuinte extends PessoaFisica {
  private ArrayList<BensEDireitos> bens;
  private ArrayList<Rendimento> rendimentos;

  public Contribuinte(String nome, ArrayList<Telefone> telefones, ArrayList<Email> emails,
      EnderecoEspecifico enderecoResidencial, String sobrenome, String nomeSocial, String cpf, String rg,
      Character sexo, ArrayList<BensEDireitos> bens, ArrayList<Rendimento> rendimentos) {
    super(nome, telefones, emails, enderecoResidencial, sobrenome, nomeSocial, cpf, rg, sexo);
    this.bens = new ArrayList<>(bens);
    this.rendimentos = new ArrayList<>(rendimentos);
  }

  public ArrayList<BensEDireitos> getBens() {
    return bens;
  }

  public void setBens(ArrayList<BensEDireitos> bens) {
    this.bens = bens;
  }

  public ArrayList<Rendimento> getRendimentos() {
    return rendimentos;
  }

  public void setRendimentos(ArrayList<Rendimento> rendimentos) {
    this.rendimentos = rendimentos;
  }

}