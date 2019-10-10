package com.example.demo.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.example.demo.dao.VoteDao;
import com.example.demo.model.Vote;

@RunWith(MockitoJUnitRunner.class)
public class VoteServiceTest {
    
    @InjectMocks
    private VoteService voteService;
    
    @Mock
    private VoteDao voteDao;
    
    @Test
    public void testGetVote() {
        int voteId = 1;
        Vote vote = mock(Vote.class);
        when(voteDao.getVote(voteId)).thenReturn(vote);
        
        Vote voteReturned = voteService.getVote(voteId);
        
        verify(voteDao, times(1)).getVote(voteId);
        assertEquals(vote, voteReturned);
    }

    @Test
    public void testGetVoteReturnNullForInvalidId() {
        int voteId = 2;
        when(voteDao.getVote(voteId)).thenReturn(null);

        Vote voteReturned = voteService.getVote(voteId);

        verify(voteDao, times(1)).getVote(voteId);
        assertEquals(null, voteReturned);
    }

}
