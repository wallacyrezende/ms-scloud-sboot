package com.devwall.hroauth.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Data
public class User implements UserDetails, Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String email;
	private String password;
	private Set<Role> roles = new HashSet<>();
	
	@Override
 	public Collection<? extends GrantedAuthority> getAuthorities() {
 		return roles.stream().map(x -> new SimpleGrantedAuthority(x.getRoleName()))
 				.collect(Collectors.toList());
 	}

 	@Override
 	public String getUsername() {
 		return email;
 	}

 	@Override
 	public boolean isAccountNonExpired() {
 		return true;
 	}

 	@Override
 	public boolean isAccountNonLocked() {
 		return true;
 	}

 	@Override
 	public boolean isCredentialsNonExpired() {
 		return true;
 	}

 	@Override
 	public boolean isEnabled() {
 		return true;
 	}

}
