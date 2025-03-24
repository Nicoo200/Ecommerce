package com.revisao.ecommerce.controllers;

import com.revisao.ecommerce.dto.PedidoDTO;
import com.revisao.ecommerce.dto.ProdutoDTO;
import com.revisao.ecommerce.services.PedidoService;
import com.revisao.ecommerce.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PedidoController {


    @Autowired
    PedidoService pedidoService;

    @PostMapping(value = "/pedido")
    public ResponseEntity<PedidoDTO> insert(@RequestBody PedidoDTO dto){
        dto = pedidoService.inserir(dto);
        return ResponseEntity.ok(dto);
    }
}

