package io.cahlee.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Word {
	@Id
	private Long id;
	
	String word;
	String mean;
	boolean isMemorized;
}
