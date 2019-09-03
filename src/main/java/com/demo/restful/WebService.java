/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.restful;

import com.demo.bean.Persona;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @author mmendez
 */
@Path("/")
public class WebService {

    @GET
    @Path("/datosPersona")
    @Produces(MediaType.APPLICATION_JSON)
    public Persona getDatosPersona() {
        Persona persona = new Persona();
        persona.setId(1);
        persona.setNombre("Manuel");
        persona.setEdad(31);
        return persona;
    }


    @POST
    @Path("/enviarDatos")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Persona setDatosPersona(
            Persona persona
    ) {


        System.out.println("######################################################");
        System.out.println("Nombre:" + persona.getNombre());
        System.out.println("######################################################");


        persona.setNombre("modificacion");
        return persona;
    }

}
