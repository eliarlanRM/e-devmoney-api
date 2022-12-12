package br.com.eliarlan.edevmoney.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eliarlan.edevmoney.domain.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Long, Category>{

}
