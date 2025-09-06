package ulaval.glo2003;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import ulaval.glo2003.Dtos.Product;
import ulaval.glo2003.data.SeedData;

import java.util.*;

@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
public class ProductsResource {

    @GET
    public Response listProducts(@QueryParam("popular") String popularParam) {

        Optional<Boolean> popularFilter = parsePopular(popularParam);

        if (popularParam != null && popularFilter.isEmpty()) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(Map.of(
                            "error", "invalid_popular",
                            "allowed", List.of("true","false","1","0","yes","no")
                    )).build();
        }

        List<Product> items = new ArrayList<>(SeedData.DB);
        if (popularFilter.isPresent()) {
            boolean wantPopular = popularFilter.get();
            items.removeIf(p -> p.popular() != wantPopular);
        }

        return Response.ok(items).build();
    }

    // GET /products/{id}
    @GET @Path("/{id}")
    public Response getProductById(@PathParam("id") String id) {
        return SeedData.DB.stream()
                .filter(p -> p.id().equals(id))
                .findFirst()
                .map(p -> Response.ok(p).build())
                .orElseGet(() -> Response.status(Response.Status.NOT_FOUND).build());
    }

    private static Optional<Boolean> parsePopular(String v) {
        if (v == null) return Optional.empty();
        switch (v.trim().toLowerCase(Locale.ROOT)) {
            case "true", "1", "yes" -> { return Optional.of(true); }
            case "false", "0", "no" -> { return Optional.of(false); }
            default -> { return Optional.empty(); }
        }
    }
}