package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.VoteDao;
import com.example.demo.model.Vote;

@Component
public class VoteService {
    
    @Autowired
    private VoteDao voteDao;

    public Vote getVote(int announcementId) {
        return voteDao.getVote(announcementId);
    }

}
