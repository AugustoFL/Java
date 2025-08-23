/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author Afonso
 */
public class Principal {
    
    public static void main(String[] args) {
        
        
        JOptionPane.showMessageDialog(null, "Vamos registrar um contrato.");
        
        Inquilino in = new Inquilino();
        in.setNome(JOptionPane.showInputDialog("Digite o nome do inquilino"));
        in.setCpf(JOptionPane.showInputDialog("Digite o cpf do inquilino"));
        in.setProfissao(JOptionPane.showInputDialog("Digite a profissao do inquilino"));
        in.setRenda(Double.parseDouble(JOptionPane.showInputDialog("Digite a renda do inquilino")));
        
        Proprietario pr = new Proprietario();
        pr.setNome(JOptionPane.showInputDialog("Digite o nome do proprietario"));
        pr.setCpf(JOptionPane.showInputDialog("Digite o cpf do proprietario"));
        pr.setConjuge(JOptionPane.showInputDialog("Digite o nome do conjuge do proprietario."));
       
        Endereco ed = new Endereco();
        ed.setCidade(JOptionPane.showInputDialog("Digite a cidade."));
        ed.setBairro(JOptionPane.showInputDialog("Digite o bairro."));
        ed.setRua(JOptionPane.showInputDialog("Digite a rua.")); 
        ed.setNumero(JOptionPane.showInputDialog("Digite o numero."));
       
        
        Imovel im = new Imovel();
        im.setEndereco(ed);
        im.setValor(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do imovel")));
        
        Contrato con = new Contrato();
        con.setData(JOptionPane.showInputDialog("Digite a data do contrato no formato DD/MM/YYYY"));
        con.setImovel(im);
        con.setInquilino(in);
        con.setProprietario(pr);
        
         JOptionPane.showMessageDialog(null, 
            "Contrato registrado com sucesso!" +
            "\nProprietário: " + con.getProprietario().getNome() +
            "\nInquilino: " + con.getInquilino().getNome() +
            "\nData: " + con.getData() +        
            "\nEndereço: " + con.getImovel().getEndereco().getRua() + ", " + 
                 con.getImovel().getEndereco().getNumero() + "," + 
                 con.getImovel().getEndereco().getBairro() + "," +
                 con.getImovel().getEndereco().getCidade());
        
        
        
        
    }
    
    
    

}
