/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALUNO
 */
public class GerenciadordeProdutos {

    private List<Produto> Produtos = new ArrayList<Produto>();

    public void addProduto(Produto p) {
        Produtos.add(p);
    }

    public Produto ConsultaProduto(String D, String M) {
        for (Produto p : Produtos) {
            if (p.getDescricao().equals(D) && p.getMarca().equals(M)) {
                return p;
            }
        }
        return null;

    }

    public void RemoverProduto(String D, String M) {
        Produto p = ConsultaProduto(D, M);
        if (p.equals(null)) {
            System.out.println("Qual foi brow");
        } else {
            Produtos.remove(p);
        }
    }

    public void AtualizarProduto(String D, String M, String novaD, String novaM, float novoP) {
          Produto p = ConsultaProduto(D, M);
        if (p.equals(null)) {
            System.out.println("Qual foi brow");
        } else {
           int index = Produtos.indexOf(p);
           Produtos.get(index).setDescricao(novaD);
           Produtos.get(index).setMarca(novaM);
           Produtos.get(index).setPreco(novoP);
           System.out.println("Produto atualizado");
        }
    }

}

