package com.frostmaster.musicroutine.routine.resources;

import com.frostmaster.musicroutine.routine.domain.model.Routine;
import com.frostmaster.musicroutine.routine.domain.service.RoutineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Igor_Usachev on 4/19/2017.
 */
@RestController
@RequestMapping("/v1/routine")
public class RoutineController {

    @Autowired
    RoutineService routineService;

    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody Routine routine) throws Exception {

        routineService.add(routine);

    }

}
