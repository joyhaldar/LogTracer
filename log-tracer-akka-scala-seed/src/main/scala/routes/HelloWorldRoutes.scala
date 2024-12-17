// package routes

// import akka.http.scaladsl.model.StatusCodes
// import akka.http.scaladsl.server.Directives._
// import akka.http.scaladsl.server.Route
// import utils.JsonSupport

// object HelloWorldRoutes extends JsonSupport {
//   val routes: Route =
//     pathPrefix("api") {
//       path("hello") {
//         get {
//           // Use JSON marshalling to send a JSON response
//           complete(StatusCodes.OK, Greeting("Hello, Akka HTTP with JSON!"))
//         } ~
//         post {
//           // Parse incoming JSON into a Greeting case class
//           entity(as[Greeting]) { greeting =>
//             complete(StatusCodes.OK, s"Received: ${greeting.message}")
//           }
//         }
//       }
//     }
// }
