package com.ay.blog.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ay.blog.domain.Vote;
import com.ay.blog.repository.VoteRepository;

/**
 * Vote 服务.
 * 
 */
@Service
public class VoteServiceImpl implements VoteService {

	@Autowired
	private VoteRepository voteRepository;
	
	@Override
	@Transactional
	public void removeVote(Long id) {
		voteRepository.delete(id);
	}
	@Override
	public Vote getVoteById(Long id) {
		return voteRepository.findOne(id);
	}

}
