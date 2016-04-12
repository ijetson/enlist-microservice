package enlistment.resource;

import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

import enlistment.service.EnlistmentService;

@Path("/enlist")
public class EnlistmentResource {

	EnlistmentService service;

	@POST
	@Path("/addSubject")
	public Response addSubject(@QueryParam("studentId") Integer studentId,
			@QueryParam("subjectCode") String subjectCode) {
		boolean result = this.service.addSubject(studentId, subjectCode);
		if (result) {
			return Response.status(Response.Status.OK).build();
		}

		return Response.status(Response.Status.NOT_ACCEPTABLE).build();

	}

}
