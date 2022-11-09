package dio.projeto.springboot.service;

import dio.projeto.springboot.model.Empresa;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//https://receitaws.com.br/v1/cnpj/cnpj
//https://api-publica.speedio.com.br/buscarcnpj?
@FeignClient(name = "consultacnpj", url = "https://receitaws.com.br/v1/cnpj/cnpj")
public interface EmpresaService {
    @GetMapping("/{cnpj}/json/")
    Empresa consultarCnpj(@PathVariable("cnpj") String cnpj);
}
