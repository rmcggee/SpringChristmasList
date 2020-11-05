package dmacc.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dmacc.beans.ChristmasListContact;
@Repository
public interface ContactRepository extends JpaRepository<ChristmasListContact, Long>  {

}
