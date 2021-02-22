package br.com.springboot.bring2me.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.springboot.bring2me.entity.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{

	@Query("SELECT p FROM Pedido p WHERE p.status = :a")
	List<Pedido> findByStatus(Object a);
}
