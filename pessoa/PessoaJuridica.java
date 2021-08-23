package pessoa;

import java.util.ArrayList;

import comunicacao.Email;
import comunicacao.Telefone;
import endereco.EnderecoEspecifico;

public class PessoaJuridica extends Pessoa {
  private String cnpj;

  public PessoaJuridica(String nome, ArrayList<Telefone> telefones, ArrayList<Email> emails,
      EnderecoEspecifico enderecoResidencial, String cnpj) {
    super(nome, telefones, emails, enderecoResidencial);
    this.cnpj = cnpj;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

}