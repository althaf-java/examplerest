package com.example.demo.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.example.demo.model.Vote;

/**
 * NOTE: This is a dummy DAO.
 */
@Component
public class VoteDao {
    
    private Map<Integer, Vote> map = new HashMap<Integer, Vote>();
    public VoteDao() {
        map.put(1, new Vote(100, 10));
        map.put(2, new Vote(200, 20));
    }
    
    public Vote getVote(int announcementId) {
        return map.get(announcementId);
    }
}
