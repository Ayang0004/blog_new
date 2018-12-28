/**
 * 
 */
package com.ay.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ay.blog.domain.Authority;
import com.ay.blog.repository.AuthorityRepository;

/**
 * Authority 服务.
 * 
 */
@Service
public class AuthorityServiceImpl  implements AuthorityService {
	
	@Autowired
	private AuthorityRepository authorityRepository;
	
	@Override
	public Authority getAuthorityById(Long id) {
		return authorityRepository.findOne(id);
	}

}
