package com.api.rh.event.listener;

import com.api.rh.event.RecursoCriadoEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.net.URI;

@Component
public class RecursoCriadoListener implements ApplicationListener<RecursoCriadoEvent> {

    @Override
    public void onApplicationEvent(RecursoCriadoEvent recursoCriadoEvent) {
        HttpServletResponse response = recursoCriadoEvent.getResponse();
        Long id = recursoCriadoEvent.getId();

        adcionarHeaderLocation(response, id);
    }

    private void adcionarHeaderLocation(HttpServletResponse response, Long id) {
        final URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("{/id}")
                .buildAndExpand(id).toUri();

        response.setHeader("Location", uri.toASCIIString());
    }
}
