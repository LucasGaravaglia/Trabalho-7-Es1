package bo.pessoa;

import java.util.ArrayList;

import bo.comunicacao.Email;
import bo.comunicacao.Telefone;
import bo.endereco.EnderecoEspecifico;

public class Empresa extends PessoaJuridica {

  public Empresa(String nome, ArrayList<Telefone> telefones, ArrayList<Email> emails,
      EnderecoEspecifico enderecoResidencial, String cnpj) {
    super(nome, telefones, emails, enderecoResidencial, cnpj);
  }

}