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
        int announcementId = 1;
        Vote vote = mock(Vote.class);
        when(voteDao.getVote(announcementId)).thenReturn(vote);
        
        Vote voteReturned = voteService.getVote(1);
        
        verify(voteDao, times(1)).getVote(announcementId);
        assertEquals(vote, voteReturned);
    }

}
