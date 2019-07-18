package com.volkanozsay.bagisla.service;

import com.volkanozsay.bagisla.model.Donation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

public interface DonationService {

	List<Donation> findAll();
	Donation findByDonationId(Long id);
}
