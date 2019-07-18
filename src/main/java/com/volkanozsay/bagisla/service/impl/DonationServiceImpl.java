package com.volkanozsay.bagisla.service.impl;

import com.volkanozsay.bagisla.model.Donation;
import com.volkanozsay.bagisla.repository.DonationRepository;
import com.volkanozsay.bagisla.service.DonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DonationServiceImpl implements DonationService {
	@Autowired
	private DonationRepository donationRepository;

	@Override public List<Donation> findAll() {
		return donationRepository.findAll();
	}

	@Override public Donation findByDonationId(Long id) {
		return donationRepository.findByDonationId(id);
	}
}
