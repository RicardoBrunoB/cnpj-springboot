package dio.projeto.springboot.service.impl;

import dio.projeto.springboot.model.CnpjRepository;
import dio.projeto.springboot.model.Empresario;
import dio.projeto.springboot.model.EmpresarioRepository;
import dio.projeto.springboot.service.CnpjService;
import dio.projeto.springboot.service.EmpresarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresarioServiceImpl implements EmpresarioService {

    //IMPLEMENTAR METÓDOS DESTA CLASSE
    @Autowired
    private EmpresarioRepository empresarioRepository;
    @Autowired
    private CnpjRepository cnpjRepository;
    @Autowired
    private CnpjService cnpjService;


    @Override
    public Iterable<Empresario> buscarTodos() {
        return null;
    }

    @Override
    public Empresario buscarPorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Empresario empresario) {

    }

    @Override
    public void atualizar(Long id, Empresario empresario) {

    }

    @Override
    public void deletar(Long id) {

    }
}
