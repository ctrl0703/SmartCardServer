package io.cahlee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.cahlee.domain.SmartCard;
import io.cahlee.repository.SmartCardRepository;

@Service
public class SmartCardService {
	@Autowired
	private SmartCardRepository smartCardRepository;

	public List<SmartCard> getSmartCardList() {
		return smartCardRepository.findAll();
	}

	public SmartCard getSmartCard(Long smartCardId) {
		return smartCardRepository.findById(smartCardId).get();
	}

}
