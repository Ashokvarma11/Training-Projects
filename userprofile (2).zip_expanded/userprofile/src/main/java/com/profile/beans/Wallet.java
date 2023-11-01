package com.profile.beans;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Wallet {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int wallet_id;
	int walletbalance;
	public Wallet() {
		super();
		this.wallet_id = wallet_id;
		this.walletbalance = walletbalance;
	}

	
	

}
