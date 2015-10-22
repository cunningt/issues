package org.jboss.soa.qa.securitypolicy.composers;

import org.switchyard.Exchange;
import org.switchyard.ExchangeState;
import org.switchyard.HandlerException;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import java.lang.reflect.UndeclaredThrowableException;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class AuthenticatedServiceRestComposer extends RESTEasyMessageComposer {

	@Override
	public RESTEasyBindingData decompose(Exchange exchange, RESTEasyBindingData target) throws Exception {

                        throw new WebApplicationException(
                                        Response.status(Response.Status.UNAUTHORIZED)
                                                        .entity("foofoobunny")
                                                        .type(MediaType.TEXT_PLAIN)
                                                        .build()
                        );

	}
}
