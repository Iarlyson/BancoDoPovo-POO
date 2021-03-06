package com.banco.bancodopovo.jgi.dao;

import com.banco.bancodopovo.jgi.interfaceDao.EmprestimoDao;
import com.banco.bancodopovo.jgi.modelo.Emprestimo;

import java.util.ArrayList;

/**
 * Classe que seria responsável por armazenar métodos de acesso de dados relacionados à uma conta corrente
 * @author joão pedro fernandes, Iarlyson Santana e Gustavo Araujo
 */
public class EmprestimoBaseDoMilagreDaoBanco implements EmprestimoDao {

    @Override
    public boolean createEmprestimo(Emprestimo emprestimo) {
        return false;
    }

    @Override
    public Emprestimo getEmprestimo(String tipoEmp) {
        return null;
    }

    @Override
    public boolean updateEmprestimo(Emprestimo emprestimo) {
        return false;
    }

    @Override
    public boolean deleteEmprestimo(Emprestimo emprestimo) {
        return false;
    }
}
