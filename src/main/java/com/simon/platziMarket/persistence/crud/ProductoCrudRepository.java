package com.simon.platziMarket.persistence.crud;

import com.simon.platziMarket.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.expression.spel.ast.OpAnd;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer>{
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock,boolean estado);

}
