package com.frostmaster.musicroutine.tasksindexer.domain.model;

import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

import javax.persistence.Id;
import java.util.Date;

@SolrDocument(solrCoreName = "task")
public class Task {

    @Id
    @Indexed(name = "id", type = "string")
    private Long id;

    private String name;
    private String text;
    private String level;
    private Integer minutes;

    private String instrument;
    private Date dateCreated;

}
