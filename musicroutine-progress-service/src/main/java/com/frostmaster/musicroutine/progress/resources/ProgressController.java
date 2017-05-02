package com.frostmaster.musicroutine.progress.resources;

import com.frostmaster.musicroutine.progress.domain.model.Progress;
import com.frostmaster.musicroutine.progress.domain.model.valueobject.ProgressVO;
import com.frostmaster.musicroutine.progress.domain.service.ProgressService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by Igor_Usachev on 4/26/2017.
 */
@RestController
@RequestMapping("/v1/routine")
public class ProgressController {

    @Autowired
    ProgressService progressService;

    @RequestMapping(method = RequestMethod.POST)
    public Progress create(@RequestBody ProgressVO routineToCreate) throws Exception {
        Progress progress = new Progress();
        BeanUtils.copyProperties(routineToCreate, progress);
        progress.setId(UUID.randomUUID());
        progressService.add(progress);
        return progress;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody Progress progress) throws Exception {
        progressService.update(progress);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete(@RequestBody Progress progress) throws Exception {
        progressService.delete(progress);
    }

    @RequestMapping("/{id}")
    public Progress get(@PathVariable("id") UUID id) throws Exception {
        Progress progress = progressService.findbyId(id);
        return progress;
    }

}
