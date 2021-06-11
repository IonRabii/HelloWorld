package local.stud.HelloWorld;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import java.util.UUID;

public class MainVerticle extends AbstractVerticle {
  private final Logger log = LoggerFactory.getLogger(MainVerticle.class);

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    vertx.createHttpServer().requestHandler(req -> {
      log.info("handled new request {1}", UUID.randomUUID());
      req.response()
        .putHeader("content-type", "text/plain")
        .end("Hello from Vert.x!");
    }).listen(7880, http -> {
      if (http.succeeded()) {
        startPromise.complete();
        System.out.println("HTTP server started on port 7880");
      } else {
        startPromise.fail(http.cause());
      }
    });
  }
}
