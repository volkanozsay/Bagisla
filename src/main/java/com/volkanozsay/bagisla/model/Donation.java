package com.volkanozsay.bagisla.model;

import javax.persistence.*;
import java.util.Date;

@Entity @Table(name = "DONATION") public class Donation {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "DONATION_ID") private Long donationId;
	@Column(name = "DONATION_NAME") private String donationName;
	@Column(name = "DONATION_DESCRIPTION") private String donationDescription;
	@Column(name = "DONATION_TARGET_MONEY") private Double donationTargetMoney;
	@Column(name = "DONATION_CREATED_DATE") @Temporal(TemporalType.DATE) private Date donationDate;
	@Column(name = "DONATION_IMAGE") @Lob private Byte[] donationImage;
	@Column(name = "DONATION_CURRENT_MONEY") private Double donationCurrentMoney;
	@ManyToOne @JoinColumn(name = "USER_ID") private User user;

	//TODO  Bir bağıs istegine bagıs yapanların listesinin verilmesi,video alanlarının eklenmesi

	public Long getDonationId() {
		return donationId;
	}

	public void setDonationId(Long donationId) {
		this.donationId = donationId;
	}

	public String getDonationName() {
		return donationName;
	}

	public void setDonationName(String donationName) {
		this.donationName = donationName;
	}

	public String getDonationDescription() {
		return donationDescription;
	}

	public void setDonationDescription(String donationDescription) {
		this.donationDescription = donationDescription;
	}

	public Double getDonationTargetMoney() {
		return donationTargetMoney;
	}

	public void setDonationTargetMoney(Double donationTargetMoney) {
		this.donationTargetMoney = donationTargetMoney;
	}

	public Date getDonationDate() {
		return donationDate;
	}

	public void setDonationDate(Date donationDate) {
		this.donationDate = donationDate;
	}

	public Byte[] getDonationImage() {
		return donationImage;
	}

	public void setDonationImage(Byte[] donationImage) {
		this.donationImage = donationImage;
	}

	public Double getDonationCurrentMoney() {
		return donationCurrentMoney;
	}

	public void setDonationCurrentMoney(Double donationCurrentMoney) {
		this.donationCurrentMoney = donationCurrentMoney;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
