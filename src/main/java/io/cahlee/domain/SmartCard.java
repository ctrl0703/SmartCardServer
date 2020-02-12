package io.cahlee.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class SmartCard {
	@Id
	private Long id;
	
	private String name;
	
	@OneToMany
	private List<Word> words;
}
