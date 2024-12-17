// import akka.actor.ActorSystem
// import akka.http.scaladsl.Http
// import akka.http.scaladsl.server.Route
// import akka.stream.ActorMaterializer

// import scala.concurrent.ExecutionContextExecutor
// import scala.io.StdIn
// import routes.HelloWorldRoutes

// object Main extends App {
//   implicit val system: ActorSystem = ActorSystem("akka-http-rest-api")
//   implicit val materializer: ActorMaterializer = ActorMaterializer()
//   implicit val executionContext: ExecutionContextExecutor = system.dispatcher

//   // Initialize routes
//   val routes: Route = HelloWorldRoutes.routes

//   // Start the server
//   val bindingFuture = Http().newServerAt("localhost", 8080).bind(routes)

//   println(s"Server online at http://localhost:8080/\nPress RETURN to stop...")
//   StdIn.readLine() // Let the server run until the user presses RETURN

//   // Shutdown the server
//   bindingFuture
//     .flatMap(_.unbind())
//     .onComplete(_ => system.terminate())
// }
