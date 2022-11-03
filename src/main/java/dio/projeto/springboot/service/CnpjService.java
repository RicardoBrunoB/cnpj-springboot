package dio.projeto.springboot.service;

import dio.projeto.springboot.model.Cnpj;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "consultacnpj", url = "https://api-publica.speedio.com.br")
public interface CnpjService {
    @GetMapping("/{cnpj}/json/")
    Cnpj consultarCnpj(@PathVariable("cnpj") String cnpj);
}
