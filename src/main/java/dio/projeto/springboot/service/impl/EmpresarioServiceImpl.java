package dio.projeto.springboot.service.impl;

import dio.projeto.springboot.model.Empresa;
import dio.projeto.springboot.model.EmpresaRepository;
import dio.projeto.springboot.model.Empresario;
import dio.projeto.springboot.model.EmpresarioRepository;
import dio.projeto.springboot.service.EmpresaService;
import dio.projeto.springboot.service.EmpresarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpresarioServiceImpl implements EmpresarioService {

    @Autowired
    private EmpresarioRepository empresarioRepository;
    @Autowired
    private EmpresaRepository empresaRepository;
    @Autowired
    private EmpresaService empresaService;


    @Override
    public Iterable<Empresario> buscarTodos() {
        return empresarioRepository.findAll();
    }

    @Override
    public Empresario buscarPorId(Long id) {
        Optional<Empresario> empresario = empresarioRepository.findById(id);
        return empresario.get();
    }

    @Override
    public void inserir(Empresario empresario) {
        salvarEmpresarioComCnpj(empresario);
    }

    private void salvarEmpresarioComCnpj(Empresario empresario) {
        String cnpj = empresario.getEmpresa().getCnpj();
        Empresa empresa = empresaRepository.findById(cnpj).orElseGet(() -> {
            Empresa novaEmpresa = empresaService.consultarCnpj(cnpj);
            empresaRepository.save(novaEmpresa);
            return novaEmpresa;
        });
        empresario.setEmpresa(empresa);
        empresarioRepository.save(empresario);
    }

    @Override
    public void atualizar(Long id, Empresario empresario) {
        Optional<Empresario> empresarioOptional = empresarioRepository.findById(id);
        if (empresarioOptional.isPresent()) {
            salvarEmpresarioComCnpj(empresario);
        }
    }

    @Override
    public void deletar(Long id) {
        empresarioRepository.deleteById(id);
    }
}
