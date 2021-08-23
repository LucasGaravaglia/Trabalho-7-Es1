package pessoa;

import java.util.ArrayList;

import comunicacao.Email;
import comunicacao.Telefone;
import endereco.EnderecoEspecifico;

public class Empresa extends PessoaJuridica {

  public Empresa(String nome, ArrayList<Telefone> telefones, ArrayList<Email> emails,
      EnderecoEspecifico enderecoResidencial, String cnpj) {
    super(nome, telefones, emails, enderecoResidencial, cnpj);
  }

}