package io.github.erlds.domain.repository;

import io.github.erlds.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensPedido extends JpaRepository<ItemPedido,Integer> {
}
