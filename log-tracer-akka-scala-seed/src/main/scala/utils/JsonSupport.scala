// package utils

// import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
// import spray.json.DefaultJsonProtocol

// // Define JSON marshalling/unmarshalling
// trait JsonSupport extends SprayJsonSupport with DefaultJsonProtocol {
//   // Add implicit JSON formats for your case classes here
//   implicit val greetingFormat = jsonFormat1(Greeting)
// }

// // Define your case classes here (or in their respective files)
// case class Greeting(message: String)
