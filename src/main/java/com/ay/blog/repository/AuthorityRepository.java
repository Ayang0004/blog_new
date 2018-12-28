package com.ay.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ay.blog.domain.Authority;

/**
 * Authority 仓库.
 *
 */
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
}
