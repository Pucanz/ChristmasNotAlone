package org.codeforall.controllers.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class RestController {

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""}){}
    public ResponseEntity<List<>>
}
