package com.example.tdd.controller;

import com.example.tdd.model.Produto;
import net.bytebuddy.dynamic.DynamicType;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pessoas")
public class ProdutoController {

    @GetMapping
    public ResponseEntity<List<Produto>> obterTodos() {

        List<Produto> produtos = new ArrayList<Produto>();
        return new ResponseEntity<>(produtos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Produto>> obterPorId(@PathVariable Long id) {
        Optional<Produto> produto = Optional.of(new Produto());

        return new ResponseEntity<>(produto, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Produto> adicionar(@RequestBody Produto produto) {

        return new ResponseEntity<>(produto, HttpStatus.OK);
    }

}
