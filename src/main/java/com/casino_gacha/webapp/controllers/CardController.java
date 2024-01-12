package com.casino_gacha.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.casino_gacha.webapp.models.Card;
import com.casino_gacha.webapp.repositories.CardRepository;

@Controller
@RequestMapping(path = "/card")
public class CardController {
  @Autowired
  private CardRepository cardRepository;

  @GetMapping(path = "/")
  public @ResponseBody Iterable<Card> getAllCards() {
    return cardRepository.findAll();
  }
}
