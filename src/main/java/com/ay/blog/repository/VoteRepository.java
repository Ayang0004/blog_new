package com.ay.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ay.blog.domain.Vote;

/**
 * Vote 仓库.
 *
 */
public interface VoteRepository extends JpaRepository<Vote, Long>{
 
}
