package io.cahlee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.cahlee.domain.SmartCard;
import io.cahlee.service.SmartCardService;

@RestController
public class SmartCardController {
	@Autowired
	private SmartCardService smartCardService;

	@RequestMapping("/smartcards")
	public List<SmartCard> smartCardList() {
		return smartCardService.getSmartCardList();
	}
	
	@RequestMapping("/smartcard/{smartCardId}")
	public SmartCard smartCard(@PathVariable Long smartCardId) {
		return smartCardService.getSmartCard(smartCardId);
	}
	
}
