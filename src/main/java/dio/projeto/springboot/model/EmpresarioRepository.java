package dio.projeto.springboot.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresarioRepository extends CrudRepository<Empresario, Long> {

}