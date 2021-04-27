package com.devwall.hroauth.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Data
public class Role implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private Long id;
	private String roleName;

}
