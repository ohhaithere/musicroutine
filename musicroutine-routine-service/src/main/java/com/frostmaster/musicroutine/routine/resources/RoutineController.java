package com.frostmaster.musicroutine.routine.resources;

import com.frostmaster.musicroutine.routine.domain.model.Routine;
import com.frostmaster.musicroutine.routine.domain.model.valueobject.RoutineVO;
import com.frostmaster.musicroutine.routine.domain.service.RoutineService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by Igor_Usachev on 4/19/2017.
 */
@RestController
@RequestMapping("/v1/routine")
public class RoutineController {

    @Autowired
    RoutineService routineService;

    @RequestMapping(method = RequestMethod.POST)
    public Routine create(@RequestBody RoutineVO routineToCreate) throws Exception {
        Routine routine = new Routine();
        BeanUtils.copyProperties(routineToCreate, routine);
        routine.setId(UUID.randomUUID());
        routineService.add(routine);
        return routine;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody Routine routine) throws Exception {
        routineService.update(routine);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete(@RequestBody Routine routine) throws Exception {
        routineService.delete(routine);
    }

    @RequestMapping("/{id}")
    public Routine get(@PathVariable("id") UUID id) throws Exception {
        Routine routine = routineService.findbyId(id);
        return routine;
    }

}
