package in.rentify.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.rentify.model.*;

@Repository
public interface ContactInfoRepository extends JpaRepository<ContactInfo,Long> 
{
}
