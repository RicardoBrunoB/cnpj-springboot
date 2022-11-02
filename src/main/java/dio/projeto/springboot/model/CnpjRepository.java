package dio.projeto.springboot.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CnpjRepository extends CrudRepository<Cnpj, String> {

}