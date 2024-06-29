package com.example.jaz_zaliczenie_s29099.repository;
import com.example.jaz_zaliczenie_s29099.model.Waluty_s29099;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface CurrencyRepository extends JpaRepository<Waluty_s29099, Double>
{
    @Modifying
    @Transactional
    @Query("UPDATE Waluty_s29099 w SET w.kurs =: sredniKurs WHERE w.id =: id ")
    int SetObliczonySredniKurs(Double sredniKurs, int id);


}
