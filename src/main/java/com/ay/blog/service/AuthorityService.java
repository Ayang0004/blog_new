package com.ay.blog.service;

import com.ay.blog.domain.Authority;

/**
 * Authority 服务接口.
 * 
 */
public interface AuthorityService {
	 
	
	/**
	 * 根据id获取 Authority
	 * @param Authority
	 * @return
	 */
	Authority getAuthorityById(Long id);
}
