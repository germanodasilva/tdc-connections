package com.thedevconf.swaggerui.resteasyjackson;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.jboss.logging.Logger;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.quarkus.panache.common.Sort;

@Path("api/endereco")
@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
public class EnderecoResource {

    private static final Logger LOGGER = Logger.getLogger(EnderecoResource.class.getName());

    @GET
    public List<Endereco> get() {
        return Endereco.listAll(Sort.by("id"));
    }

    @GET
    @Path("{id}")
    public Endereco getSingle(@PathParam Long id) {
        Endereco entity = Endereco.findById(id);
        if (entity == null) {
            throw new WebApplicationException("Endereco with id of " + id + " does not exist.", 404);
        }
        return entity;
    }

    @POST
    @Transactional
    public Response create(Endereco endereco) {
        if (endereco.id != null) {
            endereco.id++;
            //throw new WebApplicationException("Id was invalidly set on request.", 422);
        }

        endereco.persist();
        return Response.ok(endereco).status(201).build();
    }


}