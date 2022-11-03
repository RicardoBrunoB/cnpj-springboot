package dio.projeto.springboot.controller;

import dio.projeto.springboot.model.Empresario;
import dio.projeto.springboot.service.EmpresarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("empresario")
public class EmpresarioRestController {

    @Autowired
    private EmpresarioService empresarioService;

    @GetMapping
    public ResponseEntity<Iterable<Empresario>> buscarTodos() {
        return ResponseEntity.ok(empresarioService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empresario> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(empresarioService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Empresario> inserir(@RequestBody Empresario empresario) {
        empresarioService.inserir(empresario);
        return ResponseEntity.ok(empresario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Empresario> atualizar(@PathVariable Long id, @RequestBody Empresario empresario){
        empresarioService.atualizar(id, empresario);
        return ResponseEntity.ok(empresario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        empresarioService.deletar(id);
        return ResponseEntity.ok().build();
    }

}
