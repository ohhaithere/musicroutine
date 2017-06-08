package com.frostmaster.musicroutine.achievment.resources;

import com.frostmaster.musicroutine.achievment.domain.model.Achievment;
import com.frostmaster.musicroutine.achievment.domain.model.valueobject.AchievmentVO;
import com.frostmaster.musicroutine.achievment.domain.service.AchievmentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by Igor_Usachev on 5/4/2017.
 */
@RestController
@RequestMapping("/v1/achievment")
public class AchievmentController {

    @Autowired
    private AchievmentService achievmentService;

    @RequestMapping(method = RequestMethod.POST)
    public Achievment create(@RequestBody AchievmentVO achievmentToCreate) throws Exception {
        Achievment achievment = new Achievment();
        BeanUtils.copyProperties(achievmentToCreate, achievment);
        achievment.setId(UUID.randomUUID());
        achievmentService.add(achievment);
        return achievment;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody Achievment achievment) throws Exception {
        achievmentService.update(achievment);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete(@RequestBody Achievment achievment) throws Exception {
        achievmentService.delete(achievment);
    }

    @RequestMapping("/{id}")
    public Achievment get(@PathVariable("id") UUID id) throws Exception {
        Achievment achievment = achievmentService.findbyId(id);
        return achievment;
    }

}
