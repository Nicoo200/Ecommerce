package com.revisao.ecommerce.dto;

import java.time.Instant;

import com.revisao.ecommerce.entities.Pedido;
import com.revisao.ecommerce.entities.StatusDoPedido;

public class PedidoDTO {

    private  Long id;
    private Instant momento;
    private StatusDoPedido StatusDoPedido;
    private Long Cliente;

    public  PedidoDTO(){

    }

    public PedidoDTO(Long id, Instant momento, com.revisao.ecommerce.entities.StatusDoPedido statusDoPedido, Long Cliente) {
        this.id = id;
        this.momento = momento;
        StatusDoPedido = statusDoPedido;
        this.Cliente = Cliente;
    }

    public PedidoDTO(Pedido entity) {
        id = entity.getId();
        momento = entity.getMomento();
        StatusDoPedido = entity.getStatus();
        Cliente = entity.getCliente().getId();
    }

    public Long getId() {
        return id;
    }

    public Instant getMomento() {
        return momento;
    }

    public StatusDoPedido getStatusDoPedido() {
        return StatusDoPedido;
    }

    public void setMomento(Instant momento) {
        this.momento = momento;
    }

    public void setStatusDoPedido(StatusDoPedido statusDoPedido) {
        StatusDoPedido = statusDoPedido;
    }
}
