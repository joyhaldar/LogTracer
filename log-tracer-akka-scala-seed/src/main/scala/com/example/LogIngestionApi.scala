// import akka.http.scaladsl.Http
// import akka.http.scaladsl.server.Directives._
// import akka.stream.scaladsl.{Sink, Source}
// import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}
// import spray.json._

// import java.util.Properties

// object LogIngestionApi extends App {
//   implicit val system = akka.actor.ActorSystem()
//   implicit val executionContext = system.dispatcher

//   val kafkaProducer = createKafkaProducer()

//   val route =
//     path("logs") {
//       post {
//         entity(as[String]) { log =>
//           val record = new ProducerRecord[String, String]("logs", log)
//           kafkaProducer.send(record)
//           complete("Log received")
//         }
//       }
//     }

//   Http().newServerAt("0.0.0.0", 8080).bind(route)

//   def createKafkaProducer(): KafkaProducer[String, String] = {
//     val props = new Properties()
//     props.put("bootstrap.servers", "localhost:9092")
//     props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
//     props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")
//     new KafkaProducer[String, String](props)
//   }
// }
