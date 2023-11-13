package nttdata.test.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import nttdata.test.Models.Sell;

@Repository
public interface SellRepository extends JpaRepository<Sell, Long> {

}
