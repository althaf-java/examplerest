package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Vote;
import com.example.demo.service.VoteService;

@RestController
@RequestMapping(value = "/votes")
public class VoteController {

    @Autowired
    private VoteService voteService;
    
    @RequestMapping(value = "/{id}",
            method = RequestMethod.GET)
    public ResponseEntity<Vote> getVote(@PathVariable("id") Integer id) throws Exception {
        Vote vote = this.voteService.getVote(id);
        return new ResponseEntity<Vote>(vote, HttpStatus.OK);
    }
    
}
