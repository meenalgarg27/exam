package com.game.transformers.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Transformer {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="TRANSFORMER_ID")
    private long id;
}
