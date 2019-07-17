package com.volkanozsay.bagisla.repository;

		import com.volkanozsay.bagisla.model.Donation;
		import org.springframework.data.jpa.repository.JpaRepository;
		import org.springframework.data.jpa.repository.Query;

		import java.util.List;

public interface DonationRepository extends JpaRepository<Donation, Long> {
	@Query("SELECT d FROM Donation d") List<Donation> findAll();

	@Query("SELECT d FROM Donation d where d.donationId=?1") Donation findByDonationId(Long id);

}
